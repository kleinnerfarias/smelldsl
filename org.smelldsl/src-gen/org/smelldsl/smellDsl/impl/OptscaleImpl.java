/**
 * generated by Xtext 2.26.0-SNAPSHOT
 */
package org.smelldsl.smellDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.smelldsl.smellDsl.Optscale;
import org.smelldsl.smellDsl.Scaletype;
import org.smelldsl.smellDsl.SmellDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Optscale</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.smelldsl.smellDsl.impl.OptscaleImpl#getScaletype <em>Scaletype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OptscaleImpl extends MinimalEObjectImpl.Container implements Optscale
{
  /**
   * The default value of the '{@link #getScaletype() <em>Scaletype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScaletype()
   * @generated
   * @ordered
   */
  protected static final Scaletype SCALETYPE_EDEFAULT = Scaletype.NOMINAL;

  /**
   * The cached value of the '{@link #getScaletype() <em>Scaletype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScaletype()
   * @generated
   * @ordered
   */
  protected Scaletype scaletype = SCALETYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OptscaleImpl()
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
    return SmellDslPackage.Literals.OPTSCALE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Scaletype getScaletype()
  {
    return scaletype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setScaletype(Scaletype newScaletype)
  {
    Scaletype oldScaletype = scaletype;
    scaletype = newScaletype == null ? SCALETYPE_EDEFAULT : newScaletype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmellDslPackage.OPTSCALE__SCALETYPE, oldScaletype, scaletype));
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
      case SmellDslPackage.OPTSCALE__SCALETYPE:
        return getScaletype();
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
      case SmellDslPackage.OPTSCALE__SCALETYPE:
        setScaletype((Scaletype)newValue);
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
      case SmellDslPackage.OPTSCALE__SCALETYPE:
        setScaletype(SCALETYPE_EDEFAULT);
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
      case SmellDslPackage.OPTSCALE__SCALETYPE:
        return scaletype != SCALETYPE_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (scaletype: ");
    result.append(scaletype);
    result.append(')');
    return result.toString();
  }

} //OptscaleImpl
