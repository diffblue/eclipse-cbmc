/**
 */
package org.eclipse.cbmc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loops</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.cbmc.Loops#getErrorMessage <em>Error Message</em>}</li>
 *   <li>{@link org.eclipse.cbmc.Loops#getLoops <em>Loops</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.cbmc.CbmcPackage#getLoops()
 * @model extendedMetaData="name='Loops' kind='elementOnly'"
 * @generated
 */
public interface Loops extends EObject {
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
	 * @see org.eclipse.cbmc.CbmcPackage#getLoops_ErrorMessage()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='errorMessage'"
	 * @generated
	 */
	String getErrorMessage();

	/**
	 * Sets the value of the '{@link org.eclipse.cbmc.Loops#getErrorMessage <em>Error Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Message</em>' attribute.
	 * @see #getErrorMessage()
	 * @generated
	 */
	void setErrorMessage(String value);

	/**
	 * Returns the value of the '<em><b>Loops</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.cbmc.Loop}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loops</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loops</em>' containment reference list.
	 * @see org.eclipse.cbmc.CbmcPackage#getLoops_Loops()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='loops'"
	 * @generated
	 */
	EList<Loop> getLoops();

} // Loops
