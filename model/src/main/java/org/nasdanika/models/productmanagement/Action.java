/**
 */
package org.nasdanika.models.productmanagement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A concrete, observable step a persona performs in a workflow or scenario.
 * Actions are contextual, sequential, and task-level.
 * 
 * They capture:
 * - Task steps in a workflow
 * - Interactions with tools or systems
 * - Triggered events (what they do next)
 * - User journey touchpoints
 * 
 * Examples:
 * - 'Uploads a resume file'
 * - 'Filters candidates by skill score'
 * 
 * Actions help design what the user must do to succeed.
 * They guide workflow and feature design.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.Action#getOrder <em>Order</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Action#getRelatedCapabilities <em>Related Capabilities</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Action#getRelatedFeatures <em>Related Features</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sequence order of this action within the persona's workflow.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see #setOrder(Integer)
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getAction_Order()
	 * @model
	 * @generated
	 */
	Integer getOrder();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.Action#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(Integer value);

	/**
	 * Returns the value of the '<em><b>Related Capabilities</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Capability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Capabilities exercised or required by this action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Capabilities</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getAction_RelatedCapabilities()
	 * @model
	 * @generated
	 */
	EList<Capability> getRelatedCapabilities();

	/**
	 * Returns the value of the '<em><b>Related Features</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Features involved in or supporting this action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Features</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getAction_RelatedFeatures()
	 * @model
	 * @generated
	 */
	EList<Feature> getRelatedFeatures();

} // Action
