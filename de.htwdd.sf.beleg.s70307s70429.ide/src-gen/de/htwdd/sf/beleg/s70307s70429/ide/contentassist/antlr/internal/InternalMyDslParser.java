package de.htwdd.sf.beleg.s70307s70429.ide.contentassist.antlr.internal;

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
import de.htwdd.sf.beleg.s70307s70429.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_VAR", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'?-'", "'.'", "','", "':-'", "'('", "')'", "'['", "']'", "'|'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__20=20;
    public static final int RULE_VAR=6;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRulePrologdsl"
    // InternalMyDsl.g:53:1: entryRulePrologdsl : rulePrologdsl EOF ;
    public final void entryRulePrologdsl() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( rulePrologdsl EOF )
            // InternalMyDsl.g:55:1: rulePrologdsl EOF
            {
             before(grammarAccess.getPrologdslRule()); 
            pushFollow(FOLLOW_1);
            rulePrologdsl();

            state._fsp--;

             after(grammarAccess.getPrologdslRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePrologdsl"


    // $ANTLR start "rulePrologdsl"
    // InternalMyDsl.g:62:1: rulePrologdsl : ( ( rule__Prologdsl__Group__0 ) ) ;
    public final void rulePrologdsl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Prologdsl__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Prologdsl__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Prologdsl__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Prologdsl__Group__0 )
            {
             before(grammarAccess.getPrologdslAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Prologdsl__Group__0 )
            // InternalMyDsl.g:69:4: rule__Prologdsl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Prologdsl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrologdslAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrologdsl"


    // $ANTLR start "entryRuleProgram"
    // InternalMyDsl.g:78:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleProgram EOF )
            // InternalMyDsl.g:80:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalMyDsl.g:87:1: ruleProgram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Program__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Program__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Program__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__Program__Group__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Program__Group__0 )
            // InternalMyDsl.g:94:4: rule__Program__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleExquery"
    // InternalMyDsl.g:103:1: entryRuleExquery : ruleExquery EOF ;
    public final void entryRuleExquery() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleExquery EOF )
            // InternalMyDsl.g:105:1: ruleExquery EOF
            {
             before(grammarAccess.getExqueryRule()); 
            pushFollow(FOLLOW_1);
            ruleExquery();

            state._fsp--;

             after(grammarAccess.getExqueryRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExquery"


    // $ANTLR start "ruleExquery"
    // InternalMyDsl.g:112:1: ruleExquery : ( ( rule__Exquery__Group__0 ) ) ;
    public final void ruleExquery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Exquery__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Exquery__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Exquery__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Exquery__Group__0 )
            {
             before(grammarAccess.getExqueryAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Exquery__Group__0 )
            // InternalMyDsl.g:119:4: rule__Exquery__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Exquery__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExqueryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExquery"


    // $ANTLR start "entryRuleQuery"
    // InternalMyDsl.g:128:1: entryRuleQuery : ruleQuery EOF ;
    public final void entryRuleQuery() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleQuery EOF )
            // InternalMyDsl.g:130:1: ruleQuery EOF
            {
             before(grammarAccess.getQueryRule()); 
            pushFollow(FOLLOW_1);
            ruleQuery();

            state._fsp--;

             after(grammarAccess.getQueryRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQuery"


    // $ANTLR start "ruleQuery"
    // InternalMyDsl.g:137:1: ruleQuery : ( ( rule__Query__Group__0 ) ) ;
    public final void ruleQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Query__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Query__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Query__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Query__Group__0 )
            {
             before(grammarAccess.getQueryAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Query__Group__0 )
            // InternalMyDsl.g:144:4: rule__Query__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Query__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuery"


    // $ANTLR start "entryRuleClause"
    // InternalMyDsl.g:153:1: entryRuleClause : ruleClause EOF ;
    public final void entryRuleClause() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleClause EOF )
            // InternalMyDsl.g:155:1: ruleClause EOF
            {
             before(grammarAccess.getClauseRule()); 
            pushFollow(FOLLOW_1);
            ruleClause();

            state._fsp--;

             after(grammarAccess.getClauseRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleClause"


    // $ANTLR start "ruleClause"
    // InternalMyDsl.g:162:1: ruleClause : ( ( rule__Clause__Group__0 ) ) ;
    public final void ruleClause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Clause__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Clause__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Clause__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Clause__Group__0 )
            {
             before(grammarAccess.getClauseAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Clause__Group__0 )
            // InternalMyDsl.g:169:4: rule__Clause__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Clause__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClauseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClause"


    // $ANTLR start "entryRuleFact"
    // InternalMyDsl.g:178:1: entryRuleFact : ruleFact EOF ;
    public final void entryRuleFact() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleFact EOF )
            // InternalMyDsl.g:180:1: ruleFact EOF
            {
             before(grammarAccess.getFactRule()); 
            pushFollow(FOLLOW_1);
            ruleFact();

            state._fsp--;

             after(grammarAccess.getFactRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFact"


    // $ANTLR start "ruleFact"
    // InternalMyDsl.g:187:1: ruleFact : ( ( rule__Fact__Group__0 ) ) ;
    public final void ruleFact() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Fact__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Fact__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Fact__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__Fact__Group__0 )
            {
             before(grammarAccess.getFactAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__Fact__Group__0 )
            // InternalMyDsl.g:194:4: rule__Fact__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Fact__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFactAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFact"


    // $ANTLR start "entryRuleRule"
    // InternalMyDsl.g:203:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleRule EOF )
            // InternalMyDsl.g:205:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalMyDsl.g:212:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__Rule__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__Rule__Group__0 )
            // InternalMyDsl.g:219:4: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRulePredicate"
    // InternalMyDsl.g:228:1: entryRulePredicate : rulePredicate EOF ;
    public final void entryRulePredicate() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( rulePredicate EOF )
            // InternalMyDsl.g:230:1: rulePredicate EOF
            {
             before(grammarAccess.getPredicateRule()); 
            pushFollow(FOLLOW_1);
            rulePredicate();

            state._fsp--;

             after(grammarAccess.getPredicateRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePredicate"


    // $ANTLR start "rulePredicate"
    // InternalMyDsl.g:237:1: rulePredicate : ( ( rule__Predicate__Group__0 ) ) ;
    public final void rulePredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Predicate__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Predicate__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Predicate__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__Predicate__Group__0 )
            {
             before(grammarAccess.getPredicateAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__Predicate__Group__0 )
            // InternalMyDsl.g:244:4: rule__Predicate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Predicate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPredicateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePredicate"


    // $ANTLR start "entryRuleFunctor"
    // InternalMyDsl.g:253:1: entryRuleFunctor : ruleFunctor EOF ;
    public final void entryRuleFunctor() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleFunctor EOF )
            // InternalMyDsl.g:255:1: ruleFunctor EOF
            {
             before(grammarAccess.getFunctorRule()); 
            pushFollow(FOLLOW_1);
            ruleFunctor();

            state._fsp--;

             after(grammarAccess.getFunctorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFunctor"


    // $ANTLR start "ruleFunctor"
    // InternalMyDsl.g:262:1: ruleFunctor : ( ( rule__Functor__FuncAssignment ) ) ;
    public final void ruleFunctor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__Functor__FuncAssignment ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__Functor__FuncAssignment ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__Functor__FuncAssignment ) )
            // InternalMyDsl.g:268:3: ( rule__Functor__FuncAssignment )
            {
             before(grammarAccess.getFunctorAccess().getFuncAssignment()); 
            // InternalMyDsl.g:269:3: ( rule__Functor__FuncAssignment )
            // InternalMyDsl.g:269:4: rule__Functor__FuncAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Functor__FuncAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFunctorAccess().getFuncAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctor"


    // $ANTLR start "entryRuleTerm"
    // InternalMyDsl.g:278:1: entryRuleTerm : ruleTerm EOF ;
    public final void entryRuleTerm() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleTerm EOF )
            // InternalMyDsl.g:280:1: ruleTerm EOF
            {
             before(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_1);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getTermRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // InternalMyDsl.g:287:1: ruleTerm : ( ( rule__Term__TermAssignment ) ) ;
    public final void ruleTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__Term__TermAssignment ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__Term__TermAssignment ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__Term__TermAssignment ) )
            // InternalMyDsl.g:293:3: ( rule__Term__TermAssignment )
            {
             before(grammarAccess.getTermAccess().getTermAssignment()); 
            // InternalMyDsl.g:294:3: ( rule__Term__TermAssignment )
            // InternalMyDsl.g:294:4: rule__Term__TermAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Term__TermAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getTermAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleAtom"
    // InternalMyDsl.g:303:1: entryRuleAtom : ruleAtom EOF ;
    public final void entryRuleAtom() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleAtom EOF )
            // InternalMyDsl.g:305:1: ruleAtom EOF
            {
             before(grammarAccess.getAtomRule()); 
            pushFollow(FOLLOW_1);
            ruleAtom();

            state._fsp--;

             after(grammarAccess.getAtomRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAtom"


    // $ANTLR start "ruleAtom"
    // InternalMyDsl.g:312:1: ruleAtom : ( ( rule__Atom__XxAssignment ) ) ;
    public final void ruleAtom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__Atom__XxAssignment ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__Atom__XxAssignment ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__Atom__XxAssignment ) )
            // InternalMyDsl.g:318:3: ( rule__Atom__XxAssignment )
            {
             before(grammarAccess.getAtomAccess().getXxAssignment()); 
            // InternalMyDsl.g:319:3: ( rule__Atom__XxAssignment )
            // InternalMyDsl.g:319:4: rule__Atom__XxAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Atom__XxAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAtomAccess().getXxAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtom"


    // $ANTLR start "entryRuleList"
    // InternalMyDsl.g:328:1: entryRuleList : ruleList EOF ;
    public final void entryRuleList() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleList EOF )
            // InternalMyDsl.g:330:1: ruleList EOF
            {
             before(grammarAccess.getListRule()); 
            pushFollow(FOLLOW_1);
            ruleList();

            state._fsp--;

             after(grammarAccess.getListRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleList"


    // $ANTLR start "ruleList"
    // InternalMyDsl.g:337:1: ruleList : ( ( rule__List__Alternatives ) ) ;
    public final void ruleList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__List__Alternatives ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__List__Alternatives ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__List__Alternatives ) )
            // InternalMyDsl.g:343:3: ( rule__List__Alternatives )
            {
             before(grammarAccess.getListAccess().getAlternatives()); 
            // InternalMyDsl.g:344:3: ( rule__List__Alternatives )
            // InternalMyDsl.g:344:4: rule__List__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__List__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getListAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleList"


    // $ANTLR start "entryRuleNonemptylist"
    // InternalMyDsl.g:353:1: entryRuleNonemptylist : ruleNonemptylist EOF ;
    public final void entryRuleNonemptylist() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleNonemptylist EOF )
            // InternalMyDsl.g:355:1: ruleNonemptylist EOF
            {
             before(grammarAccess.getNonemptylistRule()); 
            pushFollow(FOLLOW_1);
            ruleNonemptylist();

            state._fsp--;

             after(grammarAccess.getNonemptylistRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNonemptylist"


    // $ANTLR start "ruleNonemptylist"
    // InternalMyDsl.g:362:1: ruleNonemptylist : ( ( rule__Nonemptylist__Alternatives ) ) ;
    public final void ruleNonemptylist() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__Nonemptylist__Alternatives ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__Nonemptylist__Alternatives ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__Nonemptylist__Alternatives ) )
            // InternalMyDsl.g:368:3: ( rule__Nonemptylist__Alternatives )
            {
             before(grammarAccess.getNonemptylistAccess().getAlternatives()); 
            // InternalMyDsl.g:369:3: ( rule__Nonemptylist__Alternatives )
            // InternalMyDsl.g:369:4: rule__Nonemptylist__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Nonemptylist__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNonemptylistAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNonemptylist"


    // $ANTLR start "entryRuleFolge"
    // InternalMyDsl.g:378:1: entryRuleFolge : ruleFolge EOF ;
    public final void entryRuleFolge() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleFolge EOF )
            // InternalMyDsl.g:380:1: ruleFolge EOF
            {
             before(grammarAccess.getFolgeRule()); 
            pushFollow(FOLLOW_1);
            ruleFolge();

            state._fsp--;

             after(grammarAccess.getFolgeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFolge"


    // $ANTLR start "ruleFolge"
    // InternalMyDsl.g:387:1: ruleFolge : ( ( rule__Folge__Group__0 ) ) ;
    public final void ruleFolge() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__Folge__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__Folge__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__Folge__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__Folge__Group__0 )
            {
             before(grammarAccess.getFolgeAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__Folge__Group__0 )
            // InternalMyDsl.g:394:4: rule__Folge__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Folge__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFolgeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFolge"


    // $ANTLR start "entryRuleIdent"
    // InternalMyDsl.g:403:1: entryRuleIdent : ruleIdent EOF ;
    public final void entryRuleIdent() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleIdent EOF )
            // InternalMyDsl.g:405:1: ruleIdent EOF
            {
             before(grammarAccess.getIdentRule()); 
            pushFollow(FOLLOW_1);
            ruleIdent();

            state._fsp--;

             after(grammarAccess.getIdentRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIdent"


    // $ANTLR start "ruleIdent"
    // InternalMyDsl.g:412:1: ruleIdent : ( ( rule__Ident__NameAssignment ) ) ;
    public final void ruleIdent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__Ident__NameAssignment ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__Ident__NameAssignment ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__Ident__NameAssignment ) )
            // InternalMyDsl.g:418:3: ( rule__Ident__NameAssignment )
            {
             before(grammarAccess.getIdentAccess().getNameAssignment()); 
            // InternalMyDsl.g:419:3: ( rule__Ident__NameAssignment )
            // InternalMyDsl.g:419:4: rule__Ident__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Ident__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIdentAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIdent"


    // $ANTLR start "entryRuleNumber2"
    // InternalMyDsl.g:428:1: entryRuleNumber2 : ruleNumber2 EOF ;
    public final void entryRuleNumber2() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleNumber2 EOF )
            // InternalMyDsl.g:430:1: ruleNumber2 EOF
            {
             before(grammarAccess.getNumber2Rule()); 
            pushFollow(FOLLOW_1);
            ruleNumber2();

            state._fsp--;

             after(grammarAccess.getNumber2Rule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNumber2"


    // $ANTLR start "ruleNumber2"
    // InternalMyDsl.g:437:1: ruleNumber2 : ( ( rule__Number2__WertAssignment ) ) ;
    public final void ruleNumber2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__Number2__WertAssignment ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__Number2__WertAssignment ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__Number2__WertAssignment ) )
            // InternalMyDsl.g:443:3: ( rule__Number2__WertAssignment )
            {
             before(grammarAccess.getNumber2Access().getWertAssignment()); 
            // InternalMyDsl.g:444:3: ( rule__Number2__WertAssignment )
            // InternalMyDsl.g:444:4: rule__Number2__WertAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Number2__WertAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNumber2Access().getWertAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumber2"


    // $ANTLR start "entryRuleVariable2"
    // InternalMyDsl.g:453:1: entryRuleVariable2 : ruleVariable2 EOF ;
    public final void entryRuleVariable2() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleVariable2 EOF )
            // InternalMyDsl.g:455:1: ruleVariable2 EOF
            {
             before(grammarAccess.getVariable2Rule()); 
            pushFollow(FOLLOW_1);
            ruleVariable2();

            state._fsp--;

             after(grammarAccess.getVariable2Rule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVariable2"


    // $ANTLR start "ruleVariable2"
    // InternalMyDsl.g:462:1: ruleVariable2 : ( ( rule__Variable2__Var1Assignment ) ) ;
    public final void ruleVariable2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__Variable2__Var1Assignment ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__Variable2__Var1Assignment ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__Variable2__Var1Assignment ) )
            // InternalMyDsl.g:468:3: ( rule__Variable2__Var1Assignment )
            {
             before(grammarAccess.getVariable2Access().getVar1Assignment()); 
            // InternalMyDsl.g:469:3: ( rule__Variable2__Var1Assignment )
            // InternalMyDsl.g:469:4: rule__Variable2__Var1Assignment
            {
            pushFollow(FOLLOW_2);
            rule__Variable2__Var1Assignment();

            state._fsp--;


            }

             after(grammarAccess.getVariable2Access().getVar1Assignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable2"


    // $ANTLR start "rule__Clause__Clause1Alternatives_1_0"
    // InternalMyDsl.g:477:1: rule__Clause__Clause1Alternatives_1_0 : ( ( ruleFact ) | ( ruleRule ) );
    public final void rule__Clause__Clause1Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:481:1: ( ( ruleFact ) | ( ruleRule ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            else if ( (LA1_0==15) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:482:2: ( ruleFact )
                    {
                    // InternalMyDsl.g:482:2: ( ruleFact )
                    // InternalMyDsl.g:483:3: ruleFact
                    {
                     before(grammarAccess.getClauseAccess().getClause1FactParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFact();

                    state._fsp--;

                     after(grammarAccess.getClauseAccess().getClause1FactParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:488:2: ( ruleRule )
                    {
                    // InternalMyDsl.g:488:2: ( ruleRule )
                    // InternalMyDsl.g:489:3: ruleRule
                    {
                     before(grammarAccess.getClauseAccess().getClause1RuleParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRule();

                    state._fsp--;

                     after(grammarAccess.getClauseAccess().getClause1RuleParserRuleCall_1_0_1()); 

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
    // $ANTLR end "rule__Clause__Clause1Alternatives_1_0"


    // $ANTLR start "rule__Term__TermAlternatives_0"
    // InternalMyDsl.g:498:1: rule__Term__TermAlternatives_0 : ( ( ruleAtom ) | ( ruleList ) );
    public final void rule__Term__TermAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:502:1: ( ( ruleAtom ) | ( ruleList ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_VAR)) ) {
                alt2=1;
            }
            else if ( (LA2_0==18) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:503:2: ( ruleAtom )
                    {
                    // InternalMyDsl.g:503:2: ( ruleAtom )
                    // InternalMyDsl.g:504:3: ruleAtom
                    {
                     before(grammarAccess.getTermAccess().getTermAtomParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAtom();

                    state._fsp--;

                     after(grammarAccess.getTermAccess().getTermAtomParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:509:2: ( ruleList )
                    {
                    // InternalMyDsl.g:509:2: ( ruleList )
                    // InternalMyDsl.g:510:3: ruleList
                    {
                     before(grammarAccess.getTermAccess().getTermListParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleList();

                    state._fsp--;

                     after(grammarAccess.getTermAccess().getTermListParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__Term__TermAlternatives_0"


    // $ANTLR start "rule__Atom__XxAlternatives_0"
    // InternalMyDsl.g:519:1: rule__Atom__XxAlternatives_0 : ( ( ruleIdent ) | ( ruleNumber2 ) | ( ruleVariable2 ) );
    public final void rule__Atom__XxAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:523:1: ( ( ruleIdent ) | ( ruleNumber2 ) | ( ruleVariable2 ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt3=1;
                }
                break;
            case RULE_INT:
                {
                alt3=2;
                }
                break;
            case RULE_VAR:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:524:2: ( ruleIdent )
                    {
                    // InternalMyDsl.g:524:2: ( ruleIdent )
                    // InternalMyDsl.g:525:3: ruleIdent
                    {
                     before(grammarAccess.getAtomAccess().getXxIdentParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIdent();

                    state._fsp--;

                     after(grammarAccess.getAtomAccess().getXxIdentParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:530:2: ( ruleNumber2 )
                    {
                    // InternalMyDsl.g:530:2: ( ruleNumber2 )
                    // InternalMyDsl.g:531:3: ruleNumber2
                    {
                     before(grammarAccess.getAtomAccess().getXxNumber2ParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNumber2();

                    state._fsp--;

                     after(grammarAccess.getAtomAccess().getXxNumber2ParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:536:2: ( ruleVariable2 )
                    {
                    // InternalMyDsl.g:536:2: ( ruleVariable2 )
                    // InternalMyDsl.g:537:3: ruleVariable2
                    {
                     before(grammarAccess.getAtomAccess().getXxVariable2ParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleVariable2();

                    state._fsp--;

                     after(grammarAccess.getAtomAccess().getXxVariable2ParserRuleCall_0_2()); 

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
    // $ANTLR end "rule__Atom__XxAlternatives_0"


    // $ANTLR start "rule__List__Alternatives"
    // InternalMyDsl.g:546:1: rule__List__Alternatives : ( ( ( rule__List__Group_0__0 ) ) | ( ( rule__List__NelAssignment_1 ) ) );
    public final void rule__List__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:550:1: ( ( ( rule__List__Group_0__0 ) ) | ( ( rule__List__NelAssignment_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                int LA4_1 = input.LA(2);

                if ( ((LA4_1>=RULE_ID && LA4_1<=RULE_VAR)) ) {
                    alt4=2;
                }
                else if ( (LA4_1==19) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:551:2: ( ( rule__List__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:551:2: ( ( rule__List__Group_0__0 ) )
                    // InternalMyDsl.g:552:3: ( rule__List__Group_0__0 )
                    {
                     before(grammarAccess.getListAccess().getGroup_0()); 
                    // InternalMyDsl.g:553:3: ( rule__List__Group_0__0 )
                    // InternalMyDsl.g:553:4: rule__List__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__List__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getListAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:557:2: ( ( rule__List__NelAssignment_1 ) )
                    {
                    // InternalMyDsl.g:557:2: ( ( rule__List__NelAssignment_1 ) )
                    // InternalMyDsl.g:558:3: ( rule__List__NelAssignment_1 )
                    {
                     before(grammarAccess.getListAccess().getNelAssignment_1()); 
                    // InternalMyDsl.g:559:3: ( rule__List__NelAssignment_1 )
                    // InternalMyDsl.g:559:4: rule__List__NelAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__List__NelAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getListAccess().getNelAssignment_1()); 

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
    // $ANTLR end "rule__List__Alternatives"


    // $ANTLR start "rule__Nonemptylist__Alternatives"
    // InternalMyDsl.g:567:1: rule__Nonemptylist__Alternatives : ( ( ( rule__Nonemptylist__Group_0__0 ) ) | ( ( rule__Nonemptylist__Group_1__0 ) ) );
    public final void rule__Nonemptylist__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:571:1: ( ( ( rule__Nonemptylist__Group_0__0 ) ) | ( ( rule__Nonemptylist__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                switch ( input.LA(2) ) {
                case RULE_ID:
                    {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==20) ) {
                        alt5=2;
                    }
                    else if ( (LA5_2==14||LA5_2==19) ) {
                        alt5=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_INT:
                    {
                    int LA5_3 = input.LA(3);

                    if ( (LA5_3==20) ) {
                        alt5=2;
                    }
                    else if ( (LA5_3==14||LA5_3==19) ) {
                        alt5=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_VAR:
                    {
                    int LA5_4 = input.LA(3);

                    if ( (LA5_4==14||LA5_4==19) ) {
                        alt5=1;
                    }
                    else if ( (LA5_4==20) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:572:2: ( ( rule__Nonemptylist__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:572:2: ( ( rule__Nonemptylist__Group_0__0 ) )
                    // InternalMyDsl.g:573:3: ( rule__Nonemptylist__Group_0__0 )
                    {
                     before(grammarAccess.getNonemptylistAccess().getGroup_0()); 
                    // InternalMyDsl.g:574:3: ( rule__Nonemptylist__Group_0__0 )
                    // InternalMyDsl.g:574:4: rule__Nonemptylist__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Nonemptylist__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNonemptylistAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:578:2: ( ( rule__Nonemptylist__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:578:2: ( ( rule__Nonemptylist__Group_1__0 ) )
                    // InternalMyDsl.g:579:3: ( rule__Nonemptylist__Group_1__0 )
                    {
                     before(grammarAccess.getNonemptylistAccess().getGroup_1()); 
                    // InternalMyDsl.g:580:3: ( rule__Nonemptylist__Group_1__0 )
                    // InternalMyDsl.g:580:4: rule__Nonemptylist__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Nonemptylist__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNonemptylistAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Nonemptylist__Alternatives"


    // $ANTLR start "rule__Prologdsl__Group__0"
    // InternalMyDsl.g:588:1: rule__Prologdsl__Group__0 : rule__Prologdsl__Group__0__Impl rule__Prologdsl__Group__1 ;
    public final void rule__Prologdsl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:592:1: ( rule__Prologdsl__Group__0__Impl rule__Prologdsl__Group__1 )
            // InternalMyDsl.g:593:2: rule__Prologdsl__Group__0__Impl rule__Prologdsl__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Prologdsl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Prologdsl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prologdsl__Group__0"


    // $ANTLR start "rule__Prologdsl__Group__0__Impl"
    // InternalMyDsl.g:600:1: rule__Prologdsl__Group__0__Impl : ( ( rule__Prologdsl__PrologdslAssignment_0 ) ) ;
    public final void rule__Prologdsl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:604:1: ( ( ( rule__Prologdsl__PrologdslAssignment_0 ) ) )
            // InternalMyDsl.g:605:1: ( ( rule__Prologdsl__PrologdslAssignment_0 ) )
            {
            // InternalMyDsl.g:605:1: ( ( rule__Prologdsl__PrologdslAssignment_0 ) )
            // InternalMyDsl.g:606:2: ( rule__Prologdsl__PrologdslAssignment_0 )
            {
             before(grammarAccess.getPrologdslAccess().getPrologdslAssignment_0()); 
            // InternalMyDsl.g:607:2: ( rule__Prologdsl__PrologdslAssignment_0 )
            // InternalMyDsl.g:607:3: rule__Prologdsl__PrologdslAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Prologdsl__PrologdslAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPrologdslAccess().getPrologdslAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prologdsl__Group__0__Impl"


    // $ANTLR start "rule__Prologdsl__Group__1"
    // InternalMyDsl.g:615:1: rule__Prologdsl__Group__1 : rule__Prologdsl__Group__1__Impl ;
    public final void rule__Prologdsl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:619:1: ( rule__Prologdsl__Group__1__Impl )
            // InternalMyDsl.g:620:2: rule__Prologdsl__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Prologdsl__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prologdsl__Group__1"


    // $ANTLR start "rule__Prologdsl__Group__1__Impl"
    // InternalMyDsl.g:626:1: rule__Prologdsl__Group__1__Impl : ( ( rule__Prologdsl__ExAssignment_1 ) ) ;
    public final void rule__Prologdsl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:630:1: ( ( ( rule__Prologdsl__ExAssignment_1 ) ) )
            // InternalMyDsl.g:631:1: ( ( rule__Prologdsl__ExAssignment_1 ) )
            {
            // InternalMyDsl.g:631:1: ( ( rule__Prologdsl__ExAssignment_1 ) )
            // InternalMyDsl.g:632:2: ( rule__Prologdsl__ExAssignment_1 )
            {
             before(grammarAccess.getPrologdslAccess().getExAssignment_1()); 
            // InternalMyDsl.g:633:2: ( rule__Prologdsl__ExAssignment_1 )
            // InternalMyDsl.g:633:3: rule__Prologdsl__ExAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Prologdsl__ExAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPrologdslAccess().getExAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prologdsl__Group__1__Impl"


    // $ANTLR start "rule__Program__Group__0"
    // InternalMyDsl.g:642:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:646:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalMyDsl.g:647:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Program__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0"


    // $ANTLR start "rule__Program__Group__0__Impl"
    // InternalMyDsl.g:654:1: rule__Program__Group__0__Impl : ( ( rule__Program__Clause1Assignment_0 ) ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:658:1: ( ( ( rule__Program__Clause1Assignment_0 ) ) )
            // InternalMyDsl.g:659:1: ( ( rule__Program__Clause1Assignment_0 ) )
            {
            // InternalMyDsl.g:659:1: ( ( rule__Program__Clause1Assignment_0 ) )
            // InternalMyDsl.g:660:2: ( rule__Program__Clause1Assignment_0 )
            {
             before(grammarAccess.getProgramAccess().getClause1Assignment_0()); 
            // InternalMyDsl.g:661:2: ( rule__Program__Clause1Assignment_0 )
            // InternalMyDsl.g:661:3: rule__Program__Clause1Assignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Program__Clause1Assignment_0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getClause1Assignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0__Impl"


    // $ANTLR start "rule__Program__Group__1"
    // InternalMyDsl.g:669:1: rule__Program__Group__1 : rule__Program__Group__1__Impl ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:673:1: ( rule__Program__Group__1__Impl )
            // InternalMyDsl.g:674:2: rule__Program__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1"


    // $ANTLR start "rule__Program__Group__1__Impl"
    // InternalMyDsl.g:680:1: rule__Program__Group__1__Impl : ( ( rule__Program__Clause2Assignment_1 )* ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:684:1: ( ( ( rule__Program__Clause2Assignment_1 )* ) )
            // InternalMyDsl.g:685:1: ( ( rule__Program__Clause2Assignment_1 )* )
            {
            // InternalMyDsl.g:685:1: ( ( rule__Program__Clause2Assignment_1 )* )
            // InternalMyDsl.g:686:2: ( rule__Program__Clause2Assignment_1 )*
            {
             before(grammarAccess.getProgramAccess().getClause2Assignment_1()); 
            // InternalMyDsl.g:687:2: ( rule__Program__Clause2Assignment_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:687:3: rule__Program__Clause2Assignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Program__Clause2Assignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getClause2Assignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1__Impl"


    // $ANTLR start "rule__Exquery__Group__0"
    // InternalMyDsl.g:696:1: rule__Exquery__Group__0 : rule__Exquery__Group__0__Impl rule__Exquery__Group__1 ;
    public final void rule__Exquery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:700:1: ( rule__Exquery__Group__0__Impl rule__Exquery__Group__1 )
            // InternalMyDsl.g:701:2: rule__Exquery__Group__0__Impl rule__Exquery__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Exquery__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exquery__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exquery__Group__0"


    // $ANTLR start "rule__Exquery__Group__0__Impl"
    // InternalMyDsl.g:708:1: rule__Exquery__Group__0__Impl : ( '?-' ) ;
    public final void rule__Exquery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:712:1: ( ( '?-' ) )
            // InternalMyDsl.g:713:1: ( '?-' )
            {
            // InternalMyDsl.g:713:1: ( '?-' )
            // InternalMyDsl.g:714:2: '?-'
            {
             before(grammarAccess.getExqueryAccess().getQuestionMarkHyphenMinusKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getExqueryAccess().getQuestionMarkHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exquery__Group__0__Impl"


    // $ANTLR start "rule__Exquery__Group__1"
    // InternalMyDsl.g:723:1: rule__Exquery__Group__1 : rule__Exquery__Group__1__Impl rule__Exquery__Group__2 ;
    public final void rule__Exquery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:727:1: ( rule__Exquery__Group__1__Impl rule__Exquery__Group__2 )
            // InternalMyDsl.g:728:2: rule__Exquery__Group__1__Impl rule__Exquery__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Exquery__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exquery__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exquery__Group__1"


    // $ANTLR start "rule__Exquery__Group__1__Impl"
    // InternalMyDsl.g:735:1: rule__Exquery__Group__1__Impl : ( ( rule__Exquery__QAssignment_1 ) ) ;
    public final void rule__Exquery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:739:1: ( ( ( rule__Exquery__QAssignment_1 ) ) )
            // InternalMyDsl.g:740:1: ( ( rule__Exquery__QAssignment_1 ) )
            {
            // InternalMyDsl.g:740:1: ( ( rule__Exquery__QAssignment_1 ) )
            // InternalMyDsl.g:741:2: ( rule__Exquery__QAssignment_1 )
            {
             before(grammarAccess.getExqueryAccess().getQAssignment_1()); 
            // InternalMyDsl.g:742:2: ( rule__Exquery__QAssignment_1 )
            // InternalMyDsl.g:742:3: rule__Exquery__QAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Exquery__QAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExqueryAccess().getQAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exquery__Group__1__Impl"


    // $ANTLR start "rule__Exquery__Group__2"
    // InternalMyDsl.g:750:1: rule__Exquery__Group__2 : rule__Exquery__Group__2__Impl ;
    public final void rule__Exquery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:754:1: ( rule__Exquery__Group__2__Impl )
            // InternalMyDsl.g:755:2: rule__Exquery__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exquery__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exquery__Group__2"


    // $ANTLR start "rule__Exquery__Group__2__Impl"
    // InternalMyDsl.g:761:1: rule__Exquery__Group__2__Impl : ( '.' ) ;
    public final void rule__Exquery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:765:1: ( ( '.' ) )
            // InternalMyDsl.g:766:1: ( '.' )
            {
            // InternalMyDsl.g:766:1: ( '.' )
            // InternalMyDsl.g:767:2: '.'
            {
             before(grammarAccess.getExqueryAccess().getFullStopKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getExqueryAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exquery__Group__2__Impl"


    // $ANTLR start "rule__Query__Group__0"
    // InternalMyDsl.g:777:1: rule__Query__Group__0 : rule__Query__Group__0__Impl rule__Query__Group__1 ;
    public final void rule__Query__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:781:1: ( rule__Query__Group__0__Impl rule__Query__Group__1 )
            // InternalMyDsl.g:782:2: rule__Query__Group__0__Impl rule__Query__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Query__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__0"


    // $ANTLR start "rule__Query__Group__0__Impl"
    // InternalMyDsl.g:789:1: rule__Query__Group__0__Impl : ( ( rule__Query__QueryAssignment_0 ) ) ;
    public final void rule__Query__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:793:1: ( ( ( rule__Query__QueryAssignment_0 ) ) )
            // InternalMyDsl.g:794:1: ( ( rule__Query__QueryAssignment_0 ) )
            {
            // InternalMyDsl.g:794:1: ( ( rule__Query__QueryAssignment_0 ) )
            // InternalMyDsl.g:795:2: ( rule__Query__QueryAssignment_0 )
            {
             before(grammarAccess.getQueryAccess().getQueryAssignment_0()); 
            // InternalMyDsl.g:796:2: ( rule__Query__QueryAssignment_0 )
            // InternalMyDsl.g:796:3: rule__Query__QueryAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Query__QueryAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getQueryAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__0__Impl"


    // $ANTLR start "rule__Query__Group__1"
    // InternalMyDsl.g:804:1: rule__Query__Group__1 : rule__Query__Group__1__Impl ;
    public final void rule__Query__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:808:1: ( rule__Query__Group__1__Impl )
            // InternalMyDsl.g:809:2: rule__Query__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Query__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__1"


    // $ANTLR start "rule__Query__Group__1__Impl"
    // InternalMyDsl.g:815:1: rule__Query__Group__1__Impl : ( ( rule__Query__Group_1__0 )* ) ;
    public final void rule__Query__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:819:1: ( ( ( rule__Query__Group_1__0 )* ) )
            // InternalMyDsl.g:820:1: ( ( rule__Query__Group_1__0 )* )
            {
            // InternalMyDsl.g:820:1: ( ( rule__Query__Group_1__0 )* )
            // InternalMyDsl.g:821:2: ( rule__Query__Group_1__0 )*
            {
             before(grammarAccess.getQueryAccess().getGroup_1()); 
            // InternalMyDsl.g:822:2: ( rule__Query__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==14) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:822:3: rule__Query__Group_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Query__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getQueryAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__1__Impl"


    // $ANTLR start "rule__Query__Group_1__0"
    // InternalMyDsl.g:831:1: rule__Query__Group_1__0 : rule__Query__Group_1__0__Impl rule__Query__Group_1__1 ;
    public final void rule__Query__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:835:1: ( rule__Query__Group_1__0__Impl rule__Query__Group_1__1 )
            // InternalMyDsl.g:836:2: rule__Query__Group_1__0__Impl rule__Query__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Query__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group_1__0"


    // $ANTLR start "rule__Query__Group_1__0__Impl"
    // InternalMyDsl.g:843:1: rule__Query__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Query__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:847:1: ( ( ',' ) )
            // InternalMyDsl.g:848:1: ( ',' )
            {
            // InternalMyDsl.g:848:1: ( ',' )
            // InternalMyDsl.g:849:2: ','
            {
             before(grammarAccess.getQueryAccess().getCommaKeyword_1_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getQueryAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group_1__0__Impl"


    // $ANTLR start "rule__Query__Group_1__1"
    // InternalMyDsl.g:858:1: rule__Query__Group_1__1 : rule__Query__Group_1__1__Impl ;
    public final void rule__Query__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:862:1: ( rule__Query__Group_1__1__Impl )
            // InternalMyDsl.g:863:2: rule__Query__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Query__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group_1__1"


    // $ANTLR start "rule__Query__Group_1__1__Impl"
    // InternalMyDsl.g:869:1: rule__Query__Group_1__1__Impl : ( ( rule__Query__PredAssignment_1_1 ) ) ;
    public final void rule__Query__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:873:1: ( ( ( rule__Query__PredAssignment_1_1 ) ) )
            // InternalMyDsl.g:874:1: ( ( rule__Query__PredAssignment_1_1 ) )
            {
            // InternalMyDsl.g:874:1: ( ( rule__Query__PredAssignment_1_1 ) )
            // InternalMyDsl.g:875:2: ( rule__Query__PredAssignment_1_1 )
            {
             before(grammarAccess.getQueryAccess().getPredAssignment_1_1()); 
            // InternalMyDsl.g:876:2: ( rule__Query__PredAssignment_1_1 )
            // InternalMyDsl.g:876:3: rule__Query__PredAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Query__PredAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getPredAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group_1__1__Impl"


    // $ANTLR start "rule__Clause__Group__0"
    // InternalMyDsl.g:885:1: rule__Clause__Group__0 : rule__Clause__Group__0__Impl rule__Clause__Group__1 ;
    public final void rule__Clause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:889:1: ( rule__Clause__Group__0__Impl rule__Clause__Group__1 )
            // InternalMyDsl.g:890:2: rule__Clause__Group__0__Impl rule__Clause__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Clause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clause__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clause__Group__0"


    // $ANTLR start "rule__Clause__Group__0__Impl"
    // InternalMyDsl.g:897:1: rule__Clause__Group__0__Impl : ( ( rule__Clause__FactAssignment_0 ) ) ;
    public final void rule__Clause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:901:1: ( ( ( rule__Clause__FactAssignment_0 ) ) )
            // InternalMyDsl.g:902:1: ( ( rule__Clause__FactAssignment_0 ) )
            {
            // InternalMyDsl.g:902:1: ( ( rule__Clause__FactAssignment_0 ) )
            // InternalMyDsl.g:903:2: ( rule__Clause__FactAssignment_0 )
            {
             before(grammarAccess.getClauseAccess().getFactAssignment_0()); 
            // InternalMyDsl.g:904:2: ( rule__Clause__FactAssignment_0 )
            // InternalMyDsl.g:904:3: rule__Clause__FactAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Clause__FactAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getClauseAccess().getFactAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clause__Group__0__Impl"


    // $ANTLR start "rule__Clause__Group__1"
    // InternalMyDsl.g:912:1: rule__Clause__Group__1 : rule__Clause__Group__1__Impl ;
    public final void rule__Clause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:916:1: ( rule__Clause__Group__1__Impl )
            // InternalMyDsl.g:917:2: rule__Clause__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Clause__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clause__Group__1"


    // $ANTLR start "rule__Clause__Group__1__Impl"
    // InternalMyDsl.g:923:1: rule__Clause__Group__1__Impl : ( ( rule__Clause__Clause1Assignment_1 ) ) ;
    public final void rule__Clause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:927:1: ( ( ( rule__Clause__Clause1Assignment_1 ) ) )
            // InternalMyDsl.g:928:1: ( ( rule__Clause__Clause1Assignment_1 ) )
            {
            // InternalMyDsl.g:928:1: ( ( rule__Clause__Clause1Assignment_1 ) )
            // InternalMyDsl.g:929:2: ( rule__Clause__Clause1Assignment_1 )
            {
             before(grammarAccess.getClauseAccess().getClause1Assignment_1()); 
            // InternalMyDsl.g:930:2: ( rule__Clause__Clause1Assignment_1 )
            // InternalMyDsl.g:930:3: rule__Clause__Clause1Assignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Clause__Clause1Assignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClauseAccess().getClause1Assignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clause__Group__1__Impl"


    // $ANTLR start "rule__Fact__Group__0"
    // InternalMyDsl.g:939:1: rule__Fact__Group__0 : rule__Fact__Group__0__Impl rule__Fact__Group__1 ;
    public final void rule__Fact__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:943:1: ( rule__Fact__Group__0__Impl rule__Fact__Group__1 )
            // InternalMyDsl.g:944:2: rule__Fact__Group__0__Impl rule__Fact__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Fact__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fact__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fact__Group__0"


    // $ANTLR start "rule__Fact__Group__0__Impl"
    // InternalMyDsl.g:951:1: rule__Fact__Group__0__Impl : ( () ) ;
    public final void rule__Fact__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:955:1: ( ( () ) )
            // InternalMyDsl.g:956:1: ( () )
            {
            // InternalMyDsl.g:956:1: ( () )
            // InternalMyDsl.g:957:2: ()
            {
             before(grammarAccess.getFactAccess().getFactAction_0()); 
            // InternalMyDsl.g:958:2: ()
            // InternalMyDsl.g:958:3: 
            {
            }

             after(grammarAccess.getFactAccess().getFactAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fact__Group__0__Impl"


    // $ANTLR start "rule__Fact__Group__1"
    // InternalMyDsl.g:966:1: rule__Fact__Group__1 : rule__Fact__Group__1__Impl ;
    public final void rule__Fact__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:970:1: ( rule__Fact__Group__1__Impl )
            // InternalMyDsl.g:971:2: rule__Fact__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fact__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fact__Group__1"


    // $ANTLR start "rule__Fact__Group__1__Impl"
    // InternalMyDsl.g:977:1: rule__Fact__Group__1__Impl : ( '.' ) ;
    public final void rule__Fact__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:981:1: ( ( '.' ) )
            // InternalMyDsl.g:982:1: ( '.' )
            {
            // InternalMyDsl.g:982:1: ( '.' )
            // InternalMyDsl.g:983:2: '.'
            {
             before(grammarAccess.getFactAccess().getFullStopKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFactAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fact__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalMyDsl.g:993:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:997:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalMyDsl.g:998:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // InternalMyDsl.g:1005:1: rule__Rule__Group__0__Impl : ( ':-' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1009:1: ( ( ':-' ) )
            // InternalMyDsl.g:1010:1: ( ':-' )
            {
            // InternalMyDsl.g:1010:1: ( ':-' )
            // InternalMyDsl.g:1011:2: ':-'
            {
             before(grammarAccess.getRuleAccess().getColonHyphenMinusKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getColonHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // InternalMyDsl.g:1020:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1024:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalMyDsl.g:1025:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // InternalMyDsl.g:1032:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__QAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1036:1: ( ( ( rule__Rule__QAssignment_1 ) ) )
            // InternalMyDsl.g:1037:1: ( ( rule__Rule__QAssignment_1 ) )
            {
            // InternalMyDsl.g:1037:1: ( ( rule__Rule__QAssignment_1 ) )
            // InternalMyDsl.g:1038:2: ( rule__Rule__QAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getQAssignment_1()); 
            // InternalMyDsl.g:1039:2: ( rule__Rule__QAssignment_1 )
            // InternalMyDsl.g:1039:3: rule__Rule__QAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__QAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getQAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // InternalMyDsl.g:1047:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1051:1: ( rule__Rule__Group__2__Impl )
            // InternalMyDsl.g:1052:2: rule__Rule__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // InternalMyDsl.g:1058:1: rule__Rule__Group__2__Impl : ( '.' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1062:1: ( ( '.' ) )
            // InternalMyDsl.g:1063:1: ( '.' )
            {
            // InternalMyDsl.g:1063:1: ( '.' )
            // InternalMyDsl.g:1064:2: '.'
            {
             before(grammarAccess.getRuleAccess().getFullStopKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Predicate__Group__0"
    // InternalMyDsl.g:1074:1: rule__Predicate__Group__0 : rule__Predicate__Group__0__Impl rule__Predicate__Group__1 ;
    public final void rule__Predicate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1078:1: ( rule__Predicate__Group__0__Impl rule__Predicate__Group__1 )
            // InternalMyDsl.g:1079:2: rule__Predicate__Group__0__Impl rule__Predicate__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Predicate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Predicate__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group__0"


    // $ANTLR start "rule__Predicate__Group__0__Impl"
    // InternalMyDsl.g:1086:1: rule__Predicate__Group__0__Impl : ( ( rule__Predicate__PredAssignment_0 ) ) ;
    public final void rule__Predicate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1090:1: ( ( ( rule__Predicate__PredAssignment_0 ) ) )
            // InternalMyDsl.g:1091:1: ( ( rule__Predicate__PredAssignment_0 ) )
            {
            // InternalMyDsl.g:1091:1: ( ( rule__Predicate__PredAssignment_0 ) )
            // InternalMyDsl.g:1092:2: ( rule__Predicate__PredAssignment_0 )
            {
             before(grammarAccess.getPredicateAccess().getPredAssignment_0()); 
            // InternalMyDsl.g:1093:2: ( rule__Predicate__PredAssignment_0 )
            // InternalMyDsl.g:1093:3: rule__Predicate__PredAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Predicate__PredAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPredicateAccess().getPredAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group__0__Impl"


    // $ANTLR start "rule__Predicate__Group__1"
    // InternalMyDsl.g:1101:1: rule__Predicate__Group__1 : rule__Predicate__Group__1__Impl rule__Predicate__Group__2 ;
    public final void rule__Predicate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1105:1: ( rule__Predicate__Group__1__Impl rule__Predicate__Group__2 )
            // InternalMyDsl.g:1106:2: rule__Predicate__Group__1__Impl rule__Predicate__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Predicate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Predicate__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group__1"


    // $ANTLR start "rule__Predicate__Group__1__Impl"
    // InternalMyDsl.g:1113:1: rule__Predicate__Group__1__Impl : ( '(' ) ;
    public final void rule__Predicate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1117:1: ( ( '(' ) )
            // InternalMyDsl.g:1118:1: ( '(' )
            {
            // InternalMyDsl.g:1118:1: ( '(' )
            // InternalMyDsl.g:1119:2: '('
            {
             before(grammarAccess.getPredicateAccess().getLeftParenthesisKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPredicateAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group__1__Impl"


    // $ANTLR start "rule__Predicate__Group__2"
    // InternalMyDsl.g:1128:1: rule__Predicate__Group__2 : rule__Predicate__Group__2__Impl rule__Predicate__Group__3 ;
    public final void rule__Predicate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1132:1: ( rule__Predicate__Group__2__Impl rule__Predicate__Group__3 )
            // InternalMyDsl.g:1133:2: rule__Predicate__Group__2__Impl rule__Predicate__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Predicate__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Predicate__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group__2"


    // $ANTLR start "rule__Predicate__Group__2__Impl"
    // InternalMyDsl.g:1140:1: rule__Predicate__Group__2__Impl : ( ( rule__Predicate__TAssignment_2 ) ) ;
    public final void rule__Predicate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1144:1: ( ( ( rule__Predicate__TAssignment_2 ) ) )
            // InternalMyDsl.g:1145:1: ( ( rule__Predicate__TAssignment_2 ) )
            {
            // InternalMyDsl.g:1145:1: ( ( rule__Predicate__TAssignment_2 ) )
            // InternalMyDsl.g:1146:2: ( rule__Predicate__TAssignment_2 )
            {
             before(grammarAccess.getPredicateAccess().getTAssignment_2()); 
            // InternalMyDsl.g:1147:2: ( rule__Predicate__TAssignment_2 )
            // InternalMyDsl.g:1147:3: rule__Predicate__TAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Predicate__TAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPredicateAccess().getTAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group__2__Impl"


    // $ANTLR start "rule__Predicate__Group__3"
    // InternalMyDsl.g:1155:1: rule__Predicate__Group__3 : rule__Predicate__Group__3__Impl rule__Predicate__Group__4 ;
    public final void rule__Predicate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1159:1: ( rule__Predicate__Group__3__Impl rule__Predicate__Group__4 )
            // InternalMyDsl.g:1160:2: rule__Predicate__Group__3__Impl rule__Predicate__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Predicate__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Predicate__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group__3"


    // $ANTLR start "rule__Predicate__Group__3__Impl"
    // InternalMyDsl.g:1167:1: rule__Predicate__Group__3__Impl : ( ( rule__Predicate__Group_3__0 )* ) ;
    public final void rule__Predicate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1171:1: ( ( ( rule__Predicate__Group_3__0 )* ) )
            // InternalMyDsl.g:1172:1: ( ( rule__Predicate__Group_3__0 )* )
            {
            // InternalMyDsl.g:1172:1: ( ( rule__Predicate__Group_3__0 )* )
            // InternalMyDsl.g:1173:2: ( rule__Predicate__Group_3__0 )*
            {
             before(grammarAccess.getPredicateAccess().getGroup_3()); 
            // InternalMyDsl.g:1174:2: ( rule__Predicate__Group_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==14) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:1174:3: rule__Predicate__Group_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Predicate__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getPredicateAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group__3__Impl"


    // $ANTLR start "rule__Predicate__Group__4"
    // InternalMyDsl.g:1182:1: rule__Predicate__Group__4 : rule__Predicate__Group__4__Impl ;
    public final void rule__Predicate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1186:1: ( rule__Predicate__Group__4__Impl )
            // InternalMyDsl.g:1187:2: rule__Predicate__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Predicate__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group__4"


    // $ANTLR start "rule__Predicate__Group__4__Impl"
    // InternalMyDsl.g:1193:1: rule__Predicate__Group__4__Impl : ( ')' ) ;
    public final void rule__Predicate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1197:1: ( ( ')' ) )
            // InternalMyDsl.g:1198:1: ( ')' )
            {
            // InternalMyDsl.g:1198:1: ( ')' )
            // InternalMyDsl.g:1199:2: ')'
            {
             before(grammarAccess.getPredicateAccess().getRightParenthesisKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPredicateAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group__4__Impl"


    // $ANTLR start "rule__Predicate__Group_3__0"
    // InternalMyDsl.g:1209:1: rule__Predicate__Group_3__0 : rule__Predicate__Group_3__0__Impl rule__Predicate__Group_3__1 ;
    public final void rule__Predicate__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1213:1: ( rule__Predicate__Group_3__0__Impl rule__Predicate__Group_3__1 )
            // InternalMyDsl.g:1214:2: rule__Predicate__Group_3__0__Impl rule__Predicate__Group_3__1
            {
            pushFollow(FOLLOW_11);
            rule__Predicate__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Predicate__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group_3__0"


    // $ANTLR start "rule__Predicate__Group_3__0__Impl"
    // InternalMyDsl.g:1221:1: rule__Predicate__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Predicate__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1225:1: ( ( ',' ) )
            // InternalMyDsl.g:1226:1: ( ',' )
            {
            // InternalMyDsl.g:1226:1: ( ',' )
            // InternalMyDsl.g:1227:2: ','
            {
             before(grammarAccess.getPredicateAccess().getCommaKeyword_3_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPredicateAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group_3__0__Impl"


    // $ANTLR start "rule__Predicate__Group_3__1"
    // InternalMyDsl.g:1236:1: rule__Predicate__Group_3__1 : rule__Predicate__Group_3__1__Impl ;
    public final void rule__Predicate__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1240:1: ( rule__Predicate__Group_3__1__Impl )
            // InternalMyDsl.g:1241:2: rule__Predicate__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Predicate__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group_3__1"


    // $ANTLR start "rule__Predicate__Group_3__1__Impl"
    // InternalMyDsl.g:1247:1: rule__Predicate__Group_3__1__Impl : ( ( rule__Predicate__T2Assignment_3_1 ) ) ;
    public final void rule__Predicate__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1251:1: ( ( ( rule__Predicate__T2Assignment_3_1 ) ) )
            // InternalMyDsl.g:1252:1: ( ( rule__Predicate__T2Assignment_3_1 ) )
            {
            // InternalMyDsl.g:1252:1: ( ( rule__Predicate__T2Assignment_3_1 ) )
            // InternalMyDsl.g:1253:2: ( rule__Predicate__T2Assignment_3_1 )
            {
             before(grammarAccess.getPredicateAccess().getT2Assignment_3_1()); 
            // InternalMyDsl.g:1254:2: ( rule__Predicate__T2Assignment_3_1 )
            // InternalMyDsl.g:1254:3: rule__Predicate__T2Assignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Predicate__T2Assignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPredicateAccess().getT2Assignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group_3__1__Impl"


    // $ANTLR start "rule__List__Group_0__0"
    // InternalMyDsl.g:1263:1: rule__List__Group_0__0 : rule__List__Group_0__0__Impl rule__List__Group_0__1 ;
    public final void rule__List__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1267:1: ( rule__List__Group_0__0__Impl rule__List__Group_0__1 )
            // InternalMyDsl.g:1268:2: rule__List__Group_0__0__Impl rule__List__Group_0__1
            {
            pushFollow(FOLLOW_13);
            rule__List__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__List__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group_0__0"


    // $ANTLR start "rule__List__Group_0__0__Impl"
    // InternalMyDsl.g:1275:1: rule__List__Group_0__0__Impl : ( () ) ;
    public final void rule__List__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1279:1: ( ( () ) )
            // InternalMyDsl.g:1280:1: ( () )
            {
            // InternalMyDsl.g:1280:1: ( () )
            // InternalMyDsl.g:1281:2: ()
            {
             before(grammarAccess.getListAccess().getListAction_0_0()); 
            // InternalMyDsl.g:1282:2: ()
            // InternalMyDsl.g:1282:3: 
            {
            }

             after(grammarAccess.getListAccess().getListAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group_0__0__Impl"


    // $ANTLR start "rule__List__Group_0__1"
    // InternalMyDsl.g:1290:1: rule__List__Group_0__1 : rule__List__Group_0__1__Impl rule__List__Group_0__2 ;
    public final void rule__List__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1294:1: ( rule__List__Group_0__1__Impl rule__List__Group_0__2 )
            // InternalMyDsl.g:1295:2: rule__List__Group_0__1__Impl rule__List__Group_0__2
            {
            pushFollow(FOLLOW_14);
            rule__List__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__List__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group_0__1"


    // $ANTLR start "rule__List__Group_0__1__Impl"
    // InternalMyDsl.g:1302:1: rule__List__Group_0__1__Impl : ( '[' ) ;
    public final void rule__List__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1306:1: ( ( '[' ) )
            // InternalMyDsl.g:1307:1: ( '[' )
            {
            // InternalMyDsl.g:1307:1: ( '[' )
            // InternalMyDsl.g:1308:2: '['
            {
             before(grammarAccess.getListAccess().getLeftSquareBracketKeyword_0_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getListAccess().getLeftSquareBracketKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group_0__1__Impl"


    // $ANTLR start "rule__List__Group_0__2"
    // InternalMyDsl.g:1317:1: rule__List__Group_0__2 : rule__List__Group_0__2__Impl ;
    public final void rule__List__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1321:1: ( rule__List__Group_0__2__Impl )
            // InternalMyDsl.g:1322:2: rule__List__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__List__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group_0__2"


    // $ANTLR start "rule__List__Group_0__2__Impl"
    // InternalMyDsl.g:1328:1: rule__List__Group_0__2__Impl : ( ']' ) ;
    public final void rule__List__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1332:1: ( ( ']' ) )
            // InternalMyDsl.g:1333:1: ( ']' )
            {
            // InternalMyDsl.g:1333:1: ( ']' )
            // InternalMyDsl.g:1334:2: ']'
            {
             before(grammarAccess.getListAccess().getRightSquareBracketKeyword_0_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getListAccess().getRightSquareBracketKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group_0__2__Impl"


    // $ANTLR start "rule__Nonemptylist__Group_0__0"
    // InternalMyDsl.g:1344:1: rule__Nonemptylist__Group_0__0 : rule__Nonemptylist__Group_0__0__Impl rule__Nonemptylist__Group_0__1 ;
    public final void rule__Nonemptylist__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1348:1: ( rule__Nonemptylist__Group_0__0__Impl rule__Nonemptylist__Group_0__1 )
            // InternalMyDsl.g:1349:2: rule__Nonemptylist__Group_0__0__Impl rule__Nonemptylist__Group_0__1
            {
            pushFollow(FOLLOW_15);
            rule__Nonemptylist__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Nonemptylist__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nonemptylist__Group_0__0"


    // $ANTLR start "rule__Nonemptylist__Group_0__0__Impl"
    // InternalMyDsl.g:1356:1: rule__Nonemptylist__Group_0__0__Impl : ( '[' ) ;
    public final void rule__Nonemptylist__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1360:1: ( ( '[' ) )
            // InternalMyDsl.g:1361:1: ( '[' )
            {
            // InternalMyDsl.g:1361:1: ( '[' )
            // InternalMyDsl.g:1362:2: '['
            {
             before(grammarAccess.getNonemptylistAccess().getLeftSquareBracketKeyword_0_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getNonemptylistAccess().getLeftSquareBracketKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nonemptylist__Group_0__0__Impl"


    // $ANTLR start "rule__Nonemptylist__Group_0__1"
    // InternalMyDsl.g:1371:1: rule__Nonemptylist__Group_0__1 : rule__Nonemptylist__Group_0__1__Impl rule__Nonemptylist__Group_0__2 ;
    public final void rule__Nonemptylist__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1375:1: ( rule__Nonemptylist__Group_0__1__Impl rule__Nonemptylist__Group_0__2 )
            // InternalMyDsl.g:1376:2: rule__Nonemptylist__Group_0__1__Impl rule__Nonemptylist__Group_0__2
            {
            pushFollow(FOLLOW_14);
            rule__Nonemptylist__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Nonemptylist__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nonemptylist__Group_0__1"


    // $ANTLR start "rule__Nonemptylist__Group_0__1__Impl"
    // InternalMyDsl.g:1383:1: rule__Nonemptylist__Group_0__1__Impl : ( ( rule__Nonemptylist__FolgeAssignment_0_1 ) ) ;
    public final void rule__Nonemptylist__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1387:1: ( ( ( rule__Nonemptylist__FolgeAssignment_0_1 ) ) )
            // InternalMyDsl.g:1388:1: ( ( rule__Nonemptylist__FolgeAssignment_0_1 ) )
            {
            // InternalMyDsl.g:1388:1: ( ( rule__Nonemptylist__FolgeAssignment_0_1 ) )
            // InternalMyDsl.g:1389:2: ( rule__Nonemptylist__FolgeAssignment_0_1 )
            {
             before(grammarAccess.getNonemptylistAccess().getFolgeAssignment_0_1()); 
            // InternalMyDsl.g:1390:2: ( rule__Nonemptylist__FolgeAssignment_0_1 )
            // InternalMyDsl.g:1390:3: rule__Nonemptylist__FolgeAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Nonemptylist__FolgeAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getNonemptylistAccess().getFolgeAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nonemptylist__Group_0__1__Impl"


    // $ANTLR start "rule__Nonemptylist__Group_0__2"
    // InternalMyDsl.g:1398:1: rule__Nonemptylist__Group_0__2 : rule__Nonemptylist__Group_0__2__Impl ;
    public final void rule__Nonemptylist__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1402:1: ( rule__Nonemptylist__Group_0__2__Impl )
            // InternalMyDsl.g:1403:2: rule__Nonemptylist__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Nonemptylist__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nonemptylist__Group_0__2"


    // $ANTLR start "rule__Nonemptylist__Group_0__2__Impl"
    // InternalMyDsl.g:1409:1: rule__Nonemptylist__Group_0__2__Impl : ( ']' ) ;
    public final void rule__Nonemptylist__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1413:1: ( ( ']' ) )
            // InternalMyDsl.g:1414:1: ( ']' )
            {
            // InternalMyDsl.g:1414:1: ( ']' )
            // InternalMyDsl.g:1415:2: ']'
            {
             before(grammarAccess.getNonemptylistAccess().getRightSquareBracketKeyword_0_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getNonemptylistAccess().getRightSquareBracketKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nonemptylist__Group_0__2__Impl"


    // $ANTLR start "rule__Nonemptylist__Group_1__0"
    // InternalMyDsl.g:1425:1: rule__Nonemptylist__Group_1__0 : rule__Nonemptylist__Group_1__0__Impl rule__Nonemptylist__Group_1__1 ;
    public final void rule__Nonemptylist__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1429:1: ( rule__Nonemptylist__Group_1__0__Impl rule__Nonemptylist__Group_1__1 )
            // InternalMyDsl.g:1430:2: rule__Nonemptylist__Group_1__0__Impl rule__Nonemptylist__Group_1__1
            {
            pushFollow(FOLLOW_15);
            rule__Nonemptylist__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Nonemptylist__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nonemptylist__Group_1__0"


    // $ANTLR start "rule__Nonemptylist__Group_1__0__Impl"
    // InternalMyDsl.g:1437:1: rule__Nonemptylist__Group_1__0__Impl : ( '[' ) ;
    public final void rule__Nonemptylist__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1441:1: ( ( '[' ) )
            // InternalMyDsl.g:1442:1: ( '[' )
            {
            // InternalMyDsl.g:1442:1: ( '[' )
            // InternalMyDsl.g:1443:2: '['
            {
             before(grammarAccess.getNonemptylistAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getNonemptylistAccess().getLeftSquareBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nonemptylist__Group_1__0__Impl"


    // $ANTLR start "rule__Nonemptylist__Group_1__1"
    // InternalMyDsl.g:1452:1: rule__Nonemptylist__Group_1__1 : rule__Nonemptylist__Group_1__1__Impl rule__Nonemptylist__Group_1__2 ;
    public final void rule__Nonemptylist__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1456:1: ( rule__Nonemptylist__Group_1__1__Impl rule__Nonemptylist__Group_1__2 )
            // InternalMyDsl.g:1457:2: rule__Nonemptylist__Group_1__1__Impl rule__Nonemptylist__Group_1__2
            {
            pushFollow(FOLLOW_16);
            rule__Nonemptylist__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Nonemptylist__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nonemptylist__Group_1__1"


    // $ANTLR start "rule__Nonemptylist__Group_1__1__Impl"
    // InternalMyDsl.g:1464:1: rule__Nonemptylist__Group_1__1__Impl : ( ( rule__Nonemptylist__AtomAssignment_1_1 ) ) ;
    public final void rule__Nonemptylist__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1468:1: ( ( ( rule__Nonemptylist__AtomAssignment_1_1 ) ) )
            // InternalMyDsl.g:1469:1: ( ( rule__Nonemptylist__AtomAssignment_1_1 ) )
            {
            // InternalMyDsl.g:1469:1: ( ( rule__Nonemptylist__AtomAssignment_1_1 ) )
            // InternalMyDsl.g:1470:2: ( rule__Nonemptylist__AtomAssignment_1_1 )
            {
             before(grammarAccess.getNonemptylistAccess().getAtomAssignment_1_1()); 
            // InternalMyDsl.g:1471:2: ( rule__Nonemptylist__AtomAssignment_1_1 )
            // InternalMyDsl.g:1471:3: rule__Nonemptylist__AtomAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Nonemptylist__AtomAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNonemptylistAccess().getAtomAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nonemptylist__Group_1__1__Impl"


    // $ANTLR start "rule__Nonemptylist__Group_1__2"
    // InternalMyDsl.g:1479:1: rule__Nonemptylist__Group_1__2 : rule__Nonemptylist__Group_1__2__Impl rule__Nonemptylist__Group_1__3 ;
    public final void rule__Nonemptylist__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1483:1: ( rule__Nonemptylist__Group_1__2__Impl rule__Nonemptylist__Group_1__3 )
            // InternalMyDsl.g:1484:2: rule__Nonemptylist__Group_1__2__Impl rule__Nonemptylist__Group_1__3
            {
            pushFollow(FOLLOW_11);
            rule__Nonemptylist__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Nonemptylist__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nonemptylist__Group_1__2"


    // $ANTLR start "rule__Nonemptylist__Group_1__2__Impl"
    // InternalMyDsl.g:1491:1: rule__Nonemptylist__Group_1__2__Impl : ( '|' ) ;
    public final void rule__Nonemptylist__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1495:1: ( ( '|' ) )
            // InternalMyDsl.g:1496:1: ( '|' )
            {
            // InternalMyDsl.g:1496:1: ( '|' )
            // InternalMyDsl.g:1497:2: '|'
            {
             before(grammarAccess.getNonemptylistAccess().getVerticalLineKeyword_1_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getNonemptylistAccess().getVerticalLineKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nonemptylist__Group_1__2__Impl"


    // $ANTLR start "rule__Nonemptylist__Group_1__3"
    // InternalMyDsl.g:1506:1: rule__Nonemptylist__Group_1__3 : rule__Nonemptylist__Group_1__3__Impl rule__Nonemptylist__Group_1__4 ;
    public final void rule__Nonemptylist__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1510:1: ( rule__Nonemptylist__Group_1__3__Impl rule__Nonemptylist__Group_1__4 )
            // InternalMyDsl.g:1511:2: rule__Nonemptylist__Group_1__3__Impl rule__Nonemptylist__Group_1__4
            {
            pushFollow(FOLLOW_14);
            rule__Nonemptylist__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Nonemptylist__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nonemptylist__Group_1__3"


    // $ANTLR start "rule__Nonemptylist__Group_1__3__Impl"
    // InternalMyDsl.g:1518:1: rule__Nonemptylist__Group_1__3__Impl : ( ( rule__Nonemptylist__TermAssignment_1_3 ) ) ;
    public final void rule__Nonemptylist__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1522:1: ( ( ( rule__Nonemptylist__TermAssignment_1_3 ) ) )
            // InternalMyDsl.g:1523:1: ( ( rule__Nonemptylist__TermAssignment_1_3 ) )
            {
            // InternalMyDsl.g:1523:1: ( ( rule__Nonemptylist__TermAssignment_1_3 ) )
            // InternalMyDsl.g:1524:2: ( rule__Nonemptylist__TermAssignment_1_3 )
            {
             before(grammarAccess.getNonemptylistAccess().getTermAssignment_1_3()); 
            // InternalMyDsl.g:1525:2: ( rule__Nonemptylist__TermAssignment_1_3 )
            // InternalMyDsl.g:1525:3: rule__Nonemptylist__TermAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__Nonemptylist__TermAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getNonemptylistAccess().getTermAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nonemptylist__Group_1__3__Impl"


    // $ANTLR start "rule__Nonemptylist__Group_1__4"
    // InternalMyDsl.g:1533:1: rule__Nonemptylist__Group_1__4 : rule__Nonemptylist__Group_1__4__Impl ;
    public final void rule__Nonemptylist__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1537:1: ( rule__Nonemptylist__Group_1__4__Impl )
            // InternalMyDsl.g:1538:2: rule__Nonemptylist__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Nonemptylist__Group_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nonemptylist__Group_1__4"


    // $ANTLR start "rule__Nonemptylist__Group_1__4__Impl"
    // InternalMyDsl.g:1544:1: rule__Nonemptylist__Group_1__4__Impl : ( ']' ) ;
    public final void rule__Nonemptylist__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1548:1: ( ( ']' ) )
            // InternalMyDsl.g:1549:1: ( ']' )
            {
            // InternalMyDsl.g:1549:1: ( ']' )
            // InternalMyDsl.g:1550:2: ']'
            {
             before(grammarAccess.getNonemptylistAccess().getRightSquareBracketKeyword_1_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getNonemptylistAccess().getRightSquareBracketKeyword_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nonemptylist__Group_1__4__Impl"


    // $ANTLR start "rule__Folge__Group__0"
    // InternalMyDsl.g:1560:1: rule__Folge__Group__0 : rule__Folge__Group__0__Impl rule__Folge__Group__1 ;
    public final void rule__Folge__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1564:1: ( rule__Folge__Group__0__Impl rule__Folge__Group__1 )
            // InternalMyDsl.g:1565:2: rule__Folge__Group__0__Impl rule__Folge__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Folge__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Folge__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folge__Group__0"


    // $ANTLR start "rule__Folge__Group__0__Impl"
    // InternalMyDsl.g:1572:1: rule__Folge__Group__0__Impl : ( ( rule__Folge__AtomAssignment_0 ) ) ;
    public final void rule__Folge__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1576:1: ( ( ( rule__Folge__AtomAssignment_0 ) ) )
            // InternalMyDsl.g:1577:1: ( ( rule__Folge__AtomAssignment_0 ) )
            {
            // InternalMyDsl.g:1577:1: ( ( rule__Folge__AtomAssignment_0 ) )
            // InternalMyDsl.g:1578:2: ( rule__Folge__AtomAssignment_0 )
            {
             before(grammarAccess.getFolgeAccess().getAtomAssignment_0()); 
            // InternalMyDsl.g:1579:2: ( rule__Folge__AtomAssignment_0 )
            // InternalMyDsl.g:1579:3: rule__Folge__AtomAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Folge__AtomAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFolgeAccess().getAtomAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folge__Group__0__Impl"


    // $ANTLR start "rule__Folge__Group__1"
    // InternalMyDsl.g:1587:1: rule__Folge__Group__1 : rule__Folge__Group__1__Impl ;
    public final void rule__Folge__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1591:1: ( rule__Folge__Group__1__Impl )
            // InternalMyDsl.g:1592:2: rule__Folge__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Folge__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folge__Group__1"


    // $ANTLR start "rule__Folge__Group__1__Impl"
    // InternalMyDsl.g:1598:1: rule__Folge__Group__1__Impl : ( ( rule__Folge__Group_1__0 )* ) ;
    public final void rule__Folge__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1602:1: ( ( ( rule__Folge__Group_1__0 )* ) )
            // InternalMyDsl.g:1603:1: ( ( rule__Folge__Group_1__0 )* )
            {
            // InternalMyDsl.g:1603:1: ( ( rule__Folge__Group_1__0 )* )
            // InternalMyDsl.g:1604:2: ( rule__Folge__Group_1__0 )*
            {
             before(grammarAccess.getFolgeAccess().getGroup_1()); 
            // InternalMyDsl.g:1605:2: ( rule__Folge__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==14) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:1605:3: rule__Folge__Group_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Folge__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getFolgeAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folge__Group__1__Impl"


    // $ANTLR start "rule__Folge__Group_1__0"
    // InternalMyDsl.g:1614:1: rule__Folge__Group_1__0 : rule__Folge__Group_1__0__Impl rule__Folge__Group_1__1 ;
    public final void rule__Folge__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1618:1: ( rule__Folge__Group_1__0__Impl rule__Folge__Group_1__1 )
            // InternalMyDsl.g:1619:2: rule__Folge__Group_1__0__Impl rule__Folge__Group_1__1
            {
            pushFollow(FOLLOW_15);
            rule__Folge__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Folge__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folge__Group_1__0"


    // $ANTLR start "rule__Folge__Group_1__0__Impl"
    // InternalMyDsl.g:1626:1: rule__Folge__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Folge__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1630:1: ( ( ',' ) )
            // InternalMyDsl.g:1631:1: ( ',' )
            {
            // InternalMyDsl.g:1631:1: ( ',' )
            // InternalMyDsl.g:1632:2: ','
            {
             before(grammarAccess.getFolgeAccess().getCommaKeyword_1_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getFolgeAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folge__Group_1__0__Impl"


    // $ANTLR start "rule__Folge__Group_1__1"
    // InternalMyDsl.g:1641:1: rule__Folge__Group_1__1 : rule__Folge__Group_1__1__Impl ;
    public final void rule__Folge__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1645:1: ( rule__Folge__Group_1__1__Impl )
            // InternalMyDsl.g:1646:2: rule__Folge__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Folge__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folge__Group_1__1"


    // $ANTLR start "rule__Folge__Group_1__1__Impl"
    // InternalMyDsl.g:1652:1: rule__Folge__Group_1__1__Impl : ( ( rule__Folge__AtomsAssignment_1_1 ) ) ;
    public final void rule__Folge__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1656:1: ( ( ( rule__Folge__AtomsAssignment_1_1 ) ) )
            // InternalMyDsl.g:1657:1: ( ( rule__Folge__AtomsAssignment_1_1 ) )
            {
            // InternalMyDsl.g:1657:1: ( ( rule__Folge__AtomsAssignment_1_1 ) )
            // InternalMyDsl.g:1658:2: ( rule__Folge__AtomsAssignment_1_1 )
            {
             before(grammarAccess.getFolgeAccess().getAtomsAssignment_1_1()); 
            // InternalMyDsl.g:1659:2: ( rule__Folge__AtomsAssignment_1_1 )
            // InternalMyDsl.g:1659:3: rule__Folge__AtomsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Folge__AtomsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFolgeAccess().getAtomsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folge__Group_1__1__Impl"


    // $ANTLR start "rule__Prologdsl__PrologdslAssignment_0"
    // InternalMyDsl.g:1668:1: rule__Prologdsl__PrologdslAssignment_0 : ( ruleProgram ) ;
    public final void rule__Prologdsl__PrologdslAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1672:1: ( ( ruleProgram ) )
            // InternalMyDsl.g:1673:2: ( ruleProgram )
            {
            // InternalMyDsl.g:1673:2: ( ruleProgram )
            // InternalMyDsl.g:1674:3: ruleProgram
            {
             before(grammarAccess.getPrologdslAccess().getPrologdslProgramParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getPrologdslAccess().getPrologdslProgramParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prologdsl__PrologdslAssignment_0"


    // $ANTLR start "rule__Prologdsl__ExAssignment_1"
    // InternalMyDsl.g:1683:1: rule__Prologdsl__ExAssignment_1 : ( ruleExquery ) ;
    public final void rule__Prologdsl__ExAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1687:1: ( ( ruleExquery ) )
            // InternalMyDsl.g:1688:2: ( ruleExquery )
            {
            // InternalMyDsl.g:1688:2: ( ruleExquery )
            // InternalMyDsl.g:1689:3: ruleExquery
            {
             before(grammarAccess.getPrologdslAccess().getExExqueryParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExquery();

            state._fsp--;

             after(grammarAccess.getPrologdslAccess().getExExqueryParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prologdsl__ExAssignment_1"


    // $ANTLR start "rule__Program__Clause1Assignment_0"
    // InternalMyDsl.g:1698:1: rule__Program__Clause1Assignment_0 : ( ruleClause ) ;
    public final void rule__Program__Clause1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1702:1: ( ( ruleClause ) )
            // InternalMyDsl.g:1703:2: ( ruleClause )
            {
            // InternalMyDsl.g:1703:2: ( ruleClause )
            // InternalMyDsl.g:1704:3: ruleClause
            {
             before(grammarAccess.getProgramAccess().getClause1ClauseParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleClause();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getClause1ClauseParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Clause1Assignment_0"


    // $ANTLR start "rule__Program__Clause2Assignment_1"
    // InternalMyDsl.g:1713:1: rule__Program__Clause2Assignment_1 : ( ruleClause ) ;
    public final void rule__Program__Clause2Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1717:1: ( ( ruleClause ) )
            // InternalMyDsl.g:1718:2: ( ruleClause )
            {
            // InternalMyDsl.g:1718:2: ( ruleClause )
            // InternalMyDsl.g:1719:3: ruleClause
            {
             before(grammarAccess.getProgramAccess().getClause2ClauseParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleClause();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getClause2ClauseParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Clause2Assignment_1"


    // $ANTLR start "rule__Exquery__QAssignment_1"
    // InternalMyDsl.g:1728:1: rule__Exquery__QAssignment_1 : ( ruleQuery ) ;
    public final void rule__Exquery__QAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1732:1: ( ( ruleQuery ) )
            // InternalMyDsl.g:1733:2: ( ruleQuery )
            {
            // InternalMyDsl.g:1733:2: ( ruleQuery )
            // InternalMyDsl.g:1734:3: ruleQuery
            {
             before(grammarAccess.getExqueryAccess().getQQueryParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQuery();

            state._fsp--;

             after(grammarAccess.getExqueryAccess().getQQueryParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exquery__QAssignment_1"


    // $ANTLR start "rule__Query__QueryAssignment_0"
    // InternalMyDsl.g:1743:1: rule__Query__QueryAssignment_0 : ( rulePredicate ) ;
    public final void rule__Query__QueryAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1747:1: ( ( rulePredicate ) )
            // InternalMyDsl.g:1748:2: ( rulePredicate )
            {
            // InternalMyDsl.g:1748:2: ( rulePredicate )
            // InternalMyDsl.g:1749:3: rulePredicate
            {
             before(grammarAccess.getQueryAccess().getQueryPredicateParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePredicate();

            state._fsp--;

             after(grammarAccess.getQueryAccess().getQueryPredicateParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__QueryAssignment_0"


    // $ANTLR start "rule__Query__PredAssignment_1_1"
    // InternalMyDsl.g:1758:1: rule__Query__PredAssignment_1_1 : ( rulePredicate ) ;
    public final void rule__Query__PredAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1762:1: ( ( rulePredicate ) )
            // InternalMyDsl.g:1763:2: ( rulePredicate )
            {
            // InternalMyDsl.g:1763:2: ( rulePredicate )
            // InternalMyDsl.g:1764:3: rulePredicate
            {
             before(grammarAccess.getQueryAccess().getPredPredicateParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePredicate();

            state._fsp--;

             after(grammarAccess.getQueryAccess().getPredPredicateParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__PredAssignment_1_1"


    // $ANTLR start "rule__Clause__FactAssignment_0"
    // InternalMyDsl.g:1773:1: rule__Clause__FactAssignment_0 : ( rulePredicate ) ;
    public final void rule__Clause__FactAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1777:1: ( ( rulePredicate ) )
            // InternalMyDsl.g:1778:2: ( rulePredicate )
            {
            // InternalMyDsl.g:1778:2: ( rulePredicate )
            // InternalMyDsl.g:1779:3: rulePredicate
            {
             before(grammarAccess.getClauseAccess().getFactPredicateParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePredicate();

            state._fsp--;

             after(grammarAccess.getClauseAccess().getFactPredicateParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clause__FactAssignment_0"


    // $ANTLR start "rule__Clause__Clause1Assignment_1"
    // InternalMyDsl.g:1788:1: rule__Clause__Clause1Assignment_1 : ( ( rule__Clause__Clause1Alternatives_1_0 ) ) ;
    public final void rule__Clause__Clause1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1792:1: ( ( ( rule__Clause__Clause1Alternatives_1_0 ) ) )
            // InternalMyDsl.g:1793:2: ( ( rule__Clause__Clause1Alternatives_1_0 ) )
            {
            // InternalMyDsl.g:1793:2: ( ( rule__Clause__Clause1Alternatives_1_0 ) )
            // InternalMyDsl.g:1794:3: ( rule__Clause__Clause1Alternatives_1_0 )
            {
             before(grammarAccess.getClauseAccess().getClause1Alternatives_1_0()); 
            // InternalMyDsl.g:1795:3: ( rule__Clause__Clause1Alternatives_1_0 )
            // InternalMyDsl.g:1795:4: rule__Clause__Clause1Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Clause__Clause1Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getClauseAccess().getClause1Alternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clause__Clause1Assignment_1"


    // $ANTLR start "rule__Rule__QAssignment_1"
    // InternalMyDsl.g:1803:1: rule__Rule__QAssignment_1 : ( ruleQuery ) ;
    public final void rule__Rule__QAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1807:1: ( ( ruleQuery ) )
            // InternalMyDsl.g:1808:2: ( ruleQuery )
            {
            // InternalMyDsl.g:1808:2: ( ruleQuery )
            // InternalMyDsl.g:1809:3: ruleQuery
            {
             before(grammarAccess.getRuleAccess().getQQueryParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQuery();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getQQueryParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__QAssignment_1"


    // $ANTLR start "rule__Predicate__PredAssignment_0"
    // InternalMyDsl.g:1818:1: rule__Predicate__PredAssignment_0 : ( ruleFunctor ) ;
    public final void rule__Predicate__PredAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1822:1: ( ( ruleFunctor ) )
            // InternalMyDsl.g:1823:2: ( ruleFunctor )
            {
            // InternalMyDsl.g:1823:2: ( ruleFunctor )
            // InternalMyDsl.g:1824:3: ruleFunctor
            {
             before(grammarAccess.getPredicateAccess().getPredFunctorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctor();

            state._fsp--;

             after(grammarAccess.getPredicateAccess().getPredFunctorParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__PredAssignment_0"


    // $ANTLR start "rule__Predicate__TAssignment_2"
    // InternalMyDsl.g:1833:1: rule__Predicate__TAssignment_2 : ( ruleTerm ) ;
    public final void rule__Predicate__TAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1837:1: ( ( ruleTerm ) )
            // InternalMyDsl.g:1838:2: ( ruleTerm )
            {
            // InternalMyDsl.g:1838:2: ( ruleTerm )
            // InternalMyDsl.g:1839:3: ruleTerm
            {
             before(grammarAccess.getPredicateAccess().getTTermParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getPredicateAccess().getTTermParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__TAssignment_2"


    // $ANTLR start "rule__Predicate__T2Assignment_3_1"
    // InternalMyDsl.g:1848:1: rule__Predicate__T2Assignment_3_1 : ( ruleTerm ) ;
    public final void rule__Predicate__T2Assignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1852:1: ( ( ruleTerm ) )
            // InternalMyDsl.g:1853:2: ( ruleTerm )
            {
            // InternalMyDsl.g:1853:2: ( ruleTerm )
            // InternalMyDsl.g:1854:3: ruleTerm
            {
             before(grammarAccess.getPredicateAccess().getT2TermParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getPredicateAccess().getT2TermParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__T2Assignment_3_1"


    // $ANTLR start "rule__Functor__FuncAssignment"
    // InternalMyDsl.g:1863:1: rule__Functor__FuncAssignment : ( ruleIdent ) ;
    public final void rule__Functor__FuncAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1867:1: ( ( ruleIdent ) )
            // InternalMyDsl.g:1868:2: ( ruleIdent )
            {
            // InternalMyDsl.g:1868:2: ( ruleIdent )
            // InternalMyDsl.g:1869:3: ruleIdent
            {
             before(grammarAccess.getFunctorAccess().getFuncIdentParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleIdent();

            state._fsp--;

             after(grammarAccess.getFunctorAccess().getFuncIdentParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functor__FuncAssignment"


    // $ANTLR start "rule__Term__TermAssignment"
    // InternalMyDsl.g:1878:1: rule__Term__TermAssignment : ( ( rule__Term__TermAlternatives_0 ) ) ;
    public final void rule__Term__TermAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1882:1: ( ( ( rule__Term__TermAlternatives_0 ) ) )
            // InternalMyDsl.g:1883:2: ( ( rule__Term__TermAlternatives_0 ) )
            {
            // InternalMyDsl.g:1883:2: ( ( rule__Term__TermAlternatives_0 ) )
            // InternalMyDsl.g:1884:3: ( rule__Term__TermAlternatives_0 )
            {
             before(grammarAccess.getTermAccess().getTermAlternatives_0()); 
            // InternalMyDsl.g:1885:3: ( rule__Term__TermAlternatives_0 )
            // InternalMyDsl.g:1885:4: rule__Term__TermAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Term__TermAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getTermAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__TermAssignment"


    // $ANTLR start "rule__Atom__XxAssignment"
    // InternalMyDsl.g:1893:1: rule__Atom__XxAssignment : ( ( rule__Atom__XxAlternatives_0 ) ) ;
    public final void rule__Atom__XxAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1897:1: ( ( ( rule__Atom__XxAlternatives_0 ) ) )
            // InternalMyDsl.g:1898:2: ( ( rule__Atom__XxAlternatives_0 ) )
            {
            // InternalMyDsl.g:1898:2: ( ( rule__Atom__XxAlternatives_0 ) )
            // InternalMyDsl.g:1899:3: ( rule__Atom__XxAlternatives_0 )
            {
             before(grammarAccess.getAtomAccess().getXxAlternatives_0()); 
            // InternalMyDsl.g:1900:3: ( rule__Atom__XxAlternatives_0 )
            // InternalMyDsl.g:1900:4: rule__Atom__XxAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Atom__XxAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getAtomAccess().getXxAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__XxAssignment"


    // $ANTLR start "rule__List__NelAssignment_1"
    // InternalMyDsl.g:1908:1: rule__List__NelAssignment_1 : ( ruleNonemptylist ) ;
    public final void rule__List__NelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1912:1: ( ( ruleNonemptylist ) )
            // InternalMyDsl.g:1913:2: ( ruleNonemptylist )
            {
            // InternalMyDsl.g:1913:2: ( ruleNonemptylist )
            // InternalMyDsl.g:1914:3: ruleNonemptylist
            {
             before(grammarAccess.getListAccess().getNelNonemptylistParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNonemptylist();

            state._fsp--;

             after(grammarAccess.getListAccess().getNelNonemptylistParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__NelAssignment_1"


    // $ANTLR start "rule__Nonemptylist__FolgeAssignment_0_1"
    // InternalMyDsl.g:1923:1: rule__Nonemptylist__FolgeAssignment_0_1 : ( ruleFolge ) ;
    public final void rule__Nonemptylist__FolgeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1927:1: ( ( ruleFolge ) )
            // InternalMyDsl.g:1928:2: ( ruleFolge )
            {
            // InternalMyDsl.g:1928:2: ( ruleFolge )
            // InternalMyDsl.g:1929:3: ruleFolge
            {
             before(grammarAccess.getNonemptylistAccess().getFolgeFolgeParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFolge();

            state._fsp--;

             after(grammarAccess.getNonemptylistAccess().getFolgeFolgeParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nonemptylist__FolgeAssignment_0_1"


    // $ANTLR start "rule__Nonemptylist__AtomAssignment_1_1"
    // InternalMyDsl.g:1938:1: rule__Nonemptylist__AtomAssignment_1_1 : ( ruleAtom ) ;
    public final void rule__Nonemptylist__AtomAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1942:1: ( ( ruleAtom ) )
            // InternalMyDsl.g:1943:2: ( ruleAtom )
            {
            // InternalMyDsl.g:1943:2: ( ruleAtom )
            // InternalMyDsl.g:1944:3: ruleAtom
            {
             before(grammarAccess.getNonemptylistAccess().getAtomAtomParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAtom();

            state._fsp--;

             after(grammarAccess.getNonemptylistAccess().getAtomAtomParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nonemptylist__AtomAssignment_1_1"


    // $ANTLR start "rule__Nonemptylist__TermAssignment_1_3"
    // InternalMyDsl.g:1953:1: rule__Nonemptylist__TermAssignment_1_3 : ( ruleTerm ) ;
    public final void rule__Nonemptylist__TermAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1957:1: ( ( ruleTerm ) )
            // InternalMyDsl.g:1958:2: ( ruleTerm )
            {
            // InternalMyDsl.g:1958:2: ( ruleTerm )
            // InternalMyDsl.g:1959:3: ruleTerm
            {
             before(grammarAccess.getNonemptylistAccess().getTermTermParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getNonemptylistAccess().getTermTermParserRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nonemptylist__TermAssignment_1_3"


    // $ANTLR start "rule__Folge__AtomAssignment_0"
    // InternalMyDsl.g:1968:1: rule__Folge__AtomAssignment_0 : ( ruleAtom ) ;
    public final void rule__Folge__AtomAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1972:1: ( ( ruleAtom ) )
            // InternalMyDsl.g:1973:2: ( ruleAtom )
            {
            // InternalMyDsl.g:1973:2: ( ruleAtom )
            // InternalMyDsl.g:1974:3: ruleAtom
            {
             before(grammarAccess.getFolgeAccess().getAtomAtomParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAtom();

            state._fsp--;

             after(grammarAccess.getFolgeAccess().getAtomAtomParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folge__AtomAssignment_0"


    // $ANTLR start "rule__Folge__AtomsAssignment_1_1"
    // InternalMyDsl.g:1983:1: rule__Folge__AtomsAssignment_1_1 : ( ruleAtom ) ;
    public final void rule__Folge__AtomsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1987:1: ( ( ruleAtom ) )
            // InternalMyDsl.g:1988:2: ( ruleAtom )
            {
            // InternalMyDsl.g:1988:2: ( ruleAtom )
            // InternalMyDsl.g:1989:3: ruleAtom
            {
             before(grammarAccess.getFolgeAccess().getAtomsAtomParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAtom();

            state._fsp--;

             after(grammarAccess.getFolgeAccess().getAtomsAtomParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folge__AtomsAssignment_1_1"


    // $ANTLR start "rule__Ident__NameAssignment"
    // InternalMyDsl.g:1998:1: rule__Ident__NameAssignment : ( RULE_ID ) ;
    public final void rule__Ident__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2002:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2003:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2003:2: ( RULE_ID )
            // InternalMyDsl.g:2004:3: RULE_ID
            {
             before(grammarAccess.getIdentAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIdentAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ident__NameAssignment"


    // $ANTLR start "rule__Number2__WertAssignment"
    // InternalMyDsl.g:2013:1: rule__Number2__WertAssignment : ( RULE_INT ) ;
    public final void rule__Number2__WertAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2017:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2018:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2018:2: ( RULE_INT )
            // InternalMyDsl.g:2019:3: RULE_INT
            {
             before(grammarAccess.getNumber2Access().getWertINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumber2Access().getWertINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number2__WertAssignment"


    // $ANTLR start "rule__Variable2__Var1Assignment"
    // InternalMyDsl.g:2028:1: rule__Variable2__Var1Assignment : ( RULE_VAR ) ;
    public final void rule__Variable2__Var1Assignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2032:1: ( ( RULE_VAR ) )
            // InternalMyDsl.g:2033:2: ( RULE_VAR )
            {
            // InternalMyDsl.g:2033:2: ( RULE_VAR )
            // InternalMyDsl.g:2034:3: RULE_VAR
            {
             before(grammarAccess.getVariable2Access().getVar1VARTerminalRuleCall_0()); 
            match(input,RULE_VAR,FOLLOW_2); 
             after(grammarAccess.getVariable2Access().getVar1VARTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable2__Var1Assignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040070L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});

}