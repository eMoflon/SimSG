/**
 * generated by Xtext 2.16.0
 */
package biochemsimulation.reactionrules.reactionRules.impl;

import biochemsimulation.reactionrules.reactionRules.Observation;
import biochemsimulation.reactionrules.reactionRules.PatternAssignment;
import biochemsimulation.reactionrules.reactionRules.ReactionRulesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link biochemsimulation.reactionrules.reactionRules.impl.ObservationImpl#getObservationPattern <em>Observation Pattern</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObservationImpl extends ReactionPropertyImpl implements Observation
{
  /**
   * The cached value of the '{@link #getObservationPattern() <em>Observation Pattern</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObservationPattern()
   * @generated
   * @ordered
   */
  protected PatternAssignment observationPattern;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ObservationImpl()
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
    return ReactionRulesPackage.Literals.OBSERVATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PatternAssignment getObservationPattern()
  {
    return observationPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetObservationPattern(PatternAssignment newObservationPattern, NotificationChain msgs)
  {
    PatternAssignment oldObservationPattern = observationPattern;
    observationPattern = newObservationPattern;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReactionRulesPackage.OBSERVATION__OBSERVATION_PATTERN, oldObservationPattern, newObservationPattern);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObservationPattern(PatternAssignment newObservationPattern)
  {
    if (newObservationPattern != observationPattern)
    {
      NotificationChain msgs = null;
      if (observationPattern != null)
        msgs = ((InternalEObject)observationPattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReactionRulesPackage.OBSERVATION__OBSERVATION_PATTERN, null, msgs);
      if (newObservationPattern != null)
        msgs = ((InternalEObject)newObservationPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReactionRulesPackage.OBSERVATION__OBSERVATION_PATTERN, null, msgs);
      msgs = basicSetObservationPattern(newObservationPattern, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReactionRulesPackage.OBSERVATION__OBSERVATION_PATTERN, newObservationPattern, newObservationPattern));
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
      case ReactionRulesPackage.OBSERVATION__OBSERVATION_PATTERN:
        return basicSetObservationPattern(null, msgs);
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
      case ReactionRulesPackage.OBSERVATION__OBSERVATION_PATTERN:
        return getObservationPattern();
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
      case ReactionRulesPackage.OBSERVATION__OBSERVATION_PATTERN:
        setObservationPattern((PatternAssignment)newValue);
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
      case ReactionRulesPackage.OBSERVATION__OBSERVATION_PATTERN:
        setObservationPattern((PatternAssignment)null);
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
      case ReactionRulesPackage.OBSERVATION__OBSERVATION_PATTERN:
        return observationPattern != null;
    }
    return super.eIsSet(featureID);
  }

} //ObservationImpl
