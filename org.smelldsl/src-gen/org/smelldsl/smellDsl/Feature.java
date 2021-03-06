/**
 * generated by Xtext 2.26.0-SNAPSHOT
 */
package org.smelldsl.smellDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smelldsl.smellDsl.Feature#getName <em>Name</em>}</li>
 *   <li>{@link org.smelldsl.smellDsl.Feature#isOptscales <em>Optscales</em>}</li>
 *   <li>{@link org.smelldsl.smellDsl.Feature#getMeasures <em>Measures</em>}</li>
 * </ul>
 *
 * @see org.smelldsl.smellDsl.SmellDslPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.smelldsl.smellDsl.SmellDslPackage#getFeature_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.smelldsl.smellDsl.Feature#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Optscales</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Optscales</em>' attribute.
   * @see #setOptscales(boolean)
   * @see org.smelldsl.smellDsl.SmellDslPackage#getFeature_Optscales()
   * @model
   * @generated
   */
  boolean isOptscales();

  /**
   * Sets the value of the '{@link org.smelldsl.smellDsl.Feature#isOptscales <em>Optscales</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Optscales</em>' attribute.
   * @see #isOptscales()
   * @generated
   */
  void setOptscales(boolean value);

  /**
   * Returns the value of the '<em><b>Measures</b></em>' containment reference list.
   * The list contents are of type {@link org.smelldsl.smellDsl.Measure}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Measures</em>' containment reference list.
   * @see org.smelldsl.smellDsl.SmellDslPackage#getFeature_Measures()
   * @model containment="true"
   * @generated
   */
  EList<Measure> getMeasures();

} // Feature
