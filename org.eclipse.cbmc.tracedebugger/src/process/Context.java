/**
 */
package process;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link process.Context#getFunction <em>Function</em>}</li>
 *   <li>{@link process.Context#getContainingThread <em>Containing Thread</em>}</li>
 *   <li>{@link process.Context#getStepBeingExecutedIdx <em>Step Being Executed Idx</em>}</li>
 * </ul>
 * </p>
 *
 * @see process.ProcessPackage#getContext()
 * @model
 * @generated
 */
public interface Context extends EObject {
	
	
	public static int FUNCTION_EXIT = 1;
	public static int FUNCTION_ENTER = 2;
	public static int NEXT_LINE = 4;
	public static int STEPPED = 8;
	public static int CONTINUE = 16;
	
	/**
	 * Returns the value of the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' reference.
	 * @see #setFunction(FunctionExecution)
	 * @see process.ProcessPackage#getContext_Function()
	 * @model
	 * @generated
	 */
	FunctionExecution getFunction();

	/**
	 * Sets the value of the '{@link process.Context#getFunction <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(FunctionExecution value);

	/**
	 * Returns the value of the '<em><b>Containing Thread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containing Thread</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing Thread</em>' reference.
	 * @see #setContainingThread(process.Thread)
	 * @see process.ProcessPackage#getContext_ContainingThread()
	 * @model
	 * @generated
	 */
	process.Thread getContainingThread();

	/**
	 * Sets the value of the '{@link process.Context#getContainingThread <em>Containing Thread</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containing Thread</em>' reference.
	 * @see #getContainingThread()
	 * @generated
	 */
	void setContainingThread(process.Thread value);

	/**
	 * Returns the value of the '<em><b>Step Being Executed Idx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step Being Executed Idx</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Being Executed Idx</em>' attribute.
	 * @see #setStepBeingExecutedIdx(int)
	 * @see process.ProcessPackage#getContext_StepBeingExecutedIdx()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getStepBeingExecutedIdx();

	/**
	 * Sets the value of the '{@link process.Context#getStepBeingExecutedIdx <em>Step Being Executed Idx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Being Executed Idx</em>' attribute.
	 * @see #getStepBeingExecutedIdx()
	 * @generated
	 */
	void setStepBeingExecutedIdx(int value);


} // Context
