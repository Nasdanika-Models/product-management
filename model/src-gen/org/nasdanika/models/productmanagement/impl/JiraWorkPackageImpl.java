/**
 */
package org.nasdanika.models.productmanagement.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.productmanagement.JiraWorkPackage;
import org.nasdanika.models.productmanagement.ProductmanagementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jira Work Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.JiraWorkPackageImpl#getProjectKey <em>Project Key</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.JiraWorkPackageImpl#getIssueKey <em>Issue Key</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.JiraWorkPackageImpl#getIssueType <em>Issue Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JiraWorkPackageImpl extends WorkPackageImpl implements JiraWorkPackage {
	/**
	 * The default value of the '{@link #getProjectKey() <em>Project Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectKey()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_KEY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getIssueKey() <em>Issue Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueKey()
	 * @generated
	 * @ordered
	 */
	protected static final String ISSUE_KEY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getIssueType() <em>Issue Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueType()
	 * @generated
	 * @ordered
	 */
	protected static final String ISSUE_TYPE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JiraWorkPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductmanagementPackage.Literals.JIRA_WORK_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProjectKey() {
		return (String)eDynamicGet(ProductmanagementPackage.JIRA_WORK_PACKAGE__PROJECT_KEY, ProductmanagementPackage.Literals.JIRA_WORK_PACKAGE__PROJECT_KEY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProjectKey(String newProjectKey) {
		eDynamicSet(ProductmanagementPackage.JIRA_WORK_PACKAGE__PROJECT_KEY, ProductmanagementPackage.Literals.JIRA_WORK_PACKAGE__PROJECT_KEY, newProjectKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIssueKey() {
		return (String)eDynamicGet(ProductmanagementPackage.JIRA_WORK_PACKAGE__ISSUE_KEY, ProductmanagementPackage.Literals.JIRA_WORK_PACKAGE__ISSUE_KEY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIssueKey(String newIssueKey) {
		eDynamicSet(ProductmanagementPackage.JIRA_WORK_PACKAGE__ISSUE_KEY, ProductmanagementPackage.Literals.JIRA_WORK_PACKAGE__ISSUE_KEY, newIssueKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIssueType() {
		return (String)eDynamicGet(ProductmanagementPackage.JIRA_WORK_PACKAGE__ISSUE_TYPE, ProductmanagementPackage.Literals.JIRA_WORK_PACKAGE__ISSUE_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIssueType(String newIssueType) {
		eDynamicSet(ProductmanagementPackage.JIRA_WORK_PACKAGE__ISSUE_TYPE, ProductmanagementPackage.Literals.JIRA_WORK_PACKAGE__ISSUE_TYPE, newIssueType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductmanagementPackage.JIRA_WORK_PACKAGE__PROJECT_KEY:
				return getProjectKey();
			case ProductmanagementPackage.JIRA_WORK_PACKAGE__ISSUE_KEY:
				return getIssueKey();
			case ProductmanagementPackage.JIRA_WORK_PACKAGE__ISSUE_TYPE:
				return getIssueType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProductmanagementPackage.JIRA_WORK_PACKAGE__PROJECT_KEY:
				setProjectKey((String)newValue);
				return;
			case ProductmanagementPackage.JIRA_WORK_PACKAGE__ISSUE_KEY:
				setIssueKey((String)newValue);
				return;
			case ProductmanagementPackage.JIRA_WORK_PACKAGE__ISSUE_TYPE:
				setIssueType((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ProductmanagementPackage.JIRA_WORK_PACKAGE__PROJECT_KEY:
				setProjectKey(PROJECT_KEY_EDEFAULT);
				return;
			case ProductmanagementPackage.JIRA_WORK_PACKAGE__ISSUE_KEY:
				setIssueKey(ISSUE_KEY_EDEFAULT);
				return;
			case ProductmanagementPackage.JIRA_WORK_PACKAGE__ISSUE_TYPE:
				setIssueType(ISSUE_TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ProductmanagementPackage.JIRA_WORK_PACKAGE__PROJECT_KEY:
				return PROJECT_KEY_EDEFAULT == null ? getProjectKey() != null : !PROJECT_KEY_EDEFAULT.equals(getProjectKey());
			case ProductmanagementPackage.JIRA_WORK_PACKAGE__ISSUE_KEY:
				return ISSUE_KEY_EDEFAULT == null ? getIssueKey() != null : !ISSUE_KEY_EDEFAULT.equals(getIssueKey());
			case ProductmanagementPackage.JIRA_WORK_PACKAGE__ISSUE_TYPE:
				return ISSUE_TYPE_EDEFAULT == null ? getIssueType() != null : !ISSUE_TYPE_EDEFAULT.equals(getIssueType());
		}
		return super.eIsSet(featureID);
	}

} //JiraWorkPackageImpl
