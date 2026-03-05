/**
 */
package org.nasdanika.models.productmanagement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ideal Customer Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A composite that constrains Segment + Industry + Size + Tech Stack to define the ideal customer.
 * ICP is a composite of market primitives.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.IdealCustomerProfile#getTargetIndustries <em>Target Industries</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.IdealCustomerProfile#getTargetCompanySizes <em>Target Company Sizes</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.IdealCustomerProfile#getTargetGeographies <em>Target Geographies</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.IdealCustomerProfile#getTechStack <em>Tech Stack</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.IdealCustomerProfile#getTargetPersonas <em>Target Personas</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getIdealCustomerProfile()
 * @model
 * @generated
 */
public interface IdealCustomerProfile extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Target Industries</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Industry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Target industries for this ICP.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Industries</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getIdealCustomerProfile_TargetIndustries()
	 * @model
	 * @generated
	 */
	EList<Industry> getTargetIndustries();

	/**
	 * Returns the value of the '<em><b>Target Company Sizes</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.CompanySize}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Target company sizes for this ICP.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Company Sizes</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getIdealCustomerProfile_TargetCompanySizes()
	 * @model
	 * @generated
	 */
	EList<CompanySize> getTargetCompanySizes();

	/**
	 * Returns the value of the '<em><b>Target Geographies</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Geography}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Target geographies for this ICP.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Geographies</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getIdealCustomerProfile_TargetGeographies()
	 * @model
	 * @generated
	 */
	EList<Geography> getTargetGeographies();

	/**
	 * Returns the value of the '<em><b>Tech Stack</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Technology stack requirements, e.g. 'AWS', 'Kubernetes', 'Java'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tech Stack</em>' attribute list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getIdealCustomerProfile_TechStack()
	 * @model
	 * @generated
	 */
	EList<String> getTechStack();

	/**
	 * Returns the value of the '<em><b>Target Personas</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Persona}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Personas that characterize this ICP.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Personas</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getIdealCustomerProfile_TargetPersonas()
	 * @model
	 * @generated
	 */
	EList<Persona> getTargetPersonas();

} // IdealCustomerProfile
