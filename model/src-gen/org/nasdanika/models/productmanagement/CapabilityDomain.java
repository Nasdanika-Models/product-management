/**
 */
package org.nasdanika.models.productmanagement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.CapabilityDomain#getCapabilities <em>Capabilities</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getCapabilityDomain()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface CapabilityDomain extends NamedElement, AbstractCapability {
	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.AbstractCapability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capabilities</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getCapabilityDomain_Capabilities()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractCapability> getCapabilities();

} // CapabilityDomain
