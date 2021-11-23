/**
 * generated by Xtext 2.26.0-SNAPSHOT
 */
package org.smelldsl.smellDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smelldsl.smellDsl.Expression#getRelationalOperator <em>Relational Operator</em>}</li>
 * </ul>
 *
 * @see org.smelldsl.smellDsl.SmellDslPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends EObject
{
  /**
   * Returns the value of the '<em><b>Relational Operator</b></em>' attribute list.
   * The list contents are of type {@link org.smelldsl.smellDsl.RelationalOperator}.
   * The literals are from the enumeration {@link org.smelldsl.smellDsl.RelationalOperator}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relational Operator</em>' attribute list.
   * @see org.smelldsl.smellDsl.RelationalOperator
   * @see org.smelldsl.smellDsl.SmellDslPackage#getExpression_RelationalOperator()
   * @model unique="false"
   * @generated
   */
  EList<RelationalOperator> getRelationalOperator();

} // Expression