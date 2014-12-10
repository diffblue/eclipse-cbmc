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
import trace.Assignment;
import trace.FunctionCall;
import trace.Step;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Execution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link process.FunctionExecution#getParent <em>Parent</em>}</li>
 *   <li>{@link process.FunctionExecution#getChild <em>Child</em>}</li>
 *   <li>{@link process.FunctionExecution#getEntryStep <em>Entry Step</em>}</li>
 *   <li>{@link process.FunctionExecution#getContainingThread <em>Containing Thread</em>}</li>
 *   <li>{@link process.FunctionExecution#getVariables <em>Variables</em>}</li>
 *   <li>{@link process.FunctionExecution#getStepIndexBeforeChild <em>Step Index Before Child</em>}</li>
 * </ul>
 * </p>
 *
 * @see process.ProcessPackage#getFunctionExecution()
 * @model
 * @generated
 */
public interface FunctionExecution extends EObject {
	/**
	 * Returns the value of the '<em><b>Child</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link process.FunctionExecution#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' reference.
	 * @see #setChild(FunctionExecution)
	 * @see process.ProcessPackage#getFunctionExecution_Child()
	 * @see process.FunctionExecution#getParent
	 * @model opposite="parent"
	 * @generated
	 */
	FunctionExecution getChild();

	/**
	 * Sets the value of the '{@link process.FunctionExecution#getChild <em>Child</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(FunctionExecution value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link process.FunctionExecution#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(FunctionExecution)
	 * @see process.ProcessPackage#getFunctionExecution_Parent()
	 * @see process.FunctionExecution#getChild
	 * @model opposite="child"
	 * @generated
	 */
	FunctionExecution getParent();

	/**
	 * Sets the value of the '{@link process.FunctionExecution#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(FunctionExecution value);

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link trace.Assignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see process.ProcessPackage#getFunctionExecution_Variables()
	 * @model containment="true" keys="baseName" ordered="false"
	 * @generated
	 */
	EList<Assignment> getVariables();

	/**
	 * Returns the value of the '<em><b>Step Index Before Child</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step Index Before Child</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Index Before Child</em>' attribute.
	 * @see #setStepIndexBeforeChild(int)
	 * @see process.ProcessPackage#getFunctionExecution_StepIndexBeforeChild()
	 * @model default="-1" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getStepIndexBeforeChild();

	/**
	 * Sets the value of the '{@link process.FunctionExecution#getStepIndexBeforeChild <em>Step Index Before Child</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Index Before Child</em>' attribute.
	 * @see #getStepIndexBeforeChild()
	 * @generated
	 */
	void setStepIndexBeforeChild(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameDataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	Assignment getVariable(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getFunctionName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getFileName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Step getCurrentStep();

	/**
	 * Returns the value of the '<em><b>Entry Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Step</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Step</em>' reference.
	 * @see #setEntryStep(FunctionCall)
	 * @see process.ProcessPackage#getFunctionExecution_EntryStep()
	 * @model
	 * @generated
	 */
	FunctionCall getEntryStep();

	/**
	 * Sets the value of the '{@link process.FunctionExecution#getEntryStep <em>Entry Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Step</em>' reference.
	 * @see #getEntryStep()
	 * @generated
	 */
	void setEntryStep(FunctionCall value);

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
	 * @see process.ProcessPackage#getFunctionExecution_ContainingThread()
	 * @model
	 * @generated
	 */
	process.Thread getContainingThread();

	/**
	 * Sets the value of the '{@link process.FunctionExecution#getContainingThread <em>Containing Thread</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containing Thread</em>' reference.
	 * @see #getContainingThread()
	 * @generated
	 */
	void setContainingThread(process.Thread value);

	
} // FunctionExecution
