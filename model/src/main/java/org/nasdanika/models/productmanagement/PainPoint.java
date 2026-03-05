/**
 */
package org.nasdanika.models.productmanagement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pain Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The problem, frustration, or barrier preventing the user from meeting their goals.
 * 
 * Think: 'What is getting in their way?'
 * 
 * Examples:
 * - Release notes are scattered across tools
 * - Manual steps cause errors
 * - Slow CI pipeline delays deployments
 * - They do not trust the monitoring alerts
 * 
 * Pain points are what your product should aim to resolve.
 * Pain points violate needs and block goals.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.PainPoint#getViolatedNeeds <em>Violated Needs</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.PainPoint#getBlockedGoals <em>Blocked Goals</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.PainPoint#getRelatedPainPoints <em>Related Pain Points</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getPainPoint()
 * @model
 * @generated
 */
public interface PainPoint extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Violated Needs</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Need}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Needs that this pain point violates or undermines.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Violated Needs</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getPainPoint_ViolatedNeeds()
	 * @model
	 * @generated
	 */
	EList<Need> getViolatedNeeds();

	/**
	 * Returns the value of the '<em><b>Blocked Goals</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Goal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Goals that this pain point blocks or hinders.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Blocked Goals</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getPainPoint_BlockedGoals()
	 * @model
	 * @generated
	 */
	EList<Goal> getBlockedGoals();

	/**
	 * Returns the value of the '<em><b>Related Pain Points</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.PainPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Other pain points related to this one. Supports shared pain points across personas.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Pain Points</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getPainPoint_RelatedPainPoints()
	 * @model
	 * @generated
	 */
	EList<PainPoint> getRelatedPainPoints();

} // PainPoint
