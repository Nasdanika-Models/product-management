/**
 */
package org.nasdanika.models.product.management;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Offering</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A form of capability provider packaged for external
 * consumption as a unit, e.g. a Maven artifact, a CLI download, or a Docker image.
 * Extends CapabilityProvider. The 'coordinate' field holds the canonical external
 * coordinate (e.g., Maven GAV). Follows the federated-artifact pattern from
 * https://maven.models.nasdanika.org/.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.product.management.Offering#getCoordinate <em>Coordinate</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.product.management.ManagementPackage#getOffering()
 * @model
 * @generated
 */
public interface Offering extends CapabilityProvider {
	/**
	 * Returns the value of the '<em><b>Coordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Canonical external coordinate for this offering, e.g.
	 * a Maven GAV 'org.nasdanika.models:product-management:0.1.0', an npm package name,
	 * or a Docker image tag.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coordinate</em>' attribute.
	 * @see #setCoordinate(String)
	 * @see org.nasdanika.models.product.management.ManagementPackage#getOffering_Coordinate()
	 * @model unique="false"
	 * @generated
	 */
	String getCoordinate();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.product.management.Offering#getCoordinate <em>Coordinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinate</em>' attribute.
	 * @see #getCoordinate()
	 * @generated
	 */
	void setCoordinate(String value);

} // Offering
