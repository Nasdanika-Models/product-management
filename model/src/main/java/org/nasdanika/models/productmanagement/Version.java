/**
 */
package org.nasdanika.models.productmanagement;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A version identifier. Products, features, capabilities, and capability providers may have versions.
 * Versioning may be semantic, calendar-based, or follow other schemes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.Version#getVersionScheme <em>Version Scheme</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Version#getVersionString <em>Version String</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Version#getDate <em>Date</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getVersion()
 * @model
 * @generated
 */
public interface Version extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Version Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The versioning scheme, e.g. 'semantic', 'calendar', 'incremental'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version Scheme</em>' attribute.
	 * @see #setVersionScheme(String)
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getVersion_VersionScheme()
	 * @model
	 * @generated
	 */
	String getVersionScheme();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.Version#getVersionScheme <em>Version Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Scheme</em>' attribute.
	 * @see #getVersionScheme()
	 * @generated
	 */
	void setVersionScheme(String value);

	/**
	 * Returns the value of the '<em><b>Version String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The version string, e.g. '1.2.3', '2024.01'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version String</em>' attribute.
	 * @see #setVersionString(String)
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getVersion_VersionString()
	 * @model
	 * @generated
	 */
	String getVersionString();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.Version#getVersionString <em>Version String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version String</em>' attribute.
	 * @see #getVersionString()
	 * @generated
	 */
	void setVersionString(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date this version was defined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getVersion_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.Version#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

} // Version
