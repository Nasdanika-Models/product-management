/**
 */
package org.nasdanika.models.productmanagement;

import java.time.Duration;
import java.time.Instant;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Temporal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.Temporal#getBase <em>Base</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Temporal#getInstant <em>Instant</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Temporal#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Temporal#getLowerBounds <em>Lower Bounds</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Temporal#getUpperBounds <em>Upper Bounds</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getTemporal()
 * @model
 * @generated
 */
public interface Temporal extends EObject {
	/**
	 * Returns the value of the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base</em>' reference.
	 * @see #setBase(Temporal)
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getTemporal_Base()
	 * @model
	 * @generated
	 */
	Temporal getBase();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.Temporal#getBase <em>Base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' reference.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(Temporal value);

	/**
	 * Returns the value of the '<em><b>Instant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instant</em>' attribute.
	 * @see #setInstant(Instant)
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getTemporal_Instant()
	 * @model unique="false" dataType="org.nasdanika.models.productmanagement.Instant"
	 * @generated
	 */
	Instant getInstant();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.Temporal#getInstant <em>Instant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instant</em>' attribute.
	 * @see #getInstant()
	 * @generated
	 */
	void setInstant(Instant value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(Duration)
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getTemporal_Duration()
	 * @model unique="false" dataType="org.nasdanika.models.productmanagement.Duration"
	 * @generated
	 */
	Duration getDuration();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.Temporal#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(Duration value);

	/**
	 * Returns the value of the '<em><b>Lower Bounds</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Temporal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bounds</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getTemporal_LowerBounds()
	 * @model
	 * @generated
	 */
	EList<Temporal> getLowerBounds();

	/**
	 * Returns the value of the '<em><b>Upper Bounds</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Temporal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bounds</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getTemporal_UpperBounds()
	 * @model
	 * @generated
	 */
	EList<Temporal> getUpperBounds();

} // Temporal
