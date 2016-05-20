package de.htwdd.sf.beleg.s70307s70429.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.htwdd.sf.beleg.s70307s70429.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Prologdsl";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePrologdsl"
    // InternalMyDsl.g:64:1: entryRulePrologdsl returns [EObject current=null] : iv_rulePrologdsl= rulePrologdsl EOF ;
    public final EObject entryRulePrologdsl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrologdsl = null;


        try {
            // InternalMyDsl.g:64:50: (iv_rulePrologdsl= rulePrologdsl EOF )
            // InternalMyDsl.g:65:2: iv_rulePrologdsl= rulePrologdsl EOF
            {
             newCompositeNode(grammarAccess.getPrologdslRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrologdsl=rulePrologdsl();

            state._fsp--;

             current =iv_rulePrologdsl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrologdsl"


    // $ANTLR start "rulePrologdsl"
    // InternalMyDsl.g:71:1: rulePrologdsl returns [EObject current=null] : ( ( (lv_prologdsl_0_0= ruleProgram ) ) ( (lv_ex_1_0= ruleExquery ) ) ) ;
    public final EObject rulePrologdsl() throws RecognitionException {
        EObject current = null;

        EObject lv_prologdsl_0_0 = null;

        EObject lv_ex_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( ( (lv_prologdsl_0_0= ruleProgram ) ) ( (lv_ex_1_0= ruleExquery ) ) ) )
            // InternalMyDsl.g:78:2: ( ( (lv_prologdsl_0_0= ruleProgram ) ) ( (lv_ex_1_0= ruleExquery ) ) )
            {
            // InternalMyDsl.g:78:2: ( ( (lv_prologdsl_0_0= ruleProgram ) ) ( (lv_ex_1_0= ruleExquery ) ) )
            // InternalMyDsl.g:79:3: ( (lv_prologdsl_0_0= ruleProgram ) ) ( (lv_ex_1_0= ruleExquery ) )
            {
            // InternalMyDsl.g:79:3: ( (lv_prologdsl_0_0= ruleProgram ) )
            // InternalMyDsl.g:80:4: (lv_prologdsl_0_0= ruleProgram )
            {
            // InternalMyDsl.g:80:4: (lv_prologdsl_0_0= ruleProgram )
            // InternalMyDsl.g:81:5: lv_prologdsl_0_0= ruleProgram
            {

            					newCompositeNode(grammarAccess.getPrologdslAccess().getPrologdslProgramParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_prologdsl_0_0=ruleProgram();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrologdslRule());
            					}
            					set(
            						current,
            						"prologdsl",
            						lv_prologdsl_0_0,
            						"de.htwdd.sf.beleg.s70307s70429.MyDsl.Program");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:98:3: ( (lv_ex_1_0= ruleExquery ) )
            // InternalMyDsl.g:99:4: (lv_ex_1_0= ruleExquery )
            {
            // InternalMyDsl.g:99:4: (lv_ex_1_0= ruleExquery )
            // InternalMyDsl.g:100:5: lv_ex_1_0= ruleExquery
            {

            					newCompositeNode(grammarAccess.getPrologdslAccess().getExExqueryParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_ex_1_0=ruleExquery();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrologdslRule());
            					}
            					set(
            						current,
            						"ex",
            						lv_ex_1_0,
            						"de.htwdd.sf.beleg.s70307s70429.MyDsl.Exquery");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrologdsl"


    // $ANTLR start "entryRuleProgram"
    // InternalMyDsl.g:121:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalMyDsl.g:121:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalMyDsl.g:122:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalMyDsl.g:128:1: ruleProgram returns [EObject current=null] : ( ( (lv_clause1_0_0= ruleClause ) ) ( (lv_clause2_1_0= ruleClause ) )* ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_clause1_0_0 = null;

        EObject lv_clause2_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:134:2: ( ( ( (lv_clause1_0_0= ruleClause ) ) ( (lv_clause2_1_0= ruleClause ) )* ) )
            // InternalMyDsl.g:135:2: ( ( (lv_clause1_0_0= ruleClause ) ) ( (lv_clause2_1_0= ruleClause ) )* )
            {
            // InternalMyDsl.g:135:2: ( ( (lv_clause1_0_0= ruleClause ) ) ( (lv_clause2_1_0= ruleClause ) )* )
            // InternalMyDsl.g:136:3: ( (lv_clause1_0_0= ruleClause ) ) ( (lv_clause2_1_0= ruleClause ) )*
            {
            // InternalMyDsl.g:136:3: ( (lv_clause1_0_0= ruleClause ) )
            // InternalMyDsl.g:137:4: (lv_clause1_0_0= ruleClause )
            {
            // InternalMyDsl.g:137:4: (lv_clause1_0_0= ruleClause )
            // InternalMyDsl.g:138:5: lv_clause1_0_0= ruleClause
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getClause1ClauseParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_clause1_0_0=ruleClause();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramRule());
            					}
            					set(
            						current,
            						"clause1",
            						lv_clause1_0_0,
            						"de.htwdd.sf.beleg.s70307s70429.MyDsl.Clause");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:155:3: ( (lv_clause2_1_0= ruleClause ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:156:4: (lv_clause2_1_0= ruleClause )
            	    {
            	    // InternalMyDsl.g:156:4: (lv_clause2_1_0= ruleClause )
            	    // InternalMyDsl.g:157:5: lv_clause2_1_0= ruleClause
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getClause2ClauseParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_clause2_1_0=ruleClause();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"clause2",
            	    						lv_clause2_1_0,
            	    						"de.htwdd.sf.beleg.s70307s70429.MyDsl.Clause");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleExquery"
    // InternalMyDsl.g:178:1: entryRuleExquery returns [EObject current=null] : iv_ruleExquery= ruleExquery EOF ;
    public final EObject entryRuleExquery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExquery = null;


        try {
            // InternalMyDsl.g:178:48: (iv_ruleExquery= ruleExquery EOF )
            // InternalMyDsl.g:179:2: iv_ruleExquery= ruleExquery EOF
            {
             newCompositeNode(grammarAccess.getExqueryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExquery=ruleExquery();

            state._fsp--;

             current =iv_ruleExquery; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExquery"


    // $ANTLR start "ruleExquery"
    // InternalMyDsl.g:185:1: ruleExquery returns [EObject current=null] : (otherlv_0= '?-' ( (lv_q_1_0= ruleQuery ) ) otherlv_2= '.' ) ;
    public final EObject ruleExquery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_q_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:191:2: ( (otherlv_0= '?-' ( (lv_q_1_0= ruleQuery ) ) otherlv_2= '.' ) )
            // InternalMyDsl.g:192:2: (otherlv_0= '?-' ( (lv_q_1_0= ruleQuery ) ) otherlv_2= '.' )
            {
            // InternalMyDsl.g:192:2: (otherlv_0= '?-' ( (lv_q_1_0= ruleQuery ) ) otherlv_2= '.' )
            // InternalMyDsl.g:193:3: otherlv_0= '?-' ( (lv_q_1_0= ruleQuery ) ) otherlv_2= '.'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getExqueryAccess().getQuestionMarkHyphenMinusKeyword_0());
            		
            // InternalMyDsl.g:197:3: ( (lv_q_1_0= ruleQuery ) )
            // InternalMyDsl.g:198:4: (lv_q_1_0= ruleQuery )
            {
            // InternalMyDsl.g:198:4: (lv_q_1_0= ruleQuery )
            // InternalMyDsl.g:199:5: lv_q_1_0= ruleQuery
            {

            					newCompositeNode(grammarAccess.getExqueryAccess().getQQueryParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_q_1_0=ruleQuery();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExqueryRule());
            					}
            					set(
            						current,
            						"q",
            						lv_q_1_0,
            						"de.htwdd.sf.beleg.s70307s70429.MyDsl.Query");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getExqueryAccess().getFullStopKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExquery"


    // $ANTLR start "entryRuleQuery"
    // InternalMyDsl.g:224:1: entryRuleQuery returns [EObject current=null] : iv_ruleQuery= ruleQuery EOF ;
    public final EObject entryRuleQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuery = null;


        try {
            // InternalMyDsl.g:224:46: (iv_ruleQuery= ruleQuery EOF )
            // InternalMyDsl.g:225:2: iv_ruleQuery= ruleQuery EOF
            {
             newCompositeNode(grammarAccess.getQueryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuery=ruleQuery();

            state._fsp--;

             current =iv_ruleQuery; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuery"


    // $ANTLR start "ruleQuery"
    // InternalMyDsl.g:231:1: ruleQuery returns [EObject current=null] : ( ( (lv_query_0_0= rulePredicate ) ) (otherlv_1= ',' ( (lv_pred_2_0= rulePredicate ) ) )* ) ;
    public final EObject ruleQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_query_0_0 = null;

        EObject lv_pred_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:237:2: ( ( ( (lv_query_0_0= rulePredicate ) ) (otherlv_1= ',' ( (lv_pred_2_0= rulePredicate ) ) )* ) )
            // InternalMyDsl.g:238:2: ( ( (lv_query_0_0= rulePredicate ) ) (otherlv_1= ',' ( (lv_pred_2_0= rulePredicate ) ) )* )
            {
            // InternalMyDsl.g:238:2: ( ( (lv_query_0_0= rulePredicate ) ) (otherlv_1= ',' ( (lv_pred_2_0= rulePredicate ) ) )* )
            // InternalMyDsl.g:239:3: ( (lv_query_0_0= rulePredicate ) ) (otherlv_1= ',' ( (lv_pred_2_0= rulePredicate ) ) )*
            {
            // InternalMyDsl.g:239:3: ( (lv_query_0_0= rulePredicate ) )
            // InternalMyDsl.g:240:4: (lv_query_0_0= rulePredicate )
            {
            // InternalMyDsl.g:240:4: (lv_query_0_0= rulePredicate )
            // InternalMyDsl.g:241:5: lv_query_0_0= rulePredicate
            {

            					newCompositeNode(grammarAccess.getQueryAccess().getQueryPredicateParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_query_0_0=rulePredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQueryRule());
            					}
            					set(
            						current,
            						"query",
            						lv_query_0_0,
            						"de.htwdd.sf.beleg.s70307s70429.MyDsl.Predicate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:258:3: (otherlv_1= ',' ( (lv_pred_2_0= rulePredicate ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:259:4: otherlv_1= ',' ( (lv_pred_2_0= rulePredicate ) )
            	    {
            	    otherlv_1=(Token)match(input,14,FOLLOW_5); 

            	    				newLeafNode(otherlv_1, grammarAccess.getQueryAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMyDsl.g:263:4: ( (lv_pred_2_0= rulePredicate ) )
            	    // InternalMyDsl.g:264:5: (lv_pred_2_0= rulePredicate )
            	    {
            	    // InternalMyDsl.g:264:5: (lv_pred_2_0= rulePredicate )
            	    // InternalMyDsl.g:265:6: lv_pred_2_0= rulePredicate
            	    {

            	    						newCompositeNode(grammarAccess.getQueryAccess().getPredPredicateParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_pred_2_0=rulePredicate();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getQueryRule());
            	    						}
            	    						add(
            	    							current,
            	    							"pred",
            	    							lv_pred_2_0,
            	    							"de.htwdd.sf.beleg.s70307s70429.MyDsl.Predicate");
            	    						afterParserOrEnumRuleCall();
            	    					

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


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuery"


    // $ANTLR start "entryRuleClause"
    // InternalMyDsl.g:287:1: entryRuleClause returns [EObject current=null] : iv_ruleClause= ruleClause EOF ;
    public final EObject entryRuleClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClause = null;


        try {
            // InternalMyDsl.g:287:47: (iv_ruleClause= ruleClause EOF )
            // InternalMyDsl.g:288:2: iv_ruleClause= ruleClause EOF
            {
             newCompositeNode(grammarAccess.getClauseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClause=ruleClause();

            state._fsp--;

             current =iv_ruleClause; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClause"


    // $ANTLR start "ruleClause"
    // InternalMyDsl.g:294:1: ruleClause returns [EObject current=null] : ( ( (lv_fact_0_0= rulePredicate ) ) ( ( (lv_clause1_1_1= ruleFact | lv_clause1_1_2= ruleRule ) ) ) ) ;
    public final EObject ruleClause() throws RecognitionException {
        EObject current = null;

        EObject lv_fact_0_0 = null;

        EObject lv_clause1_1_1 = null;

        EObject lv_clause1_1_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:300:2: ( ( ( (lv_fact_0_0= rulePredicate ) ) ( ( (lv_clause1_1_1= ruleFact | lv_clause1_1_2= ruleRule ) ) ) ) )
            // InternalMyDsl.g:301:2: ( ( (lv_fact_0_0= rulePredicate ) ) ( ( (lv_clause1_1_1= ruleFact | lv_clause1_1_2= ruleRule ) ) ) )
            {
            // InternalMyDsl.g:301:2: ( ( (lv_fact_0_0= rulePredicate ) ) ( ( (lv_clause1_1_1= ruleFact | lv_clause1_1_2= ruleRule ) ) ) )
            // InternalMyDsl.g:302:3: ( (lv_fact_0_0= rulePredicate ) ) ( ( (lv_clause1_1_1= ruleFact | lv_clause1_1_2= ruleRule ) ) )
            {
            // InternalMyDsl.g:302:3: ( (lv_fact_0_0= rulePredicate ) )
            // InternalMyDsl.g:303:4: (lv_fact_0_0= rulePredicate )
            {
            // InternalMyDsl.g:303:4: (lv_fact_0_0= rulePredicate )
            // InternalMyDsl.g:304:5: lv_fact_0_0= rulePredicate
            {

            					newCompositeNode(grammarAccess.getClauseAccess().getFactPredicateParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_fact_0_0=rulePredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClauseRule());
            					}
            					set(
            						current,
            						"fact",
            						lv_fact_0_0,
            						"de.htwdd.sf.beleg.s70307s70429.MyDsl.Predicate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:321:3: ( ( (lv_clause1_1_1= ruleFact | lv_clause1_1_2= ruleRule ) ) )
            // InternalMyDsl.g:322:4: ( (lv_clause1_1_1= ruleFact | lv_clause1_1_2= ruleRule ) )
            {
            // InternalMyDsl.g:322:4: ( (lv_clause1_1_1= ruleFact | lv_clause1_1_2= ruleRule ) )
            // InternalMyDsl.g:323:5: (lv_clause1_1_1= ruleFact | lv_clause1_1_2= ruleRule )
            {
            // InternalMyDsl.g:323:5: (lv_clause1_1_1= ruleFact | lv_clause1_1_2= ruleRule )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:324:6: lv_clause1_1_1= ruleFact
                    {

                    						newCompositeNode(grammarAccess.getClauseAccess().getClause1FactParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_clause1_1_1=ruleFact();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClauseRule());
                    						}
                    						set(
                    							current,
                    							"clause1",
                    							lv_clause1_1_1,
                    							"de.htwdd.sf.beleg.s70307s70429.MyDsl.Fact");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:340:6: lv_clause1_1_2= ruleRule
                    {

                    						newCompositeNode(grammarAccess.getClauseAccess().getClause1RuleParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_clause1_1_2=ruleRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClauseRule());
                    						}
                    						set(
                    							current,
                    							"clause1",
                    							lv_clause1_1_2,
                    							"de.htwdd.sf.beleg.s70307s70429.MyDsl.Rule");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClause"


    // $ANTLR start "entryRuleFact"
    // InternalMyDsl.g:362:1: entryRuleFact returns [EObject current=null] : iv_ruleFact= ruleFact EOF ;
    public final EObject entryRuleFact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFact = null;


        try {
            // InternalMyDsl.g:362:45: (iv_ruleFact= ruleFact EOF )
            // InternalMyDsl.g:363:2: iv_ruleFact= ruleFact EOF
            {
             newCompositeNode(grammarAccess.getFactRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFact=ruleFact();

            state._fsp--;

             current =iv_ruleFact; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFact"


    // $ANTLR start "ruleFact"
    // InternalMyDsl.g:369:1: ruleFact returns [EObject current=null] : ( () otherlv_1= '.' ) ;
    public final EObject ruleFact() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:375:2: ( ( () otherlv_1= '.' ) )
            // InternalMyDsl.g:376:2: ( () otherlv_1= '.' )
            {
            // InternalMyDsl.g:376:2: ( () otherlv_1= '.' )
            // InternalMyDsl.g:377:3: () otherlv_1= '.'
            {
            // InternalMyDsl.g:377:3: ()
            // InternalMyDsl.g:378:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFactAccess().getFactAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getFactAccess().getFullStopKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFact"


    // $ANTLR start "entryRuleRule"
    // InternalMyDsl.g:392:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalMyDsl.g:392:45: (iv_ruleRule= ruleRule EOF )
            // InternalMyDsl.g:393:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalMyDsl.g:399:1: ruleRule returns [EObject current=null] : (otherlv_0= ':-' ( (lv_q_1_0= ruleQuery ) ) otherlv_2= '.' ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_q_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:405:2: ( (otherlv_0= ':-' ( (lv_q_1_0= ruleQuery ) ) otherlv_2= '.' ) )
            // InternalMyDsl.g:406:2: (otherlv_0= ':-' ( (lv_q_1_0= ruleQuery ) ) otherlv_2= '.' )
            {
            // InternalMyDsl.g:406:2: (otherlv_0= ':-' ( (lv_q_1_0= ruleQuery ) ) otherlv_2= '.' )
            // InternalMyDsl.g:407:3: otherlv_0= ':-' ( (lv_q_1_0= ruleQuery ) ) otherlv_2= '.'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getColonHyphenMinusKeyword_0());
            		
            // InternalMyDsl.g:411:3: ( (lv_q_1_0= ruleQuery ) )
            // InternalMyDsl.g:412:4: (lv_q_1_0= ruleQuery )
            {
            // InternalMyDsl.g:412:4: (lv_q_1_0= ruleQuery )
            // InternalMyDsl.g:413:5: lv_q_1_0= ruleQuery
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getQQueryParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_q_1_0=ruleQuery();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"q",
            						lv_q_1_0,
            						"de.htwdd.sf.beleg.s70307s70429.MyDsl.Query");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getFullStopKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRulePredicate"
    // InternalMyDsl.g:438:1: entryRulePredicate returns [EObject current=null] : iv_rulePredicate= rulePredicate EOF ;
    public final EObject entryRulePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicate = null;


        try {
            // InternalMyDsl.g:438:50: (iv_rulePredicate= rulePredicate EOF )
            // InternalMyDsl.g:439:2: iv_rulePredicate= rulePredicate EOF
            {
             newCompositeNode(grammarAccess.getPredicateRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePredicate=rulePredicate();

            state._fsp--;

             current =iv_rulePredicate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePredicate"


    // $ANTLR start "rulePredicate"
    // InternalMyDsl.g:445:1: rulePredicate returns [EObject current=null] : ( ( (lv_pred_0_0= ruleFunctor ) ) otherlv_1= '(' ( (lv_t_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_t2_4_0= ruleTerm ) ) )* otherlv_5= ')' ) ;
    public final EObject rulePredicate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_pred_0_0 = null;

        EObject lv_t_2_0 = null;

        EObject lv_t2_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:451:2: ( ( ( (lv_pred_0_0= ruleFunctor ) ) otherlv_1= '(' ( (lv_t_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_t2_4_0= ruleTerm ) ) )* otherlv_5= ')' ) )
            // InternalMyDsl.g:452:2: ( ( (lv_pred_0_0= ruleFunctor ) ) otherlv_1= '(' ( (lv_t_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_t2_4_0= ruleTerm ) ) )* otherlv_5= ')' )
            {
            // InternalMyDsl.g:452:2: ( ( (lv_pred_0_0= ruleFunctor ) ) otherlv_1= '(' ( (lv_t_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_t2_4_0= ruleTerm ) ) )* otherlv_5= ')' )
            // InternalMyDsl.g:453:3: ( (lv_pred_0_0= ruleFunctor ) ) otherlv_1= '(' ( (lv_t_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_t2_4_0= ruleTerm ) ) )* otherlv_5= ')'
            {
            // InternalMyDsl.g:453:3: ( (lv_pred_0_0= ruleFunctor ) )
            // InternalMyDsl.g:454:4: (lv_pred_0_0= ruleFunctor )
            {
            // InternalMyDsl.g:454:4: (lv_pred_0_0= ruleFunctor )
            // InternalMyDsl.g:455:5: lv_pred_0_0= ruleFunctor
            {

            					newCompositeNode(grammarAccess.getPredicateAccess().getPredFunctorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_pred_0_0=ruleFunctor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPredicateRule());
            					}
            					set(
            						current,
            						"pred",
            						lv_pred_0_0,
            						"de.htwdd.sf.beleg.s70307s70429.MyDsl.Functor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getPredicateAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:476:3: ( (lv_t_2_0= ruleTerm ) )
            // InternalMyDsl.g:477:4: (lv_t_2_0= ruleTerm )
            {
            // InternalMyDsl.g:477:4: (lv_t_2_0= ruleTerm )
            // InternalMyDsl.g:478:5: lv_t_2_0= ruleTerm
            {

            					newCompositeNode(grammarAccess.getPredicateAccess().getTTermParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_t_2_0=ruleTerm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPredicateRule());
            					}
            					set(
            						current,
            						"t",
            						lv_t_2_0,
            						"de.htwdd.sf.beleg.s70307s70429.MyDsl.Term");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:495:3: (otherlv_3= ',' ( (lv_t2_4_0= ruleTerm ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:496:4: otherlv_3= ',' ( (lv_t2_4_0= ruleTerm ) )
            	    {
            	    otherlv_3=(Token)match(input,14,FOLLOW_10); 

            	    				newLeafNode(otherlv_3, grammarAccess.getPredicateAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalMyDsl.g:500:4: ( (lv_t2_4_0= ruleTerm ) )
            	    // InternalMyDsl.g:501:5: (lv_t2_4_0= ruleTerm )
            	    {
            	    // InternalMyDsl.g:501:5: (lv_t2_4_0= ruleTerm )
            	    // InternalMyDsl.g:502:6: lv_t2_4_0= ruleTerm
            	    {

            	    						newCompositeNode(grammarAccess.getPredicateAccess().getT2TermParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_t2_4_0=ruleTerm();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPredicateRule());
            	    						}
            	    						add(
            	    							current,
            	    							"t2",
            	    							lv_t2_4_0,
            	    							"de.htwdd.sf.beleg.s70307s70429.MyDsl.Term");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPredicateAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePredicate"


    // $ANTLR start "entryRuleFunctor"
    // InternalMyDsl.g:528:1: entryRuleFunctor returns [EObject current=null] : iv_ruleFunctor= ruleFunctor EOF ;
    public final EObject entryRuleFunctor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctor = null;


        try {
            // InternalMyDsl.g:528:48: (iv_ruleFunctor= ruleFunctor EOF )
            // InternalMyDsl.g:529:2: iv_ruleFunctor= ruleFunctor EOF
            {
             newCompositeNode(grammarAccess.getFunctorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctor=ruleFunctor();

            state._fsp--;

             current =iv_ruleFunctor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctor"


    // $ANTLR start "ruleFunctor"
    // InternalMyDsl.g:535:1: ruleFunctor returns [EObject current=null] : ( (lv_func_0_0= ruleIdent ) ) ;
    public final EObject ruleFunctor() throws RecognitionException {
        EObject current = null;

        EObject lv_func_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:541:2: ( ( (lv_func_0_0= ruleIdent ) ) )
            // InternalMyDsl.g:542:2: ( (lv_func_0_0= ruleIdent ) )
            {
            // InternalMyDsl.g:542:2: ( (lv_func_0_0= ruleIdent ) )
            // InternalMyDsl.g:543:3: (lv_func_0_0= ruleIdent )
            {
            // InternalMyDsl.g:543:3: (lv_func_0_0= ruleIdent )
            // InternalMyDsl.g:544:4: lv_func_0_0= ruleIdent
            {

            				newCompositeNode(grammarAccess.getFunctorAccess().getFuncIdentParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_func_0_0=ruleIdent();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getFunctorRule());
            				}
            				set(
            					current,
            					"func",
            					lv_func_0_0,
            					"de.htwdd.sf.beleg.s70307s70429.MyDsl.Ident");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctor"


    // $ANTLR start "entryRuleTerm"
    // InternalMyDsl.g:564:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // InternalMyDsl.g:564:45: (iv_ruleTerm= ruleTerm EOF )
            // InternalMyDsl.g:565:2: iv_ruleTerm= ruleTerm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerm=ruleTerm();

            state._fsp--;

             current =iv_ruleTerm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // InternalMyDsl.g:571:1: ruleTerm returns [EObject current=null] : ( ( (lv_term_0_1= ruleAtom | lv_term_0_2= ruleList ) ) ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        EObject lv_term_0_1 = null;

        EObject lv_term_0_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:577:2: ( ( ( (lv_term_0_1= ruleAtom | lv_term_0_2= ruleList ) ) ) )
            // InternalMyDsl.g:578:2: ( ( (lv_term_0_1= ruleAtom | lv_term_0_2= ruleList ) ) )
            {
            // InternalMyDsl.g:578:2: ( ( (lv_term_0_1= ruleAtom | lv_term_0_2= ruleList ) ) )
            // InternalMyDsl.g:579:3: ( (lv_term_0_1= ruleAtom | lv_term_0_2= ruleList ) )
            {
            // InternalMyDsl.g:579:3: ( (lv_term_0_1= ruleAtom | lv_term_0_2= ruleList ) )
            // InternalMyDsl.g:580:4: (lv_term_0_1= ruleAtom | lv_term_0_2= ruleList )
            {
            // InternalMyDsl.g:580:4: (lv_term_0_1= ruleAtom | lv_term_0_2= ruleList )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_VAR)) ) {
                alt5=1;
            }
            else if ( (LA5_0==18) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:581:5: lv_term_0_1= ruleAtom
                    {

                    					newCompositeNode(grammarAccess.getTermAccess().getTermAtomParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_term_0_1=ruleAtom();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTermRule());
                    					}
                    					set(
                    						current,
                    						"term",
                    						lv_term_0_1,
                    						"de.htwdd.sf.beleg.s70307s70429.MyDsl.Atom");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:597:5: lv_term_0_2= ruleList
                    {

                    					newCompositeNode(grammarAccess.getTermAccess().getTermListParserRuleCall_0_1());
                    				
                    pushFollow(FOLLOW_2);
                    lv_term_0_2=ruleList();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTermRule());
                    					}
                    					set(
                    						current,
                    						"term",
                    						lv_term_0_2,
                    						"de.htwdd.sf.beleg.s70307s70429.MyDsl.List");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleAtom"
    // InternalMyDsl.g:618:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // InternalMyDsl.g:618:45: (iv_ruleAtom= ruleAtom EOF )
            // InternalMyDsl.g:619:2: iv_ruleAtom= ruleAtom EOF
            {
             newCompositeNode(grammarAccess.getAtomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtom=ruleAtom();

            state._fsp--;

             current =iv_ruleAtom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtom"


    // $ANTLR start "ruleAtom"
    // InternalMyDsl.g:625:1: ruleAtom returns [EObject current=null] : ( ( (lv_xx_0_1= ruleIdent | lv_xx_0_2= ruleNumber2 | lv_xx_0_3= ruleVariable2 ) ) ) ;
    public final EObject ruleAtom() throws RecognitionException {
        EObject current = null;

        EObject lv_xx_0_1 = null;

        EObject lv_xx_0_2 = null;

        EObject lv_xx_0_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:631:2: ( ( ( (lv_xx_0_1= ruleIdent | lv_xx_0_2= ruleNumber2 | lv_xx_0_3= ruleVariable2 ) ) ) )
            // InternalMyDsl.g:632:2: ( ( (lv_xx_0_1= ruleIdent | lv_xx_0_2= ruleNumber2 | lv_xx_0_3= ruleVariable2 ) ) )
            {
            // InternalMyDsl.g:632:2: ( ( (lv_xx_0_1= ruleIdent | lv_xx_0_2= ruleNumber2 | lv_xx_0_3= ruleVariable2 ) ) )
            // InternalMyDsl.g:633:3: ( (lv_xx_0_1= ruleIdent | lv_xx_0_2= ruleNumber2 | lv_xx_0_3= ruleVariable2 ) )
            {
            // InternalMyDsl.g:633:3: ( (lv_xx_0_1= ruleIdent | lv_xx_0_2= ruleNumber2 | lv_xx_0_3= ruleVariable2 ) )
            // InternalMyDsl.g:634:4: (lv_xx_0_1= ruleIdent | lv_xx_0_2= ruleNumber2 | lv_xx_0_3= ruleVariable2 )
            {
            // InternalMyDsl.g:634:4: (lv_xx_0_1= ruleIdent | lv_xx_0_2= ruleNumber2 | lv_xx_0_3= ruleVariable2 )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt6=1;
                }
                break;
            case RULE_INT:
                {
                alt6=2;
                }
                break;
            case RULE_VAR:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:635:5: lv_xx_0_1= ruleIdent
                    {

                    					newCompositeNode(grammarAccess.getAtomAccess().getXxIdentParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_xx_0_1=ruleIdent();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAtomRule());
                    					}
                    					set(
                    						current,
                    						"xx",
                    						lv_xx_0_1,
                    						"de.htwdd.sf.beleg.s70307s70429.MyDsl.Ident");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:651:5: lv_xx_0_2= ruleNumber2
                    {

                    					newCompositeNode(grammarAccess.getAtomAccess().getXxNumber2ParserRuleCall_0_1());
                    				
                    pushFollow(FOLLOW_2);
                    lv_xx_0_2=ruleNumber2();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAtomRule());
                    					}
                    					set(
                    						current,
                    						"xx",
                    						lv_xx_0_2,
                    						"de.htwdd.sf.beleg.s70307s70429.MyDsl.Number2");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:667:5: lv_xx_0_3= ruleVariable2
                    {

                    					newCompositeNode(grammarAccess.getAtomAccess().getXxVariable2ParserRuleCall_0_2());
                    				
                    pushFollow(FOLLOW_2);
                    lv_xx_0_3=ruleVariable2();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAtomRule());
                    					}
                    					set(
                    						current,
                    						"xx",
                    						lv_xx_0_3,
                    						"de.htwdd.sf.beleg.s70307s70429.MyDsl.Variable2");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtom"


    // $ANTLR start "entryRuleList"
    // InternalMyDsl.g:688:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // InternalMyDsl.g:688:45: (iv_ruleList= ruleList EOF )
            // InternalMyDsl.g:689:2: iv_ruleList= ruleList EOF
            {
             newCompositeNode(grammarAccess.getListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleList=ruleList();

            state._fsp--;

             current =iv_ruleList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleList"


    // $ANTLR start "ruleList"
    // InternalMyDsl.g:695:1: ruleList returns [EObject current=null] : ( ( () otherlv_1= '[' otherlv_2= ']' ) | ( (lv_nel_3_0= ruleNonemptylist ) ) ) ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_nel_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:701:2: ( ( ( () otherlv_1= '[' otherlv_2= ']' ) | ( (lv_nel_3_0= ruleNonemptylist ) ) ) )
            // InternalMyDsl.g:702:2: ( ( () otherlv_1= '[' otherlv_2= ']' ) | ( (lv_nel_3_0= ruleNonemptylist ) ) )
            {
            // InternalMyDsl.g:702:2: ( ( () otherlv_1= '[' otherlv_2= ']' ) | ( (lv_nel_3_0= ruleNonemptylist ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                int LA7_1 = input.LA(2);

                if ( ((LA7_1>=RULE_ID && LA7_1<=RULE_VAR)) ) {
                    alt7=2;
                }
                else if ( (LA7_1==19) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:703:3: ( () otherlv_1= '[' otherlv_2= ']' )
                    {
                    // InternalMyDsl.g:703:3: ( () otherlv_1= '[' otherlv_2= ']' )
                    // InternalMyDsl.g:704:4: () otherlv_1= '[' otherlv_2= ']'
                    {
                    // InternalMyDsl.g:704:4: ()
                    // InternalMyDsl.g:705:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getListAccess().getListAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getListAccess().getLeftSquareBracketKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getListAccess().getRightSquareBracketKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:721:3: ( (lv_nel_3_0= ruleNonemptylist ) )
                    {
                    // InternalMyDsl.g:721:3: ( (lv_nel_3_0= ruleNonemptylist ) )
                    // InternalMyDsl.g:722:4: (lv_nel_3_0= ruleNonemptylist )
                    {
                    // InternalMyDsl.g:722:4: (lv_nel_3_0= ruleNonemptylist )
                    // InternalMyDsl.g:723:5: lv_nel_3_0= ruleNonemptylist
                    {

                    					newCompositeNode(grammarAccess.getListAccess().getNelNonemptylistParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_nel_3_0=ruleNonemptylist();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getListRule());
                    					}
                    					set(
                    						current,
                    						"nel",
                    						lv_nel_3_0,
                    						"de.htwdd.sf.beleg.s70307s70429.MyDsl.Nonemptylist");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleList"


    // $ANTLR start "entryRuleNonemptylist"
    // InternalMyDsl.g:744:1: entryRuleNonemptylist returns [EObject current=null] : iv_ruleNonemptylist= ruleNonemptylist EOF ;
    public final EObject entryRuleNonemptylist() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonemptylist = null;


        try {
            // InternalMyDsl.g:744:53: (iv_ruleNonemptylist= ruleNonemptylist EOF )
            // InternalMyDsl.g:745:2: iv_ruleNonemptylist= ruleNonemptylist EOF
            {
             newCompositeNode(grammarAccess.getNonemptylistRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNonemptylist=ruleNonemptylist();

            state._fsp--;

             current =iv_ruleNonemptylist; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNonemptylist"


    // $ANTLR start "ruleNonemptylist"
    // InternalMyDsl.g:751:1: ruleNonemptylist returns [EObject current=null] : ( (otherlv_0= '[' ( (lv_folge_1_0= ruleFolge ) ) otherlv_2= ']' ) | (otherlv_3= '[' ( (lv_atom_4_0= ruleAtom ) ) otherlv_5= '|' ( (lv_term_6_0= ruleTerm ) ) otherlv_7= ']' ) ) ;
    public final EObject ruleNonemptylist() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_folge_1_0 = null;

        EObject lv_atom_4_0 = null;

        EObject lv_term_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:757:2: ( ( (otherlv_0= '[' ( (lv_folge_1_0= ruleFolge ) ) otherlv_2= ']' ) | (otherlv_3= '[' ( (lv_atom_4_0= ruleAtom ) ) otherlv_5= '|' ( (lv_term_6_0= ruleTerm ) ) otherlv_7= ']' ) ) )
            // InternalMyDsl.g:758:2: ( (otherlv_0= '[' ( (lv_folge_1_0= ruleFolge ) ) otherlv_2= ']' ) | (otherlv_3= '[' ( (lv_atom_4_0= ruleAtom ) ) otherlv_5= '|' ( (lv_term_6_0= ruleTerm ) ) otherlv_7= ']' ) )
            {
            // InternalMyDsl.g:758:2: ( (otherlv_0= '[' ( (lv_folge_1_0= ruleFolge ) ) otherlv_2= ']' ) | (otherlv_3= '[' ( (lv_atom_4_0= ruleAtom ) ) otherlv_5= '|' ( (lv_term_6_0= ruleTerm ) ) otherlv_7= ']' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                switch ( input.LA(2) ) {
                case RULE_ID:
                    {
                    int LA8_2 = input.LA(3);

                    if ( (LA8_2==20) ) {
                        alt8=2;
                    }
                    else if ( (LA8_2==14||LA8_2==19) ) {
                        alt8=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_INT:
                    {
                    int LA8_3 = input.LA(3);

                    if ( (LA8_3==20) ) {
                        alt8=2;
                    }
                    else if ( (LA8_3==14||LA8_3==19) ) {
                        alt8=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_VAR:
                    {
                    int LA8_4 = input.LA(3);

                    if ( (LA8_4==14||LA8_4==19) ) {
                        alt8=1;
                    }
                    else if ( (LA8_4==20) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:759:3: (otherlv_0= '[' ( (lv_folge_1_0= ruleFolge ) ) otherlv_2= ']' )
                    {
                    // InternalMyDsl.g:759:3: (otherlv_0= '[' ( (lv_folge_1_0= ruleFolge ) ) otherlv_2= ']' )
                    // InternalMyDsl.g:760:4: otherlv_0= '[' ( (lv_folge_1_0= ruleFolge ) ) otherlv_2= ']'
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_0, grammarAccess.getNonemptylistAccess().getLeftSquareBracketKeyword_0_0());
                    			
                    // InternalMyDsl.g:764:4: ( (lv_folge_1_0= ruleFolge ) )
                    // InternalMyDsl.g:765:5: (lv_folge_1_0= ruleFolge )
                    {
                    // InternalMyDsl.g:765:5: (lv_folge_1_0= ruleFolge )
                    // InternalMyDsl.g:766:6: lv_folge_1_0= ruleFolge
                    {

                    						newCompositeNode(grammarAccess.getNonemptylistAccess().getFolgeFolgeParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_folge_1_0=ruleFolge();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNonemptylistRule());
                    						}
                    						set(
                    							current,
                    							"folge",
                    							lv_folge_1_0,
                    							"de.htwdd.sf.beleg.s70307s70429.MyDsl.Folge");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getNonemptylistAccess().getRightSquareBracketKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:789:3: (otherlv_3= '[' ( (lv_atom_4_0= ruleAtom ) ) otherlv_5= '|' ( (lv_term_6_0= ruleTerm ) ) otherlv_7= ']' )
                    {
                    // InternalMyDsl.g:789:3: (otherlv_3= '[' ( (lv_atom_4_0= ruleAtom ) ) otherlv_5= '|' ( (lv_term_6_0= ruleTerm ) ) otherlv_7= ']' )
                    // InternalMyDsl.g:790:4: otherlv_3= '[' ( (lv_atom_4_0= ruleAtom ) ) otherlv_5= '|' ( (lv_term_6_0= ruleTerm ) ) otherlv_7= ']'
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getNonemptylistAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalMyDsl.g:794:4: ( (lv_atom_4_0= ruleAtom ) )
                    // InternalMyDsl.g:795:5: (lv_atom_4_0= ruleAtom )
                    {
                    // InternalMyDsl.g:795:5: (lv_atom_4_0= ruleAtom )
                    // InternalMyDsl.g:796:6: lv_atom_4_0= ruleAtom
                    {

                    						newCompositeNode(grammarAccess.getNonemptylistAccess().getAtomAtomParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_atom_4_0=ruleAtom();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNonemptylistRule());
                    						}
                    						set(
                    							current,
                    							"atom",
                    							lv_atom_4_0,
                    							"de.htwdd.sf.beleg.s70307s70429.MyDsl.Atom");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getNonemptylistAccess().getVerticalLineKeyword_1_2());
                    			
                    // InternalMyDsl.g:817:4: ( (lv_term_6_0= ruleTerm ) )
                    // InternalMyDsl.g:818:5: (lv_term_6_0= ruleTerm )
                    {
                    // InternalMyDsl.g:818:5: (lv_term_6_0= ruleTerm )
                    // InternalMyDsl.g:819:6: lv_term_6_0= ruleTerm
                    {

                    						newCompositeNode(grammarAccess.getNonemptylistAccess().getTermTermParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_term_6_0=ruleTerm();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNonemptylistRule());
                    						}
                    						set(
                    							current,
                    							"term",
                    							lv_term_6_0,
                    							"de.htwdd.sf.beleg.s70307s70429.MyDsl.Term");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getNonemptylistAccess().getRightSquareBracketKeyword_1_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNonemptylist"


    // $ANTLR start "entryRuleFolge"
    // InternalMyDsl.g:845:1: entryRuleFolge returns [EObject current=null] : iv_ruleFolge= ruleFolge EOF ;
    public final EObject entryRuleFolge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFolge = null;


        try {
            // InternalMyDsl.g:845:46: (iv_ruleFolge= ruleFolge EOF )
            // InternalMyDsl.g:846:2: iv_ruleFolge= ruleFolge EOF
            {
             newCompositeNode(grammarAccess.getFolgeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFolge=ruleFolge();

            state._fsp--;

             current =iv_ruleFolge; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFolge"


    // $ANTLR start "ruleFolge"
    // InternalMyDsl.g:852:1: ruleFolge returns [EObject current=null] : ( ( (lv_atom_0_0= ruleAtom ) ) (otherlv_1= ',' ( (lv_atoms_2_0= ruleAtom ) ) )* ) ;
    public final EObject ruleFolge() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_atom_0_0 = null;

        EObject lv_atoms_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:858:2: ( ( ( (lv_atom_0_0= ruleAtom ) ) (otherlv_1= ',' ( (lv_atoms_2_0= ruleAtom ) ) )* ) )
            // InternalMyDsl.g:859:2: ( ( (lv_atom_0_0= ruleAtom ) ) (otherlv_1= ',' ( (lv_atoms_2_0= ruleAtom ) ) )* )
            {
            // InternalMyDsl.g:859:2: ( ( (lv_atom_0_0= ruleAtom ) ) (otherlv_1= ',' ( (lv_atoms_2_0= ruleAtom ) ) )* )
            // InternalMyDsl.g:860:3: ( (lv_atom_0_0= ruleAtom ) ) (otherlv_1= ',' ( (lv_atoms_2_0= ruleAtom ) ) )*
            {
            // InternalMyDsl.g:860:3: ( (lv_atom_0_0= ruleAtom ) )
            // InternalMyDsl.g:861:4: (lv_atom_0_0= ruleAtom )
            {
            // InternalMyDsl.g:861:4: (lv_atom_0_0= ruleAtom )
            // InternalMyDsl.g:862:5: lv_atom_0_0= ruleAtom
            {

            					newCompositeNode(grammarAccess.getFolgeAccess().getAtomAtomParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_atom_0_0=ruleAtom();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFolgeRule());
            					}
            					set(
            						current,
            						"atom",
            						lv_atom_0_0,
            						"de.htwdd.sf.beleg.s70307s70429.MyDsl.Atom");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:879:3: (otherlv_1= ',' ( (lv_atoms_2_0= ruleAtom ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==14) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:880:4: otherlv_1= ',' ( (lv_atoms_2_0= ruleAtom ) )
            	    {
            	    otherlv_1=(Token)match(input,14,FOLLOW_13); 

            	    				newLeafNode(otherlv_1, grammarAccess.getFolgeAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMyDsl.g:884:4: ( (lv_atoms_2_0= ruleAtom ) )
            	    // InternalMyDsl.g:885:5: (lv_atoms_2_0= ruleAtom )
            	    {
            	    // InternalMyDsl.g:885:5: (lv_atoms_2_0= ruleAtom )
            	    // InternalMyDsl.g:886:6: lv_atoms_2_0= ruleAtom
            	    {

            	    						newCompositeNode(grammarAccess.getFolgeAccess().getAtomsAtomParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_atoms_2_0=ruleAtom();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFolgeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"atoms",
            	    							lv_atoms_2_0,
            	    							"de.htwdd.sf.beleg.s70307s70429.MyDsl.Atom");
            	    						afterParserOrEnumRuleCall();
            	    					

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


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFolge"


    // $ANTLR start "entryRuleIdent"
    // InternalMyDsl.g:908:1: entryRuleIdent returns [EObject current=null] : iv_ruleIdent= ruleIdent EOF ;
    public final EObject entryRuleIdent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdent = null;


        try {
            // InternalMyDsl.g:908:46: (iv_ruleIdent= ruleIdent EOF )
            // InternalMyDsl.g:909:2: iv_ruleIdent= ruleIdent EOF
            {
             newCompositeNode(grammarAccess.getIdentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIdent=ruleIdent();

            state._fsp--;

             current =iv_ruleIdent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdent"


    // $ANTLR start "ruleIdent"
    // InternalMyDsl.g:915:1: ruleIdent returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleIdent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:921:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:922:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:922:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:923:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:923:3: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:924:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getIdentAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIdentRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIdent"


    // $ANTLR start "entryRuleNumber2"
    // InternalMyDsl.g:943:1: entryRuleNumber2 returns [EObject current=null] : iv_ruleNumber2= ruleNumber2 EOF ;
    public final EObject entryRuleNumber2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber2 = null;


        try {
            // InternalMyDsl.g:943:48: (iv_ruleNumber2= ruleNumber2 EOF )
            // InternalMyDsl.g:944:2: iv_ruleNumber2= ruleNumber2 EOF
            {
             newCompositeNode(grammarAccess.getNumber2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumber2=ruleNumber2();

            state._fsp--;

             current =iv_ruleNumber2; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumber2"


    // $ANTLR start "ruleNumber2"
    // InternalMyDsl.g:950:1: ruleNumber2 returns [EObject current=null] : ( (lv_wert_0_0= RULE_INT ) ) ;
    public final EObject ruleNumber2() throws RecognitionException {
        EObject current = null;

        Token lv_wert_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:956:2: ( ( (lv_wert_0_0= RULE_INT ) ) )
            // InternalMyDsl.g:957:2: ( (lv_wert_0_0= RULE_INT ) )
            {
            // InternalMyDsl.g:957:2: ( (lv_wert_0_0= RULE_INT ) )
            // InternalMyDsl.g:958:3: (lv_wert_0_0= RULE_INT )
            {
            // InternalMyDsl.g:958:3: (lv_wert_0_0= RULE_INT )
            // InternalMyDsl.g:959:4: lv_wert_0_0= RULE_INT
            {
            lv_wert_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_wert_0_0, grammarAccess.getNumber2Access().getWertINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNumber2Rule());
            				}
            				setWithLastConsumed(
            					current,
            					"wert",
            					lv_wert_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumber2"


    // $ANTLR start "entryRuleVariable2"
    // InternalMyDsl.g:978:1: entryRuleVariable2 returns [EObject current=null] : iv_ruleVariable2= ruleVariable2 EOF ;
    public final EObject entryRuleVariable2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable2 = null;


        try {
            // InternalMyDsl.g:978:50: (iv_ruleVariable2= ruleVariable2 EOF )
            // InternalMyDsl.g:979:2: iv_ruleVariable2= ruleVariable2 EOF
            {
             newCompositeNode(grammarAccess.getVariable2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable2=ruleVariable2();

            state._fsp--;

             current =iv_ruleVariable2; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable2"


    // $ANTLR start "ruleVariable2"
    // InternalMyDsl.g:985:1: ruleVariable2 returns [EObject current=null] : ( (lv_var1_0_0= RULE_VAR ) ) ;
    public final EObject ruleVariable2() throws RecognitionException {
        EObject current = null;

        Token lv_var1_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:991:2: ( ( (lv_var1_0_0= RULE_VAR ) ) )
            // InternalMyDsl.g:992:2: ( (lv_var1_0_0= RULE_VAR ) )
            {
            // InternalMyDsl.g:992:2: ( (lv_var1_0_0= RULE_VAR ) )
            // InternalMyDsl.g:993:3: (lv_var1_0_0= RULE_VAR )
            {
            // InternalMyDsl.g:993:3: (lv_var1_0_0= RULE_VAR )
            // InternalMyDsl.g:994:4: lv_var1_0_0= RULE_VAR
            {
            lv_var1_0_0=(Token)match(input,RULE_VAR,FOLLOW_2); 

            				newLeafNode(lv_var1_0_0, grammarAccess.getVariable2Access().getVar1VARTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariable2Rule());
            				}
            				setWithLastConsumed(
            					current,
            					"var1",
            					lv_var1_0_0,
            					"de.htwdd.sf.beleg.s70307s70429.MyDsl.VAR");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040070L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});

}