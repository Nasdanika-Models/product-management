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
 *   <li>{@link org.nasdanika.models.productmanagement.ModelElement#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.ModelElement#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.ModelElement#getDocRef <em>Doc Ref</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.ModelElement#getDocFormat <em>Doc Format</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.ModelElement#getUris <em>Uris</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getModelElement()
 * @model abstract="true"
 * @generated
 */
public interface ModelElement extends StringIdentity {
	/**
	 * Returns the value of the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Custom icon - treated as URL if contains / or as a CSS class otherwise.
	 * E.g. fas fa-wrench would be treated as a CSS class.
	 * For URLs the recommended icon size is 20x20 pixels and the recommended format is SVG.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Icon</em>' attribute.
	 * @see #setIcon(String)
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getModelElement_Icon()
	 * @model unique="false"
	 * @generated
	 */
	String getIcon();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.ModelElement#getIcon <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon</em>' attribute.
	 * @see #getIcon()
	 * @generated
	 */
	void setIcon(String value);

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
	 * Returns the value of the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Documentation resource URI resolved relative to this model element resource URI.
	 * Documentation format is derived from extension if not set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Doc Ref</em>' attribute.
	 * @see #setDocRef(String)
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getModelElement_DocRef()
	 * @model unique="false"
	 * @generated
	 */
	String getDocRef();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.ModelElement#getDocRef <em>Doc Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doc Ref</em>' attribute.
	 * @see #getDocRef()
	 * @generated
	 */
	void setDocRef(String value);

	/**
	 * Returns the value of the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Documentation format. If not set, defaults to markdown for inline documentation and is
	 * derived from the documentation resource extension for docRef
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Doc Format</em>' attribute.
	 * @see #setDocFormat(String)
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getModelElement_DocFormat()
	 * @model unique="false"
	 * @generated
	 */
	String getDocFormat();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.ModelElement#getDocFormat <em>Doc Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doc Format</em>' attribute.
	 * @see #getDocFormat()
	 * @generated
	 */
	void setDocFormat(String value);

	/**
	 * Returns the value of the '<em><b>Uris</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Alias URIs resolved relative to the parent URIs - can be absolute or opaque - global references.
	 * For example: actors://john-smith.
	 * For domains URIs can be used as anchors to merge domains from different sources.
	 * For example, several teams may maintain capability domains with URI myorg://capabilities/developer-productivity
	 * When these definitions are assembled into the organization's product management model to generate documentation
	 * all of these domains are merged into a single logical domain.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uris</em>' attribute list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getModelElement_Uris()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getUris();

} // ModelElement
