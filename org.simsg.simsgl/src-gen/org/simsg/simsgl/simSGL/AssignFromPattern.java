/**
 * generated by Xtext 2.16.0
 */
package org.simsg.simsgl.simSGL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assign From Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.simsg.simsgl.simSGL.AssignFromPattern#getPattern <em>Pattern</em>}</li>
 * </ul>
 *
 * @see org.simsg.simsgl.simSGL.SimSGLPackage#getAssignFromPattern()
 * @model
 * @generated
 */
public interface AssignFromPattern extends PatternAssignment
{
  /**
   * Returns the value of the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pattern</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pattern</em>' containment reference.
   * @see #setPattern(Pattern)
   * @see org.simsg.simsgl.simSGL.SimSGLPackage#getAssignFromPattern_Pattern()
   * @model containment="true"
   * @generated
   */
  Pattern getPattern();

  /**
   * Sets the value of the '{@link org.simsg.simsgl.simSGL.AssignFromPattern#getPattern <em>Pattern</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pattern</em>' containment reference.
   * @see #getPattern()
   * @generated
   */
  void setPattern(Pattern value);

} // AssignFromPattern
