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
package trace;

import org.eclipse.emf.ecore.EObject;
import process.Context;
import process.StepResult;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trace.Step#getNumber <em>Number</em>}</li>
 *   <li>{@link trace.Step#getLocation <em>Location</em>}</li>
 *   <li>{@link trace.Step#getThread <em>Thread</em>}</li>
 *   <li>{@link trace.Step#isHidden <em>Hidden</em>}</li>
 * </ul>
 * </p>
 *
 * @see trace.TracePackage#getStep()
 * @model extendedMetaData="name='Step' kind='elementOnly'"
 * @generated
 */
public interface Step extends EObject {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #isSetNumber()
	 * @see #unsetNumber()
	 * @see #setNumber(int)
	 * @see trace.TracePackage#getStep_Number()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='number'"
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link trace.Step#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #isSetNumber()
	 * @see #unsetNumber()
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Unsets the value of the '{@link trace.Step#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumber()
	 * @see #getNumber()
	 * @see #setNumber(int)
	 * @generated
	 */
	void unsetNumber();

	/**
	 * Returns whether the value of the '{@link trace.Step#getNumber <em>Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Number</em>' attribute is set.
	 * @see #unsetNumber()
	 * @see #getNumber()
	 * @see #setNumber(int)
	 * @generated
	 */
	boolean isSetNumber();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Location)
	 * @see trace.TracePackage#getStep_Location()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='location'"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link trace.Step#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Thread</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thread</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thread</em>' attribute.
	 * @see #isSetThread()
	 * @see #unsetThread()
	 * @see #setThread(int)
	 * @see trace.TracePackage#getStep_Thread()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='thread'"
	 * @generated
	 */
	int getThread();

	/**
	 * Sets the value of the '{@link trace.Step#getThread <em>Thread</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thread</em>' attribute.
	 * @see #isSetThread()
	 * @see #unsetThread()
	 * @see #getThread()
	 * @generated
	 */
	void setThread(int value);

	/**
	 * Unsets the value of the '{@link trace.Step#getThread <em>Thread</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetThread()
	 * @see #getThread()
	 * @see #setThread(int)
	 * @generated
	 */
	void unsetThread();

	/**
	 * Returns whether the value of the '{@link trace.Step#getThread <em>Thread</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Thread</em>' attribute is set.
	 * @see #unsetThread()
	 * @see #getThread()
	 * @see #setThread(int)
	 * @generated
	 */
	boolean isSetThread();

	/**
	 * Returns the value of the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hidden</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hidden</em>' attribute.
	 * @see #isSetHidden()
	 * @see #unsetHidden()
	 * @see #setHidden(boolean)
	 * @see trace.TracePackage#getStep_Hidden()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='hidden'"
	 * @generated
	 */
	boolean isHidden();

	/**
	 * Sets the value of the '{@link trace.Step#isHidden <em>Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hidden</em>' attribute.
	 * @see #isSetHidden()
	 * @see #unsetHidden()
	 * @see #isHidden()
	 * @generated
	 */
	void setHidden(boolean value);

	/**
	 * Unsets the value of the '{@link trace.Step#isHidden <em>Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHidden()
	 * @see #isHidden()
	 * @see #setHidden(boolean)
	 * @generated
	 */
	void unsetHidden();

	/**
	 * Returns whether the value of the '{@link trace.Step#isHidden <em>Hidden</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hidden</em>' attribute is set.
	 * @see #unsetHidden()
	 * @see #isHidden()
	 * @see #setHidden(boolean)
	 * @generated
	 */
	boolean isSetHidden();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	StepResult interpret(Context context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated NOT
	 */
	int getLineNumber();

} // Step
