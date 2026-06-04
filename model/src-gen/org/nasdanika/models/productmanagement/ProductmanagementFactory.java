/**
 */
package org.nasdanika.models.productmanagement;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage
 * @generated
 */
public interface ProductmanagementFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProductmanagementFactory eINSTANCE = org.nasdanika.models.productmanagement.impl.ProductmanagementFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Temporal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Temporal</em>'.
	 * @generated
	 */
	Temporal createTemporal();

	/**
	 * Returns a new object of class '<em>Period</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Period</em>'.
	 * @generated
	 */
	Period createPeriod();

	/**
	 * Returns a new object of class '<em>Product Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Model</em>'.
	 * @generated
	 */
	ProductModel createProductModel();

	/**
	 * Returns a new object of class '<em>Persona</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Persona</em>'.
	 * @generated
	 */
	Persona createPersona();

	/**
	 * Returns a new object of class '<em>Persona Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Persona Domain</em>'.
	 * @generated
	 */
	PersonaDomain createPersonaDomain();

	/**
	 * Returns a new object of class '<em>Persona Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Persona Reference</em>'.
	 * @generated
	 */
	PersonaReference createPersonaReference();

	/**
	 * Returns a new object of class '<em>Concern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concern</em>'.
	 * @generated
	 */
	Concern createConcern();

	/**
	 * Returns a new object of class '<em>Concern Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concern Reference</em>'.
	 * @generated
	 */
	ConcernReference createConcernReference();

	/**
	 * Returns a new object of class '<em>Concern Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concern Domain</em>'.
	 * @generated
	 */
	ConcernDomain createConcernDomain();

	/**
	 * Returns a new object of class '<em>Goal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Goal</em>'.
	 * @generated
	 */
	Goal createGoal();

	/**
	 * Returns a new object of class '<em>Need</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Need</em>'.
	 * @generated
	 */
	Need createNeed();

	/**
	 * Returns a new object of class '<em>Pain Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pain Point</em>'.
	 * @generated
	 */
	PainPoint createPainPoint();

	/**
	 * Returns a new object of class '<em>Capability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capability</em>'.
	 * @generated
	 */
	Capability createCapability();

	/**
	 * Returns a new object of class '<em>Composite Capability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Capability</em>'.
	 * @generated
	 */
	CompositeCapability createCompositeCapability();

	/**
	 * Returns a new object of class '<em>Capability Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capability Reference</em>'.
	 * @generated
	 */
	CapabilityReference createCapabilityReference();

	/**
	 * Returns a new object of class '<em>Capability Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capability Domain</em>'.
	 * @generated
	 */
	CapabilityDomain createCapabilityDomain();

	/**
	 * Returns a new object of class '<em>Capability Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capability Dependency</em>'.
	 * @generated
	 */
	CapabilityDependency createCapabilityDependency();

	/**
	 * Returns a new object of class '<em>Capability Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capability Provider</em>'.
	 * @generated
	 */
	CapabilityProvider createCapabilityProvider();

	/**
	 * Returns a new object of class '<em>Capability Provider Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capability Provider Domain</em>'.
	 * @generated
	 */
	CapabilityProviderDomain createCapabilityProviderDomain();

	/**
	 * Returns a new object of class '<em>Capability Provider Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capability Provider Reference</em>'.
	 * @generated
	 */
	CapabilityProviderReference createCapabilityProviderReference();

	/**
	 * Returns a new object of class '<em>Provided Capability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provided Capability</em>'.
	 * @generated
	 */
	ProvidedCapability createProvidedCapability();

	/**
	 * Returns a new object of class '<em>Evidence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evidence</em>'.
	 * @generated
	 */
	Evidence createEvidence();

	/**
	 * Returns a new object of class '<em>Evidence Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evidence Domain</em>'.
	 * @generated
	 */
	EvidenceDomain createEvidenceDomain();

	/**
	 * Returns a new object of class '<em>Required Capability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Required Capability</em>'.
	 * @generated
	 */
	RequiredCapability createRequiredCapability();

	/**
	 * Returns a new object of class '<em>Version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Version</em>'.
	 * @generated
	 */
	Version createVersion();

	/**
	 * Returns a new object of class '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role</em>'.
	 * @generated
	 */
	Role createRole();

	/**
	 * Returns a new object of class '<em>Role Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Assignment</em>'.
	 * @generated
	 */
	RoleAssignment createRoleAssignment();

	/**
	 * Returns a new object of class '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actor</em>'.
	 * @generated
	 */
	Actor createActor();

	/**
	 * Returns a new object of class '<em>Actor Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actor Domain</em>'.
	 * @generated
	 */
	ActorDomain createActorDomain();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ProductmanagementPackage getProductmanagementPackage();

} //ProductmanagementFactory
