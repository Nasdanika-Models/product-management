/**
 */
package org.nasdanika.models.productmanagement;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Release</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A version made available to users.
 * A release references a specific version and tracks when it was published and its current status.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.Release#getVersion <em>Version</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Release#getReleaseDate <em>Release Date</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Release#getStatus <em>Status</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Release#getIncludedFeatures <em>Included Features</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getRelease()
 * @model
 * @generated
 */
public interface Release extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The version associated with this release.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' reference.
	 * @see #setVersion(Version)
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getRelease_Version()
	 * @model
	 * @generated
	 */
	Version getVersion();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.Release#getVersion <em>Version</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(Version value);

	/**
	 * Returns the value of the '<em><b>Release Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date the release was published or made available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Release Date</em>' attribute.
	 * @see #setReleaseDate(Date)
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getRelease_ReleaseDate()
	 * @model
	 * @generated
	 */
	Date getReleaseDate();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.Release#getReleaseDate <em>Release Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release Date</em>' attribute.
	 * @see #getReleaseDate()
	 * @generated
	 */
	void setReleaseDate(Date value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.productmanagement.ReleaseStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Current status of the release.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.nasdanika.models.productmanagement.ReleaseStatus
	 * @see #setStatus(ReleaseStatus)
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getRelease_Status()
	 * @model
	 * @generated
	 */
	ReleaseStatus getStatus();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.Release#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.nasdanika.models.productmanagement.ReleaseStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ReleaseStatus value);

	/**
	 * Returns the value of the '<em><b>Included Features</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Features included in this release.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Included Features</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getRelease_IncludedFeatures()
	 * @model
	 * @generated
	 */
	EList<Feature> getIncludedFeatures();

} // Release
