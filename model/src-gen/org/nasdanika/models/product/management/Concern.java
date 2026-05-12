/**
 */
package org.nasdanika.models.product.management;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A goal, need, or pain point that a persona experiences.
 * Has temporal scope (inherited from ModelElement). Hierarchical via subConcerns.
 * Lateral associations via bidirectional relatedConcerns / referringConcerns.
 * Participates as an MCDA alternative for weight derivation.
 * Corresponds to enterprise.Concern (ecore://nasdanika.org/models/enterprise).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.product.management.Concern#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.product.management.Concern#getSubConcerns <em>Sub Concerns</em>}</li>
 *   <li>{@link org.nasdanika.models.product.management.Concern#getRelatedConcerns <em>Related Concerns</em>}</li>
 *   <li>{@link org.nasdanika.models.product.management.Concern#getReferringConcerns <em>Referring Concerns</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.product.management.ManagementPackage#getConcern()
 * @model
 * @generated
 */
public interface Concern extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"NEED"</code>.
	 * The literals are from the enumeration {@link org.nasdanika.models.product.management.ConcernType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The nature of this concern: Goal (desired outcome),
	 * Need (functional/non-functional requirement), or Pain Point (existing problem).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.nasdanika.models.product.management.ConcernType
	 * @see #setType(ConcernType)
	 * @see org.nasdanika.models.product.management.ManagementPackage#getConcern_Type()
	 * @model default="NEED" unique="false"
	 * @generated
	 */
	ConcernType getType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.product.management.Concern#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.nasdanika.models.product.management.ConcernType
	 * @see #getType()
	 * @generated
	 */
	void setType(ConcernType value);

	/**
	 * Returns the value of the '<em><b>Sub Concerns</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.product.management.Concern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sub-concerns decomposing this concern into more specific
	 * aspects. Primary containment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Concerns</em>' containment reference list.
	 * @see org.nasdanika.models.product.management.ManagementPackage#getConcern_SubConcerns()
	 * @model containment="true"
	 * @generated
	 */
	EList<Concern> getSubConcerns();

	/**
	 * Returns the value of the '<em><b>Related Concerns</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.product.management.Concern}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.product.management.Concern#getReferringConcerns <em>Referring Concerns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lateral associations to related concerns. Bidirectional
	 * with referringConcerns: relationships can be defined from one end and navigated
	 * from both.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Concerns</em>' reference list.
	 * @see org.nasdanika.models.product.management.ManagementPackage#getConcern_RelatedConcerns()
	 * @see org.nasdanika.models.product.management.Concern#getReferringConcerns
	 * @model opposite="referringConcerns"
	 * @generated
	 */
	EList<Concern> getRelatedConcerns();

	/**
	 * Returns the value of the '<em><b>Referring Concerns</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.product.management.Concern}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.product.management.Concern#getRelatedConcerns <em>Related Concerns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derived opposite of relatedConcerns. Contains all
	 * concerns that reference this concern via their relatedConcerns. Automatically
	 * maintained by EMF; no need to set explicitly.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referring Concerns</em>' reference list.
	 * @see org.nasdanika.models.product.management.ManagementPackage#getConcern_ReferringConcerns()
	 * @see org.nasdanika.models.product.management.Concern#getRelatedConcerns
	 * @model opposite="relatedConcerns"
	 * @generated
	 */
	EList<Concern> getReferringConcerns();

} // Concern
