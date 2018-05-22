package biochemsimulation.reactionrules.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalReactionRulesLexer extends Lexer {
    public static final int RULE_FREE_LINK=9;
    public static final int RULE_STRING=4;
    public static final int RULE_AT=12;
    public static final int RULE_WHATEVER_LINK=10;
    public static final int RULE_SL_COMMENT=15;
    public static final int T__19=19;
    public static final int T__18=18;
    public static final int RULE_SEMI_LINK=8;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=16;
    public static final int RULE_ANY_OTHER=17;
    public static final int RULE_BI=13;
    public static final int RULE_EXPONENT=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int RULE_UNI=11;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=14;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalReactionRulesLexer() {;} 
    public InternalReactionRulesLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalReactionRulesLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalReactionRules.g"; }

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:11:7: ( 'URI' )
            // InternalReactionRules.g:11:9: 'URI'
            {
            match("URI"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:12:7: ( 'PATH' )
            // InternalReactionRules.g:12:9: 'PATH'
            {
            match("PATH"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:13:7: ( 'ModelID' )
            // InternalReactionRules.g:13:9: 'ModelID'
            {
            match("ModelID"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:14:7: ( 'AgentInstance' )
            // InternalReactionRules.g:14:9: 'AgentInstance'
            {
            match("AgentInstance"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:15:7: ( '-' )
            // InternalReactionRules.g:15:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:16:7: ( '.' )
            // InternalReactionRules.g:16:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:17:7: ( '{' )
            // InternalReactionRules.g:17:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:18:7: ( ',' )
            // InternalReactionRules.g:18:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:19:7: ( '}' )
            // InternalReactionRules.g:19:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:20:7: ( '(' )
            // InternalReactionRules.g:20:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:21:7: ( ')' )
            // InternalReactionRules.g:21:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:22:7: ( 'agent' )
            // InternalReactionRules.g:22:9: 'agent'
            {
            match("agent"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:23:7: ( 'var' )
            // InternalReactionRules.g:23:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:24:7: ( '=' )
            // InternalReactionRules.g:24:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:25:7: ( '[' )
            // InternalReactionRules.g:25:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:26:7: ( ']' )
            // InternalReactionRules.g:26:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:27:7: ( 'obs' )
            // InternalReactionRules.g:27:9: 'obs'
            {
            match("obs"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:28:7: ( 'init' )
            // InternalReactionRules.g:28:9: 'init'
            {
            match("init"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:29:7: ( 'rule' )
            // InternalReactionRules.g:29:9: 'rule'
            {
            match("rule"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "RULE_AT"
    public final void mRULE_AT() throws RecognitionException {
        try {
            int _type = RULE_AT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:2780:9: ( '@' )
            // InternalReactionRules.g:2780:11: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AT"

    // $ANTLR start "RULE_BI"
    public final void mRULE_BI() throws RecognitionException {
        try {
            int _type = RULE_BI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:2782:9: ( '<->' )
            // InternalReactionRules.g:2782:11: '<->'
            {
            match("<->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BI"

    // $ANTLR start "RULE_UNI"
    public final void mRULE_UNI() throws RecognitionException {
        try {
            int _type = RULE_UNI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:2784:10: ( '->' )
            // InternalReactionRules.g:2784:12: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNI"

    // $ANTLR start "RULE_SEMI_LINK"
    public final void mRULE_SEMI_LINK() throws RecognitionException {
        try {
            int _type = RULE_SEMI_LINK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:2786:16: ( 'semi' )
            // InternalReactionRules.g:2786:18: 'semi'
            {
            match("semi"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SEMI_LINK"

    // $ANTLR start "RULE_FREE_LINK"
    public final void mRULE_FREE_LINK() throws RecognitionException {
        try {
            int _type = RULE_FREE_LINK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:2788:16: ( 'free' )
            // InternalReactionRules.g:2788:18: 'free'
            {
            match("free"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FREE_LINK"

    // $ANTLR start "RULE_WHATEVER_LINK"
    public final void mRULE_WHATEVER_LINK() throws RecognitionException {
        try {
            int _type = RULE_WHATEVER_LINK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:2790:20: ( '?' )
            // InternalReactionRules.g:2790:22: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WHATEVER_LINK"

    // $ANTLR start "RULE_EXPONENT"
    public final void mRULE_EXPONENT() throws RecognitionException {
        try {
            int _type = RULE_EXPONENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:2792:15: ( 'E' )
            // InternalReactionRules.g:2792:17: 'E'
            {
            match('E'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXPONENT"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:2794:10: ( '0' .. '9' ( '0' .. '9' )* )
            // InternalReactionRules.g:2794:12: '0' .. '9' ( '0' .. '9' )*
            {
            matchRange('0','9'); 
            // InternalReactionRules.g:2794:21: ( '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalReactionRules.g:2794:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:2796:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalReactionRules.g:2796:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalReactionRules.g:2796:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalReactionRules.g:2796:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalReactionRules.g:2796:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalReactionRules.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:2798:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalReactionRules.g:2798:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalReactionRules.g:2798:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalReactionRules.g:2798:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalReactionRules.g:2798:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalReactionRules.g:2798:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalReactionRules.g:2798:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalReactionRules.g:2798:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalReactionRules.g:2798:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalReactionRules.g:2798:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalReactionRules.g:2798:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop5;
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

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:2800:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalReactionRules.g:2800:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalReactionRules.g:2800:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalReactionRules.g:2800:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
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
            // InternalReactionRules.g:2802:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalReactionRules.g:2802:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalReactionRules.g:2802:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalReactionRules.g:2802:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop8;
                }
            } while (true);

            // InternalReactionRules.g:2802:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalReactionRules.g:2802:41: ( '\\r' )? '\\n'
                    {
                    // InternalReactionRules.g:2802:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalReactionRules.g:2802:41: '\\r'
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

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:2804:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalReactionRules.g:2804:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalReactionRules.g:2804:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalReactionRules.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionRules.g:2806:16: ( . )
            // InternalReactionRules.g:2806:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalReactionRules.g:1:8: ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | RULE_AT | RULE_BI | RULE_UNI | RULE_SEMI_LINK | RULE_FREE_LINK | RULE_WHATEVER_LINK | RULE_EXPONENT | RULE_INT | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=33;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalReactionRules.g:1:10: T__18
                {
                mT__18(); 

                }
                break;
            case 2 :
                // InternalReactionRules.g:1:16: T__19
                {
                mT__19(); 

                }
                break;
            case 3 :
                // InternalReactionRules.g:1:22: T__20
                {
                mT__20(); 

                }
                break;
            case 4 :
                // InternalReactionRules.g:1:28: T__21
                {
                mT__21(); 

                }
                break;
            case 5 :
                // InternalReactionRules.g:1:34: T__22
                {
                mT__22(); 

                }
                break;
            case 6 :
                // InternalReactionRules.g:1:40: T__23
                {
                mT__23(); 

                }
                break;
            case 7 :
                // InternalReactionRules.g:1:46: T__24
                {
                mT__24(); 

                }
                break;
            case 8 :
                // InternalReactionRules.g:1:52: T__25
                {
                mT__25(); 

                }
                break;
            case 9 :
                // InternalReactionRules.g:1:58: T__26
                {
                mT__26(); 

                }
                break;
            case 10 :
                // InternalReactionRules.g:1:64: T__27
                {
                mT__27(); 

                }
                break;
            case 11 :
                // InternalReactionRules.g:1:70: T__28
                {
                mT__28(); 

                }
                break;
            case 12 :
                // InternalReactionRules.g:1:76: T__29
                {
                mT__29(); 

                }
                break;
            case 13 :
                // InternalReactionRules.g:1:82: T__30
                {
                mT__30(); 

                }
                break;
            case 14 :
                // InternalReactionRules.g:1:88: T__31
                {
                mT__31(); 

                }
                break;
            case 15 :
                // InternalReactionRules.g:1:94: T__32
                {
                mT__32(); 

                }
                break;
            case 16 :
                // InternalReactionRules.g:1:100: T__33
                {
                mT__33(); 

                }
                break;
            case 17 :
                // InternalReactionRules.g:1:106: T__34
                {
                mT__34(); 

                }
                break;
            case 18 :
                // InternalReactionRules.g:1:112: T__35
                {
                mT__35(); 

                }
                break;
            case 19 :
                // InternalReactionRules.g:1:118: T__36
                {
                mT__36(); 

                }
                break;
            case 20 :
                // InternalReactionRules.g:1:124: RULE_AT
                {
                mRULE_AT(); 

                }
                break;
            case 21 :
                // InternalReactionRules.g:1:132: RULE_BI
                {
                mRULE_BI(); 

                }
                break;
            case 22 :
                // InternalReactionRules.g:1:140: RULE_UNI
                {
                mRULE_UNI(); 

                }
                break;
            case 23 :
                // InternalReactionRules.g:1:149: RULE_SEMI_LINK
                {
                mRULE_SEMI_LINK(); 

                }
                break;
            case 24 :
                // InternalReactionRules.g:1:164: RULE_FREE_LINK
                {
                mRULE_FREE_LINK(); 

                }
                break;
            case 25 :
                // InternalReactionRules.g:1:179: RULE_WHATEVER_LINK
                {
                mRULE_WHATEVER_LINK(); 

                }
                break;
            case 26 :
                // InternalReactionRules.g:1:198: RULE_EXPONENT
                {
                mRULE_EXPONENT(); 

                }
                break;
            case 27 :
                // InternalReactionRules.g:1:212: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 28 :
                // InternalReactionRules.g:1:221: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 29 :
                // InternalReactionRules.g:1:229: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 30 :
                // InternalReactionRules.g:1:241: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 31 :
                // InternalReactionRules.g:1:257: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 32 :
                // InternalReactionRules.g:1:273: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 33 :
                // InternalReactionRules.g:1:281: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\4\43\1\50\6\uffff\2\43\3\uffff\3\43\1\uffff\1\41\2\43\1\uffff\1\74\1\uffff\1\41\1\uffff\3\41\2\uffff\1\43\1\uffff\3\43\10\uffff\2\43\3\uffff\3\43\2\uffff\2\43\7\uffff\1\115\4\43\1\122\1\123\4\43\1\uffff\1\130\3\43\2\uffff\1\134\1\135\1\136\1\137\1\uffff\2\43\1\142\4\uffff\2\43\1\uffff\1\145\1\43\1\uffff\5\43\1\154\1\uffff";
    static final String DFA12_eofS =
        "\155\uffff";
    static final String DFA12_minS =
        "\1\0\1\122\1\101\1\157\1\147\1\76\6\uffff\1\147\1\141\3\uffff\1\142\1\156\1\165\1\uffff\1\55\1\145\1\162\1\uffff\1\60\1\uffff\1\101\1\uffff\2\0\1\52\2\uffff\1\111\1\uffff\1\124\1\144\1\145\10\uffff\1\145\1\162\3\uffff\1\163\1\151\1\154\2\uffff\1\155\1\145\7\uffff\1\60\1\110\1\145\2\156\2\60\1\164\1\145\1\151\1\145\1\uffff\1\60\1\154\2\164\2\uffff\4\60\1\uffff\2\111\1\60\4\uffff\1\104\1\156\1\uffff\1\60\1\163\1\uffff\1\164\1\141\1\156\1\143\1\145\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\122\1\101\1\157\1\147\1\76\6\uffff\1\147\1\141\3\uffff\1\142\1\156\1\165\1\uffff\1\55\1\145\1\162\1\uffff\1\172\1\uffff\1\172\1\uffff\2\uffff\1\57\2\uffff\1\111\1\uffff\1\124\1\144\1\145\10\uffff\1\145\1\162\3\uffff\1\163\1\151\1\154\2\uffff\1\155\1\145\7\uffff\1\172\1\110\1\145\2\156\2\172\1\164\1\145\1\151\1\145\1\uffff\1\172\1\154\2\164\2\uffff\4\172\1\uffff\2\111\1\172\4\uffff\1\104\1\156\1\uffff\1\172\1\163\1\uffff\1\164\1\141\1\156\1\143\1\145\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\6\uffff\1\6\1\7\1\10\1\11\1\12\1\13\2\uffff\1\16\1\17\1\20\3\uffff\1\24\3\uffff\1\31\1\uffff\1\33\1\uffff\1\34\3\uffff\1\40\1\41\1\uffff\1\34\3\uffff\1\26\1\5\1\6\1\7\1\10\1\11\1\12\1\13\2\uffff\1\16\1\17\1\20\3\uffff\1\24\1\25\2\uffff\1\31\1\32\1\33\1\35\1\36\1\37\1\40\13\uffff\1\1\4\uffff\1\15\1\21\4\uffff\1\2\3\uffff\1\22\1\23\1\27\1\30\2\uffff\1\14\2\uffff\1\3\6\uffff\1\4";
    static final String DFA12_specialS =
        "\1\0\34\uffff\1\1\1\2\116\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\41\2\40\2\41\1\40\22\41\1\40\1\41\1\35\4\41\1\36\1\12\1\13\2\41\1\10\1\5\1\6\1\37\12\32\2\41\1\25\1\16\1\41\1\30\1\24\1\4\3\34\1\31\7\34\1\3\2\34\1\2\4\34\1\1\5\34\1\17\1\41\1\20\1\33\1\34\1\41\1\14\4\34\1\27\2\34\1\22\5\34\1\21\2\34\1\23\1\26\2\34\1\15\4\34\1\7\1\41\1\11\uff82\41",
            "\1\42",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\57",
            "\1\60",
            "",
            "",
            "",
            "\1\64",
            "\1\65",
            "\1\66",
            "",
            "\1\70",
            "\1\71",
            "\1\72",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\0\76",
            "\0\76",
            "\1\77\4\uffff\1\100",
            "",
            "",
            "\1\102",
            "",
            "\1\103",
            "\1\104",
            "\1\105",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\106",
            "\1\107",
            "",
            "",
            "",
            "\1\110",
            "\1\111",
            "\1\112",
            "",
            "",
            "\1\113",
            "\1\114",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\131",
            "\1\132",
            "\1\133",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\140",
            "\1\141",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "",
            "",
            "\1\143",
            "\1\144",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\146",
            "",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | RULE_AT | RULE_BI | RULE_UNI | RULE_SEMI_LINK | RULE_FREE_LINK | RULE_WHATEVER_LINK | RULE_EXPONENT | RULE_INT | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='U') ) {s = 1;}

                        else if ( (LA12_0=='P') ) {s = 2;}

                        else if ( (LA12_0=='M') ) {s = 3;}

                        else if ( (LA12_0=='A') ) {s = 4;}

                        else if ( (LA12_0=='-') ) {s = 5;}

                        else if ( (LA12_0=='.') ) {s = 6;}

                        else if ( (LA12_0=='{') ) {s = 7;}

                        else if ( (LA12_0==',') ) {s = 8;}

                        else if ( (LA12_0=='}') ) {s = 9;}

                        else if ( (LA12_0=='(') ) {s = 10;}

                        else if ( (LA12_0==')') ) {s = 11;}

                        else if ( (LA12_0=='a') ) {s = 12;}

                        else if ( (LA12_0=='v') ) {s = 13;}

                        else if ( (LA12_0=='=') ) {s = 14;}

                        else if ( (LA12_0=='[') ) {s = 15;}

                        else if ( (LA12_0==']') ) {s = 16;}

                        else if ( (LA12_0=='o') ) {s = 17;}

                        else if ( (LA12_0=='i') ) {s = 18;}

                        else if ( (LA12_0=='r') ) {s = 19;}

                        else if ( (LA12_0=='@') ) {s = 20;}

                        else if ( (LA12_0=='<') ) {s = 21;}

                        else if ( (LA12_0=='s') ) {s = 22;}

                        else if ( (LA12_0=='f') ) {s = 23;}

                        else if ( (LA12_0=='?') ) {s = 24;}

                        else if ( (LA12_0=='E') ) {s = 25;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 26;}

                        else if ( (LA12_0=='^') ) {s = 27;}

                        else if ( ((LA12_0>='B' && LA12_0<='D')||(LA12_0>='F' && LA12_0<='L')||(LA12_0>='N' && LA12_0<='O')||(LA12_0>='Q' && LA12_0<='T')||(LA12_0>='V' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='b' && LA12_0<='e')||(LA12_0>='g' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='n')||(LA12_0>='p' && LA12_0<='q')||(LA12_0>='t' && LA12_0<='u')||(LA12_0>='w' && LA12_0<='z')) ) {s = 28;}

                        else if ( (LA12_0=='\"') ) {s = 29;}

                        else if ( (LA12_0=='\'') ) {s = 30;}

                        else if ( (LA12_0=='/') ) {s = 31;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 32;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='*' && LA12_0<='+')||(LA12_0>=':' && LA12_0<=';')||LA12_0=='>'||LA12_0=='\\'||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_29 = input.LA(1);

                        s = -1;
                        if ( ((LA12_29>='\u0000' && LA12_29<='\uFFFF')) ) {s = 62;}

                        else s = 33;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_30 = input.LA(1);

                        s = -1;
                        if ( ((LA12_30>='\u0000' && LA12_30<='\uFFFF')) ) {s = 62;}

                        else s = 33;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}