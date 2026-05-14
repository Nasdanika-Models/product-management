/**
 */
package org.nasdanika.models.productmanagement;

import org.eclipse.emf.common.util.EList;

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
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getConcern()
 * @model
 * @generated
 */
public interface Concern extends NamedPeriod, AbstractConcern {
	/**
	 * Returns the value of the '<em><b>Addressed By</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.AbstractCapability}.
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

} // Concern
