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
import trace.Location;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link process.StepResult#getCode <em>Code</em>}</li>
 *   <li>{@link process.StepResult#getStepDone <em>Step Done</em>}</li>
 *   <li>{@link process.StepResult#getBreakpoint <em>Breakpoint</em>}</li>
 *   <li>{@link process.StepResult#getLineExecuted <em>Line Executed</em>}</li>
 * </ul>
 * </p>
 *
 * @see process.ProcessPackage#getStepResult()
 * @model
 * @generated
 */
public interface StepResult extends EObject {
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

	/**
	 * Returns the value of the '<em><b>Line Executed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Executed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Executed</em>' reference.
	 * @see #setLineExecuted(Location)
	 * @see process.ProcessPackage#getStepResult_LineExecuted()
	 * @model
	 * @generated
	 */
	Location getLineExecuted();

	/**
	 * Sets the value of the '{@link process.StepResult#getLineExecuted <em>Line Executed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Executed</em>' reference.
	 * @see #getLineExecuted()
	 * @generated
	 */
	void setLineExecuted(Location value);

	/**
	 * Returns the value of the '<em><b>Breakpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Breakpoint</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Breakpoint</em>' reference.
	 * @see #setBreakpoint(Breakpoint)
	 * @see process.ProcessPackage#getStepResult_Breakpoint()
	 * @model
	 * @generated
	 */
	Breakpoint getBreakpoint();

	/**
	 * Sets the value of the '{@link process.StepResult#getBreakpoint <em>Breakpoint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Breakpoint</em>' reference.
	 * @see #getBreakpoint()
	 * @generated
	 */
	void setBreakpoint(Breakpoint value);

} // StepResult
