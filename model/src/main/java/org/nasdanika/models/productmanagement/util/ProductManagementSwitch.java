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
 * @see org.nasdanika.models.productmanagement.ProductManagementPackage
 * @generated
 */
public class ProductManagementSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProductManagementPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductManagementSwitch() {
		if (modelPackage == null) {
			modelPackage = ProductManagementPackage.eINSTANCE;
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
			case ProductManagementPackage.MODEL_ELEMENT: {
				ModelElement modelElement = (ModelElement)theEObject;
				T result = caseModelElement(modelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductManagementPackage.PERSONA: {
				Persona persona = (Persona)theEObject;
				T result = casePersona(persona);
				if (result == null) result = caseModelElement(persona);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductManagementPackage.BEHAVIOR: {
				Behavior behavior = (Behavior)theEObject;
				T result = caseBehavior(behavior);
				if (result == null) result = caseModelElement(behavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductManagementPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = caseModelElement(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductManagementPackage.NEED: {
				Need need = (Need)theEObject;
				T result = caseNeed(need);
				if (result == null) result = caseModelElement(need);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductManagementPackage.GOAL: {
				Goal goal = (Goal)theEObject;
				T result = caseGoal(goal);
				if (result == null) result = caseModelElement(goal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductManagementPackage.PAIN_POINT: {
				PainPoint painPoint = (PainPoint)theEObject;
				T result = casePainPoint(painPoint);
				if (result == null) result = caseModelElement(painPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductManagementPackage.PRODUCT_PORTFOLIO: {
				ProductPortfolio productPortfolio = (ProductPortfolio)theEObject;
				T result = caseProductPortfolio(productPortfolio);
				if (result == null) result = caseModelElement(productPortfolio);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductManagementPackage.PRODUCT: {
				Product product = (Product)theEObject;
				T result = caseProduct(product);
				if (result == null) result = caseModelElement(product);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductManagementPackage.EDITION: {
				Edition edition = (Edition)theEObject;
				T result = caseEdition(edition);
				if (result == null) result = caseModelElement(edition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductManagementPackage.FEATURE: {
				Feature feature = (Feature)theEObject;
				T result = caseFeature(feature);
				if (result == null) result = caseCapability(feature);
				if (result == null) result = caseModelElement(feature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductManagementPackage.FEATURE_PERSONA_ASSOCIATION: {
				FeaturePersonaAssociation featurePersonaAssociation = (FeaturePersonaAssociation)theEObject;
				T result = caseFeaturePersonaAssociation(featurePersonaAssociation);
				if (result == null) result = caseModelElement(featurePersonaAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductManagementPackage.CAPABILITY: {
				Capability capability = (Capability)theEObject;
				T result = caseCapability(capability);
				if (result == null) result = caseModelElement(capability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductManagementPackage.CAPABILITY_PROVIDER: {
				CapabilityProvider capabilityProvider = (CapabilityProvider)theEObject;
				T result = caseCapabilityProvider(capabilityProvider);
				if (result == null) result = caseModelElement(capabilityProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductManagementPackage.VERSION: {
				Version version = (Version)theEObject;
				T result = caseVersion(version);
				if (result == null) result = caseModelElement(version);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductManagementPackage.RELEASE: {
				Release release = (Release)theEObject;
				T result = caseRelease(release);
				if (result == null) result = caseModelElement(release);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductManagementPackage.SUBSCRIPTION: {
				Subscription subscription = (Subscription)theEObject;
				T result = caseSubscription(subscription);
				if (result == null) result = caseModelElement(subscription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductManagementPackage.SERVICE_LEVEL: {
				ServiceLevel serviceLevel = (ServiceLevel)theEObject;
				T result = caseServiceLevel(serviceLevel);
				if (result == null) result = caseModelElement(serviceLevel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductManagementPackage.VALUE_PROPOSITION: {
				ValueProposition valueProposition = (ValueProposition)theEObject;
				T result = caseValueProposition(valueProposition);
				if (result == null) result = caseModelElement(valueProposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductManagementPackage.EVIDENCE: {
				Evidence evidence = (Evidence)theEObject;
				T result = caseEvidence(evidence);
				if (result == null) result = caseModelElement(evidence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductManagementPackage.OUTCOME_METRIC: {
				OutcomeMetric outcomeMetric = (OutcomeMetric)theEObject;
				T result = caseOutcomeMetric(outcomeMetric);
				if (result == null) result = caseModelElement(outcomeMetric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductManagementPackage.ALTERNATIVE: {
				Alternative alternative = (Alternative)theEObject;
				T result = caseAlternative(alternative);
				if (result == null) result = caseModelElement(alternative);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductManagementPackage.MARKET_SEGMENT: {
				MarketSegment marketSegment = (MarketSegment)theEObject;
				T result = caseMarketSegment(marketSegment);
				if (result == null) result = caseModelElement(marketSegment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductManagementPackage.INDUSTRY: {
				Industry industry = (Industry)theEObject;
				T result = caseIndustry(industry);
				if (result == null) result = caseModelElement(industry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductManagementPackage.GEOGRAPHY: {
				Geography geography = (Geography)theEObject;
				T result = caseGeography(geography);
				if (result == null) result = caseModelElement(geography);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductManagementPackage.COMPANY_SIZE: {
				CompanySize companySize = (CompanySize)theEObject;
				T result = caseCompanySize(companySize);
				if (result == null) result = caseModelElement(companySize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductManagementPackage.CHANNEL: {
				Channel channel = (Channel)theEObject;
				T result = caseChannel(channel);
				if (result == null) result = caseModelElement(channel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductManagementPackage.IDEAL_CUSTOMER_PROFILE: {
				IdealCustomerProfile idealCustomerProfile = (IdealCustomerProfile)theEObject;
				T result = caseIdealCustomerProfile(idealCustomerProfile);
				if (result == null) result = caseModelElement(idealCustomerProfile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductManagementPackage.REGULATORY_CONSTRAINT: {
				RegulatoryConstraint regulatoryConstraint = (RegulatoryConstraint)theEObject;
				T result = caseRegulatoryConstraint(regulatoryConstraint);
				if (result == null) result = caseModelElement(regulatoryConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductManagementPackage.HYPOTHESIS: {
				Hypothesis hypothesis = (Hypothesis)theEObject;
				T result = caseHypothesis(hypothesis);
				if (result == null) result = caseModelElement(hypothesis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL: {
				ProductManagementModel productManagementModel = (ProductManagementModel)theEObject;
				T result = caseProductManagementModel(productManagementModel);
				if (result == null) result = caseModelElement(productManagementModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehavior(Behavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Product Portfolio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Portfolio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductPortfolio(ProductPortfolio object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProduct(Product object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdition(Edition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeature(Feature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Persona Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Persona Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeaturePersonaAssociation(FeaturePersonaAssociation object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Release</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Release</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelease(Release object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subscription</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subscription</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubscription(Subscription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Level</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Level</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceLevel(ServiceLevel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Proposition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Proposition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueProposition(ValueProposition object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Outcome Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Outcome Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutcomeMetric(OutcomeMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alternative</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alternative</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlternative(Alternative object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Market Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Market Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarketSegment(MarketSegment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Industry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Industry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndustry(Industry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geography</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geography</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeography(Geography object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Company Size</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Company Size</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompanySize(CompanySize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Channel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Channel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChannel(Channel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ideal Customer Profile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ideal Customer Profile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdealCustomerProfile(IdealCustomerProfile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regulatory Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regulatory Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegulatoryConstraint(RegulatoryConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hypothesis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hypothesis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHypothesis(Hypothesis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductManagementModel(ProductManagementModel object) {
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

} //ProductManagementSwitch
