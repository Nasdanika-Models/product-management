/**
 */
package org.nasdanika.models.productmanagement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.CapabilityReference#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getCapabilityReference()
 * @model
 * @generated
 */
public interface CapabilityReference extends AbstractCapability {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Capability)
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getCapabilityReference_Target()
	 * @model annotation="urn:org.nasdanika logicalContainment='true'"
	 * @generated
	 */
	Capability getTarget();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.CapabilityReference#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Capability value);

} // CapabilityReference
