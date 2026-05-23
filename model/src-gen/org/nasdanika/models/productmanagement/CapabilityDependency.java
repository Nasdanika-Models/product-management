/**
 */
package org.nasdanika.models.productmanagement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.CapabilityDependency#getKind <em>Kind</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.CapabilityDependency#isOptional <em>Optional</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getCapabilityDependency()
 * @model
 * @generated
 */
public interface CapabilityDependency extends CapabilityReference {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.productmanagement.DependencyKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.nasdanika.models.productmanagement.DependencyKind
	 * @see #setKind(DependencyKind)
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getCapabilityDependency_Kind()
	 * @model unique="false"
	 * @generated
	 */
	DependencyKind getKind();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.CapabilityDependency#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.nasdanika.models.productmanagement.DependencyKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(DependencyKind value);

	/**
	 * Returns the value of the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional</em>' attribute.
	 * @see #setOptional(boolean)
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getCapabilityDependency_Optional()
	 * @model unique="false"
	 * @generated
	 */
	boolean isOptional();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.CapabilityDependency#isOptional <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional</em>' attribute.
	 * @see #isOptional()
	 * @generated
	 */
	void setOptional(boolean value);

} // CapabilityDependency
