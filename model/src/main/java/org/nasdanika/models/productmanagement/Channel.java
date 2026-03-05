/**
 */
package org.nasdanika.models.productmanagement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A route-to-market channel.
 * Examples: Direct, Self-serve, Partner/Reseller, Marketplace (e.g. Azure, AWS).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.Channel#getChannelType <em>Channel Type</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getChannel()
 * @model
 * @generated
 */
public interface Channel extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Channel Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of channel, e.g. 'Direct', 'Self-serve', 'Partner', 'Reseller', 'Marketplace'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Channel Type</em>' attribute.
	 * @see #setChannelType(String)
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getChannel_ChannelType()
	 * @model
	 * @generated
	 */
	String getChannelType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.Channel#getChannelType <em>Channel Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel Type</em>' attribute.
	 * @see #getChannelType()
	 * @generated
	 */
	void setChannelType(String value);

} // Channel
