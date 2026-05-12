/**
 */
package org.nasdanika.models.productmanagement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jira Work Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A WorkPackage backed by a Jira issue. Adds Jira-specific
 * fields: projectKey (e.g. 'PM'), issueKey (e.g. 'PM-123'), and issueType
 * (e.g. 'Story', 'Epic'). The inherited 'tracker' field holds the full Jira URL.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.JiraWorkPackage#getProjectKey <em>Project Key</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.JiraWorkPackage#getIssueKey <em>Issue Key</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.JiraWorkPackage#getIssueType <em>Issue Type</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getJiraWorkPackage()
 * @model
 * @generated
 */
public interface JiraWorkPackage extends WorkPackage {
	/**
	 * Returns the value of the '<em><b>Project Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Jira project key, e.g. 'PM' or 'NSDPM'. Used for URL
	 * construction and filtering by project.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Project Key</em>' attribute.
	 * @see #setProjectKey(String)
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getJiraWorkPackage_ProjectKey()
	 * @model unique="false"
	 * @generated
	 */
	String getProjectKey();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.JiraWorkPackage#getProjectKey <em>Project Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Key</em>' attribute.
	 * @see #getProjectKey()
	 * @generated
	 */
	void setProjectKey(String value);

	/**
	 * Returns the value of the '<em><b>Issue Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Jira issue key, e.g. 'PM-123'. Uniquely identifies
	 * the issue within the Jira instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issue Key</em>' attribute.
	 * @see #setIssueKey(String)
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getJiraWorkPackage_IssueKey()
	 * @model unique="false"
	 * @generated
	 */
	String getIssueKey();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.JiraWorkPackage#getIssueKey <em>Issue Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Key</em>' attribute.
	 * @see #getIssueKey()
	 * @generated
	 */
	void setIssueKey(String value);

	/**
	 * Returns the value of the '<em><b>Issue Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Jira issue type, e.g. 'Epic', 'Story', 'Task', 'Bug',
	 * or 'Sub-task'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issue Type</em>' attribute.
	 * @see #setIssueType(String)
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getJiraWorkPackage_IssueType()
	 * @model unique="false"
	 * @generated
	 */
	String getIssueType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.JiraWorkPackage#getIssueType <em>Issue Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Type</em>' attribute.
	 * @see #getIssueType()
	 * @generated
	 */
	void setIssueType(String value);

} // JiraWorkPackage
