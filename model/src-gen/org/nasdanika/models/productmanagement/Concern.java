/**
 */
package org.nasdanika.models.productmanagement;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.capability.AbstractCapability;

import org.nasdanika.models.nxcore.NamedPeriod;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.Concern#getAddressedBy <em>Addressed By</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Concern#getAllAddressedBy <em>All Addressed By</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Concern#getSupports <em>Supports</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Concern#getAllSupports <em>All Supports</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Concern#getSupportedBy <em>Supported By</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Concern#getAllSupportedBy <em>All Supported By</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getConcern()
 * @model
 * @generated
 */
public interface Concern extends NamedPeriod, AbstractConcern {
	/**
	 * Returns the value of the '<em><b>Addressed By</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.capability.AbstractCapability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Addressed by allows to explain how some external capabilities address
	 * concerns.
	 * It also allows to model capabilities within concerns to have a
	 * self-contained persona.
	 * It can be used in acquisition/unification scenarios
	 * where shared capabilities are extracted (e.g. accounting or a custom script/tool)
	 * and unique are retained (e.g. the best clam chowder in town, report generation)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Addressed By</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getConcern_AddressedBy()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractCapability> getAddressedBy();

	/**
	 * Returns the value of the '<em><b>All Addressed By</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.capability.AbstractCapability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Addressed concerns from this capability plus addressedBy from concerns
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>All Addressed By</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getConcern_AllAddressedBy()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<AbstractCapability> getAllAddressedBy();

	/**
	 * Returns the value of the '<em><b>Supports</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.ConcernReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Goals supported by this need
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supports</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getConcern_Supports()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConcernReference> getSupports();

	/**
	 * Returns the value of the '<em><b>All Supports</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Concern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Supports from this need plus supportingNeeds from goals
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>All Supports</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getConcern_AllSupports()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Concern> getAllSupports();

	/**
	 * Returns the value of the '<em><b>Supported By</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.ConcernReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * References to needs supporting this goal
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported By</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getConcern_SupportedBy()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConcernReference> getSupportedBy();

	/**
	 * Returns the value of the '<em><b>All Supported By</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Concern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Supporting needs from this goal plus supports from needs
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>All Supported By</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getConcern_AllSupportedBy()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Concern> getAllSupportedBy();

} // Concern
