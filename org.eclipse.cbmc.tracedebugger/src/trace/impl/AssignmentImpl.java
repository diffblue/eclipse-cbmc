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
package trace.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import process.Context;
import process.FunctionExecution;
import process.ProcessFactory;
import process.StepResult;
import process.SteppingResult;
import trace.Assignment;
import trace.TracePackage;
import trace.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link trace.impl.AssignmentImpl#getId <em>Id</em>}</li>
 *   <li>{@link trace.impl.AssignmentImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link trace.impl.AssignmentImpl#getBaseName <em>Base Name</em>}</li>
 *   <li>{@link trace.impl.AssignmentImpl#getValue <em>Value</em>}</li>
 *   <li>{@link trace.impl.AssignmentImpl#getAssignmentType <em>Assignment Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssignmentImpl extends StepImpl implements Assignment {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected String displayName = DISPLAY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBaseName() <em>Base Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseName()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseName() <em>Base Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseName()
	 * @generated
	 * @ordered
	 */
	protected String baseName = BASE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Value value;

	/**
	 * The default value of the '{@link #getAssignmentType() <em>Assignment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignmentType()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSIGNMENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssignmentType() <em>Assignment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignmentType()
	 * @generated
	 * @ordered
	 */
	protected String assignmentType = ASSIGNMENT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracePackage.Literals.ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.ASSIGNMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayName(String newDisplayName) {
		String oldDisplayName = displayName;
		displayName = newDisplayName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.ASSIGNMENT__DISPLAY_NAME, oldDisplayName, displayName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBaseName() {
		return baseName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseName(String newBaseName) {
		String oldBaseName = baseName;
		baseName = newBaseName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.ASSIGNMENT__BASE_NAME, oldBaseName, baseName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Value newValue) {
		Value oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.ASSIGNMENT__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAssignmentType() {
		return assignmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignmentType(String newAssignmentType) {
		String oldAssignmentType = assignmentType;
		assignmentType = newAssignmentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.ASSIGNMENT__ASSIGNMENT_TYPE, oldAssignmentType, assignmentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getType() {
		if (value == null)
			return "unknonw";
		return value.getType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Value getValue(String expression) {
		if (getBaseName().equals(expression))
			return value;

		if (expression.startsWith(getBaseName()))
			expression = expression.substring(getBaseName().length());
		return value.getValue(expression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TracePackage.ASSIGNMENT__ID:
				return getId();
			case TracePackage.ASSIGNMENT__DISPLAY_NAME:
				return getDisplayName();
			case TracePackage.ASSIGNMENT__BASE_NAME:
				return getBaseName();
			case TracePackage.ASSIGNMENT__VALUE:
				return getValue();
			case TracePackage.ASSIGNMENT__ASSIGNMENT_TYPE:
				return getAssignmentType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TracePackage.ASSIGNMENT__ID:
				setId((String)newValue);
				return;
			case TracePackage.ASSIGNMENT__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case TracePackage.ASSIGNMENT__BASE_NAME:
				setBaseName((String)newValue);
				return;
			case TracePackage.ASSIGNMENT__VALUE:
				setValue((Value)newValue);
				return;
			case TracePackage.ASSIGNMENT__ASSIGNMENT_TYPE:
				setAssignmentType((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TracePackage.ASSIGNMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case TracePackage.ASSIGNMENT__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case TracePackage.ASSIGNMENT__BASE_NAME:
				setBaseName(BASE_NAME_EDEFAULT);
				return;
			case TracePackage.ASSIGNMENT__VALUE:
				setValue((Value)null);
				return;
			case TracePackage.ASSIGNMENT__ASSIGNMENT_TYPE:
				setAssignmentType(ASSIGNMENT_TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TracePackage.ASSIGNMENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case TracePackage.ASSIGNMENT__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
			case TracePackage.ASSIGNMENT__BASE_NAME:
				return BASE_NAME_EDEFAULT == null ? baseName != null : !BASE_NAME_EDEFAULT.equals(baseName);
			case TracePackage.ASSIGNMENT__VALUE:
				return value != null;
			case TracePackage.ASSIGNMENT__ASSIGNMENT_TYPE:
				return ASSIGNMENT_TYPE_EDEFAULT == null ? assignmentType != null : !ASSIGNMENT_TYPE_EDEFAULT.equals(assignmentType);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case TracePackage.ASSIGNMENT___GET_VALUE__STRING:
				return getValue((String)arguments.get(0));
			case TracePackage.ASSIGNMENT___GET_TYPE:
				return getType();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", displayName: ");
		result.append(displayName);
		result.append(", baseName: ");
		result.append(baseName);
		result.append(", assignmentType: ");
		result.append(assignmentType);
		result.append(')');
		return result.toString();
	}

	@Override
	public StepResult interpret(Context context) {
		context.getContainingThread().getProcess().getMemory().getCells().put(getId(), this);
		FunctionExecution function = context.getFunction();
		if (function == null) {
			//We are in the presence of a global variable
			context.getContainingThread().getProcess().getMemory().getGlobalVariables().put(getBaseName(), getId());
			return createResult();
		}
		
		//We only add to the function the local variables.
		//Local variables are identified to be those whose name include the name of the function in their id.
		//This is useful to deal with pointers since CBMC produces an assignment updating the real variable being pointed at.
		//However we don't want to present this variable local to the function is the pointer, not the original variable.
		if (getId().contains(function.getFunctionName()))
			function.getLocalNameToMemory().put(getBaseName(), getId());
		
		return createResult();
	}
	
	private StepResult createResult() {
		StepResult result = ProcessFactory.eINSTANCE.createStepResult();
		result.setCode(SteppingResult.STEP_COMPLETE);
		result.setStepDone(Context.ASSIGNMENT);
		return result;
	}
} //AssignmentImpl
