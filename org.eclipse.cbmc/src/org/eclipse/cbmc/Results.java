/**
 */
package org.eclipse.cbmc;

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

} // Results
