/**
 */
package process;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link process.StepResult#getObject <em>Object</em>}</li>
 *   <li>{@link process.StepResult#getCode <em>Code</em>}</li>
 *   <li>{@link process.StepResult#getStepDone <em>Step Done</em>}</li>
 * </ul>
 * </p>
 *
 * @see process.ProcessPackage#getStepResult()
 * @model
 * @generated
 */
public interface StepResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' attribute.
	 * @see #setObject(Object)
	 * @see process.ProcessPackage#getStepResult_Object()
	 * @model
	 * @generated
	 */
	Object getObject();

	/**
	 * Sets the value of the '{@link process.StepResult#getObject <em>Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' attribute.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(Object value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * The literals are from the enumeration {@link process.SteppingResult}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see process.SteppingResult
	 * @see #setCode(SteppingResult)
	 * @see process.ProcessPackage#getStepResult_Code()
	 * @model
	 * @generated
	 */
	SteppingResult getCode();

	/**
	 * Sets the value of the '{@link process.StepResult#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see process.SteppingResult
	 * @see #getCode()
	 * @generated
	 */
	void setCode(SteppingResult value);

	/**
	 * Returns the value of the '<em><b>Step Done</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step Done</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Done</em>' attribute.
	 * @see #setStepDone(int)
	 * @see process.ProcessPackage#getStepResult_StepDone()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getStepDone();

	/**
	 * Sets the value of the '{@link process.StepResult#getStepDone <em>Step Done</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Done</em>' attribute.
	 * @see #getStepDone()
	 * @generated
	 */
	void setStepDone(int value);

} // StepResult
