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
 *   <li>{@link org.nasdanika.models.productmanagement.CapabilityDependency#getQualifier <em>Qualifier</em>}</li>
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
	 * Returns the value of the '<em><b>Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Qualifier for the dependency kind, e.g. CUSTOM kind
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Qualifier</em>' attribute.
	 * @see #setQualifier(String)
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getCapabilityDependency_Qualifier()
	 * @model unique="false"
	 * @generated
	 */
	String getQualifier();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.CapabilityDependency#getQualifier <em>Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier</em>' attribute.
	 * @see #getQualifier()
	 * @generated
	 */
	void setQualifier(String value);

} // CapabilityDependency
