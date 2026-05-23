/**
 */
package org.nasdanika.models.productmanagement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concern Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.ConcernDomain#getConcerns <em>Concerns</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.ConcernDomain#getResolvedConcerns <em>Resolved Concerns</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getConcernDomain()
 * @model
 * @generated
 */
public interface ConcernDomain extends NamedElement, AbstractConcern {
	/**
	 * Returns the value of the '<em><b>Concerns</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.AbstractConcern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerns</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getConcernDomain_Concerns()
	 * @model containment="true" keys="id"
	 *        annotation="urn:org.nasdanika logicalContainment='false'"
	 * @generated
	 */
	EList<AbstractConcern> getConcerns();

	/**
	 * Returns the value of the '<em><b>Resolved Concerns</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.AbstractConcern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolved Concerns</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getConcernDomain_ResolvedConcerns()
	 * @model keys="id" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="urn:org.nasdanika logicalContainment='true'"
	 * @generated
	 */
	EList<AbstractConcern> getResolvedConcerns();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" startUnique="false"
	 * @generated
	 */
	AbstractConcern resolveConcernReference(AbstractConcern start);

} // ConcernDomain
