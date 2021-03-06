/**
 * generated by Xtext 2.26.0-SNAPSHOT
 */
package org.smelldsl.smellDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smelldsl.smellDsl.Measure#getName <em>Name</em>}</li>
 *   <li>{@link org.smelldsl.smellDsl.Measure#getMeasure <em>Measure</em>}</li>
 * </ul>
 *
 * @see org.smelldsl.smellDsl.SmellDslPackage#getMeasure()
 * @model
 * @generated
 */
public interface Measure extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.smelldsl.smellDsl.SmellDslPackage#getMeasure_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.smelldsl.smellDsl.Measure#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Measure</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Measure</em>' containment reference.
   * @see #setMeasure(Measure)
   * @see org.smelldsl.smellDsl.SmellDslPackage#getMeasure_Measure()
   * @model containment="true"
   * @generated
   */
  Measure getMeasure();

  /**
   * Sets the value of the '{@link org.smelldsl.smellDsl.Measure#getMeasure <em>Measure</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Measure</em>' containment reference.
   * @see #getMeasure()
   * @generated
   */
  void setMeasure(Measure value);

} // Measure
