/**
 */
package org.eclipse.cbmc;

import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.cbmc.Property#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.cbmc.Property#getNumber <em>Number</em>}</li>
 *   <li>{@link org.eclipse.cbmc.Property#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.cbmc.Property#getFile <em>File</em>}</li>
 *   <li>{@link org.eclipse.cbmc.Property#getFunction <em>Function</em>}</li>
 *   <li>{@link org.eclipse.cbmc.Property#getLine <em>Line</em>}</li>
 *   <li>{@link org.eclipse.cbmc.Property#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.cbmc.Property#getDetailsFile <em>Details File</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.cbmc.CbmcPackage#getProperty()
 * @model extendedMetaData="name='Property' kind='elementOnly'"
 * @generated
 */
public interface Property extends EObject {

	/**
	 * Returns the value of the '<em><b>Category</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.cbmc.PropertyCategory#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' reference.
	 * @see #setCategory(PropertyCategory)
	 * @see org.eclipse.cbmc.CbmcPackage#getProperty_Category()
	 * @see org.eclipse.cbmc.PropertyCategory#getProperties
	 * @model opposite="properties" required="true"
	 *        extendedMetaData="kind='element' name='category'"
	 * @generated
	 */
	PropertyCategory getCategory();

	/**
	 * Sets the value of the '{@link org.eclipse.cbmc.Property#getCategory <em>Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(PropertyCategory value);

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(String)
	 * @see org.eclipse.cbmc.CbmcPackage#getProperty_Number()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='number'"
	 * @generated
	 */
	String getNumber();

	/**
	 * Sets the value of the '{@link org.eclipse.cbmc.Property#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.cbmc.CbmcPackage#getProperty_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.cbmc.Property#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>File</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.cbmc.File#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' reference.
	 * @see #setFile(File)
	 * @see org.eclipse.cbmc.CbmcPackage#getProperty_File()
	 * @see org.eclipse.cbmc.File#getProperties
	 * @model opposite="properties" required="true"
	 *        extendedMetaData="kind='element' name='file'"
	 * @generated
	 */
	File getFile();

	/**
	 * Sets the value of the '{@link org.eclipse.cbmc.Property#getFile <em>File</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' reference.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(File value);

	/**
	 * Returns the value of the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' attribute.
	 * @see #setFunction(String)
	 * @see org.eclipse.cbmc.CbmcPackage#getProperty_Function()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='function'"
	 * @generated
	 */
	String getFunction();

	/**
	 * Sets the value of the '{@link org.eclipse.cbmc.Property#getFunction <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' attribute.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(String value);

	/**
	 * Returns the value of the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' attribute.
	 * @see #isSetLine()
	 * @see #unsetLine()
	 * @see #setLine(int)
	 * @see org.eclipse.cbmc.CbmcPackage#getProperty_Line()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='line'"
	 * @generated
	 */
	int getLine();

	/**
	 * Sets the value of the '{@link org.eclipse.cbmc.Property#getLine <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line</em>' attribute.
	 * @see #isSetLine()
	 * @see #unsetLine()
	 * @see #getLine()
	 * @generated
	 */
	void setLine(int value);

	/**
	 * Unsets the value of the '{@link org.eclipse.cbmc.Property#getLine <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLine()
	 * @see #getLine()
	 * @see #setLine(int)
	 * @generated
	 */
	void unsetLine();

	/**
	 * Returns whether the value of the '{@link org.eclipse.cbmc.Property#getLine <em>Line</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Line</em>' attribute is set.
	 * @see #unsetLine()
	 * @see #getLine()
	 * @see #setLine(int)
	 * @generated
	 */
	boolean isSetLine();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.cbmc.PropertyStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.eclipse.cbmc.PropertyStatus
	 * @see #isSetStatus()
	 * @see #unsetStatus()
	 * @see #setStatus(PropertyStatus)
	 * @see org.eclipse.cbmc.CbmcPackage#getProperty_Status()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='status'"
	 * @generated
	 */
	PropertyStatus getStatus();

	/**
	 * Sets the value of the '{@link org.eclipse.cbmc.Property#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.eclipse.cbmc.PropertyStatus
	 * @see #isSetStatus()
	 * @see #unsetStatus()
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(PropertyStatus value);

	/**
	 * Unsets the value of the '{@link org.eclipse.cbmc.Property#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStatus()
	 * @see #getStatus()
	 * @see #setStatus(PropertyStatus)
	 * @generated
	 */
	void unsetStatus();

	/**
	 * Returns whether the value of the '{@link org.eclipse.cbmc.Property#getStatus <em>Status</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Status</em>' attribute is set.
	 * @see #unsetStatus()
	 * @see #getStatus()
	 * @see #setStatus(PropertyStatus)
	 * @generated
	 */
	boolean isSetStatus();

	/**
	 * Returns the value of the '<em><b>Details File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Details File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Details File</em>' attribute.
	 * @see #setDetailsFile(String)
	 * @see org.eclipse.cbmc.CbmcPackage#getProperty_DetailsFile()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='detailsFile'"
	 * @generated
	 */
	String getDetailsFile();

	/**
	 * Sets the value of the '{@link org.eclipse.cbmc.Property#getDetailsFile <em>Details File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Details File</em>' attribute.
	 * @see #getDetailsFile()
	 * @generated
	 */
	void setDetailsFile(String value);

	void setJob(Job job);

	Job getJob();

} // Property
