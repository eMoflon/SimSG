/**
 * generated by Xtext 2.16.0
 */
package org.simsg.simsgl.simSGL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Site State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.simsg.simsgl.simSGL.SiteState#getState <em>State</em>}</li>
 * </ul>
 *
 * @see org.simsg.simsgl.simSGL.SimSGLPackage#getSiteState()
 * @model
 * @generated
 */
public interface SiteState extends EObject
{
  /**
   * Returns the value of the '<em><b>State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>State</em>' reference.
   * @see #setState(State)
   * @see org.simsg.simsgl.simSGL.SimSGLPackage#getSiteState_State()
   * @model
   * @generated
   */
  State getState();

  /**
   * Sets the value of the '{@link org.simsg.simsgl.simSGL.SiteState#getState <em>State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State</em>' reference.
   * @see #getState()
   * @generated
   */
  void setState(State value);

} // SiteState
