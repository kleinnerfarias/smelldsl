/**
 * generated by Xtext 2.26.0-SNAPSHOT
 */
package org.smelldsl.smellDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domainmodel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smelldsl.smellDsl.Domainmodel#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.smelldsl.smellDsl.SmellDslPackage#getDomainmodel()
 * @model
 * @generated
 */
public interface Domainmodel extends EObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.smelldsl.smellDsl.Type}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.smelldsl.smellDsl.SmellDslPackage#getDomainmodel_Elements()
   * @model containment="true"
   * @generated
   */
  EList<Type> getElements();

} // Domainmodel
