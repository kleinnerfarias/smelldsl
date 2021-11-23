/**
 * generated by Xtext 2.26.0-SNAPSHOT
 */
package org.smelldsl.smellDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.smelldsl.smellDsl.Expression;
import org.smelldsl.smellDsl.LogicExpression;
import org.smelldsl.smellDsl.LogicOperator;
import org.smelldsl.smellDsl.SmellDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logic Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.smelldsl.smellDsl.impl.LogicExpressionImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.smelldsl.smellDsl.impl.LogicExpressionImpl#getLogicOperator <em>Logic Operator</em>}</li>
 *   <li>{@link org.smelldsl.smellDsl.impl.LogicExpressionImpl#getLogicExpression <em>Logic Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogicExpressionImpl extends MinimalEObjectImpl.Container implements LogicExpression
{
  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected Expression expression;

  /**
   * The default value of the '{@link #getLogicOperator() <em>Logic Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLogicOperator()
   * @generated
   * @ordered
   */
  protected static final LogicOperator LOGIC_OPERATOR_EDEFAULT = LogicOperator.AND;

  /**
   * The cached value of the '{@link #getLogicOperator() <em>Logic Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLogicOperator()
   * @generated
   * @ordered
   */
  protected LogicOperator logicOperator = LOGIC_OPERATOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getLogicExpression() <em>Logic Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLogicExpression()
   * @generated
   * @ordered
   */
  protected LogicExpression logicExpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LogicExpressionImpl()
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
    return SmellDslPackage.Literals.LOGIC_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs)
  {
    Expression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmellDslPackage.LOGIC_EXPRESSION__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setExpression(Expression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmellDslPackage.LOGIC_EXPRESSION__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmellDslPackage.LOGIC_EXPRESSION__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmellDslPackage.LOGIC_EXPRESSION__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LogicOperator getLogicOperator()
  {
    return logicOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLogicOperator(LogicOperator newLogicOperator)
  {
    LogicOperator oldLogicOperator = logicOperator;
    logicOperator = newLogicOperator == null ? LOGIC_OPERATOR_EDEFAULT : newLogicOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmellDslPackage.LOGIC_EXPRESSION__LOGIC_OPERATOR, oldLogicOperator, logicOperator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LogicExpression getLogicExpression()
  {
    return logicExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLogicExpression(LogicExpression newLogicExpression, NotificationChain msgs)
  {
    LogicExpression oldLogicExpression = logicExpression;
    logicExpression = newLogicExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmellDslPackage.LOGIC_EXPRESSION__LOGIC_EXPRESSION, oldLogicExpression, newLogicExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLogicExpression(LogicExpression newLogicExpression)
  {
    if (newLogicExpression != logicExpression)
    {
      NotificationChain msgs = null;
      if (logicExpression != null)
        msgs = ((InternalEObject)logicExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmellDslPackage.LOGIC_EXPRESSION__LOGIC_EXPRESSION, null, msgs);
      if (newLogicExpression != null)
        msgs = ((InternalEObject)newLogicExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmellDslPackage.LOGIC_EXPRESSION__LOGIC_EXPRESSION, null, msgs);
      msgs = basicSetLogicExpression(newLogicExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmellDslPackage.LOGIC_EXPRESSION__LOGIC_EXPRESSION, newLogicExpression, newLogicExpression));
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
      case SmellDslPackage.LOGIC_EXPRESSION__EXPRESSION:
        return basicSetExpression(null, msgs);
      case SmellDslPackage.LOGIC_EXPRESSION__LOGIC_EXPRESSION:
        return basicSetLogicExpression(null, msgs);
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
      case SmellDslPackage.LOGIC_EXPRESSION__EXPRESSION:
        return getExpression();
      case SmellDslPackage.LOGIC_EXPRESSION__LOGIC_OPERATOR:
        return getLogicOperator();
      case SmellDslPackage.LOGIC_EXPRESSION__LOGIC_EXPRESSION:
        return getLogicExpression();
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
      case SmellDslPackage.LOGIC_EXPRESSION__EXPRESSION:
        setExpression((Expression)newValue);
        return;
      case SmellDslPackage.LOGIC_EXPRESSION__LOGIC_OPERATOR:
        setLogicOperator((LogicOperator)newValue);
        return;
      case SmellDslPackage.LOGIC_EXPRESSION__LOGIC_EXPRESSION:
        setLogicExpression((LogicExpression)newValue);
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
      case SmellDslPackage.LOGIC_EXPRESSION__EXPRESSION:
        setExpression((Expression)null);
        return;
      case SmellDslPackage.LOGIC_EXPRESSION__LOGIC_OPERATOR:
        setLogicOperator(LOGIC_OPERATOR_EDEFAULT);
        return;
      case SmellDslPackage.LOGIC_EXPRESSION__LOGIC_EXPRESSION:
        setLogicExpression((LogicExpression)null);
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
      case SmellDslPackage.LOGIC_EXPRESSION__EXPRESSION:
        return expression != null;
      case SmellDslPackage.LOGIC_EXPRESSION__LOGIC_OPERATOR:
        return logicOperator != LOGIC_OPERATOR_EDEFAULT;
      case SmellDslPackage.LOGIC_EXPRESSION__LOGIC_EXPRESSION:
        return logicExpression != null;
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
    result.append(" (logicOperator: ");
    result.append(logicOperator);
    result.append(')');
    return result.toString();
  }

} //LogicExpressionImpl
