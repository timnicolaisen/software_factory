/*
 * generated by Xtext 2.9.2
 */
package de.htwdd.sf.beleg.s70307s70429.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MyDslGrammarAccess extends AbstractGrammarElementFinder {
	
	public class PrologdslElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.htwdd.sf.beleg.s70307s70429.MyDsl.Prologdsl");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cPrologdslAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cPrologdslProgramParserRuleCall_0_0 = (RuleCall)cPrologdslAssignment_0.eContents().get(0);
		private final Assignment cExAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cExExqueryParserRuleCall_1_0 = (RuleCall)cExAssignment_1.eContents().get(0);
		
		//Prologdsl:
		//	prologdsl=Program ex=Exquery;
		@Override public ParserRule getRule() { return rule; }
		
		//prologdsl=Program ex=Exquery
		public Group getGroup() { return cGroup; }
		
		//prologdsl=Program
		public Assignment getPrologdslAssignment_0() { return cPrologdslAssignment_0; }
		
		//Program
		public RuleCall getPrologdslProgramParserRuleCall_0_0() { return cPrologdslProgramParserRuleCall_0_0; }
		
		//ex=Exquery
		public Assignment getExAssignment_1() { return cExAssignment_1; }
		
		//Exquery
		public RuleCall getExExqueryParserRuleCall_1_0() { return cExExqueryParserRuleCall_1_0; }
	}
	public class ProgramElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.htwdd.sf.beleg.s70307s70429.MyDsl.Program");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cClause1Assignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cClause1ClauseParserRuleCall_0_0 = (RuleCall)cClause1Assignment_0.eContents().get(0);
		private final Assignment cClause2Assignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cClause2ClauseParserRuleCall_1_0 = (RuleCall)cClause2Assignment_1.eContents().get(0);
		
		//Program:
		//	clause1=Clause clause2+=Clause*;
		@Override public ParserRule getRule() { return rule; }
		
		//clause1=Clause clause2+=Clause*
		public Group getGroup() { return cGroup; }
		
		//clause1=Clause
		public Assignment getClause1Assignment_0() { return cClause1Assignment_0; }
		
		//Clause
		public RuleCall getClause1ClauseParserRuleCall_0_0() { return cClause1ClauseParserRuleCall_0_0; }
		
		//clause2+=Clause*
		public Assignment getClause2Assignment_1() { return cClause2Assignment_1; }
		
		//Clause
		public RuleCall getClause2ClauseParserRuleCall_1_0() { return cClause2ClauseParserRuleCall_1_0; }
	}
	public class ExqueryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.htwdd.sf.beleg.s70307s70429.MyDsl.Exquery");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cQuestionMarkHyphenMinusKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cQAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cQQueryParserRuleCall_1_0 = (RuleCall)cQAssignment_1.eContents().get(0);
		private final Keyword cFullStopKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Exquery:
		//	'?-' q=Query '.';
		@Override public ParserRule getRule() { return rule; }
		
		//'?-' q=Query '.'
		public Group getGroup() { return cGroup; }
		
		//'?-'
		public Keyword getQuestionMarkHyphenMinusKeyword_0() { return cQuestionMarkHyphenMinusKeyword_0; }
		
		//q=Query
		public Assignment getQAssignment_1() { return cQAssignment_1; }
		
		//Query
		public RuleCall getQQueryParserRuleCall_1_0() { return cQQueryParserRuleCall_1_0; }
		
		//'.'
		public Keyword getFullStopKeyword_2() { return cFullStopKeyword_2; }
	}
	public class QueryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.htwdd.sf.beleg.s70307s70429.MyDsl.Query");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cQueryAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cQueryPredicateParserRuleCall_0_0 = (RuleCall)cQueryAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cCommaKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cPredAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cPredPredicateParserRuleCall_1_1_0 = (RuleCall)cPredAssignment_1_1.eContents().get(0);
		
		//Query:
		//	query=Predicate (',' pred+=Predicate)*;
		@Override public ParserRule getRule() { return rule; }
		
		//query=Predicate (',' pred+=Predicate)*
		public Group getGroup() { return cGroup; }
		
		//query=Predicate
		public Assignment getQueryAssignment_0() { return cQueryAssignment_0; }
		
		//Predicate
		public RuleCall getQueryPredicateParserRuleCall_0_0() { return cQueryPredicateParserRuleCall_0_0; }
		
		//(',' pred+=Predicate)*
		public Group getGroup_1() { return cGroup_1; }
		
		//','
		public Keyword getCommaKeyword_1_0() { return cCommaKeyword_1_0; }
		
		//pred+=Predicate
		public Assignment getPredAssignment_1_1() { return cPredAssignment_1_1; }
		
		//Predicate
		public RuleCall getPredPredicateParserRuleCall_1_1_0() { return cPredPredicateParserRuleCall_1_1_0; }
	}
	public class ClauseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.htwdd.sf.beleg.s70307s70429.MyDsl.Clause");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cFactAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cFactPredicateParserRuleCall_0_0 = (RuleCall)cFactAssignment_0.eContents().get(0);
		private final Assignment cClause1Assignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cClause1Alternatives_1_0 = (Alternatives)cClause1Assignment_1.eContents().get(0);
		private final RuleCall cClause1FactParserRuleCall_1_0_0 = (RuleCall)cClause1Alternatives_1_0.eContents().get(0);
		private final RuleCall cClause1RuleParserRuleCall_1_0_1 = (RuleCall)cClause1Alternatives_1_0.eContents().get(1);
		
		//Clause:
		//	fact=Predicate clause1=(Fact | Rule);
		@Override public ParserRule getRule() { return rule; }
		
		//fact=Predicate clause1=(Fact | Rule)
		public Group getGroup() { return cGroup; }
		
		//fact=Predicate
		public Assignment getFactAssignment_0() { return cFactAssignment_0; }
		
		//Predicate
		public RuleCall getFactPredicateParserRuleCall_0_0() { return cFactPredicateParserRuleCall_0_0; }
		
		//clause1=(Fact | Rule)
		public Assignment getClause1Assignment_1() { return cClause1Assignment_1; }
		
		//(Fact | Rule)
		public Alternatives getClause1Alternatives_1_0() { return cClause1Alternatives_1_0; }
		
		//Fact
		public RuleCall getClause1FactParserRuleCall_1_0_0() { return cClause1FactParserRuleCall_1_0_0; }
		
		//Rule
		public RuleCall getClause1RuleParserRuleCall_1_0_1() { return cClause1RuleParserRuleCall_1_0_1; }
	}
	public class FactElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.htwdd.sf.beleg.s70307s70429.MyDsl.Fact");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cFactAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cFullStopKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//Fact:
		//	{Fact} '.';
		@Override public ParserRule getRule() { return rule; }
		
		//{Fact} '.'
		public Group getGroup() { return cGroup; }
		
		//{Fact}
		public Action getFactAction_0() { return cFactAction_0; }
		
		//'.'
		public Keyword getFullStopKeyword_1() { return cFullStopKeyword_1; }
	}
	public class RuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.htwdd.sf.beleg.s70307s70429.MyDsl.Rule");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cColonHyphenMinusKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cQAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cQQueryParserRuleCall_1_0 = (RuleCall)cQAssignment_1.eContents().get(0);
		private final Keyword cFullStopKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Rule:
		//	':-' q=Query '.';
		@Override public ParserRule getRule() { return rule; }
		
		//':-' q=Query '.'
		public Group getGroup() { return cGroup; }
		
		//':-'
		public Keyword getColonHyphenMinusKeyword_0() { return cColonHyphenMinusKeyword_0; }
		
		//q=Query
		public Assignment getQAssignment_1() { return cQAssignment_1; }
		
		//Query
		public RuleCall getQQueryParserRuleCall_1_0() { return cQQueryParserRuleCall_1_0; }
		
		//'.'
		public Keyword getFullStopKeyword_2() { return cFullStopKeyword_2; }
	}
	public class PredicateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.htwdd.sf.beleg.s70307s70429.MyDsl.Predicate");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cPredAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cPredFunctorParserRuleCall_0_0 = (RuleCall)cPredAssignment_0.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTTermParserRuleCall_2_0 = (RuleCall)cTAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cCommaKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cT2Assignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cT2TermParserRuleCall_3_1_0 = (RuleCall)cT2Assignment_3_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Predicate:
		//	pred=Functor '(' t=Term (',' t2+=Term)* ')';
		@Override public ParserRule getRule() { return rule; }
		
		//pred=Functor '(' t=Term (',' t2+=Term)* ')'
		public Group getGroup() { return cGroup; }
		
		//pred=Functor
		public Assignment getPredAssignment_0() { return cPredAssignment_0; }
		
		//Functor
		public RuleCall getPredFunctorParserRuleCall_0_0() { return cPredFunctorParserRuleCall_0_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//t=Term
		public Assignment getTAssignment_2() { return cTAssignment_2; }
		
		//Term
		public RuleCall getTTermParserRuleCall_2_0() { return cTTermParserRuleCall_2_0; }
		
		//(',' t2+=Term)*
		public Group getGroup_3() { return cGroup_3; }
		
		//','
		public Keyword getCommaKeyword_3_0() { return cCommaKeyword_3_0; }
		
		//t2+=Term
		public Assignment getT2Assignment_3_1() { return cT2Assignment_3_1; }
		
		//Term
		public RuleCall getT2TermParserRuleCall_3_1_0() { return cT2TermParserRuleCall_3_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
	}
	public class FunctorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.htwdd.sf.beleg.s70307s70429.MyDsl.Functor");
		private final Assignment cFuncAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cFuncIdentParserRuleCall_0 = (RuleCall)cFuncAssignment.eContents().get(0);
		
		//Functor:
		//	func=Ident;
		@Override public ParserRule getRule() { return rule; }
		
		//func=Ident
		public Assignment getFuncAssignment() { return cFuncAssignment; }
		
		//Ident
		public RuleCall getFuncIdentParserRuleCall_0() { return cFuncIdentParserRuleCall_0; }
	}
	public class TermElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.htwdd.sf.beleg.s70307s70429.MyDsl.Term");
		private final Assignment cTermAssignment = (Assignment)rule.eContents().get(1);
		private final Alternatives cTermAlternatives_0 = (Alternatives)cTermAssignment.eContents().get(0);
		private final RuleCall cTermAtomParserRuleCall_0_0 = (RuleCall)cTermAlternatives_0.eContents().get(0);
		private final RuleCall cTermListParserRuleCall_0_1 = (RuleCall)cTermAlternatives_0.eContents().get(1);
		
		//Term:
		//	term=(Atom | List);
		@Override public ParserRule getRule() { return rule; }
		
		//term=(Atom | List)
		public Assignment getTermAssignment() { return cTermAssignment; }
		
		//(Atom | List)
		public Alternatives getTermAlternatives_0() { return cTermAlternatives_0; }
		
		//Atom
		public RuleCall getTermAtomParserRuleCall_0_0() { return cTermAtomParserRuleCall_0_0; }
		
		//List
		public RuleCall getTermListParserRuleCall_0_1() { return cTermListParserRuleCall_0_1; }
	}
	public class AtomElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.htwdd.sf.beleg.s70307s70429.MyDsl.Atom");
		private final Assignment cXxAssignment = (Assignment)rule.eContents().get(1);
		private final Alternatives cXxAlternatives_0 = (Alternatives)cXxAssignment.eContents().get(0);
		private final RuleCall cXxIdentParserRuleCall_0_0 = (RuleCall)cXxAlternatives_0.eContents().get(0);
		private final RuleCall cXxNumber2ParserRuleCall_0_1 = (RuleCall)cXxAlternatives_0.eContents().get(1);
		private final RuleCall cXxVariable2ParserRuleCall_0_2 = (RuleCall)cXxAlternatives_0.eContents().get(2);
		
		//Atom:
		//	xx=(Ident | Number2 | Variable2);
		@Override public ParserRule getRule() { return rule; }
		
		//xx=(Ident | Number2 | Variable2)
		public Assignment getXxAssignment() { return cXxAssignment; }
		
		//(Ident | Number2 | Variable2)
		public Alternatives getXxAlternatives_0() { return cXxAlternatives_0; }
		
		//Ident
		public RuleCall getXxIdentParserRuleCall_0_0() { return cXxIdentParserRuleCall_0_0; }
		
		//Number2
		public RuleCall getXxNumber2ParserRuleCall_0_1() { return cXxNumber2ParserRuleCall_0_1; }
		
		//Variable2
		public RuleCall getXxVariable2ParserRuleCall_0_2() { return cXxVariable2ParserRuleCall_0_2; }
	}
	public class ListElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.htwdd.sf.beleg.s70307s70429.MyDsl.List");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cListAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Keyword cRightSquareBracketKeyword_0_2 = (Keyword)cGroup_0.eContents().get(2);
		private final Assignment cNelAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cNelNonemptylistParserRuleCall_1_0 = (RuleCall)cNelAssignment_1.eContents().get(0);
		
		//List:
		//	{List} '[' ']' | nel=Nonemptylist;
		@Override public ParserRule getRule() { return rule; }
		
		//{List} '[' ']' | nel=Nonemptylist
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//{List} '[' ']'
		public Group getGroup_0() { return cGroup_0; }
		
		//{List}
		public Action getListAction_0_0() { return cListAction_0_0; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_0_1() { return cLeftSquareBracketKeyword_0_1; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_0_2() { return cRightSquareBracketKeyword_0_2; }
		
		//nel=Nonemptylist
		public Assignment getNelAssignment_1() { return cNelAssignment_1; }
		
		//Nonemptylist
		public RuleCall getNelNonemptylistParserRuleCall_1_0() { return cNelNonemptylistParserRuleCall_1_0; }
	}
	public class NonemptylistElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.htwdd.sf.beleg.s70307s70429.MyDsl.Nonemptylist");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cFolgeAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cFolgeFolgeParserRuleCall_0_1_0 = (RuleCall)cFolgeAssignment_0_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_0_2 = (Keyword)cGroup_0.eContents().get(2);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cAtomAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cAtomAtomParserRuleCall_1_1_0 = (RuleCall)cAtomAssignment_1_1.eContents().get(0);
		private final Keyword cVerticalLineKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final Assignment cTermAssignment_1_3 = (Assignment)cGroup_1.eContents().get(3);
		private final RuleCall cTermTermParserRuleCall_1_3_0 = (RuleCall)cTermAssignment_1_3.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_1_4 = (Keyword)cGroup_1.eContents().get(4);
		
		//Nonemptylist:
		//	'[' folge=Folge ']' | '[' atom=Atom '|' term=Term ']';
		@Override public ParserRule getRule() { return rule; }
		
		//'[' folge=Folge ']' | '[' atom=Atom '|' term=Term ']'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'[' folge=Folge ']'
		public Group getGroup_0() { return cGroup_0; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_0_0() { return cLeftSquareBracketKeyword_0_0; }
		
		//folge=Folge
		public Assignment getFolgeAssignment_0_1() { return cFolgeAssignment_0_1; }
		
		//Folge
		public RuleCall getFolgeFolgeParserRuleCall_0_1_0() { return cFolgeFolgeParserRuleCall_0_1_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_0_2() { return cRightSquareBracketKeyword_0_2; }
		
		//'[' atom=Atom '|' term=Term ']'
		public Group getGroup_1() { return cGroup_1; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_1_0() { return cLeftSquareBracketKeyword_1_0; }
		
		//atom=Atom
		public Assignment getAtomAssignment_1_1() { return cAtomAssignment_1_1; }
		
		//Atom
		public RuleCall getAtomAtomParserRuleCall_1_1_0() { return cAtomAtomParserRuleCall_1_1_0; }
		
		//'|'
		public Keyword getVerticalLineKeyword_1_2() { return cVerticalLineKeyword_1_2; }
		
		//term=Term
		public Assignment getTermAssignment_1_3() { return cTermAssignment_1_3; }
		
		//Term
		public RuleCall getTermTermParserRuleCall_1_3_0() { return cTermTermParserRuleCall_1_3_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_1_4() { return cRightSquareBracketKeyword_1_4; }
	}
	public class FolgeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.htwdd.sf.beleg.s70307s70429.MyDsl.Folge");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cAtomAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cAtomAtomParserRuleCall_0_0 = (RuleCall)cAtomAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cCommaKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cAtomsAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cAtomsAtomParserRuleCall_1_1_0 = (RuleCall)cAtomsAssignment_1_1.eContents().get(0);
		
		//Folge:
		//	atom=Atom (',' atoms+=Atom)*;
		@Override public ParserRule getRule() { return rule; }
		
		//atom=Atom (',' atoms+=Atom)*
		public Group getGroup() { return cGroup; }
		
		//atom=Atom
		public Assignment getAtomAssignment_0() { return cAtomAssignment_0; }
		
		//Atom
		public RuleCall getAtomAtomParserRuleCall_0_0() { return cAtomAtomParserRuleCall_0_0; }
		
		//(',' atoms+=Atom)*
		public Group getGroup_1() { return cGroup_1; }
		
		//','
		public Keyword getCommaKeyword_1_0() { return cCommaKeyword_1_0; }
		
		//atoms+=Atom
		public Assignment getAtomsAssignment_1_1() { return cAtomsAssignment_1_1; }
		
		//Atom
		public RuleCall getAtomsAtomParserRuleCall_1_1_0() { return cAtomsAtomParserRuleCall_1_1_0; }
	}
	public class IdentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.htwdd.sf.beleg.s70307s70429.MyDsl.Ident");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//Ident:
		//	name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	public class Number2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.htwdd.sf.beleg.s70307s70429.MyDsl.Number2");
		private final Assignment cWertAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cWertINTTerminalRuleCall_0 = (RuleCall)cWertAssignment.eContents().get(0);
		
		//Number2:
		//	wert=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//wert=INT
		public Assignment getWertAssignment() { return cWertAssignment; }
		
		//INT
		public RuleCall getWertINTTerminalRuleCall_0() { return cWertINTTerminalRuleCall_0; }
	}
	public class Variable2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.htwdd.sf.beleg.s70307s70429.MyDsl.Variable2");
		private final Assignment cVar1Assignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cVar1VARTerminalRuleCall_0 = (RuleCall)cVar1Assignment.eContents().get(0);
		
		//Variable2:
		//	var1=VAR;
		@Override public ParserRule getRule() { return rule; }
		
		//var1=VAR
		public Assignment getVar1Assignment() { return cVar1Assignment; }
		
		//VAR
		public RuleCall getVar1VARTerminalRuleCall_0() { return cVar1VARTerminalRuleCall_0; }
	}
	
	
	private final PrologdslElements pPrologdsl;
	private final ProgramElements pProgram;
	private final ExqueryElements pExquery;
	private final QueryElements pQuery;
	private final ClauseElements pClause;
	private final FactElements pFact;
	private final RuleElements pRule;
	private final PredicateElements pPredicate;
	private final FunctorElements pFunctor;
	private final TermElements pTerm;
	private final AtomElements pAtom;
	private final ListElements pList;
	private final NonemptylistElements pNonemptylist;
	private final FolgeElements pFolge;
	private final IdentElements pIdent;
	private final Number2Elements pNumber2;
	private final Variable2Elements pVariable2;
	private final TerminalRule tVAR;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pPrologdsl = new PrologdslElements();
		this.pProgram = new ProgramElements();
		this.pExquery = new ExqueryElements();
		this.pQuery = new QueryElements();
		this.pClause = new ClauseElements();
		this.pFact = new FactElements();
		this.pRule = new RuleElements();
		this.pPredicate = new PredicateElements();
		this.pFunctor = new FunctorElements();
		this.pTerm = new TermElements();
		this.pAtom = new AtomElements();
		this.pList = new ListElements();
		this.pNonemptylist = new NonemptylistElements();
		this.pFolge = new FolgeElements();
		this.pIdent = new IdentElements();
		this.pNumber2 = new Number2Elements();
		this.pVariable2 = new Variable2Elements();
		this.tVAR = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "de.htwdd.sf.beleg.s70307s70429.MyDsl.VAR");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("de.htwdd.sf.beleg.s70307s70429.MyDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Prologdsl:
	//	prologdsl=Program ex=Exquery;
	public PrologdslElements getPrologdslAccess() {
		return pPrologdsl;
	}
	
	public ParserRule getPrologdslRule() {
		return getPrologdslAccess().getRule();
	}
	
	//Program:
	//	clause1=Clause clause2+=Clause*;
	public ProgramElements getProgramAccess() {
		return pProgram;
	}
	
	public ParserRule getProgramRule() {
		return getProgramAccess().getRule();
	}
	
	//Exquery:
	//	'?-' q=Query '.';
	public ExqueryElements getExqueryAccess() {
		return pExquery;
	}
	
	public ParserRule getExqueryRule() {
		return getExqueryAccess().getRule();
	}
	
	//Query:
	//	query=Predicate (',' pred+=Predicate)*;
	public QueryElements getQueryAccess() {
		return pQuery;
	}
	
	public ParserRule getQueryRule() {
		return getQueryAccess().getRule();
	}
	
	//Clause:
	//	fact=Predicate clause1=(Fact | Rule);
	public ClauseElements getClauseAccess() {
		return pClause;
	}
	
	public ParserRule getClauseRule() {
		return getClauseAccess().getRule();
	}
	
	//Fact:
	//	{Fact} '.';
	public FactElements getFactAccess() {
		return pFact;
	}
	
	public ParserRule getFactRule() {
		return getFactAccess().getRule();
	}
	
	//Rule:
	//	':-' q=Query '.';
	public RuleElements getRuleAccess() {
		return pRule;
	}
	
	public ParserRule getRuleRule() {
		return getRuleAccess().getRule();
	}
	
	//Predicate:
	//	pred=Functor '(' t=Term (',' t2+=Term)* ')';
	public PredicateElements getPredicateAccess() {
		return pPredicate;
	}
	
	public ParserRule getPredicateRule() {
		return getPredicateAccess().getRule();
	}
	
	//Functor:
	//	func=Ident;
	public FunctorElements getFunctorAccess() {
		return pFunctor;
	}
	
	public ParserRule getFunctorRule() {
		return getFunctorAccess().getRule();
	}
	
	//Term:
	//	term=(Atom | List);
	public TermElements getTermAccess() {
		return pTerm;
	}
	
	public ParserRule getTermRule() {
		return getTermAccess().getRule();
	}
	
	//Atom:
	//	xx=(Ident | Number2 | Variable2);
	public AtomElements getAtomAccess() {
		return pAtom;
	}
	
	public ParserRule getAtomRule() {
		return getAtomAccess().getRule();
	}
	
	//List:
	//	{List} '[' ']' | nel=Nonemptylist;
	public ListElements getListAccess() {
		return pList;
	}
	
	public ParserRule getListRule() {
		return getListAccess().getRule();
	}
	
	//Nonemptylist:
	//	'[' folge=Folge ']' | '[' atom=Atom '|' term=Term ']';
	public NonemptylistElements getNonemptylistAccess() {
		return pNonemptylist;
	}
	
	public ParserRule getNonemptylistRule() {
		return getNonemptylistAccess().getRule();
	}
	
	//Folge:
	//	atom=Atom (',' atoms+=Atom)*;
	public FolgeElements getFolgeAccess() {
		return pFolge;
	}
	
	public ParserRule getFolgeRule() {
		return getFolgeAccess().getRule();
	}
	
	//Ident:
	//	name=ID;
	public IdentElements getIdentAccess() {
		return pIdent;
	}
	
	public ParserRule getIdentRule() {
		return getIdentAccess().getRule();
	}
	
	//Number2:
	//	wert=INT;
	public Number2Elements getNumber2Access() {
		return pNumber2;
	}
	
	public ParserRule getNumber2Rule() {
		return getNumber2Access().getRule();
	}
	
	//Variable2:
	//	var1=VAR;
	public Variable2Elements getVariable2Access() {
		return pVariable2;
	}
	
	public ParserRule getVariable2Rule() {
		return getVariable2Access().getRule();
	}
	
	//terminal VAR:
	//	'A'..'Z';
	public TerminalRule getVARRule() {
		return tVAR;
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
