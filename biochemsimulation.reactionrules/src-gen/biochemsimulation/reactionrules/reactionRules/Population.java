/**
 * generated by Xtext 2.12.0
 */
package biochemsimulation.reactionrules.reactionRules;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Population</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link biochemsimulation.reactionrules.reactionRules.Population#getPa <em>Pa</em>}</li>
 * </ul>
 *
 * @see biochemsimulation.reactionrules.reactionRules.ReactionRulesPackage#getPopulation()
 * @model
 * @generated
 */
public interface Population extends TerminationCondition
{
  /**
   * Returns the value of the '<em><b>Pa</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pa</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pa</em>' containment reference.
   * @see #setPa(PatternAssignment)
   * @see biochemsimulation.reactionrules.reactionRules.ReactionRulesPackage#getPopulation_Pa()
   * @model containment="true"
   * @generated
   */
  PatternAssignment getPa();

  /**
   * Sets the value of the '{@link biochemsimulation.reactionrules.reactionRules.Population#getPa <em>Pa</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pa</em>' containment reference.
   * @see #getPa()
   * @generated
   */
  void setPa(PatternAssignment value);

} // Population
