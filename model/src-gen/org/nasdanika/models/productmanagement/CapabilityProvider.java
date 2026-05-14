/**
 */
package org.nasdanika.models.productmanagement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.CapabilityProvider#getProvides <em>Provides</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.CapabilityProvider#getRequires <em>Requires</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.CapabilityProvider#getLifecycle <em>Lifecycle</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getCapabilityProvider()
 * @model
 * @generated
 */
public interface CapabilityProvider extends NamedPeriod, AbstractCapabilityProvider {
	/**
	 * Returns the value of the '<em><b>Provides</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.ProvidedCapability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provides</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getCapabilityProvider_Provides()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProvidedCapability> getProvides();

	/**
	 * Returns the value of the '<em><b>Requires</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.RequiredCapability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getCapabilityProvider_Requires()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequiredCapability> getRequires();

	/**
	 * Returns the value of the '<em><b>Lifecycle</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.productmanagement.Lifecycle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lifecycle</em>' attribute.
	 * @see org.nasdanika.models.productmanagement.Lifecycle
	 * @see #setLifecycle(Lifecycle)
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getCapabilityProvider_Lifecycle()
	 * @model unique="false"
	 * @generated
	 */
	Lifecycle getLifecycle();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.CapabilityProvider#getLifecycle <em>Lifecycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lifecycle</em>' attribute.
	 * @see org.nasdanika.models.productmanagement.Lifecycle
	 * @see #getLifecycle()
	 * @generated
	 */
	void setLifecycle(Lifecycle value);

} // CapabilityProvider
