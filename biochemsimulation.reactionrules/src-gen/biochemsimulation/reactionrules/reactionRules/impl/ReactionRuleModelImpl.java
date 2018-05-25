/**
 * generated by Xtext 2.12.0
 */
package biochemsimulation.reactionrules.reactionRules.impl;

import biochemsimulation.reactionrules.reactionRules.Model;
import biochemsimulation.reactionrules.reactionRules.ReactionContainer;
import biochemsimulation.reactionrules.reactionRules.ReactionProperty;
import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel;
import biochemsimulation.reactionrules.reactionRules.ReactionRulesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reaction Rule Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link biochemsimulation.reactionrules.reactionRules.impl.ReactionRuleModelImpl#getModel <em>Model</em>}</li>
 *   <li>{@link biochemsimulation.reactionrules.reactionRules.impl.ReactionRuleModelImpl#getReactionContainer <em>Reaction Container</em>}</li>
 *   <li>{@link biochemsimulation.reactionrules.reactionRules.impl.ReactionRuleModelImpl#getReactionProperties <em>Reaction Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReactionRuleModelImpl extends MinimalEObjectImpl.Container implements ReactionRuleModel
{
  /**
   * The cached value of the '{@link #getModel() <em>Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModel()
   * @generated
   * @ordered
   */
  protected Model model;

  /**
   * The cached value of the '{@link #getReactionContainer() <em>Reaction Container</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReactionContainer()
   * @generated
   * @ordered
   */
  protected ReactionContainer reactionContainer;

  /**
   * The cached value of the '{@link #getReactionProperties() <em>Reaction Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReactionProperties()
   * @generated
   * @ordered
   */
  protected EList<ReactionProperty> reactionProperties;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReactionRuleModelImpl()
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
    return ReactionRulesPackage.Literals.REACTION_RULE_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model getModel()
  {
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetModel(Model newModel, NotificationChain msgs)
  {
    Model oldModel = model;
    model = newModel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReactionRulesPackage.REACTION_RULE_MODEL__MODEL, oldModel, newModel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModel(Model newModel)
  {
    if (newModel != model)
    {
      NotificationChain msgs = null;
      if (model != null)
        msgs = ((InternalEObject)model).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReactionRulesPackage.REACTION_RULE_MODEL__MODEL, null, msgs);
      if (newModel != null)
        msgs = ((InternalEObject)newModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReactionRulesPackage.REACTION_RULE_MODEL__MODEL, null, msgs);
      msgs = basicSetModel(newModel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReactionRulesPackage.REACTION_RULE_MODEL__MODEL, newModel, newModel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReactionContainer getReactionContainer()
  {
    return reactionContainer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReactionContainer(ReactionContainer newReactionContainer, NotificationChain msgs)
  {
    ReactionContainer oldReactionContainer = reactionContainer;
    reactionContainer = newReactionContainer;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReactionRulesPackage.REACTION_RULE_MODEL__REACTION_CONTAINER, oldReactionContainer, newReactionContainer);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReactionContainer(ReactionContainer newReactionContainer)
  {
    if (newReactionContainer != reactionContainer)
    {
      NotificationChain msgs = null;
      if (reactionContainer != null)
        msgs = ((InternalEObject)reactionContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReactionRulesPackage.REACTION_RULE_MODEL__REACTION_CONTAINER, null, msgs);
      if (newReactionContainer != null)
        msgs = ((InternalEObject)newReactionContainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReactionRulesPackage.REACTION_RULE_MODEL__REACTION_CONTAINER, null, msgs);
      msgs = basicSetReactionContainer(newReactionContainer, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReactionRulesPackage.REACTION_RULE_MODEL__REACTION_CONTAINER, newReactionContainer, newReactionContainer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ReactionProperty> getReactionProperties()
  {
    if (reactionProperties == null)
    {
      reactionProperties = new EObjectContainmentEList<ReactionProperty>(ReactionProperty.class, this, ReactionRulesPackage.REACTION_RULE_MODEL__REACTION_PROPERTIES);
    }
    return reactionProperties;
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
      case ReactionRulesPackage.REACTION_RULE_MODEL__MODEL:
        return basicSetModel(null, msgs);
      case ReactionRulesPackage.REACTION_RULE_MODEL__REACTION_CONTAINER:
        return basicSetReactionContainer(null, msgs);
      case ReactionRulesPackage.REACTION_RULE_MODEL__REACTION_PROPERTIES:
        return ((InternalEList<?>)getReactionProperties()).basicRemove(otherEnd, msgs);
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
      case ReactionRulesPackage.REACTION_RULE_MODEL__MODEL:
        return getModel();
      case ReactionRulesPackage.REACTION_RULE_MODEL__REACTION_CONTAINER:
        return getReactionContainer();
      case ReactionRulesPackage.REACTION_RULE_MODEL__REACTION_PROPERTIES:
        return getReactionProperties();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ReactionRulesPackage.REACTION_RULE_MODEL__MODEL:
        setModel((Model)newValue);
        return;
      case ReactionRulesPackage.REACTION_RULE_MODEL__REACTION_CONTAINER:
        setReactionContainer((ReactionContainer)newValue);
        return;
      case ReactionRulesPackage.REACTION_RULE_MODEL__REACTION_PROPERTIES:
        getReactionProperties().clear();
        getReactionProperties().addAll((Collection<? extends ReactionProperty>)newValue);
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
      case ReactionRulesPackage.REACTION_RULE_MODEL__MODEL:
        setModel((Model)null);
        return;
      case ReactionRulesPackage.REACTION_RULE_MODEL__REACTION_CONTAINER:
        setReactionContainer((ReactionContainer)null);
        return;
      case ReactionRulesPackage.REACTION_RULE_MODEL__REACTION_PROPERTIES:
        getReactionProperties().clear();
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
      case ReactionRulesPackage.REACTION_RULE_MODEL__MODEL:
        return model != null;
      case ReactionRulesPackage.REACTION_RULE_MODEL__REACTION_CONTAINER:
        return reactionContainer != null;
      case ReactionRulesPackage.REACTION_RULE_MODEL__REACTION_PROPERTIES:
        return reactionProperties != null && !reactionProperties.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ReactionRuleModelImpl
