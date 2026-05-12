/**
 */
package org.nasdanika.models.product.management;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract base class for all product management elements.
 * Provides id, name, documentation (mirroring ncore.DocumentedNamedStringIdentity),
 * temporal anchoring via start/end/duration (mirroring ncore.Period), and a weight
 * attribute for MCDA participation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.product.management.ModelElement#getD <em>D</em>}</li>
 *   <li>{@link org.nasdanika.models.product.management.ModelElement#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.product.management.ModelElement#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.nasdanika.models.product.management.ModelElement#getStart <em>Start</em>}</li>
 *   <li>{@link org.nasdanika.models.product.management.ModelElement#getEnd <em>End</em>}</li>
 *   <li>{@link org.nasdanika.models.product.management.ModelElement#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.nasdanika.models.product.management.ModelElement#getWeight <em>Weight</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.product.management.ManagementPackage#getModelElement()
 * @model abstract="true"
 * @generated
 */
public interface ModelElement extends EObject {
	/**
	 * Returns the value of the '<em><b>D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * String key uniquely identifying this element within its
	 * containment reference. Used as eKey and as a URI segment for cross-resource references.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>D</em>' attribute.
	 * @see #setD(String)
	 * @see org.nasdanika.models.product.management.ManagementPackage#getModelElement_D()
	 * @model unique="false"
	 * @generated
	 */
	String getD();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.product.management.ModelElement#getD <em>D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>D</em>' attribute.
	 * @see #getD()
	 * @generated
	 */
	void setD(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Human-readable display name for documentation, diagrams,
	 * and navigation trees.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.models.product.management.ManagementPackage#getModelElement_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.product.management.ModelElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rich documentation (HTML or Markdown) rendered in the
	 * generated documentation site.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Documentation</em>' attribute.
	 * @see #setDocumentation(String)
	 * @see org.nasdanika.models.product.management.ManagementPackage#getModelElement_Documentation()
	 * @model unique="false"
	 * @generated
	 */
	String getDocumentation();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.product.management.ModelElement#getDocumentation <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' attribute.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(String value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Start of this element's period. ISO-8601 date/datetime
	 * or a relative offset from the container's start, e.g. 'P30D' for 30 days in.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(String)
	 * @see org.nasdanika.models.product.management.ManagementPackage#getModelElement_Start()
	 * @model unique="false"
	 * @generated
	 */
	String getStart();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.product.management.ModelElement#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(String value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * End of this element's period. ISO-8601 date/datetime
	 * or a relative offset from the container's start.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(String)
	 * @see org.nasdanika.models.product.management.ManagementPackage#getModelElement_End()
	 * @model unique="false"
	 * @generated
	 */
	String getEnd();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.product.management.ModelElement#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(String value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Positive ISO-8601 duration (e.g., 'P3M'). May be used
	 * instead of an explicit end date. Corresponds to ncore.Period.duration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(String)
	 * @see org.nasdanika.models.product.management.ManagementPackage#getModelElement_Duration()
	 * @model unique="false"
	 * @generated
	 */
	String getDuration();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.product.management.ModelElement#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(String value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relative importance weight for MCDA pairwise comparison.
	 * Used to prioritize Personas, Concerns, and Capabilities relative to their siblings.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(double)
	 * @see org.nasdanika.models.product.management.ManagementPackage#getModelElement_Weight()
	 * @model unique="false"
	 * @generated
	 */
	double getWeight();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.product.management.ModelElement#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(double value);

} // ModelElement
