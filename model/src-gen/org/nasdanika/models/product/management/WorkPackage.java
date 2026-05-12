/**
 */
package org.nasdanika.models.product.management;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A unit of planned or in-progress work with temporal scope
 * and organizational accountability. Nestable via subWorkPackages. Links to offerings
 * via 'impacts' and to capabilities via 'contributes'. The 'tracker' field holds a
 * URI to an external tracking system (Jira, GitHub Issues, etc.).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.product.management.WorkPackage#getSubWorkPackages <em>Sub Work Packages</em>}</li>
 *   <li>{@link org.nasdanika.models.product.management.WorkPackage#getImpacts <em>Impacts</em>}</li>
 *   <li>{@link org.nasdanika.models.product.management.WorkPackage#getContributes <em>Contributes</em>}</li>
 *   <li>{@link org.nasdanika.models.product.management.WorkPackage#getTracker <em>Tracker</em>}</li>
 *   <li>{@link org.nasdanika.models.product.management.WorkPackage#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.product.management.ManagementPackage#getWorkPackage()
 * @model
 * @generated
 */
public interface WorkPackage extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Sub Work Packages</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.product.management.WorkPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nested work packages decomposing this work package into
	 * smaller units, e.g. epics → stories → sub-tasks.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Work Packages</em>' containment reference list.
	 * @see org.nasdanika.models.product.management.ManagementPackage#getWorkPackage_SubWorkPackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<WorkPackage> getSubWorkPackages();

	/**
	 * Returns the value of the '<em><b>Impacts</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.product.management.CapabilityProvider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Offerings and capability providers that this work package
	 * affects, e.g. the Maven module or deployable bundle that will be changed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Impacts</em>' reference list.
	 * @see org.nasdanika.models.product.management.ManagementPackage#getWorkPackage_Impacts()
	 * @model
	 * @generated
	 */
	EList<CapabilityProvider> getImpacts();

	/**
	 * Returns the value of the '<em><b>Contributes</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.product.management.Capability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Capabilities this work package delivers or advances.
	 * Tracks which planned capabilities are progressed by this work package.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contributes</em>' reference list.
	 * @see org.nasdanika.models.product.management.ManagementPackage#getWorkPackage_Contributes()
	 * @model
	 * @generated
	 */
	EList<Capability> getContributes();

	/**
	 * Returns the value of the '<em><b>Tracker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URI or identifier in an external tracking system, e.g.
	 * a Jira issue URL or GitHub issue reference. Enables traceability between the
	 * product model and execution-layer tools.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tracker</em>' attribute.
	 * @see #setTracker(String)
	 * @see org.nasdanika.models.product.management.ManagementPackage#getWorkPackage_Tracker()
	 * @model unique="false"
	 * @generated
	 */
	String getTracker();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.product.management.WorkPackage#getTracker <em>Tracker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tracker</em>' attribute.
	 * @see #getTracker()
	 * @generated
	 */
	void setTracker(String value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.product.management.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Roles defined on this work package as an undergoer,
	 * e.g. 'Lead', 'Assignee', or 'Reviewer'. Models architecture.Undergoer.roles
	 * (ecore://nasdanika.org/models/architecture).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see org.nasdanika.models.product.management.ManagementPackage#getWorkPackage_Roles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role> getRoles();

} // WorkPackage
