package com.b2international.snomed.ecl.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEclLexer extends Lexer {
    public static final int RULE_DIALECT_KEYWORD=47;
    public static final int RULE_LANGUAGE_KEYWORD=43;
    public static final int RULE_DIGIT_NONZERO=14;
    public static final int RULE_CURLY_OPEN=16;
    public static final int RULE_TO=8;
    public static final int RULE_ROUND_CLOSE=19;
    public static final int RULE_DBL_GT=32;
    public static final int True=5;
    public static final int RULE_GT=30;
    public static final int False=4;
    public static final int RULE_ACTIVE_KEYWORD=48;
    public static final int RULE_GTE=37;
    public static final int RULE_MODULEID_KEYWORD=49;
    public static final int RULE_NUMERIC_OPERATOR=57;
    public static final int RULE_ROUND_OPEN=18;
    public static final int RULE_DBL_LT=31;
    public static final int RULE_TYPEID_KEYWORD=44;
    public static final int RULE_NOT_EQUAL=28;
    public static final int RULE_SQUARE_CLOSE=21;
    public static final int RULE_SQUARE_OPEN=20;
    public static final int RULE_EQUAL=27;
    public static final int RULE_COMMA=9;
    public static final int RULE_LT_EM=33;
    public static final int RULE_CASE_SIGNIFICANCE_ID_KEYWORD=53;
    public static final int RULE_CURLY_CLOSE=17;
    public static final int RULE_ZERO=13;
    public static final int RULE_DBL_GT_EM=36;
    public static final int RULE_NON_NUMERIC_OPERATOR=56;
    public static final int RULE_COLON=15;
    public static final int RULE_LT=29;
    public static final int RULE_DOUBLE_CURLY_CLOSE=41;
    public static final int RULE_LANGUAGE_REFSET_ID_KEYWORD=52;
    public static final int RULE_ML_COMMENT=60;
    public static final int RULE_PREFERRED_IN_KEYWORD=50;
    public static final int RULE_LTE=38;
    public static final int RULE_ALPHA=58;
    public static final int RULE_TYPE_KEYWORD=45;
    public static final int RULE_STRING=62;
    public static final int RULE_REVERSED=7;
    public static final int RULE_SL_COMMENT=61;
    public static final int RULE_HASH=39;
    public static final int RULE_DASH=23;
    public static final int RULE_PLUS=22;
    public static final int RULE_DOT=25;
    public static final int EOF=-1;
    public static final int RULE_DIALECTID_KEYWORD=46;
    public static final int RULE_ACCEPTABLE_IN_KEYWORD=51;
    public static final int RULE_GT_EM=35;
    public static final int RULE_TERM_KEYWORD=42;
    public static final int RULE_WS=59;
    public static final int RULE_EXCLUSION=12;
    public static final int RULE_LEXICAL_SEARCH_TYPE=54;
    public static final int RULE_CARET=24;
    public static final int RULE_DOUBLE_CURLY_OPEN=40;
    public static final int RULE_CONJUNCTION=10;
    public static final int RULE_WILDCARD=26;
    public static final int RULE_DOMAIN=55;
    public static final int RULE_DISJUNCTION=11;
    public static final int RULE_TERM_STRING=6;
    public static final int RULE_DBL_LT_EM=34;

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

    // $ANTLR start "False"
    public final void mFalse() throws RecognitionException {
        try {
            int _type = False;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:26:7: ( ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // InternalEclLexer.g:26:9: ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' )
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

    // $ANTLR start "True"
    public final void mTrue() throws RecognitionException {
        try {
            int _type = True;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:28:6: ( ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'E' | 'e' ) )
            // InternalEclLexer.g:28:8: ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'E' | 'e' )
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

    // $ANTLR start "RULE_TERM_STRING"
    public final void mRULE_TERM_STRING() throws RecognitionException {
        try {
            int _type = RULE_TERM_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:30:18: ( '|' (~ ( '|' ) )* '|' )
            // InternalEclLexer.g:30:20: '|' (~ ( '|' ) )* '|'
            {
            match('|'); 
            // InternalEclLexer.g:30:24: (~ ( '|' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='{')||(LA1_0>='}' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEclLexer.g:30:24: ~ ( '|' )
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
            // InternalEclLexer.g:32:15: ( 'R' )
            // InternalEclLexer.g:32:17: 'R'
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
            // InternalEclLexer.g:34:9: ( '..' )
            // InternalEclLexer.g:34:11: '..'
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
            // InternalEclLexer.g:36:12: ( ',' )
            // InternalEclLexer.g:36:14: ','
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

    // $ANTLR start "RULE_CONJUNCTION"
    public final void mRULE_CONJUNCTION() throws RecognitionException {
        try {
            int _type = RULE_CONJUNCTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:38:18: ( 'and' )
            // InternalEclLexer.g:38:20: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CONJUNCTION"

    // $ANTLR start "RULE_DISJUNCTION"
    public final void mRULE_DISJUNCTION() throws RecognitionException {
        try {
            int _type = RULE_DISJUNCTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:40:18: ( 'or' )
            // InternalEclLexer.g:40:20: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DISJUNCTION"

    // $ANTLR start "RULE_EXCLUSION"
    public final void mRULE_EXCLUSION() throws RecognitionException {
        try {
            int _type = RULE_EXCLUSION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:42:16: ( 'minus' )
            // InternalEclLexer.g:42:18: 'minus'
            {
            match("minus"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXCLUSION"

    // $ANTLR start "RULE_ZERO"
    public final void mRULE_ZERO() throws RecognitionException {
        try {
            int _type = RULE_ZERO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:44:11: ( '0' )
            // InternalEclLexer.g:44:13: '0'
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
            // InternalEclLexer.g:46:20: ( '1' .. '9' )
            // InternalEclLexer.g:46:22: '1' .. '9'
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
            // InternalEclLexer.g:48:12: ( ':' )
            // InternalEclLexer.g:48:14: ':'
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
            // InternalEclLexer.g:50:17: ( '{' )
            // InternalEclLexer.g:50:19: '{'
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
            // InternalEclLexer.g:52:18: ( '}' )
            // InternalEclLexer.g:52:20: '}'
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
            // InternalEclLexer.g:54:17: ( '(' )
            // InternalEclLexer.g:54:19: '('
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
            // InternalEclLexer.g:56:18: ( ')' )
            // InternalEclLexer.g:56:20: ')'
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
            // InternalEclLexer.g:58:18: ( '[' )
            // InternalEclLexer.g:58:20: '['
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
            // InternalEclLexer.g:60:19: ( ']' )
            // InternalEclLexer.g:60:21: ']'
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
            // InternalEclLexer.g:62:11: ( '+' )
            // InternalEclLexer.g:62:13: '+'
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
            // InternalEclLexer.g:64:11: ( '-' )
            // InternalEclLexer.g:64:13: '-'
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
            // InternalEclLexer.g:66:12: ( '^' )
            // InternalEclLexer.g:66:14: '^'
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
            // InternalEclLexer.g:68:10: ( '.' )
            // InternalEclLexer.g:68:12: '.'
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
            // InternalEclLexer.g:70:15: ( '*' )
            // InternalEclLexer.g:70:17: '*'
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
            // InternalEclLexer.g:72:12: ( '=' )
            // InternalEclLexer.g:72:14: '='
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
            // InternalEclLexer.g:74:25: ( '!=' )
            // InternalEclLexer.g:74:27: '!='
            {
            match("!="); 


            }

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
            // InternalEclLexer.g:76:9: ( '<' )
            // InternalEclLexer.g:76:11: '<'
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
            // InternalEclLexer.g:78:9: ( '>' )
            // InternalEclLexer.g:78:11: '>'
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
            // InternalEclLexer.g:80:13: ( '<<' )
            // InternalEclLexer.g:80:15: '<<'
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
            // InternalEclLexer.g:82:13: ( '>>' )
            // InternalEclLexer.g:82:15: '>>'
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
            // InternalEclLexer.g:84:12: ( '<!' )
            // InternalEclLexer.g:84:14: '<!'
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
            // InternalEclLexer.g:86:16: ( '<<!' )
            // InternalEclLexer.g:86:18: '<<!'
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
            // InternalEclLexer.g:88:12: ( '>!' )
            // InternalEclLexer.g:88:14: '>!'
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
            // InternalEclLexer.g:90:16: ( '>>!' )
            // InternalEclLexer.g:90:18: '>>!'
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
            // InternalEclLexer.g:92:19: ( '>=' )
            // InternalEclLexer.g:92:21: '>='
            {
            match(">="); 


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_GTE"

    // $ANTLR start "RULE_LTE"
    public final void mRULE_LTE() throws RecognitionException {
        try {
            // InternalEclLexer.g:94:19: ( '<=' )
            // InternalEclLexer.g:94:21: '<='
            {
            match("<="); 


            }

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
            // InternalEclLexer.g:96:11: ( '#' )
            // InternalEclLexer.g:96:13: '#'
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
            // InternalEclLexer.g:98:24: ( '{{' )
            // InternalEclLexer.g:98:26: '{{'
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
            // InternalEclLexer.g:100:25: ( '}}' )
            // InternalEclLexer.g:100:27: '}}'
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

    // $ANTLR start "RULE_TERM_KEYWORD"
    public final void mRULE_TERM_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_TERM_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:102:19: ( 'term' )
            // InternalEclLexer.g:102:21: 'term'
            {
            match("term"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TERM_KEYWORD"

    // $ANTLR start "RULE_LANGUAGE_KEYWORD"
    public final void mRULE_LANGUAGE_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_LANGUAGE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:104:23: ( 'language' )
            // InternalEclLexer.g:104:25: 'language'
            {
            match("language"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LANGUAGE_KEYWORD"

    // $ANTLR start "RULE_TYPEID_KEYWORD"
    public final void mRULE_TYPEID_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_TYPEID_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:106:21: ( 'typeId' )
            // InternalEclLexer.g:106:23: 'typeId'
            {
            match("typeId"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TYPEID_KEYWORD"

    // $ANTLR start "RULE_TYPE_KEYWORD"
    public final void mRULE_TYPE_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_TYPE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:108:19: ( 'type' )
            // InternalEclLexer.g:108:21: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TYPE_KEYWORD"

    // $ANTLR start "RULE_DIALECTID_KEYWORD"
    public final void mRULE_DIALECTID_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_DIALECTID_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:110:24: ( 'dialectId' )
            // InternalEclLexer.g:110:26: 'dialectId'
            {
            match("dialectId"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIALECTID_KEYWORD"

    // $ANTLR start "RULE_DIALECT_KEYWORD"
    public final void mRULE_DIALECT_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_DIALECT_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:112:22: ( 'dialect' )
            // InternalEclLexer.g:112:24: 'dialect'
            {
            match("dialect"); 


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
            // InternalEclLexer.g:114:21: ( 'active' )
            // InternalEclLexer.g:114:23: 'active'
            {
            match("active"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ACTIVE_KEYWORD"

    // $ANTLR start "RULE_MODULEID_KEYWORD"
    public final void mRULE_MODULEID_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_MODULEID_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:116:23: ( 'moduleId' )
            // InternalEclLexer.g:116:25: 'moduleId'
            {
            match("moduleId"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MODULEID_KEYWORD"

    // $ANTLR start "RULE_PREFERRED_IN_KEYWORD"
    public final void mRULE_PREFERRED_IN_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_PREFERRED_IN_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:118:27: ( 'preferredIn' )
            // InternalEclLexer.g:118:29: 'preferredIn'
            {
            match("preferredIn"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PREFERRED_IN_KEYWORD"

    // $ANTLR start "RULE_ACCEPTABLE_IN_KEYWORD"
    public final void mRULE_ACCEPTABLE_IN_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_ACCEPTABLE_IN_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:120:28: ( 'acceptableIn' )
            // InternalEclLexer.g:120:30: 'acceptableIn'
            {
            match("acceptableIn"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ACCEPTABLE_IN_KEYWORD"

    // $ANTLR start "RULE_LANGUAGE_REFSET_ID_KEYWORD"
    public final void mRULE_LANGUAGE_REFSET_ID_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_LANGUAGE_REFSET_ID_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:122:33: ( 'languageRefSetId' )
            // InternalEclLexer.g:122:35: 'languageRefSetId'
            {
            match("languageRefSetId"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LANGUAGE_REFSET_ID_KEYWORD"

    // $ANTLR start "RULE_CASE_SIGNIFICANCE_ID_KEYWORD"
    public final void mRULE_CASE_SIGNIFICANCE_ID_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_CASE_SIGNIFICANCE_ID_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:124:35: ( 'caseSignificanceId' )
            // InternalEclLexer.g:124:37: 'caseSignificanceId'
            {
            match("caseSignificanceId"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CASE_SIGNIFICANCE_ID_KEYWORD"

    // $ANTLR start "RULE_LEXICAL_SEARCH_TYPE"
    public final void mRULE_LEXICAL_SEARCH_TYPE() throws RecognitionException {
        try {
            int _type = RULE_LEXICAL_SEARCH_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:126:26: ( ( 'match' | 'wild' | 'regex' | 'exact' ) )
            // InternalEclLexer.g:126:28: ( 'match' | 'wild' | 'regex' | 'exact' )
            {
            // InternalEclLexer.g:126:28: ( 'match' | 'wild' | 'regex' | 'exact' )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 'm':
                {
                alt2=1;
                }
                break;
            case 'w':
                {
                alt2=2;
                }
                break;
            case 'r':
                {
                alt2=3;
                }
                break;
            case 'e':
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalEclLexer.g:126:29: 'match'
                    {
                    match("match"); 


                    }
                    break;
                case 2 :
                    // InternalEclLexer.g:126:37: 'wild'
                    {
                    match("wild"); 


                    }
                    break;
                case 3 :
                    // InternalEclLexer.g:126:44: 'regex'
                    {
                    match("regex"); 


                    }
                    break;
                case 4 :
                    // InternalEclLexer.g:126:52: 'exact'
                    {
                    match("exact"); 


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
    // $ANTLR end "RULE_LEXICAL_SEARCH_TYPE"

    // $ANTLR start "RULE_DOMAIN"
    public final void mRULE_DOMAIN() throws RecognitionException {
        try {
            int _type = RULE_DOMAIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:128:13: ( ( 'Concept' | 'Description' ) )
            // InternalEclLexer.g:128:15: ( 'Concept' | 'Description' )
            {
            // InternalEclLexer.g:128:15: ( 'Concept' | 'Description' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='C') ) {
                alt3=1;
            }
            else if ( (LA3_0=='D') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalEclLexer.g:128:16: 'Concept'
                    {
                    match("Concept"); 


                    }
                    break;
                case 2 :
                    // InternalEclLexer.g:128:26: 'Description'
                    {
                    match("Description"); 


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
    // $ANTLR end "RULE_DOMAIN"

    // $ANTLR start "RULE_NON_NUMERIC_OPERATOR"
    public final void mRULE_NON_NUMERIC_OPERATOR() throws RecognitionException {
        try {
            int _type = RULE_NON_NUMERIC_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:130:27: ( ( RULE_EQUAL | RULE_NOT_EQUAL ) )
            // InternalEclLexer.g:130:29: ( RULE_EQUAL | RULE_NOT_EQUAL )
            {
            // InternalEclLexer.g:130:29: ( RULE_EQUAL | RULE_NOT_EQUAL )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='=') ) {
                alt4=1;
            }
            else if ( (LA4_0=='!') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalEclLexer.g:130:30: RULE_EQUAL
                    {
                    mRULE_EQUAL(); 

                    }
                    break;
                case 2 :
                    // InternalEclLexer.g:130:41: RULE_NOT_EQUAL
                    {
                    mRULE_NOT_EQUAL(); 

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
    // $ANTLR end "RULE_NON_NUMERIC_OPERATOR"

    // $ANTLR start "RULE_NUMERIC_OPERATOR"
    public final void mRULE_NUMERIC_OPERATOR() throws RecognitionException {
        try {
            int _type = RULE_NUMERIC_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:132:23: ( ( RULE_EQUAL | RULE_NOT_EQUAL | RULE_GT | RULE_LT | RULE_GTE | RULE_LTE ) )
            // InternalEclLexer.g:132:25: ( RULE_EQUAL | RULE_NOT_EQUAL | RULE_GT | RULE_LT | RULE_GTE | RULE_LTE )
            {
            // InternalEclLexer.g:132:25: ( RULE_EQUAL | RULE_NOT_EQUAL | RULE_GT | RULE_LT | RULE_GTE | RULE_LTE )
            int alt5=6;
            switch ( input.LA(1) ) {
            case '=':
                {
                alt5=1;
                }
                break;
            case '!':
                {
                alt5=2;
                }
                break;
            case '>':
                {
                int LA5_3 = input.LA(2);

                if ( (LA5_3=='=') ) {
                    alt5=5;
                }
                else {
                    alt5=3;}
                }
                break;
            case '<':
                {
                int LA5_4 = input.LA(2);

                if ( (LA5_4=='=') ) {
                    alt5=6;
                }
                else {
                    alt5=4;}
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalEclLexer.g:132:26: RULE_EQUAL
                    {
                    mRULE_EQUAL(); 

                    }
                    break;
                case 2 :
                    // InternalEclLexer.g:132:37: RULE_NOT_EQUAL
                    {
                    mRULE_NOT_EQUAL(); 

                    }
                    break;
                case 3 :
                    // InternalEclLexer.g:132:52: RULE_GT
                    {
                    mRULE_GT(); 

                    }
                    break;
                case 4 :
                    // InternalEclLexer.g:132:60: RULE_LT
                    {
                    mRULE_LT(); 

                    }
                    break;
                case 5 :
                    // InternalEclLexer.g:132:68: RULE_GTE
                    {
                    mRULE_GTE(); 

                    }
                    break;
                case 6 :
                    // InternalEclLexer.g:132:77: RULE_LTE
                    {
                    mRULE_LTE(); 

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
    // $ANTLR end "RULE_NUMERIC_OPERATOR"

    // $ANTLR start "RULE_ALPHA"
    public final void mRULE_ALPHA() throws RecognitionException {
        try {
            int _type = RULE_ALPHA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:134:12: ( 'a' .. 'z' )
            // InternalEclLexer.g:134:14: 'a' .. 'z'
            {
            matchRange('a','z'); 

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
            // InternalEclLexer.g:136:9: ( ( ' ' | '\\t' | '\\n' | '\\r' ) )
            // InternalEclLexer.g:136:11: ( ' ' | '\\t' | '\\n' | '\\r' )
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
            // InternalEclLexer.g:138:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalEclLexer.g:138:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalEclLexer.g:138:24: ( options {greedy=false; } : . )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='*') ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1=='/') ) {
                        alt6=2;
                    }
                    else if ( ((LA6_1>='\u0000' && LA6_1<='.')||(LA6_1>='0' && LA6_1<='\uFFFF')) ) {
                        alt6=1;
                    }


                }
                else if ( ((LA6_0>='\u0000' && LA6_0<=')')||(LA6_0>='+' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalEclLexer.g:138:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop6;
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
            // InternalEclLexer.g:140:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalEclLexer.g:140:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalEclLexer.g:140:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalEclLexer.g:140:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop7;
                }
            } while (true);

            // InternalEclLexer.g:140:40: ( ( '\\r' )? '\\n' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\n'||LA9_0=='\r') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalEclLexer.g:140:41: ( '\\r' )? '\\n'
                    {
                    // InternalEclLexer.g:140:41: ( '\\r' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='\r') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalEclLexer.g:140:41: '\\r'
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
            // InternalEclLexer.g:142:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalEclLexer.g:142:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalEclLexer.g:142:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\"') ) {
                alt12=1;
            }
            else if ( (LA12_0=='\'') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalEclLexer.g:142:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalEclLexer.g:142:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='!')||(LA10_0>='#' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalEclLexer.g:142:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalEclLexer.g:142:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop10;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalEclLexer.g:142:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalEclLexer.g:142:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalEclLexer.g:142:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalEclLexer.g:142:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop11;
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
        // InternalEclLexer.g:1:8: ( False | True | RULE_TERM_STRING | RULE_REVERSED | RULE_TO | RULE_COMMA | RULE_CONJUNCTION | RULE_DISJUNCTION | RULE_EXCLUSION | RULE_ZERO | RULE_DIGIT_NONZERO | RULE_COLON | RULE_CURLY_OPEN | RULE_CURLY_CLOSE | RULE_ROUND_OPEN | RULE_ROUND_CLOSE | RULE_SQUARE_OPEN | RULE_SQUARE_CLOSE | RULE_PLUS | RULE_DASH | RULE_CARET | RULE_DOT | RULE_WILDCARD | RULE_EQUAL | RULE_LT | RULE_GT | RULE_DBL_LT | RULE_DBL_GT | RULE_LT_EM | RULE_DBL_LT_EM | RULE_GT_EM | RULE_DBL_GT_EM | RULE_HASH | RULE_DOUBLE_CURLY_OPEN | RULE_DOUBLE_CURLY_CLOSE | RULE_TERM_KEYWORD | RULE_LANGUAGE_KEYWORD | RULE_TYPEID_KEYWORD | RULE_TYPE_KEYWORD | RULE_DIALECTID_KEYWORD | RULE_DIALECT_KEYWORD | RULE_ACTIVE_KEYWORD | RULE_MODULEID_KEYWORD | RULE_PREFERRED_IN_KEYWORD | RULE_ACCEPTABLE_IN_KEYWORD | RULE_LANGUAGE_REFSET_ID_KEYWORD | RULE_CASE_SIGNIFICANCE_ID_KEYWORD | RULE_LEXICAL_SEARCH_TYPE | RULE_DOMAIN | RULE_NON_NUMERIC_OPERATOR | RULE_NUMERIC_OPERATOR | RULE_ALPHA | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_STRING )
        int alt13=56;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalEclLexer.g:1:10: False
                {
                mFalse(); 

                }
                break;
            case 2 :
                // InternalEclLexer.g:1:16: True
                {
                mTrue(); 

                }
                break;
            case 3 :
                // InternalEclLexer.g:1:21: RULE_TERM_STRING
                {
                mRULE_TERM_STRING(); 

                }
                break;
            case 4 :
                // InternalEclLexer.g:1:38: RULE_REVERSED
                {
                mRULE_REVERSED(); 

                }
                break;
            case 5 :
                // InternalEclLexer.g:1:52: RULE_TO
                {
                mRULE_TO(); 

                }
                break;
            case 6 :
                // InternalEclLexer.g:1:60: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 7 :
                // InternalEclLexer.g:1:71: RULE_CONJUNCTION
                {
                mRULE_CONJUNCTION(); 

                }
                break;
            case 8 :
                // InternalEclLexer.g:1:88: RULE_DISJUNCTION
                {
                mRULE_DISJUNCTION(); 

                }
                break;
            case 9 :
                // InternalEclLexer.g:1:105: RULE_EXCLUSION
                {
                mRULE_EXCLUSION(); 

                }
                break;
            case 10 :
                // InternalEclLexer.g:1:120: RULE_ZERO
                {
                mRULE_ZERO(); 

                }
                break;
            case 11 :
                // InternalEclLexer.g:1:130: RULE_DIGIT_NONZERO
                {
                mRULE_DIGIT_NONZERO(); 

                }
                break;
            case 12 :
                // InternalEclLexer.g:1:149: RULE_COLON
                {
                mRULE_COLON(); 

                }
                break;
            case 13 :
                // InternalEclLexer.g:1:160: RULE_CURLY_OPEN
                {
                mRULE_CURLY_OPEN(); 

                }
                break;
            case 14 :
                // InternalEclLexer.g:1:176: RULE_CURLY_CLOSE
                {
                mRULE_CURLY_CLOSE(); 

                }
                break;
            case 15 :
                // InternalEclLexer.g:1:193: RULE_ROUND_OPEN
                {
                mRULE_ROUND_OPEN(); 

                }
                break;
            case 16 :
                // InternalEclLexer.g:1:209: RULE_ROUND_CLOSE
                {
                mRULE_ROUND_CLOSE(); 

                }
                break;
            case 17 :
                // InternalEclLexer.g:1:226: RULE_SQUARE_OPEN
                {
                mRULE_SQUARE_OPEN(); 

                }
                break;
            case 18 :
                // InternalEclLexer.g:1:243: RULE_SQUARE_CLOSE
                {
                mRULE_SQUARE_CLOSE(); 

                }
                break;
            case 19 :
                // InternalEclLexer.g:1:261: RULE_PLUS
                {
                mRULE_PLUS(); 

                }
                break;
            case 20 :
                // InternalEclLexer.g:1:271: RULE_DASH
                {
                mRULE_DASH(); 

                }
                break;
            case 21 :
                // InternalEclLexer.g:1:281: RULE_CARET
                {
                mRULE_CARET(); 

                }
                break;
            case 22 :
                // InternalEclLexer.g:1:292: RULE_DOT
                {
                mRULE_DOT(); 

                }
                break;
            case 23 :
                // InternalEclLexer.g:1:301: RULE_WILDCARD
                {
                mRULE_WILDCARD(); 

                }
                break;
            case 24 :
                // InternalEclLexer.g:1:315: RULE_EQUAL
                {
                mRULE_EQUAL(); 

                }
                break;
            case 25 :
                // InternalEclLexer.g:1:326: RULE_LT
                {
                mRULE_LT(); 

                }
                break;
            case 26 :
                // InternalEclLexer.g:1:334: RULE_GT
                {
                mRULE_GT(); 

                }
                break;
            case 27 :
                // InternalEclLexer.g:1:342: RULE_DBL_LT
                {
                mRULE_DBL_LT(); 

                }
                break;
            case 28 :
                // InternalEclLexer.g:1:354: RULE_DBL_GT
                {
                mRULE_DBL_GT(); 

                }
                break;
            case 29 :
                // InternalEclLexer.g:1:366: RULE_LT_EM
                {
                mRULE_LT_EM(); 

                }
                break;
            case 30 :
                // InternalEclLexer.g:1:377: RULE_DBL_LT_EM
                {
                mRULE_DBL_LT_EM(); 

                }
                break;
            case 31 :
                // InternalEclLexer.g:1:392: RULE_GT_EM
                {
                mRULE_GT_EM(); 

                }
                break;
            case 32 :
                // InternalEclLexer.g:1:403: RULE_DBL_GT_EM
                {
                mRULE_DBL_GT_EM(); 

                }
                break;
            case 33 :
                // InternalEclLexer.g:1:418: RULE_HASH
                {
                mRULE_HASH(); 

                }
                break;
            case 34 :
                // InternalEclLexer.g:1:428: RULE_DOUBLE_CURLY_OPEN
                {
                mRULE_DOUBLE_CURLY_OPEN(); 

                }
                break;
            case 35 :
                // InternalEclLexer.g:1:451: RULE_DOUBLE_CURLY_CLOSE
                {
                mRULE_DOUBLE_CURLY_CLOSE(); 

                }
                break;
            case 36 :
                // InternalEclLexer.g:1:475: RULE_TERM_KEYWORD
                {
                mRULE_TERM_KEYWORD(); 

                }
                break;
            case 37 :
                // InternalEclLexer.g:1:493: RULE_LANGUAGE_KEYWORD
                {
                mRULE_LANGUAGE_KEYWORD(); 

                }
                break;
            case 38 :
                // InternalEclLexer.g:1:515: RULE_TYPEID_KEYWORD
                {
                mRULE_TYPEID_KEYWORD(); 

                }
                break;
            case 39 :
                // InternalEclLexer.g:1:535: RULE_TYPE_KEYWORD
                {
                mRULE_TYPE_KEYWORD(); 

                }
                break;
            case 40 :
                // InternalEclLexer.g:1:553: RULE_DIALECTID_KEYWORD
                {
                mRULE_DIALECTID_KEYWORD(); 

                }
                break;
            case 41 :
                // InternalEclLexer.g:1:576: RULE_DIALECT_KEYWORD
                {
                mRULE_DIALECT_KEYWORD(); 

                }
                break;
            case 42 :
                // InternalEclLexer.g:1:597: RULE_ACTIVE_KEYWORD
                {
                mRULE_ACTIVE_KEYWORD(); 

                }
                break;
            case 43 :
                // InternalEclLexer.g:1:617: RULE_MODULEID_KEYWORD
                {
                mRULE_MODULEID_KEYWORD(); 

                }
                break;
            case 44 :
                // InternalEclLexer.g:1:639: RULE_PREFERRED_IN_KEYWORD
                {
                mRULE_PREFERRED_IN_KEYWORD(); 

                }
                break;
            case 45 :
                // InternalEclLexer.g:1:665: RULE_ACCEPTABLE_IN_KEYWORD
                {
                mRULE_ACCEPTABLE_IN_KEYWORD(); 

                }
                break;
            case 46 :
                // InternalEclLexer.g:1:692: RULE_LANGUAGE_REFSET_ID_KEYWORD
                {
                mRULE_LANGUAGE_REFSET_ID_KEYWORD(); 

                }
                break;
            case 47 :
                // InternalEclLexer.g:1:724: RULE_CASE_SIGNIFICANCE_ID_KEYWORD
                {
                mRULE_CASE_SIGNIFICANCE_ID_KEYWORD(); 

                }
                break;
            case 48 :
                // InternalEclLexer.g:1:758: RULE_LEXICAL_SEARCH_TYPE
                {
                mRULE_LEXICAL_SEARCH_TYPE(); 

                }
                break;
            case 49 :
                // InternalEclLexer.g:1:783: RULE_DOMAIN
                {
                mRULE_DOMAIN(); 

                }
                break;
            case 50 :
                // InternalEclLexer.g:1:795: RULE_NON_NUMERIC_OPERATOR
                {
                mRULE_NON_NUMERIC_OPERATOR(); 

                }
                break;
            case 51 :
                // InternalEclLexer.g:1:821: RULE_NUMERIC_OPERATOR
                {
                mRULE_NUMERIC_OPERATOR(); 

                }
                break;
            case 52 :
                // InternalEclLexer.g:1:843: RULE_ALPHA
                {
                mRULE_ALPHA(); 

                }
                break;
            case 53 :
                // InternalEclLexer.g:1:854: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 54 :
                // InternalEclLexer.g:1:862: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 55 :
                // InternalEclLexer.g:1:878: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 56 :
                // InternalEclLexer.g:1:894: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\2\46\2\uffff\1\55\1\uffff\3\46\3\uffff\1\65\1\67\11\uffff\1\74\1\77\2\uffff\7\46\26\uffff\1\113\3\uffff\1\115\23\uffff\1\125\11\uffff\1\136\1\140\4\uffff";
    static final String DFA13_eofS =
        "\141\uffff";
    static final String DFA13_minS =
        "\1\11\1\101\1\122\2\uffff\1\56\1\uffff\1\143\1\162\1\141\3\uffff\1\173\1\175\11\uffff\2\41\2\uffff\1\141\1\151\1\162\1\141\1\151\1\145\1\170\1\uffff\1\75\3\uffff\1\52\2\uffff\1\160\3\uffff\1\143\11\uffff\1\41\3\uffff\1\41\2\uffff\1\156\1\141\5\uffff\1\145\6\uffff\1\147\1\154\1\uffff\1\111\1\165\1\145\2\uffff\1\141\1\143\1\147\1\164\1\145\1\111\1\122\4\uffff";
    static final String DFA13_maxS =
        "\1\175\1\141\1\171\2\uffff\1\56\1\uffff\1\156\1\162\1\157\3\uffff\1\173\1\175\11\uffff\1\75\1\76\2\uffff\1\141\1\151\1\162\1\141\1\151\1\145\1\170\1\uffff\1\75\3\uffff\1\57\2\uffff\1\160\3\uffff\1\164\11\uffff\1\41\3\uffff\1\41\2\uffff\1\156\1\141\5\uffff\1\145\6\uffff\1\147\1\154\1\uffff\1\111\1\165\1\145\2\uffff\1\141\1\143\1\147\1\164\1\145\1\111\1\122\4\uffff";
    static final String DFA13_acceptS =
        "\3\uffff\1\3\1\4\1\uffff\1\6\3\uffff\1\12\1\13\1\14\2\uffff\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\27\1\30\2\uffff\1\41\1\2\7\uffff\1\61\1\uffff\1\1\1\64\1\65\1\uffff\1\70\1\44\1\uffff\1\5\1\26\1\7\1\uffff\1\10\1\11\1\53\1\60\1\42\1\15\1\43\1\16\1\30\1\uffff\1\35\1\63\1\31\1\uffff\1\37\1\32\2\uffff\1\54\1\57\1\62\1\66\1\67\1\uffff\1\52\1\55\1\36\1\33\1\40\1\34\2\uffff\1\62\3\uffff\1\46\1\47\7\uffff\1\50\1\51\1\56\1\45";
    static final String DFA13_specialS =
        "\141\uffff}>";
    static final String[] DFA13_transitionS = DFA13_transitionS_.DFA13_transitionS;
    private static final class DFA13_transitionS_ {
        static final String[] DFA13_transitionS = {
                "\2\47\2\uffff\1\47\22\uffff\1\47\1\44\1\51\1\32\3\uffff\1\51\1\17\1\20\1\26\1\23\1\6\1\24\1\5\1\50\1\12\11\13\1\14\1\uffff\1\30\1\27\1\31\4\uffff\2\43\1\uffff\1\45\13\uffff\1\4\1\uffff\1\33\6\uffff\1\21\1\uffff\1\22\1\25\2\uffff\1\7\1\46\1\37\1\35\1\42\1\1\5\46\1\34\1\11\1\46\1\10\1\36\1\46\1\41\1\46\1\2\2\46\1\40\3\46\1\15\1\3\1\16",
                "\1\45\37\uffff\1\45",
                "\1\33\22\uffff\1\52\14\uffff\1\33\6\uffff\1\53",
                "",
                "",
                "\1\54",
                "",
                "\1\57\12\uffff\1\56",
                "\1\60",
                "\1\63\7\uffff\1\61\5\uffff\1\62",
                "",
                "",
                "",
                "\1\64",
                "\1\66",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "\1\72\32\uffff\1\71\1\73",
                "\1\76\33\uffff\1\73\1\75",
                "",
                "",
                "\1\100",
                "\1\101",
                "\1\102",
                "\1\103",
                "\1\63",
                "\1\63",
                "\1\63",
                "",
                "\1\104",
                "",
                "",
                "",
                "\1\105\4\uffff\1\106",
                "",
                "",
                "\1\107",
                "",
                "",
                "",
                "\1\111\20\uffff\1\110",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "\1\112",
                "",
                "",
                "",
                "\1\114",
                "",
                "",
                "\1\116",
                "\1\117",
                "",
                "",
                "",
                "",
                "",
                "\1\121",
                "",
                "",
                "",
                "",
                "",
                "",
                "\1\122",
                "\1\123",
                "",
                "\1\124",
                "\1\126",
                "\1\127",
                "",
                "",
                "\1\130",
                "\1\131",
                "\1\132",
                "\1\133",
                "\1\134",
                "\1\135",
                "\1\137",
                "",
                "",
                "",
                ""
        };
    }

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( False | True | RULE_TERM_STRING | RULE_REVERSED | RULE_TO | RULE_COMMA | RULE_CONJUNCTION | RULE_DISJUNCTION | RULE_EXCLUSION | RULE_ZERO | RULE_DIGIT_NONZERO | RULE_COLON | RULE_CURLY_OPEN | RULE_CURLY_CLOSE | RULE_ROUND_OPEN | RULE_ROUND_CLOSE | RULE_SQUARE_OPEN | RULE_SQUARE_CLOSE | RULE_PLUS | RULE_DASH | RULE_CARET | RULE_DOT | RULE_WILDCARD | RULE_EQUAL | RULE_LT | RULE_GT | RULE_DBL_LT | RULE_DBL_GT | RULE_LT_EM | RULE_DBL_LT_EM | RULE_GT_EM | RULE_DBL_GT_EM | RULE_HASH | RULE_DOUBLE_CURLY_OPEN | RULE_DOUBLE_CURLY_CLOSE | RULE_TERM_KEYWORD | RULE_LANGUAGE_KEYWORD | RULE_TYPEID_KEYWORD | RULE_TYPE_KEYWORD | RULE_DIALECTID_KEYWORD | RULE_DIALECT_KEYWORD | RULE_ACTIVE_KEYWORD | RULE_MODULEID_KEYWORD | RULE_PREFERRED_IN_KEYWORD | RULE_ACCEPTABLE_IN_KEYWORD | RULE_LANGUAGE_REFSET_ID_KEYWORD | RULE_CASE_SIGNIFICANCE_ID_KEYWORD | RULE_LEXICAL_SEARCH_TYPE | RULE_DOMAIN | RULE_NON_NUMERIC_OPERATOR | RULE_NUMERIC_OPERATOR | RULE_ALPHA | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_STRING );";
        }
    }
 

}