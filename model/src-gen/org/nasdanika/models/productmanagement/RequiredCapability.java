/**
 */
package org.nasdanika.models.productmanagement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.RequiredCapability#getCapability <em>Capability</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getRequiredCapability()
 * @model
 * @generated
 */
public interface RequiredCapability extends NamedPeriod {
	/**
	 * Returns the value of the '<em><b>Capability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability</em>' containment reference.
	 * @see #setCapability(AbstractCapability)
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getRequiredCapability_Capability()
	 * @model containment="true"
	 * @generated
	 */
	AbstractCapability getCapability();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.RequiredCapability#getCapability <em>Capability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capability</em>' containment reference.
	 * @see #getCapability()
	 * @generated
	 */
	void setCapability(AbstractCapability value);

} // RequiredCapability
