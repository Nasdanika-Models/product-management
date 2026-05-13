/**
 */
package org.nasdanika.models.productmanagement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.ModelElement#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.ModelElement#getUris <em>Uris</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getModelElement()
 * @model abstract="true"
 * @generated
 */
public interface ModelElement extends StringIdentity {
	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' attribute.
	 * @see #setDocumentation(String)
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getModelElement_Documentation()
	 * @model unique="false"
	 * @generated
	 */
	String getDocumentation();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.ModelElement#getDocumentation <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' attribute.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(String value);

	/**
	 * Returns the value of the '<em><b>Uris</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Alias URIs resolved relative to the parent URIs - can be absolute or opaque - global references.
	 * For example: actors://john-smith
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uris</em>' attribute list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getModelElement_Uris()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getUris();

} // ModelElement
