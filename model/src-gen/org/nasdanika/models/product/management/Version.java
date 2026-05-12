/**
 */
package org.nasdanika.models.product.management;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A version of a capability or capability provider.
 * Carries a formal versionString (e.g. '4.12.0') and an optional display label
 * (e.g. '2026-03 Cerulean'). Lifecycle transitions are tracked via statusPeriods.
 * Corresponds to capability.Version (ecore://nasdanika.org/models/capability).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.product.management.Version#getVersionString <em>Version String</em>}</li>
 *   <li>{@link org.nasdanika.models.product.management.Version#getLabel <em>Label</em>}</li>
 *   <li>{@link org.nasdanika.models.product.management.Version#getStatusPeriods <em>Status Periods</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.product.management.ManagementPackage#getVersion()
 * @model
 * @generated
 */
public interface Version extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Version String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Formal version identifier, e.g. '4.12.0' or
	 * '2026.2.0'. Should follow the versioning scheme of the capability provider
	 * ecosystem (Maven, OSGi, npm, etc.).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version String</em>' attribute.
	 * @see #setVersionString(String)
	 * @see org.nasdanika.models.product.management.ManagementPackage#getVersion_VersionString()
	 * @model unique="false"
	 * @generated
	 */
	String getVersionString();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.product.management.Version#getVersionString <em>Version String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version String</em>' attribute.
	 * @see #getVersionString()
	 * @generated
	 */
	void setVersionString(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Human-readable display label, e.g. a release name like
	 * '2026-03 Cerulean'. Distinct from versionString. Used in documentation and
	 * user-facing materials.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.nasdanika.models.product.management.ManagementPackage#getVersion_Label()
	 * @model unique="false"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.product.management.Version#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Status Periods</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.product.management.LifecycleStatusPeriod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time-bounded lifecycle status records tracking the
	 * Planned → GA → Deprecated → Retired transition timeline for this version.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status Periods</em>' containment reference list.
	 * @see org.nasdanika.models.product.management.ManagementPackage#getVersion_StatusPeriods()
	 * @model containment="true"
	 * @generated
	 */
	EList<LifecycleStatusPeriod> getStatusPeriods();

} // Version
