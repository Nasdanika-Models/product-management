/**
 */
package org.nasdanika.models.product.management;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lifecycle Status Period</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A time-bounded lifecycle status record within a Version.
 * Enables tracking of Planned → GA → Deprecated → Retired transitions with explicit
 * date ranges. Extends ModelElement for temporal anchoring.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.product.management.LifecycleStatusPeriod#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.product.management.ManagementPackage#getLifecycleStatusPeriod()
 * @model
 * @generated
 */
public interface LifecycleStatusPeriod extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The default value is <code>"PLANNED"</code>.
	 * The literals are from the enumeration {@link org.nasdanika.models.product.management.LifecycleStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The lifecycle status that applies during this period.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.nasdanika.models.product.management.LifecycleStatus
	 * @see #setStatus(LifecycleStatus)
	 * @see org.nasdanika.models.product.management.ManagementPackage#getLifecycleStatusPeriod_Status()
	 * @model default="PLANNED" unique="false"
	 * @generated
	 */
	LifecycleStatus getStatus();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.product.management.LifecycleStatusPeriod#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.nasdanika.models.product.management.LifecycleStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(LifecycleStatus value);

} // LifecycleStatusPeriod
