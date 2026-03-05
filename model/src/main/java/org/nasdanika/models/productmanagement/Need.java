/**
 */
package org.nasdanika.models.productmanagement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Need</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The fundamental requirement a user has to achieve something meaningful.
 * 
 * Think: 'What must be true for this user to succeed?'
 * 
 * Needs are often unstated, discovered through research. They are not tasks and not goals.
 * They are the underlying necessities.
 * 
 * Examples:
 * - Needs a reliable way to track deployment failures
 * - Needs visibility into system performance
 * - Needs a workflow that integrates with existing tools
 * 
 * Needs support goals.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.Need#getSupportedGoals <em>Supported Goals</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Need#getRelatedNeeds <em>Related Needs</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getNeed()
 * @model
 * @generated
 */
public interface Need extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Supported Goals</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Goal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Goals that this need supports. Fulfilling the need contributes to achieving these goals.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Goals</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getNeed_SupportedGoals()
	 * @model
	 * @generated
	 */
	EList<Goal> getSupportedGoals();

	/**
	 * Returns the value of the '<em><b>Related Needs</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Need}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Other needs related to this need. Supports shared needs across personas.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Needs</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getNeed_RelatedNeeds()
	 * @model
	 * @generated
	 */
	EList<Need> getRelatedNeeds();

} // Need
