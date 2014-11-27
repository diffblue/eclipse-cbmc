/**
 */
package org.eclipse.cbmc;

import org.eclipse.cbmc.util.CBMCCliHelper;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Results</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.cbmc.Results#getErrorMessage <em>Error Message</em>}</li>
 *   <li>{@link org.eclipse.cbmc.Results#getSucceededCount <em>Succeeded Count</em>}</li>
 *   <li>{@link org.eclipse.cbmc.Results#getFailedCount <em>Failed Count</em>}</li>
 *   <li>{@link org.eclipse.cbmc.Results#getErrorCount <em>Error Count</em>}</li>
 *   <li>{@link org.eclipse.cbmc.Results#getRunCount <em>Run Count</em>}</li>
 *   <li>{@link org.eclipse.cbmc.Results#getLoopResults <em>Loop Results</em>}</li>
 *   <li>{@link org.eclipse.cbmc.Results#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.eclipse.cbmc.Results#getFiles <em>Files</em>}</li>
 *   <li>{@link org.eclipse.cbmc.Results#getCategories <em>Categories</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.cbmc.CbmcPackage#getResults()
 * @model extendedMetaData="name='Results' kind='elementOnly'"
 * @generated
 */
public interface Results extends EObject {
	/**
	 * Returns the value of the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Message</em>' attribute.
	 * @see #setErrorMessage(String)
	 * @see org.eclipse.cbmc.CbmcPackage#getResults_ErrorMessage()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='errorMessage'"
	 * @generated
	 */
	String getErrorMessage();

	/**
	 * Sets the value of the '{@link org.eclipse.cbmc.Results#getErrorMessage <em>Error Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Message</em>' attribute.
	 * @see #getErrorMessage()
	 * @generated
	 */
	void setErrorMessage(String value);

	/**
	 * Returns the value of the '<em><b>Succeeded Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Succeeded Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Succeeded Count</em>' attribute.
	 * @see #isSetSucceededCount()
	 * @see #unsetSucceededCount()
	 * @see #setSucceededCount(int)
	 * @see org.eclipse.cbmc.CbmcPackage#getResults_SucceededCount()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='succeededCount'"
	 * @generated
	 */
	int getSucceededCount();

	/**
	 * Sets the value of the '{@link org.eclipse.cbmc.Results#getSucceededCount <em>Succeeded Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Succeeded Count</em>' attribute.
	 * @see #isSetSucceededCount()
	 * @see #unsetSucceededCount()
	 * @see #getSucceededCount()
	 * @generated
	 */
	void setSucceededCount(int value);

	/**
	 * Unsets the value of the '{@link org.eclipse.cbmc.Results#getSucceededCount <em>Succeeded Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSucceededCount()
	 * @see #getSucceededCount()
	 * @see #setSucceededCount(int)
	 * @generated
	 */
	void unsetSucceededCount();

	/**
	 * Returns whether the value of the '{@link org.eclipse.cbmc.Results#getSucceededCount <em>Succeeded Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Succeeded Count</em>' attribute is set.
	 * @see #unsetSucceededCount()
	 * @see #getSucceededCount()
	 * @see #setSucceededCount(int)
	 * @generated
	 */
	boolean isSetSucceededCount();

	/**
	 * Returns the value of the '<em><b>Failed Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failed Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failed Count</em>' attribute.
	 * @see #isSetFailedCount()
	 * @see #unsetFailedCount()
	 * @see #setFailedCount(int)
	 * @see org.eclipse.cbmc.CbmcPackage#getResults_FailedCount()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='failedCount'"
	 * @generated
	 */
	int getFailedCount();

	/**
	 * Sets the value of the '{@link org.eclipse.cbmc.Results#getFailedCount <em>Failed Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failed Count</em>' attribute.
	 * @see #isSetFailedCount()
	 * @see #unsetFailedCount()
	 * @see #getFailedCount()
	 * @generated
	 */
	void setFailedCount(int value);

	/**
	 * Unsets the value of the '{@link org.eclipse.cbmc.Results#getFailedCount <em>Failed Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFailedCount()
	 * @see #getFailedCount()
	 * @see #setFailedCount(int)
	 * @generated
	 */
	void unsetFailedCount();

	/**
	 * Returns whether the value of the '{@link org.eclipse.cbmc.Results#getFailedCount <em>Failed Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Failed Count</em>' attribute is set.
	 * @see #unsetFailedCount()
	 * @see #getFailedCount()
	 * @see #setFailedCount(int)
	 * @generated
	 */
	boolean isSetFailedCount();

	/**
	 * Returns the value of the '<em><b>Error Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Count</em>' attribute.
	 * @see #isSetErrorCount()
	 * @see #unsetErrorCount()
	 * @see #setErrorCount(int)
	 * @see org.eclipse.cbmc.CbmcPackage#getResults_ErrorCount()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='errorCount'"
	 * @generated
	 */
	int getErrorCount();

	/**
	 * Sets the value of the '{@link org.eclipse.cbmc.Results#getErrorCount <em>Error Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Count</em>' attribute.
	 * @see #isSetErrorCount()
	 * @see #unsetErrorCount()
	 * @see #getErrorCount()
	 * @generated
	 */
	void setErrorCount(int value);

	/**
	 * Unsets the value of the '{@link org.eclipse.cbmc.Results#getErrorCount <em>Error Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetErrorCount()
	 * @see #getErrorCount()
	 * @see #setErrorCount(int)
	 * @generated
	 */
	void unsetErrorCount();

	/**
	 * Returns whether the value of the '{@link org.eclipse.cbmc.Results#getErrorCount <em>Error Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Error Count</em>' attribute is set.
	 * @see #unsetErrorCount()
	 * @see #getErrorCount()
	 * @see #setErrorCount(int)
	 * @generated
	 */
	boolean isSetErrorCount();

	/**
	 * Returns the value of the '<em><b>Run Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Run Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run Count</em>' attribute.
	 * @see #isSetRunCount()
	 * @see #unsetRunCount()
	 * @see #setRunCount(int)
	 * @see org.eclipse.cbmc.CbmcPackage#getResults_RunCount()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='runCount'"
	 * @generated
	 */
	int getRunCount();

	/**
	 * Sets the value of the '{@link org.eclipse.cbmc.Results#getRunCount <em>Run Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Run Count</em>' attribute.
	 * @see #isSetRunCount()
	 * @see #unsetRunCount()
	 * @see #getRunCount()
	 * @generated
	 */
	void setRunCount(int value);

	/**
	 * Unsets the value of the '{@link org.eclipse.cbmc.Results#getRunCount <em>Run Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRunCount()
	 * @see #getRunCount()
	 * @see #setRunCount(int)
	 * @generated
	 */
	void unsetRunCount();

	/**
	 * Returns whether the value of the '{@link org.eclipse.cbmc.Results#getRunCount <em>Run Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Run Count</em>' attribute is set.
	 * @see #unsetRunCount()
	 * @see #getRunCount()
	 * @see #setRunCount(int)
	 * @generated
	 */
	boolean isSetRunCount();

	/**
	 * Returns the value of the '<em><b>Loop Results</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop Results</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Results</em>' containment reference.
	 * @see #setLoopResults(LoopResults)
	 * @see org.eclipse.cbmc.CbmcPackage#getResults_LoopResults()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='loopResults'"
	 * @generated
	 */
	LoopResults getLoopResults();

	/**
	 * Sets the value of the '{@link org.eclipse.cbmc.Results#getLoopResults <em>Loop Results</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop Results</em>' containment reference.
	 * @see #getLoopResults()
	 * @generated
	 */
	void setLoopResults(LoopResults value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.cbmc.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see org.eclipse.cbmc.CbmcPackage#getResults_Properties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='properties'"
	 * @generated
	 */
	EList<Property> getProperties();

	/**
	 * Returns the value of the '<em><b>Files</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.cbmc.File}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Files</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Files</em>' containment reference list.
	 * @see org.eclipse.cbmc.CbmcPackage#getResults_Files()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='files'"
	 * @generated
	 */
	EList<File> getFiles();

	/**
	 * Returns the value of the '<em><b>Categories</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.cbmc.PropertyCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories</em>' containment reference list.
	 * @see org.eclipse.cbmc.CbmcPackage#getResults_Categories()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='categories'"
	 * @generated
	 */
	EList<PropertyCategory> getCategories();

	public CBMCCliHelper getCBMCHelper();

	public void setCBMCHelper(CBMCCliHelper helper);

} // Results
