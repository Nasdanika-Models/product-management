/**
 */
package org.nasdanika.models.productmanagement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evidence Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.EvidenceDomain#getEvidence <em>Evidence</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getEvidenceDomain()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface EvidenceDomain extends NamedElement, AbstractEvidence {
	/**
	 * Returns the value of the '<em><b>Evidence</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Evidence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evidence</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getEvidenceDomain_Evidence()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<Evidence> getEvidence();

} // EvidenceDomain
