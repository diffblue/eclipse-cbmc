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

	//These code represent the exit value from the intepretation of each step.
	//These values are for the internal behaviour of the stepping logic and are not expected to be referenced in the commands. 
	//These are different from the StepGoal that represent the desired goal when an exec-* command is performed.
	//The mapping between the goal to reach and the internal context is done in the ThreadImpl#reachedGoal().
	public static final int ASSIGNMENT = 1;
	public static final int FAILURE = 2;
	public static final int FUNCTION_CALL = 4;
	public static final int FUNCTION_RETURN = 8;
	public static final int LOCATION_ONLY = 16;
	public static final int OUTPUT = 32;
	public static final int NEXT_LINE = 64;
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
