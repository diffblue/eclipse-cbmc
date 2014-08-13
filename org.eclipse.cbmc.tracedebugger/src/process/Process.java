/**
 */
package process;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link process.Process#getThreads <em>Threads</em>}</li>
 *   <li>{@link process.Process#isStarted <em>Started</em>}</li>
 *   <li>{@link process.Process#getGroupThreadId <em>Group Thread Id</em>}</li>
 *   <li>{@link process.Process#getProcessNumber <em>Process Number</em>}</li>
 *   <li>{@link process.Process#getActiveThreads <em>Active Threads</em>}</li>
 *   <li>{@link process.Process#getPid <em>Pid</em>}</li>
 *   <li>{@link process.Process#getVariableManager <em>Variable Manager</em>}</li>
 *   <li>{@link process.Process#getBreakpointManager <em>Breakpoint Manager</em>}</li>
 *   <li>{@link process.Process#getExecutableName <em>Executable Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see process.ProcessPackage#getProcess()
 * @model
 * @generated
 */
public interface Process extends EObject {
	/**
	 * Returns the value of the '<em><b>Threads</b></em>' containment reference list.
	 * The list contents are of type {@link process.Thread}.
	 * It is bidirectional and its opposite is '{@link process.Thread#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threads</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threads</em>' containment reference list.
	 * @see process.ProcessPackage#getProcess_Threads()
	 * @see process.Thread#getProcess
	 * @model opposite="process" containment="true"
	 * @generated
	 */
	EList<process.Thread> getThreads();

	/**
	 * Returns the value of the '<em><b>Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Started</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Started</em>' attribute.
	 * @see #setStarted(boolean)
	 * @see process.ProcessPackage#getProcess_Started()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isStarted();

	/**
	 * Sets the value of the '{@link process.Process#isStarted <em>Started</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Started</em>' attribute.
	 * @see #isStarted()
	 * @generated
	 */
	void setStarted(boolean value);

	/**
	 * Returns the value of the '<em><b>Group Thread Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Thread Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Thread Id</em>' attribute.
	 * @see #setGroupThreadId(String)
	 * @see process.ProcessPackage#getProcess_GroupThreadId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getGroupThreadId();

	/**
	 * Sets the value of the '{@link process.Process#getGroupThreadId <em>Group Thread Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Thread Id</em>' attribute.
	 * @see #getGroupThreadId()
	 * @generated
	 */
	void setGroupThreadId(String value);

	/**
	 * Returns the value of the '<em><b>Process Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Number</em>' attribute.
	 * @see #setProcessNumber(String)
	 * @see process.ProcessPackage#getProcess_ProcessNumber()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getProcessNumber();

	/**
	 * Sets the value of the '{@link process.Process#getProcessNumber <em>Process Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Number</em>' attribute.
	 * @see #getProcessNumber()
	 * @generated
	 */
	void setProcessNumber(String value);

	/**
	 * Returns the value of the '<em><b>Active Threads</b></em>' reference list.
	 * The list contents are of type {@link process.Thread}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active Threads</em>' reference list.
	 * @see process.ProcessPackage#getProcess_ActiveThreads()
	 * @model
	 * @generated
	 */
	EList<process.Thread> getActiveThreads();

	/**
	 * Returns the value of the '<em><b>Pid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pid</em>' attribute.
	 * @see #setPid(String)
	 * @see process.ProcessPackage#getProcess_Pid()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getPid();

	/**
	 * Sets the value of the '{@link process.Process#getPid <em>Pid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pid</em>' attribute.
	 * @see #getPid()
	 * @generated
	 */
	void setPid(String value);

	/**
	 * Returns the value of the '<em><b>Variable Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Manager</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Manager</em>' reference.
	 * @see #setVariableManager(VariableManager)
	 * @see process.ProcessPackage#getProcess_VariableManager()
	 * @model required="true"
	 * @generated
	 */
	VariableManager getVariableManager();

	/**
	 * Sets the value of the '{@link process.Process#getVariableManager <em>Variable Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Manager</em>' reference.
	 * @see #getVariableManager()
	 * @generated
	 */
	void setVariableManager(VariableManager value);

	/**
	 * Returns the value of the '<em><b>Breakpoint Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Breakpoint Manager</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Breakpoint Manager</em>' reference.
	 * @see #setBreakpointManager(BreakpointManager)
	 * @see process.ProcessPackage#getProcess_BreakpointManager()
	 * @model required="true"
	 * @generated
	 */
	BreakpointManager getBreakpointManager();

	/**
	 * Sets the value of the '{@link process.Process#getBreakpointManager <em>Breakpoint Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Breakpoint Manager</em>' reference.
	 * @see #getBreakpointManager()
	 * @generated
	 */
	void setBreakpointManager(BreakpointManager value);

	/**
	 * Returns the value of the '<em><b>Executable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executable Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executable Name</em>' attribute.
	 * @see #setExecutableName(String)
	 * @see process.ProcessPackage#getProcess_ExecutableName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getExecutableName();

	/**
	 * Sets the value of the '{@link process.Process#getExecutableName <em>Executable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executable Name</em>' attribute.
	 * @see #getExecutableName()
	 * @generated
	 */
	void setExecutableName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	StepResult start();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model threadIdDataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	process.Thread getThread(int threadId);

} // Process
