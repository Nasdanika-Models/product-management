/**
 */
package org.nasdanika.models.productmanagement.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.models.productmanagement.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage
 * @generated
 */
public class ProductmanagementSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProductmanagementPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductmanagementSwitch() {
		if (modelPackage == null) {
			modelPackage = ProductmanagementPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ProductmanagementPackage.TEMPORAL: {
				Temporal temporal = (Temporal)theEObject;
				T result = caseTemporal(temporal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductmanagementPackage.PERIOD: {
				Period period = (Period)theEObject;
				T result = casePeriod(period);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductmanagementPackage.STRING_IDENTITY: {
				StringIdentity stringIdentity = (StringIdentity)theEObject;
				T result = caseStringIdentity(stringIdentity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductmanagementPackage.MODEL_ELEMENT: {
				ModelElement modelElement = (ModelElement)theEObject;
				T result = caseModelElement(modelElement);
				if (result == null) result = caseStringIdentity(modelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductmanagementPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = caseModelElement(namedElement);
				if (result == null) result = caseStringIdentity(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductmanagementPackage.NAMED_PERIOD: {
				NamedPeriod namedPeriod = (NamedPeriod)theEObject;
				T result = caseNamedPeriod(namedPeriod);
				if (result == null) result = caseNamedElement(namedPeriod);
				if (result == null) result = casePeriod(namedPeriod);
				if (result == null) result = caseModelElement(namedPeriod);
				if (result == null) result = caseStringIdentity(namedPeriod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductmanagementPackage.PRODUCT_MODEL: {
				ProductModel productModel = (ProductModel)theEObject;
				T result = caseProductModel(productModel);
				if (result == null) result = caseNamedPeriod(productModel);
				if (result == null) result = casePersonaDomain(productModel);
				if (result == null) result = caseCapabilityDomain(productModel);
				if (result == null) result = caseCapabilityProviderDomain(productModel);
				if (result == null) result = caseActorDomain(productModel);
				if (result == null) result = caseNamedElement(productModel);
				if (result == null) result = casePeriod(productModel);
				if (result == null) result = caseAbstractPersona(productModel);
				if (result == null) result = caseAbstractCapability(productModel);
				if (result == null) result = caseAbstractCapabilityProvider(productModel);
				if (result == null) result = caseAbstractActor(productModel);
				if (result == null) result = caseModelElement(productModel);
				if (result == null) result = caseStringIdentity(productModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductmanagementPackage.ABSTRACT_PERSONA: {
				AbstractPersona abstractPersona = (AbstractPersona)theEObject;
				T result = caseAbstractPersona(abstractPersona);
				if (result == null) result = caseStringIdentity(abstractPersona);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductmanagementPackage.PERSONA: {
				Persona persona = (Persona)theEObject;
				T result = casePersona(persona);
				if (result == null) result = caseNamedPeriod(persona);
				if (result == null) result = caseAbstractPersona(persona);
				if (result == null) result = caseConcernDomain(persona);
				if (result == null) result = caseNamedElement(persona);
				if (result == null) result = casePeriod(persona);
				if (result == null) result = caseAbstractConcern(persona);
				if (result == null) result = caseModelElement(persona);
				if (result == null) result = caseStringIdentity(persona);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductmanagementPackage.PERSONA_DOMAIN: {
				PersonaDomain personaDomain = (PersonaDomain)theEObject;
				T result = casePersonaDomain(personaDomain);
				if (result == null) result = caseNamedElement(personaDomain);
				if (result == null) result = caseAbstractPersona(personaDomain);
				if (result == null) result = caseModelElement(personaDomain);
				if (result == null) result = caseStringIdentity(personaDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductmanagementPackage.PERSONA_REFERENCE: {
				PersonaReference personaReference = (PersonaReference)theEObject;
				T result = casePersonaReference(personaReference);
				if (result == null) result = caseAbstractPersona(personaReference);
				if (result == null) result = caseStringIdentity(personaReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductmanagementPackage.ABSTRACT_CONCERN: {
				AbstractConcern abstractConcern = (AbstractConcern)theEObject;
				T result = caseAbstractConcern(abstractConcern);
				if (result == null) result = caseStringIdentity(abstractConcern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductmanagementPackage.CONCERN: {
				Concern concern = (Concern)theEObject;
				T result = caseConcern(concern);
				if (result == null) result = caseNamedPeriod(concern);
				if (result == null) result = caseAbstractConcern(concern);
				if (result == null) result = caseNamedElement(concern);
				if (result == null) result = casePeriod(concern);
				if (result == null) result = caseModelElement(concern);
				if (result == null) result = caseStringIdentity(concern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductmanagementPackage.CONCERN_REFERENCE: {
				ConcernReference concernReference = (ConcernReference)theEObject;
				T result = caseConcernReference(concernReference);
				if (result == null) result = caseAbstractConcern(concernReference);
				if (result == null) result = caseStringIdentity(concernReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductmanagementPackage.CONCERN_DOMAIN: {
				ConcernDomain concernDomain = (ConcernDomain)theEObject;
				T result = caseConcernDomain(concernDomain);
				if (result == null) result = caseAbstractConcern(concernDomain);
				if (result == null) result = caseStringIdentity(concernDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductmanagementPackage.GOAL: {
				Goal goal = (Goal)theEObject;
				T result = caseGoal(goal);
				if (result == null) result = caseConcern(goal);
				if (result == null) result = caseNamedPeriod(goal);
				if (result == null) result = caseAbstractConcern(goal);
				if (result == null) result = caseNamedElement(goal);
				if (result == null) result = casePeriod(goal);
				if (result == null) result = caseModelElement(goal);
				if (result == null) result = caseStringIdentity(goal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductmanagementPackage.NEED: {
				Need need = (Need)theEObject;
				T result = caseNeed(need);
				if (result == null) result = caseConcern(need);
				if (result == null) result = caseNamedPeriod(need);
				if (result == null) result = caseAbstractConcern(need);
				if (result == null) result = caseNamedElement(need);
				if (result == null) result = casePeriod(need);
				if (result == null) result = caseModelElement(need);
				if (result == null) result = caseStringIdentity(need);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductmanagementPackage.SUPPORTED_GOALS: {
				SupportedGoals supportedGoals = (SupportedGoals)theEObject;
				T result = caseSupportedGoals(supportedGoals);
				if (result == null) result = caseModelElement(supportedGoals);
				if (result == null) result = caseStringIdentity(supportedGoals);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductmanagementPackage.PAIN_POINT: {
				PainPoint painPoint = (PainPoint)theEObject;
				T result = casePainPoint(painPoint);
				if (result == null) result = caseConcern(painPoint);
				if (result == null) result = caseNamedPeriod(painPoint);
				if (result == null) result = caseAbstractConcern(painPoint);
				if (result == null) result = caseNamedElement(painPoint);
				if (result == null) result = casePeriod(painPoint);
				if (result == null) result = caseModelElement(painPoint);
				if (result == null) result = caseStringIdentity(painPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductmanagementPackage.BLOCKED_GOALS: {
				BlockedGoals blockedGoals = (BlockedGoals)theEObject;
				T result = caseBlockedGoals(blockedGoals);
				if (result == null) result = caseModelElement(blockedGoals);
				if (result == null) result = caseStringIdentity(blockedGoals);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductmanagementPackage.VIOLATED_NEEDS: {
				ViolatedNeeds violatedNeeds = (ViolatedNeeds)theEObject;
				T result = caseViolatedNeeds(violatedNeeds);
				if (result == null) result = caseModelElement(violatedNeeds);
				if (result == null) result = caseStringIdentity(violatedNeeds);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductmanagementPackage.ABSTRACT_CAPABILITY: {
				AbstractCapability abstractCapability = (AbstractCapability)theEObject;
				T result = caseAbstractCapability(abstractCapability);
				if (result == null) result = caseStringIdentity(abstractCapability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductmanagementPackage.CAPABILITY: {
				Capability capability = (Capability)theEObject;
				T result = caseCapability(capability);
				if (result == null) result = caseNamedPeriod(capability);
				if (result == null) result = caseAbstractCapability(capability);
				if (result == null) result = caseEvidenceDomain(capability);
				if (result == null) result = casePersonaDomain(capability);
				if (result == null) result = caseConcernDomain(capability);
				if (result == null) result = caseNamedElement(capability);
				if (result == null) result = casePeriod(capability);
				if (result == null) result = caseAbstractEvidence(capability);
				if (result == null) result = caseAbstractPersona(capability);
				if (result == null) result = caseAbstractConcern(capability);
				if (result == null) result = caseModelElement(capability);
				if (result == null) result = caseStringIdentity(capability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductmanagementPackage.CAPABILITY_REFERENCE: {
				CapabilityReference capabilityReference = (CapabilityReference)theEObject;
				T result = caseCapabilityReference(capabilityReference);
				if (result == null) result = caseAbstractCapability(capabilityReference);
				if (result == null) result = caseStringIdentity(capabilityReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductmanagementPackage.CAPABILITY_DOMAIN: {
				CapabilityDomain capabilityDomain = (CapabilityDomain)theEObject;
				T result = caseCapabilityDomain(capabilityDomain);
				if (result == null) result = caseNamedElement(capabilityDomain);
				if (result == null) result = caseAbstractCapability(capabilityDomain);
				if (result == null) result = caseModelElement(capabilityDomain);
				if (result == null) result = caseStringIdentity(capabilityDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductmanagementPackage.ADDRESSED_CONCERNS: {
				AddressedConcerns addressedConcerns = (AddressedConcerns)theEObject;
				T result = caseAddressedConcerns(addressedConcerns);
				if (result == null) result = caseModelElement(addressedConcerns);
				if (result == null) result = caseStringIdentity(addressedConcerns);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductmanagementPackage.CAPABILITY_DEPENDENCY: {
				CapabilityDependency capabilityDependency = (CapabilityDependency)theEObject;
				T result = caseCapabilityDependency(capabilityDependency);
				if (result == null) result = caseModelElement(capabilityDependency);
				if (result == null) result = caseStringIdentity(capabilityDependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductmanagementPackage.ABSTRACT_CAPABILITY_PROVIDER: {
				AbstractCapabilityProvider abstractCapabilityProvider = (AbstractCapabilityProvider)theEObject;
				T result = caseAbstractCapabilityProvider(abstractCapabilityProvider);
				if (result == null) result = caseStringIdentity(abstractCapabilityProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductmanagementPackage.CAPABILITY_PROVIDER: {
				CapabilityProvider capabilityProvider = (CapabilityProvider)theEObject;
				T result = caseCapabilityProvider(capabilityProvider);
				if (result == null) result = caseNamedPeriod(capabilityProvider);
				if (result == null) result = caseAbstractCapabilityProvider(capabilityProvider);
				if (result == null) result = caseNamedElement(capabilityProvider);
				if (result == null) result = casePeriod(capabilityProvider);
				if (result == null) result = caseModelElement(capabilityProvider);
				if (result == null) result = caseStringIdentity(capabilityProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductmanagementPackage.CAPABILITY_PROVIDER_DOMAIN: {
				CapabilityProviderDomain capabilityProviderDomain = (CapabilityProviderDomain)theEObject;
				T result = caseCapabilityProviderDomain(capabilityProviderDomain);
				if (result == null) result = caseNamedElement(capabilityProviderDomain);
				if (result == null) result = caseAbstractCapabilityProvider(capabilityProviderDomain);
				if (result == null) result = caseModelElement(capabilityProviderDomain);
				if (result == null) result = caseStringIdentity(capabilityProviderDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductmanagementPackage.CAPABILITY_PROVIDER_REFERENCE: {
				CapabilityProviderReference capabilityProviderReference = (CapabilityProviderReference)theEObject;
				T result = caseCapabilityProviderReference(capabilityProviderReference);
				if (result == null) result = caseAbstractCapabilityProvider(capabilityProviderReference);
				if (result == null) result = caseStringIdentity(capabilityProviderReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductmanagementPackage.PROVIDED_CAPABILITY: {
				ProvidedCapability providedCapability = (ProvidedCapability)theEObject;
				T result = caseProvidedCapability(providedCapability);
				if (result == null) result = caseNamedPeriod(providedCapability);
				if (result == null) result = caseEvidenceDomain(providedCapability);
				if (result == null) result = caseNamedElement(providedCapability);
				if (result == null) result = casePeriod(providedCapability);
				if (result == null) result = caseAbstractEvidence(providedCapability);
				if (result == null) result = caseModelElement(providedCapability);
				if (result == null) result = caseStringIdentity(providedCapability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductmanagementPackage.ABSTRACT_EVIDENCE: {
				AbstractEvidence abstractEvidence = (AbstractEvidence)theEObject;
				T result = caseAbstractEvidence(abstractEvidence);
				if (result == null) result = caseStringIdentity(abstractEvidence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductmanagementPackage.EVIDENCE: {
				Evidence evidence = (Evidence)theEObject;
				T result = caseEvidence(evidence);
				if (result == null) result = caseNamedPeriod(evidence);
				if (result == null) result = caseAbstractEvidence(evidence);
				if (result == null) result = caseNamedElement(evidence);
				if (result == null) result = casePeriod(evidence);
				if (result == null) result = caseModelElement(evidence);
				if (result == null) result = caseStringIdentity(evidence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductmanagementPackage.EVIDENCE_DOMAIN: {
				EvidenceDomain evidenceDomain = (EvidenceDomain)theEObject;
				T result = caseEvidenceDomain(evidenceDomain);
				if (result == null) result = caseNamedElement(evidenceDomain);
				if (result == null) result = caseAbstractEvidence(evidenceDomain);
				if (result == null) result = caseModelElement(evidenceDomain);
				if (result == null) result = caseStringIdentity(evidenceDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductmanagementPackage.REQUIRED_CAPABILITY: {
				RequiredCapability requiredCapability = (RequiredCapability)theEObject;
				T result = caseRequiredCapability(requiredCapability);
				if (result == null) result = caseNamedPeriod(requiredCapability);
				if (result == null) result = caseNamedElement(requiredCapability);
				if (result == null) result = casePeriod(requiredCapability);
				if (result == null) result = caseModelElement(requiredCapability);
				if (result == null) result = caseStringIdentity(requiredCapability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductmanagementPackage.VERSION: {
				Version version = (Version)theEObject;
				T result = caseVersion(version);
				if (result == null) result = caseNamedPeriod(version);
				if (result == null) result = caseNamedElement(version);
				if (result == null) result = casePeriod(version);
				if (result == null) result = caseModelElement(version);
				if (result == null) result = caseStringIdentity(version);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductmanagementPackage.UNDERGOER: {
				Undergoer undergoer = (Undergoer)theEObject;
				T result = caseUndergoer(undergoer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductmanagementPackage.ROLE: {
				Role role = (Role)theEObject;
				T result = caseRole(role);
				if (result == null) result = caseNamedPeriod(role);
				if (result == null) result = caseNamedElement(role);
				if (result == null) result = casePeriod(role);
				if (result == null) result = caseModelElement(role);
				if (result == null) result = caseStringIdentity(role);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductmanagementPackage.ROLE_ASSIGNMENT: {
				RoleAssignment roleAssignment = (RoleAssignment)theEObject;
				T result = caseRoleAssignment(roleAssignment);
				if (result == null) result = casePeriod(roleAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductmanagementPackage.ABSTRACT_ACTOR: {
				AbstractActor abstractActor = (AbstractActor)theEObject;
				T result = caseAbstractActor(abstractActor);
				if (result == null) result = caseStringIdentity(abstractActor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductmanagementPackage.ACTOR: {
				Actor actor = (Actor)theEObject;
				T result = caseActor(actor);
				if (result == null) result = caseNamedPeriod(actor);
				if (result == null) result = caseAbstractActor(actor);
				if (result == null) result = caseNamedElement(actor);
				if (result == null) result = casePeriod(actor);
				if (result == null) result = caseModelElement(actor);
				if (result == null) result = caseStringIdentity(actor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductmanagementPackage.ACTOR_DOMAIN: {
				ActorDomain actorDomain = (ActorDomain)theEObject;
				T result = caseActorDomain(actorDomain);
				if (result == null) result = caseNamedElement(actorDomain);
				if (result == null) result = caseAbstractActor(actorDomain);
				if (result == null) result = caseModelElement(actorDomain);
				if (result == null) result = caseStringIdentity(actorDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporal(Temporal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Period</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Period</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePeriod(Period object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Identity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Identity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringIdentity(StringIdentity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Period</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Period</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedPeriod(NamedPeriod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductModel(ProductModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Persona</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Persona</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractPersona(AbstractPersona object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Persona</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Persona</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersona(Persona object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Persona Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Persona Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonaDomain(PersonaDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Persona Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Persona Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonaReference(PersonaReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Concern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Concern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractConcern(AbstractConcern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcern(Concern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concern Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concern Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcernReference(ConcernReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concern Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concern Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcernDomain(ConcernDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoal(Goal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Need</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Need</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNeed(Need object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supported Goals</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supported Goals</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupportedGoals(SupportedGoals object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pain Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pain Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePainPoint(PainPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Blocked Goals</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Blocked Goals</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlockedGoals(BlockedGoals object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Violated Needs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Violated Needs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViolatedNeeds(ViolatedNeeds object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCapability(AbstractCapability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapability(Capability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityReference(CapabilityReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityDomain(CapabilityDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Addressed Concerns</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Addressed Concerns</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressedConcerns(AddressedConcerns object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityDependency(CapabilityDependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Capability Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Capability Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCapabilityProvider(AbstractCapabilityProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityProvider(CapabilityProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Provider Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Provider Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityProviderDomain(CapabilityProviderDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Provider Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Provider Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityProviderReference(CapabilityProviderReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provided Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provided Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvidedCapability(ProvidedCapability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Evidence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Evidence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractEvidence(AbstractEvidence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evidence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evidence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvidence(Evidence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evidence Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evidence Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvidenceDomain(EvidenceDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Required Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiredCapability(RequiredCapability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Version</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Version</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersion(Version object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Undergoer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Undergoer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUndergoer(Undergoer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole(Role object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleAssignment(RoleAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractActor(AbstractActor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActor(Actor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActorDomain(ActorDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ProductmanagementSwitch
