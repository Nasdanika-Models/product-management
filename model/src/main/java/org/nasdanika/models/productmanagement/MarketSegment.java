/**
 */
package org.nasdanika.models.productmanagement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Market Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A market segment, e.g. SMB, Mid-market, Enterprise; or horizontal vs vertical segments.
 * 
 * Markets drive which personas you prioritize, which value props you emphasize,
 * and how you package/price. Market attributes should be kept independent and composable.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.MarketSegment#getSegmentType <em>Segment Type</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.MarketSegment#getTargetPersonas <em>Target Personas</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.MarketSegment#getIndustries <em>Industries</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.MarketSegment#getGeographies <em>Geographies</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.MarketSegment#getCompanySizes <em>Company Sizes</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.MarketSegment#getChannels <em>Channels</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.MarketSegment#getIdealCustomerProfiles <em>Ideal Customer Profiles</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getMarketSegment()
 * @model
 * @generated
 */
public interface MarketSegment extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Segment Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of segment, e.g. 'SMB', 'Mid-market', 'Enterprise', 'Horizontal', 'Vertical'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Segment Type</em>' attribute.
	 * @see #setSegmentType(String)
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getMarketSegment_SegmentType()
	 * @model
	 * @generated
	 */
	String getSegmentType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.MarketSegment#getSegmentType <em>Segment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Segment Type</em>' attribute.
	 * @see #getSegmentType()
	 * @generated
	 */
	void setSegmentType(String value);

	/**
	 * Returns the value of the '<em><b>Target Personas</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Persona}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Personas targeted by this market segment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Personas</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getMarketSegment_TargetPersonas()
	 * @model
	 * @generated
	 */
	EList<Persona> getTargetPersonas();

	/**
	 * Returns the value of the '<em><b>Industries</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Industry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Industries within this market segment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Industries</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getMarketSegment_Industries()
	 * @model containment="true"
	 * @generated
	 */
	EList<Industry> getIndustries();

	/**
	 * Returns the value of the '<em><b>Geographies</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Geography}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Geographies within this market segment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geographies</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getMarketSegment_Geographies()
	 * @model containment="true"
	 * @generated
	 */
	EList<Geography> getGeographies();

	/**
	 * Returns the value of the '<em><b>Company Sizes</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.CompanySize}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Company size bands within this market segment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Company Sizes</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getMarketSegment_CompanySizes()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompanySize> getCompanySizes();

	/**
	 * Returns the value of the '<em><b>Channels</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Channel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Route-to-market channels in this segment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Channels</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getMarketSegment_Channels()
	 * @model containment="true"
	 * @generated
	 */
	EList<Channel> getChannels();

	/**
	 * Returns the value of the '<em><b>Ideal Customer Profiles</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.IdealCustomerProfile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ideal customer profiles within this market segment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ideal Customer Profiles</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getMarketSegment_IdealCustomerProfiles()
	 * @model containment="true"
	 * @generated
	 */
	EList<IdealCustomerProfile> getIdealCustomerProfiles();

} // MarketSegment
