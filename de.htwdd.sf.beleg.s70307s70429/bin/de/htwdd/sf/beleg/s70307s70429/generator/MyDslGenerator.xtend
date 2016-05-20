/*
 * generated by Xtext 2.9.1
 */
package de.htwdd.sf.beleg.s70307s70429.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import de.htwdd.sf.beleg.s70307s70429.myDsl.*

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MyDslGenerator extends AbstractGenerator {

	String code = ""
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
//		code=""	
		for (e : resource.allContents.toIterable.filter(typeof(Prologdsl))) {
			e.traverse
		}
		fsa.generateFile("Prologdsl.lsp", code) { }
			
	}
			
	def traverse(Prologdsl to) {
		conc("(prolog (quote\n(")
		to.prologdsl.traverse
		conc("))\n(quote\n(")
		to.ex.traverse
		conc(")))")
	}
	
	def traverse(Program to) {	//c+=Clause+;
		System::out.println("traverse Program")
//		conc("(")	
		to.clause1.traverse
		if (to.clause1 != null){
			for (allc:to.clause2){
				allc.traverse
			}
		}
//		conc(")")
	}
	
	def traverse(Exquery to) { //'?-' q=Query '.';
		System::out.println("traverse Exquery")	
		to.q.traverse
	}
	
	def traverse(Query to) { //query=Predicate (','pred+=Predicate)*;
		System::out.println("traverse Query")	
		to.query.traverse
		if (to.pred != null){ 
			for (allpred:to.pred){
				allpred.traverse
			}
		}
	}
	
	def traverse(Clause to) { //fact=Predicate (clause1= Fact | Rule);
		System::out.println("traverse Clause")
		 conc("(")	
		to.fact.traverse
		if (to.clause1 instanceof Fact) {
			System::out.println("Fact erkannt")
			(to.clause1 as Fact).traverse
		}else if (to.clause1 instanceof Rule) {
			System::out.println("Rule erkannt")
			(to.clause1 as Rule).traverse		
		}else{
			conc(' ()')
			System::out.println("gar nichts erkannt")
		}
		conc(")\n")
	}
	
	def traverse(Fact to) { //{Fact}'.';
//		to.query.traverse
//		conc('\n');
	}
	
	def traverse(Rule to) { //':-' q=Query '.';	
		to.q.traverse
	}

	def traverse(Predicate to) { //pred=Functor '(' t=Term (',' t2+=Term )*')';
		System::out.println("traverse Predicate")	
		conc('(')
		to.pred.traverse
		to.t.traverse
		if (to.t2 != null){
			for (allt2:to.t2){
				allt2.traverse
			}	
		}
		conc(')')
	}
	
	def traverse(Functor to) { //func=Ident;
		System::out.println("traverse Functor")
		to.func.traverse	
	}
	
	def traverse(Term to) { //term=(Atom | List);
		System::out.println("traverse Term")	
		if (to.term instanceof Atom){
			System::out.println("Atom erkannt")
			(to.term as Atom).traverse
		}else if (to.term instanceof List) {
			System::out.println("List erkannt")
			(to.term as List).traverse		
		}else{
			conc(' ()')
			System::out.println("gar nichts erkannt")
		}
	}
	
	def traverse(Atom to) { //xx=(Ident | Number2 | Variable2);
		System::out.println("traverse Atom")	
		if (to.xx instanceof Ident){
			System::out.println("Ident erkannt")
			(to.xx as Ident).traverse
		}else if (to.xx instanceof Number2){
			System::out.println("Number2 erkannt")
			(to.xx as Number2).traverse
		}else if (to.xx instanceof Variable2) {
			System::out.println("Variable2 erkannt")
			(to.xx as Variable2).traverse		
		}else{
			conc(' ()')
			System::out.println("gar nichts erkannt")
		}
	}
	
	def traverse(List e){
	    if(e.nel==null){
	    	conc("()")
	    }else{ 
	    	e.nel.traverse
        }
    }

	def traverse(Nonemptylist e){
		conc("(cons ")
		if(e.folge!=null){ 
			e.folge.traverse
		}else{
			if(e.atom!=null){
				e.atom.traverse
			}
			conc(" ")
			if(e.term!=null){ 
				e.term.traverse
			}
		}
		conc(")")
	}

	def traverse(Folge e){
		var int i = 0
		if(e.atom!=null){
			e.atom.traverse
		}
		if(e.atoms!=null){
			for(atom : e.atoms){
				i = i + 1
				conc(" (cons ")
				(atom as Atom).traverse
			}
			conc(" ()")
			for(j:1..i){
				conc(")")
			}
		}
	}
	
	def traverse(Variable2 k){
		conc(" "+k.getVar1()+" ")	
	}
		
	def traverse(Number2 k){
			// conc(" "+k.getWert() as String+" ")
		conc(" "+k.wert +" ")	
	} 
		
	def traverse(Ident k){
		conc(" "+k.getName()+" ")	
	}
	
	
	def conc(String str) {
		code = code + str
	}
		
}
