/**
 * generated by Xtext 2.16.0
 */
package biochemsimulation.reactionrules.reactionRules.impl;

import biochemsimulation.reactionrules.reactionRules.BoundAnyOfTypeLinkSite;
import biochemsimulation.reactionrules.reactionRules.ReactionRulesPackage;
import biochemsimulation.reactionrules.reactionRules.Site;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bound Any Of Type Link Site</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link biochemsimulation.reactionrules.reactionRules.impl.BoundAnyOfTypeLinkSiteImpl#getSite <em>Site</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoundAnyOfTypeLinkSiteImpl extends MinimalEObjectImpl.Container implements BoundAnyOfTypeLinkSite
{
  /**
   * The cached value of the '{@link #getSite() <em>Site</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSite()
   * @generated
   * @ordered
   */
  protected Site site;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BoundAnyOfTypeLinkSiteImpl()
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
    return ReactionRulesPackage.Literals.BOUND_ANY_OF_TYPE_LINK_SITE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Site getSite()
  {
    if (site != null && site.eIsProxy())
    {
      InternalEObject oldSite = (InternalEObject)site;
      site = (Site)eResolveProxy(oldSite);
      if (site != oldSite)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReactionRulesPackage.BOUND_ANY_OF_TYPE_LINK_SITE__SITE, oldSite, site));
      }
    }
    return site;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Site basicGetSite()
  {
    return site;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSite(Site newSite)
  {
    Site oldSite = site;
    site = newSite;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReactionRulesPackage.BOUND_ANY_OF_TYPE_LINK_SITE__SITE, oldSite, site));
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
      case ReactionRulesPackage.BOUND_ANY_OF_TYPE_LINK_SITE__SITE:
        if (resolve) return getSite();
        return basicGetSite();
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
      case ReactionRulesPackage.BOUND_ANY_OF_TYPE_LINK_SITE__SITE:
        setSite((Site)newValue);
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
      case ReactionRulesPackage.BOUND_ANY_OF_TYPE_LINK_SITE__SITE:
        setSite((Site)null);
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
      case ReactionRulesPackage.BOUND_ANY_OF_TYPE_LINK_SITE__SITE:
        return site != null;
    }
    return super.eIsSet(featureID);
  }

} //BoundAnyOfTypeLinkSiteImpl
