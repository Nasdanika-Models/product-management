/**
 */
package org.nasdanika.models.productmanagement.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.models.capability.AbstractCapability;
import org.nasdanika.models.capability.AbstractCapabilityProvider;
import org.nasdanika.models.capability.AbstractEvidence;
import org.nasdanika.models.capability.CapabilityDomain;
import org.nasdanika.models.capability.CapabilityProviderDomain;
import org.nasdanika.models.capability.EvidenceDomain;

import org.nasdanika.models.iam.AccessControlled;

import org.nasdanika.models.lifecycle.Staged;

import org.nasdanika.models.nxcore.Documented;
import org.nasdanika.models.nxcore.Marked;
import org.nasdanika.models.nxcore.ModelElement;
import org.nasdanika.models.nxcore.NamedElement;
import org.nasdanika.models.nxcore.NamedPeriod;
import org.nasdanika.models.nxcore.Period;
import org.nasdanika.models.nxcore.Referrable;
import org.nasdanika.models.nxcore.StringIdentity;

import org.nasdanika.models.productmanagement.*;

import org.nasdanika.models.role.AbstractActor;
import org.nasdanika.models.role.ActorDomain;

import org.nasdanika.models.seal.SealedElement;

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
				if (result == null) result = caseDocumented(productModel);
				if (result == null) result = caseMarked(productModel);
				if (result == null) result = caseReferrable(productModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductmanagementPackage.ABSTRACT_PERSONA: {
				AbstractPersona abstractPersona = (AbstractPersona)theEObject;
				T result = caseAbstractPersona(abstractPersona);
				if (result == null) result = caseModelElement(abstractPersona);
				if (result == null) result = caseStringIdentity(abstractPersona);
				if (result == null) result = caseDocumented(abstractPersona);
				if (result == null) result = caseMarked(abstractPersona);
				if (result == null) result = caseReferrable(abstractPersona);
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
				if (result == null) result = caseDocumented(persona);
				if (result == null) result = caseMarked(persona);
				if (result == null) result = caseReferrable(persona);
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
				if (result == null) result = caseDocumented(personaDomain);
				if (result == null) result = caseMarked(personaDomain);
				if (result == null) result = caseReferrable(personaDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductmanagementPackage.PERSONA_REFERENCE: {
				PersonaReference personaReference = (PersonaReference)theEObject;
				T result = casePersonaReference(personaReference);
				if (result == null) result = caseAbstractPersona(personaReference);
				if (result == null) result = caseModelElement(personaReference);
				if (result == null) result = caseStringIdentity(personaReference);
				if (result == null) result = caseDocumented(personaReference);
				if (result == null) result = caseMarked(personaReference);
				if (result == null) result = caseReferrable(personaReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductmanagementPackage.ABSTRACT_CONCERN: {
				AbstractConcern abstractConcern = (AbstractConcern)theEObject;
				T result = caseAbstractConcern(abstractConcern);
				if (result == null) result = caseModelElement(abstractConcern);
				if (result == null) result = caseStringIdentity(abstractConcern);
				if (result == null) result = caseDocumented(abstractConcern);
				if (result == null) result = caseMarked(abstractConcern);
				if (result == null) result = caseReferrable(abstractConcern);
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
				if (result == null) result = caseDocumented(concern);
				if (result == null) result = caseMarked(concern);
				if (result == null) result = caseReferrable(concern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductmanagementPackage.CONCERN_REFERENCE: {
				ConcernReference concernReference = (ConcernReference)theEObject;
				T result = caseConcernReference(concernReference);
				if (result == null) result = caseAbstractConcern(concernReference);
				if (result == null) result = caseModelElement(concernReference);
				if (result == null) result = caseStringIdentity(concernReference);
				if (result == null) result = caseDocumented(concernReference);
				if (result == null) result = caseMarked(concernReference);
				if (result == null) result = caseReferrable(concernReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductmanagementPackage.CONCERN_DOMAIN: {
				ConcernDomain concernDomain = (ConcernDomain)theEObject;
				T result = caseConcernDomain(concernDomain);
				if (result == null) result = caseNamedElement(concernDomain);
				if (result == null) result = caseAbstractConcern(concernDomain);
				if (result == null) result = caseModelElement(concernDomain);
				if (result == null) result = caseStringIdentity(concernDomain);
				if (result == null) result = caseDocumented(concernDomain);
				if (result == null) result = caseMarked(concernDomain);
				if (result == null) result = caseReferrable(concernDomain);
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
				if (result == null) result = caseDocumented(goal);
				if (result == null) result = caseMarked(goal);
				if (result == null) result = caseReferrable(goal);
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
				if (result == null) result = caseDocumented(need);
				if (result == null) result = caseMarked(need);
				if (result == null) result = caseReferrable(need);
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
				if (result == null) result = caseDocumented(painPoint);
				if (result == null) result = caseMarked(painPoint);
				if (result == null) result = caseReferrable(painPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductmanagementPackage.CAPABILITY: {
				Capability capability = (Capability)theEObject;
				T result = caseCapability(capability);
				if (result == null) result = caseCapability_Capability(capability);
				if (result == null) result = casePersonaDomain(capability);
				if (result == null) result = caseConcernDomain(capability);
				if (result == null) result = caseNamedPeriod(capability);
				if (result == null) result = caseAbstractCapability(capability);
				if (result == null) result = caseEvidenceDomain(capability);
				if (result == null) result = caseStaged(capability);
				if (result == null) result = caseAbstractPersona(capability);
				if (result == null) result = caseAbstractConcern(capability);
				if (result == null) result = caseNamedElement(capability);
				if (result == null) result = casePeriod(capability);
				if (result == null) result = caseAbstractEvidence(capability);
				if (result == null) result = caseSealedElement(capability);
				if (result == null) result = caseModelElement(capability);
				if (result == null) result = caseAccessControlled(capability);
				if (result == null) result = caseStringIdentity(capability);
				if (result == null) result = caseDocumented(capability);
				if (result == null) result = caseMarked(capability);
				if (result == null) result = caseReferrable(capability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductmanagementPackage.COMPOSITE_CAPABILITY: {
				CompositeCapability compositeCapability = (CompositeCapability)theEObject;
				T result = caseCompositeCapability(compositeCapability);
				if (result == null) result = caseCapability(compositeCapability);
				if (result == null) result = caseCapabilityDomain(compositeCapability);
				if (result == null) result = caseCapability_Capability(compositeCapability);
				if (result == null) result = casePersonaDomain(compositeCapability);
				if (result == null) result = caseConcernDomain(compositeCapability);
				if (result == null) result = caseNamedPeriod(compositeCapability);
				if (result == null) result = caseAbstractCapability(compositeCapability);
				if (result == null) result = caseEvidenceDomain(compositeCapability);
				if (result == null) result = caseStaged(compositeCapability);
				if (result == null) result = caseAbstractPersona(compositeCapability);
				if (result == null) result = caseAbstractConcern(compositeCapability);
				if (result == null) result = caseNamedElement(compositeCapability);
				if (result == null) result = casePeriod(compositeCapability);
				if (result == null) result = caseAbstractEvidence(compositeCapability);
				if (result == null) result = caseSealedElement(compositeCapability);
				if (result == null) result = caseModelElement(compositeCapability);
				if (result == null) result = caseAccessControlled(compositeCapability);
				if (result == null) result = caseStringIdentity(compositeCapability);
				if (result == null) result = caseDocumented(compositeCapability);
				if (result == null) result = caseMarked(compositeCapability);
				if (result == null) result = caseReferrable(compositeCapability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Composite Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeCapability(CompositeCapability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referrable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referrable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferrable(Referrable object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Documented</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documented</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumented(Documented object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marked</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marked</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarked(Marked object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityDomain(CapabilityDomain object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Provider Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provider Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityProviderDomain(CapabilityProviderDomain object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Access Controlled</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Access Controlled</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessControlled(AccessControlled object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sealed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sealed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSealedElement(SealedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Staged</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Staged</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaged(Staged object) {
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
	public T caseCapability_Capability(org.nasdanika.models.capability.Capability object) {
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
