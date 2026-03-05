/**
 */
package org.nasdanika.models.productmanagement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persona</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A fictional but research-based representation of a target user.
 * 
 * Purpose: to help the product team visualize who they are building for.
 * 
 * Includes demographics, behaviors, motivations, context (work environment, tools),
 * and attitudes/preferences.
 * 
 * Example: 'Alex, a 34-year-old DevOps engineer who values automation and hates manual workflows.'
 * 
 * Personas have needs, goals, and pain points. In this model they are contained by a persona
 * for simplicity. Shared needs, goals, or pain points are addressed by reference subtypes
 * or 'related to' references.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.Persona#getAge <em>Age</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Persona#getRole <em>Role</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Persona#getExperienceLevel <em>Experience Level</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Persona#getWorkEnvironment <em>Work Environment</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Persona#getToolsUsed <em>Tools Used</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Persona#getAttitudes <em>Attitudes</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Persona#getBehaviors <em>Behaviors</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Persona#getActions <em>Actions</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Persona#getNeeds <em>Needs</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Persona#getGoals <em>Goals</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Persona#getPainPoints <em>Pain Points</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getPersona()
 * @model
 * @generated
 */
public interface Persona extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Representative age of the persona.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Age</em>' attribute.
	 * @see #setAge(Integer)
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getPersona_Age()
	 * @model
	 * @generated
	 */
	Integer getAge();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.Persona#getAge <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' attribute.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(Integer value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Job title or role of the persona, e.g. 'DevOps Engineer', 'Hiring Manager'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getPersona_Role()
	 * @model
	 * @generated
	 */
	String getRole();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.Persona#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(String value);

	/**
	 * Returns the value of the '<em><b>Experience Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Level of experience, e.g. 'Junior', 'Mid-level', 'Senior', 'Expert'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Experience Level</em>' attribute.
	 * @see #setExperienceLevel(String)
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getPersona_ExperienceLevel()
	 * @model
	 * @generated
	 */
	String getExperienceLevel();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.Persona#getExperienceLevel <em>Experience Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Experience Level</em>' attribute.
	 * @see #getExperienceLevel()
	 * @generated
	 */
	void setExperienceLevel(String value);

	/**
	 * Returns the value of the '<em><b>Work Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of the persona's work environment, e.g. 'remote startup', 'enterprise office'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Work Environment</em>' attribute.
	 * @see #setWorkEnvironment(String)
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getPersona_WorkEnvironment()
	 * @model
	 * @generated
	 */
	String getWorkEnvironment();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.Persona#getWorkEnvironment <em>Work Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Environment</em>' attribute.
	 * @see #getWorkEnvironment()
	 * @generated
	 */
	void setWorkEnvironment(String value);

	/**
	 * Returns the value of the '<em><b>Tools Used</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tools the persona currently uses in their workflow.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tools Used</em>' attribute list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getPersona_ToolsUsed()
	 * @model
	 * @generated
	 */
	EList<String> getToolsUsed();

	/**
	 * Returns the value of the '<em><b>Attitudes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attitudes and preferences of the persona, e.g. 'risk-averse', 'data-driven'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attitudes</em>' attribute list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getPersona_Attitudes()
	 * @model
	 * @generated
	 */
	EList<String> getAttitudes();

	/**
	 * Returns the value of the '<em><b>Behaviors</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Behavior}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Behavioral patterns of this persona — habitual, preference-based, and cross-situational patterns
	 * describing how the persona typically operates.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Behaviors</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getPersona_Behaviors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Behavior> getBehaviors();

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Concrete, observable steps this persona performs in workflows or scenarios.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getPersona_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Needs</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Need}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fundamental requirements this persona has to achieve something meaningful.
	 * Needs are often unstated and discovered through research.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Needs</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getPersona_Needs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Need> getNeeds();

	/**
	 * Returns the value of the '<em><b>Goals</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Goal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Desired outcomes this persona is trying to accomplish.
	 * Goals may be functional, emotional, or aspirational.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Goals</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getPersona_Goals()
	 * @model containment="true"
	 * @generated
	 */
	EList<Goal> getGoals();

	/**
	 * Returns the value of the '<em><b>Pain Points</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.PainPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Problems, frustrations, or barriers preventing this persona from meeting their goals.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pain Points</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getPersona_PainPoints()
	 * @model containment="true"
	 * @generated
	 */
	EList<PainPoint> getPainPoints();

} // Persona
