/**
 * generated by Xtext 2.9.2
 */
package de.htwdd.sf.beleg.s70307s70429.myDsl.impl;

import de.htwdd.sf.beleg.s70307s70429.myDsl.List;
import de.htwdd.sf.beleg.s70307s70429.myDsl.MyDslPackage;
import de.htwdd.sf.beleg.s70307s70429.myDsl.Nonemptylist;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.htwdd.sf.beleg.s70307s70429.myDsl.impl.ListImpl#getNel <em>Nel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListImpl extends MinimalEObjectImpl.Container implements List
{
  /**
   * The cached value of the '{@link #getNel() <em>Nel</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNel()
   * @generated
   * @ordered
   */
  protected Nonemptylist nel;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ListImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Nonemptylist getNel()
  {
    return nel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNel(Nonemptylist newNel, NotificationChain msgs)
  {
    Nonemptylist oldNel = nel;
    nel = newNel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.LIST__NEL, oldNel, newNel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNel(Nonemptylist newNel)
  {
    if (newNel != nel)
    {
      NotificationChain msgs = null;
      if (nel != null)
        msgs = ((InternalEObject)nel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.LIST__NEL, null, msgs);
      if (newNel != null)
        msgs = ((InternalEObject)newNel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.LIST__NEL, null, msgs);
      msgs = basicSetNel(newNel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.LIST__NEL, newNel, newNel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslPackage.LIST__NEL:
        return basicSetNel(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.LIST__NEL:
        return getNel();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.LIST__NEL:
        setNel((Nonemptylist)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.LIST__NEL:
        setNel((Nonemptylist)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.LIST__NEL:
        return nel != null;
    }
    return super.eIsSet(featureID);
  }

} //ListImpl
