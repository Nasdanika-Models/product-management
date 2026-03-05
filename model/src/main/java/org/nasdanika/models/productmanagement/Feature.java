/**
 */
package org.nasdanika.models.productmanagement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A unit of utility for one or more personas — something that helps to achieve a goal,
 * satisfies a need, or addresses a pain point.
 * 
 * One feature may be associated with multiple goals, needs, and pain points and vice versa.
 * Features can be associated with personas directly for coarse-grained models.
 * 
 * A Feature is modeled as a subtype of Capability because a feature is itself a capability
 * exposed to users.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.Feature#getAddressedNeeds <em>Addressed Needs</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Feature#getSupportedGoals <em>Supported Goals</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Feature#getAddressedPainPoints <em>Addressed Pain Points</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Feature#getPersonaAssociations <em>Persona Associations</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Feature#getUsedCapabilities <em>Used Capabilities</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends Capability {
	/**
	 * Returns the value of the '<em><b>Addressed Needs</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Need}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Needs that this feature addresses or satisfies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Addressed Needs</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getFeature_AddressedNeeds()
	 * @model
	 * @generated
	 */
	EList<Need> getAddressedNeeds();

	/**
	 * Returns the value of the '<em><b>Supported Goals</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Goal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Goals that this feature supports or helps achieve.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Goals</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getFeature_SupportedGoals()
	 * @model
	 * @generated
	 */
	EList<Goal> getSupportedGoals();

	/**
	 * Returns the value of the '<em><b>Addressed Pain Points</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.PainPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pain points that this feature addresses or mitigates.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Addressed Pain Points</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getFeature_AddressedPainPoints()
	 * @model
	 * @generated
	 */
	EList<PainPoint> getAddressedPainPoints();

	/**
	 * Returns the value of the '<em><b>Persona Associations</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.FeaturePersonaAssociation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Associations between this feature and specific personas. The association class
	 * carries a description and is contained by the feature — features are created to make personas happy.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Persona Associations</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getFeature_PersonaAssociations()
	 * @model containment="true"
	 * @generated
	 */
	EList<FeaturePersonaAssociation> getPersonaAssociations();

	/**
	 * Returns the value of the '<em><b>Used Capabilities</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Capability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Capabilities that this feature uses or depends on.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Used Capabilities</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getFeature_UsedCapabilities()
	 * @model
	 * @generated
	 */
	EList<Capability> getUsedCapabilities();

} // Feature
