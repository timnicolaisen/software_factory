/**
 * generated by Xtext 2.9.2
 */
package de.htwdd.sf.beleg.s70307s70429.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.htwdd.sf.beleg.s70307s70429.myDsl.List#getNel <em>Nel</em>}</li>
 * </ul>
 *
 * @see de.htwdd.sf.beleg.s70307s70429.myDsl.MyDslPackage#getList()
 * @model
 * @generated
 */
public interface List extends EObject
{
  /**
   * Returns the value of the '<em><b>Nel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nel</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nel</em>' containment reference.
   * @see #setNel(Nonemptylist)
   * @see de.htwdd.sf.beleg.s70307s70429.myDsl.MyDslPackage#getList_Nel()
   * @model containment="true"
   * @generated
   */
  Nonemptylist getNel();

  /**
   * Sets the value of the '{@link de.htwdd.sf.beleg.s70307s70429.myDsl.List#getNel <em>Nel</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nel</em>' containment reference.
   * @see #getNel()
   * @generated
   */
  void setNel(Nonemptylist value);

} // List
