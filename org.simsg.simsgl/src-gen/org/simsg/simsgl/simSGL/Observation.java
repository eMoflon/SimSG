/**
 * generated by Xtext 2.16.0
 */
package org.simsg.simsgl.simSGL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.simsg.simsgl.simSGL.Observation#getObservationPattern <em>Observation Pattern</em>}</li>
 * </ul>
 *
 * @see org.simsg.simsgl.simSGL.SimSGLPackage#getObservation()
 * @model
 * @generated
 */
public interface Observation extends SimSGLProperty
{
  /**
   * Returns the value of the '<em><b>Observation Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Observation Pattern</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Observation Pattern</em>' containment reference.
   * @see #setObservationPattern(PatternAssignment)
   * @see org.simsg.simsgl.simSGL.SimSGLPackage#getObservation_ObservationPattern()
   * @model containment="true"
   * @generated
   */
  PatternAssignment getObservationPattern();

  /**
   * Sets the value of the '{@link org.simsg.simsgl.simSGL.Observation#getObservationPattern <em>Observation Pattern</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Observation Pattern</em>' containment reference.
   * @see #getObservationPattern()
   * @generated
   */
  void setObservationPattern(PatternAssignment value);

} // Observation
