/**
 * generated by Xtext 2.9.2
 */
package de.htwdd.sf.beleg.s70307s70429;

import de.htwdd.sf.beleg.s70307s70429.MyDslStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class MyDslStandaloneSetup extends MyDslStandaloneSetupGenerated {
  public static void doSetup() {
    MyDslStandaloneSetup _myDslStandaloneSetup = new MyDslStandaloneSetup();
    _myDslStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}
