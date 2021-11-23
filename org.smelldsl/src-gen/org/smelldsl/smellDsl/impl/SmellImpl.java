/**
 * generated by Xtext 2.26.0-SNAPSHOT
 */
package org.smelldsl.smellDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.smelldsl.smellDsl.Feature;
import org.smelldsl.smellDsl.Smell;
import org.smelldsl.smellDsl.SmellDslPackage;
import org.smelldsl.smellDsl.SmellType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Smell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.smelldsl.smellDsl.impl.SmellImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.smelldsl.smellDsl.impl.SmellImpl#getSmellcontent <em>Smellcontent</em>}</li>
 *   <li>{@link org.smelldsl.smellDsl.impl.SmellImpl#isSymptom <em>Symptom</em>}</li>
 *   <li>{@link org.smelldsl.smellDsl.impl.SmellImpl#isTreatment <em>Treatment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SmellImpl extends TypeImpl implements Smell
{
  /**
   * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperType()
   * @generated
   * @ordered
   */
  protected SmellType superType;

  /**
   * The cached value of the '{@link #getSmellcontent() <em>Smellcontent</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSmellcontent()
   * @generated
   * @ordered
   */
  protected EList<Feature> smellcontent;

  /**
   * The default value of the '{@link #isSymptom() <em>Symptom</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSymptom()
   * @generated
   * @ordered
   */
  protected static final boolean SYMPTOM_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSymptom() <em>Symptom</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSymptom()
   * @generated
   * @ordered
   */
  protected boolean symptom = SYMPTOM_EDEFAULT;

  /**
   * The default value of the '{@link #isTreatment() <em>Treatment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTreatment()
   * @generated
   * @ordered
   */
  protected static final boolean TREATMENT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isTreatment() <em>Treatment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTreatment()
   * @generated
   * @ordered
   */
  protected boolean treatment = TREATMENT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SmellImpl()
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
    return SmellDslPackage.Literals.SMELL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SmellType getSuperType()
  {
    if (superType != null && superType.eIsProxy())
    {
      InternalEObject oldSuperType = (InternalEObject)superType;
      superType = (SmellType)eResolveProxy(oldSuperType);
      if (superType != oldSuperType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmellDslPackage.SMELL__SUPER_TYPE, oldSuperType, superType));
      }
    }
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmellType basicGetSuperType()
  {
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSuperType(SmellType newSuperType)
  {
    SmellType oldSuperType = superType;
    superType = newSuperType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmellDslPackage.SMELL__SUPER_TYPE, oldSuperType, superType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Feature> getSmellcontent()
  {
    if (smellcontent == null)
    {
      smellcontent = new EObjectContainmentEList<Feature>(Feature.class, this, SmellDslPackage.SMELL__SMELLCONTENT);
    }
    return smellcontent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isSymptom()
  {
    return symptom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSymptom(boolean newSymptom)
  {
    boolean oldSymptom = symptom;
    symptom = newSymptom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmellDslPackage.SMELL__SYMPTOM, oldSymptom, symptom));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isTreatment()
  {
    return treatment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTreatment(boolean newTreatment)
  {
    boolean oldTreatment = treatment;
    treatment = newTreatment;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmellDslPackage.SMELL__TREATMENT, oldTreatment, treatment));
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
      case SmellDslPackage.SMELL__SMELLCONTENT:
        return ((InternalEList<?>)getSmellcontent()).basicRemove(otherEnd, msgs);
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
      case SmellDslPackage.SMELL__SUPER_TYPE:
        if (resolve) return getSuperType();
        return basicGetSuperType();
      case SmellDslPackage.SMELL__SMELLCONTENT:
        return getSmellcontent();
      case SmellDslPackage.SMELL__SYMPTOM:
        return isSymptom();
      case SmellDslPackage.SMELL__TREATMENT:
        return isTreatment();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SmellDslPackage.SMELL__SUPER_TYPE:
        setSuperType((SmellType)newValue);
        return;
      case SmellDslPackage.SMELL__SMELLCONTENT:
        getSmellcontent().clear();
        getSmellcontent().addAll((Collection<? extends Feature>)newValue);
        return;
      case SmellDslPackage.SMELL__SYMPTOM:
        setSymptom((Boolean)newValue);
        return;
      case SmellDslPackage.SMELL__TREATMENT:
        setTreatment((Boolean)newValue);
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
      case SmellDslPackage.SMELL__SUPER_TYPE:
        setSuperType((SmellType)null);
        return;
      case SmellDslPackage.SMELL__SMELLCONTENT:
        getSmellcontent().clear();
        return;
      case SmellDslPackage.SMELL__SYMPTOM:
        setSymptom(SYMPTOM_EDEFAULT);
        return;
      case SmellDslPackage.SMELL__TREATMENT:
        setTreatment(TREATMENT_EDEFAULT);
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
      case SmellDslPackage.SMELL__SUPER_TYPE:
        return superType != null;
      case SmellDslPackage.SMELL__SMELLCONTENT:
        return smellcontent != null && !smellcontent.isEmpty();
      case SmellDslPackage.SMELL__SYMPTOM:
        return symptom != SYMPTOM_EDEFAULT;
      case SmellDslPackage.SMELL__TREATMENT:
        return treatment != TREATMENT_EDEFAULT;
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
    result.append(" (symptom: ");
    result.append(symptom);
    result.append(", treatment: ");
    result.append(treatment);
    result.append(')');
    return result.toString();
  }

} //SmellImpl