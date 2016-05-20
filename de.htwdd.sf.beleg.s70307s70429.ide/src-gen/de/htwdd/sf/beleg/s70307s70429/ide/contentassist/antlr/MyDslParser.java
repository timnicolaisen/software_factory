/*
 * generated by Xtext 2.9.2
 */
package de.htwdd.sf.beleg.s70307s70429.ide.contentassist.antlr;

import com.google.inject.Inject;
import de.htwdd.sf.beleg.s70307s70429.ide.contentassist.antlr.internal.InternalMyDslParser;
import de.htwdd.sf.beleg.s70307s70429.services.MyDslGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class MyDslParser extends AbstractContentAssistParser {

	@Inject
	private MyDslGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalMyDslParser createParser() {
		InternalMyDslParser result = new InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getClauseAccess().getClause1Alternatives_1_0(), "rule__Clause__Clause1Alternatives_1_0");
					put(grammarAccess.getTermAccess().getTermAlternatives_0(), "rule__Term__TermAlternatives_0");
					put(grammarAccess.getAtomAccess().getXxAlternatives_0(), "rule__Atom__XxAlternatives_0");
					put(grammarAccess.getListAccess().getAlternatives(), "rule__List__Alternatives");
					put(grammarAccess.getNonemptylistAccess().getAlternatives(), "rule__Nonemptylist__Alternatives");
					put(grammarAccess.getPrologdslAccess().getGroup(), "rule__Prologdsl__Group__0");
					put(grammarAccess.getProgramAccess().getGroup(), "rule__Program__Group__0");
					put(grammarAccess.getExqueryAccess().getGroup(), "rule__Exquery__Group__0");
					put(grammarAccess.getQueryAccess().getGroup(), "rule__Query__Group__0");
					put(grammarAccess.getQueryAccess().getGroup_1(), "rule__Query__Group_1__0");
					put(grammarAccess.getClauseAccess().getGroup(), "rule__Clause__Group__0");
					put(grammarAccess.getFactAccess().getGroup(), "rule__Fact__Group__0");
					put(grammarAccess.getRuleAccess().getGroup(), "rule__Rule__Group__0");
					put(grammarAccess.getPredicateAccess().getGroup(), "rule__Predicate__Group__0");
					put(grammarAccess.getPredicateAccess().getGroup_3(), "rule__Predicate__Group_3__0");
					put(grammarAccess.getListAccess().getGroup_0(), "rule__List__Group_0__0");
					put(grammarAccess.getNonemptylistAccess().getGroup_0(), "rule__Nonemptylist__Group_0__0");
					put(grammarAccess.getNonemptylistAccess().getGroup_1(), "rule__Nonemptylist__Group_1__0");
					put(grammarAccess.getFolgeAccess().getGroup(), "rule__Folge__Group__0");
					put(grammarAccess.getFolgeAccess().getGroup_1(), "rule__Folge__Group_1__0");
					put(grammarAccess.getPrologdslAccess().getPrologdslAssignment_0(), "rule__Prologdsl__PrologdslAssignment_0");
					put(grammarAccess.getPrologdslAccess().getExAssignment_1(), "rule__Prologdsl__ExAssignment_1");
					put(grammarAccess.getProgramAccess().getClause1Assignment_0(), "rule__Program__Clause1Assignment_0");
					put(grammarAccess.getProgramAccess().getClause2Assignment_1(), "rule__Program__Clause2Assignment_1");
					put(grammarAccess.getExqueryAccess().getQAssignment_1(), "rule__Exquery__QAssignment_1");
					put(grammarAccess.getQueryAccess().getQueryAssignment_0(), "rule__Query__QueryAssignment_0");
					put(grammarAccess.getQueryAccess().getPredAssignment_1_1(), "rule__Query__PredAssignment_1_1");
					put(grammarAccess.getClauseAccess().getFactAssignment_0(), "rule__Clause__FactAssignment_0");
					put(grammarAccess.getClauseAccess().getClause1Assignment_1(), "rule__Clause__Clause1Assignment_1");
					put(grammarAccess.getRuleAccess().getQAssignment_1(), "rule__Rule__QAssignment_1");
					put(grammarAccess.getPredicateAccess().getPredAssignment_0(), "rule__Predicate__PredAssignment_0");
					put(grammarAccess.getPredicateAccess().getTAssignment_2(), "rule__Predicate__TAssignment_2");
					put(grammarAccess.getPredicateAccess().getT2Assignment_3_1(), "rule__Predicate__T2Assignment_3_1");
					put(grammarAccess.getFunctorAccess().getFuncAssignment(), "rule__Functor__FuncAssignment");
					put(grammarAccess.getTermAccess().getTermAssignment(), "rule__Term__TermAssignment");
					put(grammarAccess.getAtomAccess().getXxAssignment(), "rule__Atom__XxAssignment");
					put(grammarAccess.getListAccess().getNelAssignment_1(), "rule__List__NelAssignment_1");
					put(grammarAccess.getNonemptylistAccess().getFolgeAssignment_0_1(), "rule__Nonemptylist__FolgeAssignment_0_1");
					put(grammarAccess.getNonemptylistAccess().getAtomAssignment_1_1(), "rule__Nonemptylist__AtomAssignment_1_1");
					put(grammarAccess.getNonemptylistAccess().getTermAssignment_1_3(), "rule__Nonemptylist__TermAssignment_1_3");
					put(grammarAccess.getFolgeAccess().getAtomAssignment_0(), "rule__Folge__AtomAssignment_0");
					put(grammarAccess.getFolgeAccess().getAtomsAssignment_1_1(), "rule__Folge__AtomsAssignment_1_1");
					put(grammarAccess.getIdentAccess().getNameAssignment(), "rule__Ident__NameAssignment");
					put(grammarAccess.getNumber2Access().getWertAssignment(), "rule__Number2__WertAssignment");
					put(grammarAccess.getVariable2Access().getVar1Assignment(), "rule__Variable2__Var1Assignment");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalMyDslParser typedParser = (InternalMyDslParser) parser;
			typedParser.entryRulePrologdsl();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}