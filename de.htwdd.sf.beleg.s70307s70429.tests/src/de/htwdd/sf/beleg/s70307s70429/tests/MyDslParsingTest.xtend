/*
 * generated by Xtext 2.9.2
 */
package de.htwdd.sf.beleg.s70307s70429.tests

import com.google.inject.Inject
import de.htwdd.sf.beleg.s70307s70429.myDsl.Prologdsl
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(MyDslInjectorProvider)
class MyDslParsingTest{

	@Inject
	ParseHelper<Prologdsl> parseHelper;

	@Test 
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assert.assertNotNull(result)
	}

}
