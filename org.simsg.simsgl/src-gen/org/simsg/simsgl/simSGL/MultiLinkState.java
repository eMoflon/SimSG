/**
 * generated by Xtext 2.16.0
 */
package org.simsg.simsgl.simSGL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Link State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.simsg.simsgl.simSGL.MultiLinkState#getLinkState <em>Link State</em>}</li>
 * </ul>
 *
 * @see org.simsg.simsgl.simSGL.SimSGLPackage#getMultiLinkState()
 * @model
 * @generated
 */
public interface MultiLinkState extends EObject
{
  /**
   * Returns the value of the '<em><b>Link State</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Link State</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Link State</em>' containment reference.
   * @see #setLinkState(LinkState)
   * @see org.simsg.simsgl.simSGL.SimSGLPackage#getMultiLinkState_LinkState()
   * @model containment="true"
   * @generated
   */
  LinkState getLinkState();

  /**
   * Sets the value of the '{@link org.simsg.simsgl.simSGL.MultiLinkState#getLinkState <em>Link State</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Link State</em>' containment reference.
   * @see #getLinkState()
   * @generated
   */
  void setLinkState(LinkState value);

} // MultiLinkState
