/*******************************************************************************
 * Copyright (c) 2014 Rapicorp, Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Rapicorp, Inc - initial API and implementation
 *******************************************************************************/
/**
 */
package process;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import trace.Step;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thread</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link process.Thread#getId <em>Id</em>}</li>
 *   <li>{@link process.Thread#getAllSteps <em>All Steps</em>}</li>
 *   <li>{@link process.Thread#isStarted <em>Started</em>}</li>
 *   <li>{@link process.Thread#getStack <em>Stack</em>}</li>
 *   <li>{@link process.Thread#isRunning <em>Running</em>}</li>
 *   <li>{@link process.Thread#getProcess <em>Process</em>}</li>
 *   <li>{@link process.Thread#getStepToExecuteIdx <em>Step To Execute Idx</em>}</li>
 * </ul>
 * </p>
 *
 * @see process.ProcessPackage#getThread()
 * @model
 * @generated
 */
public interface Thread extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see process.ProcessPackage#getThread_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link process.Thread#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>All Steps</b></em>' reference list.
	 * The list contents are of type {@link trace.Step}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Steps</em>' reference list.
	 * @see process.ProcessPackage#getThread_AllSteps()
	 * @model
	 * @generated
	 */
	EList<Step> getAllSteps();

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
	 * @see process.ProcessPackage#getThread_Started()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isStarted();

	/**
	 * Sets the value of the '{@link process.Thread#isStarted <em>Started</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Started</em>' attribute.
	 * @see #isStarted()
	 * @generated
	 */
	void setStarted(boolean value);

	/**
	 * Returns the value of the '<em><b>Stack</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stack</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stack</em>' reference.
	 * @see #setStack(FunctionExecution)
	 * @see process.ProcessPackage#getThread_Stack()
	 * @model
	 * @generated
	 */
	FunctionExecution getStack();

	/**
	 * Sets the value of the '{@link process.Thread#getStack <em>Stack</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stack</em>' reference.
	 * @see #getStack()
	 * @generated
	 */
	void setStack(FunctionExecution value);

	/**
	 * Returns the value of the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Running</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Running</em>' attribute.
	 * @see #setRunning(boolean)
	 * @see process.ProcessPackage#getThread_Running()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isRunning();

	/**
	 * Sets the value of the '{@link process.Thread#isRunning <em>Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Running</em>' attribute.
	 * @see #isRunning()
	 * @generated
	 */
	void setRunning(boolean value);

	/**
	 * Returns the value of the '<em><b>Process</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link process.Process#getThreads <em>Threads</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' container reference.
	 * @see #setProcess(process.Process)
	 * @see process.ProcessPackage#getThread_Process()
	 * @see process.Process#getThreads
	 * @model opposite="threads" transient="false"
	 * @generated
	 */
	process.Process getProcess();

	/**
	 * Sets the value of the '{@link process.Thread#getProcess <em>Process</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process</em>' container reference.
	 * @see #getProcess()
	 * @generated
	 */
	void setProcess(process.Process value);

	/**
	 * Returns the value of the '<em><b>Step To Execute Idx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step To Execute Idx</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step To Execute Idx</em>' attribute.
	 * @see #setStepToExecuteIdx(int)
	 * @see process.ProcessPackage#getThread_StepToExecuteIdx()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getStepToExecuteIdx();

	/**
	 * Sets the value of the '{@link process.Thread#getStepToExecuteIdx <em>Step To Execute Idx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step To Execute Idx</em>' attribute.
	 * @see #getStepToExecuteIdx()
	 * @generated
	 */
	void setStepToExecuteIdx(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	StepResult step(StepGoal goal);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getStackDepth();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model depthDataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	FunctionExecution getFrame(int depth);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Step getStepToExecuteOrLastOne();

} // Thread
