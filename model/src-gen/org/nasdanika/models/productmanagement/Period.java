/**
 */
package org.nasdanika.models.productmanagement;

import java.time.Duration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Period</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.Period#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Period#getStart <em>Start</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Period#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getPeriod()
 * @model
 * @generated
 */
public interface Period extends EObject {
	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(Duration)
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getPeriod_Duration()
	 * @model unique="false" dataType="org.nasdanika.models.productmanagement.Duration"
	 * @generated
	 */
	Duration getDuration();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.Period#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(Duration value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(Temporal)
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getPeriod_Start()
	 * @model containment="true"
	 * @generated
	 */
	Temporal getStart();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.Period#getStart <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' containment reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Temporal value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(Temporal)
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getPeriod_End()
	 * @model containment="true"
	 * @generated
	 */
	Temporal getEnd();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.Period#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Temporal value);

} // Period
