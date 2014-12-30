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
package process.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

import process.FunctionExecution;
import process.ProcessPackage;
import trace.Assignment;
import trace.FunctionCall;
import trace.Step;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Execution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link process.impl.FunctionExecutionImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link process.impl.FunctionExecutionImpl#getChild <em>Child</em>}</li>
 *   <li>{@link process.impl.FunctionExecutionImpl#getEntryStep <em>Entry Step</em>}</li>
 *   <li>{@link process.impl.FunctionExecutionImpl#getContainingThread <em>Containing Thread</em>}</li>
 *   <li>{@link process.impl.FunctionExecutionImpl#getStepIndexBeforeChild <em>Step Index Before Child</em>}</li>
 *   <li>{@link process.impl.FunctionExecutionImpl#getLocalNameToMemory <em>Local Name To Memory</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionExecutionImpl extends MinimalEObjectImpl.Container implements FunctionExecution {
	private static final String NOT_A_FUNCTION = "BOOTSTRAP";

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected FunctionExecution parent;

	/**
	 * The cached value of the '{@link #getChild() <em>Child</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChild()
	 * @generated
	 * @ordered
	 */
	protected FunctionExecution child;

	/**
	 * The cached value of the '{@link #getEntryStep() <em>Entry Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryStep()
	 * @generated
	 * @ordered
	 */
	protected FunctionCall entryStep;

	/**
	 * The cached value of the '{@link #getContainingThread() <em>Containing Thread</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainingThread()
	 * @generated
	 * @ordered
	 */
	protected process.Thread containingThread;

	/**
	 * The default value of the '{@link #getStepIndexBeforeChild() <em>Step Index Before Child</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepIndexBeforeChild()
	 * @generated
	 * @ordered
	 */
	public static final int STEP_INDEX_BEFORE_CHILD_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getStepIndexBeforeChild() <em>Step Index Before Child</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepIndexBeforeChild()
	 * @generated
	 * @ordered
	 */
	protected int stepIndexBeforeChild = STEP_INDEX_BEFORE_CHILD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLocalNameToMemory() <em>Local Name To Memory</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalNameToMemory()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> localNameToMemory;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionExecutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessPackage.Literals.FUNCTION_EXECUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionExecution getChild() {
		if (child != null && child.eIsProxy()) {
			InternalEObject oldChild = (InternalEObject)child;
			child = (FunctionExecution)eResolveProxy(oldChild);
			if (child != oldChild) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessPackage.FUNCTION_EXECUTION__CHILD, oldChild, child));
			}
		}
		return child;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionExecution basicGetChild() {
		return child;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChild(FunctionExecution newChild, NotificationChain msgs) {
		FunctionExecution oldChild = child;
		child = newChild;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessPackage.FUNCTION_EXECUTION__CHILD, oldChild, newChild);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChild(FunctionExecution newChild) {
		if (newChild != child) {
			NotificationChain msgs = null;
			if (child != null)
				msgs = ((InternalEObject)child).eInverseRemove(this, ProcessPackage.FUNCTION_EXECUTION__PARENT, FunctionExecution.class, msgs);
			if (newChild != null)
				msgs = ((InternalEObject)newChild).eInverseAdd(this, ProcessPackage.FUNCTION_EXECUTION__PARENT, FunctionExecution.class, msgs);
			msgs = basicSetChild(newChild, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.FUNCTION_EXECUTION__CHILD, newChild, newChild));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionExecution getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (FunctionExecution)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessPackage.FUNCTION_EXECUTION__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionExecution basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(FunctionExecution newParent, NotificationChain msgs) {
		FunctionExecution oldParent = parent;
		parent = newParent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessPackage.FUNCTION_EXECUTION__PARENT, oldParent, newParent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(FunctionExecution newParent) {
		if (newParent != parent) {
			NotificationChain msgs = null;
			if (parent != null)
				msgs = ((InternalEObject)parent).eInverseRemove(this, ProcessPackage.FUNCTION_EXECUTION__CHILD, FunctionExecution.class, msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, ProcessPackage.FUNCTION_EXECUTION__CHILD, FunctionExecution.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.FUNCTION_EXECUTION__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStepIndexBeforeChild() {
		return stepIndexBeforeChild;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStepIndexBeforeChild(int newStepIndexBeforeChild) {
		int oldStepIndexBeforeChild = stepIndexBeforeChild;
		stepIndexBeforeChild = newStepIndexBeforeChild;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.FUNCTION_EXECUTION__STEP_INDEX_BEFORE_CHILD, oldStepIndexBeforeChild, stepIndexBeforeChild));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getLocalNameToMemory() {
		if (localNameToMemory == null) {
			localNameToMemory = new EcoreEMap<String,String>(ProcessPackage.Literals.STRING_TO_STRING_ENTRY, StringToStringEntryImpl.class, this, ProcessPackage.FUNCTION_EXECUTION__LOCAL_NAME_TO_MEMORY);
		}
		return localNameToMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Step getCurrentStep() {
		if (stepIndexBeforeChild == STEP_INDEX_BEFORE_CHILD_EDEFAULT)	{
			return getContainingThread().getStepToExecuteOrLastOne();
		} else 
			return getContainingThread().getAllSteps().get(stepIndexBeforeChild);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Assignment> getAllVariables() {
		EList<Assignment> result = new BasicEList<Assignment>();
		
		Collection<String> assignmentIds = getLocalNameToMemory().values();
		for (String id : assignmentIds) {
			result.add(getContainingThread().getProcess().getMemory().getCells().get(id));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Assignment getVariable(String name) {
		String memoryId = getLocalNameToMemory().get(name);
		if (memoryId == null) {
			memoryId = containingThread.getProcess().getMemory().getGlobalVariables().get(name);
		}
		if (memoryId == null)
			throw new RuntimeException("Requested variable name does not exist");
		
		return containingThread.getProcess().getMemory().getCells().get(memoryId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getFileName() {
		return getEntryStep().getLocation().getFile();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getFunctionName() {
		if (getEntryStep() == null)
			return NOT_A_FUNCTION;
		return getEntryStep().getDisplayName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcessPackage.FUNCTION_EXECUTION__PARENT:
				if (parent != null)
					msgs = ((InternalEObject)parent).eInverseRemove(this, ProcessPackage.FUNCTION_EXECUTION__CHILD, FunctionExecution.class, msgs);
				return basicSetParent((FunctionExecution)otherEnd, msgs);
			case ProcessPackage.FUNCTION_EXECUTION__CHILD:
				if (child != null)
					msgs = ((InternalEObject)child).eInverseRemove(this, ProcessPackage.FUNCTION_EXECUTION__PARENT, FunctionExecution.class, msgs);
				return basicSetChild((FunctionExecution)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcessPackage.FUNCTION_EXECUTION__PARENT:
				return basicSetParent(null, msgs);
			case ProcessPackage.FUNCTION_EXECUTION__CHILD:
				return basicSetChild(null, msgs);
			case ProcessPackage.FUNCTION_EXECUTION__LOCAL_NAME_TO_MEMORY:
				return ((InternalEList<?>)getLocalNameToMemory()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionCall getEntryStep() {
		if (entryStep != null && entryStep.eIsProxy()) {
			InternalEObject oldEntryStep = (InternalEObject)entryStep;
			entryStep = (FunctionCall)eResolveProxy(oldEntryStep);
			if (entryStep != oldEntryStep) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessPackage.FUNCTION_EXECUTION__ENTRY_STEP, oldEntryStep, entryStep));
			}
		}
		return entryStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionCall basicGetEntryStep() {
		return entryStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryStep(FunctionCall newEntryStep) {
		FunctionCall oldEntryStep = entryStep;
		entryStep = newEntryStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.FUNCTION_EXECUTION__ENTRY_STEP, oldEntryStep, entryStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public process.Thread getContainingThread() {
		if (containingThread != null && containingThread.eIsProxy()) {
			InternalEObject oldContainingThread = (InternalEObject)containingThread;
			containingThread = (process.Thread)eResolveProxy(oldContainingThread);
			if (containingThread != oldContainingThread) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessPackage.FUNCTION_EXECUTION__CONTAINING_THREAD, oldContainingThread, containingThread));
			}
		}
		return containingThread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public process.Thread basicGetContainingThread() {
		return containingThread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainingThread(process.Thread newContainingThread) {
		process.Thread oldContainingThread = containingThread;
		containingThread = newContainingThread;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.FUNCTION_EXECUTION__CONTAINING_THREAD, oldContainingThread, containingThread));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProcessPackage.FUNCTION_EXECUTION__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case ProcessPackage.FUNCTION_EXECUTION__CHILD:
				if (resolve) return getChild();
				return basicGetChild();
			case ProcessPackage.FUNCTION_EXECUTION__ENTRY_STEP:
				if (resolve) return getEntryStep();
				return basicGetEntryStep();
			case ProcessPackage.FUNCTION_EXECUTION__CONTAINING_THREAD:
				if (resolve) return getContainingThread();
				return basicGetContainingThread();
			case ProcessPackage.FUNCTION_EXECUTION__STEP_INDEX_BEFORE_CHILD:
				return getStepIndexBeforeChild();
			case ProcessPackage.FUNCTION_EXECUTION__LOCAL_NAME_TO_MEMORY:
				if (coreType) return getLocalNameToMemory();
				else return getLocalNameToMemory().map();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProcessPackage.FUNCTION_EXECUTION__PARENT:
				setParent((FunctionExecution)newValue);
				return;
			case ProcessPackage.FUNCTION_EXECUTION__CHILD:
				setChild((FunctionExecution)newValue);
				return;
			case ProcessPackage.FUNCTION_EXECUTION__ENTRY_STEP:
				setEntryStep((FunctionCall)newValue);
				return;
			case ProcessPackage.FUNCTION_EXECUTION__CONTAINING_THREAD:
				setContainingThread((process.Thread)newValue);
				return;
			case ProcessPackage.FUNCTION_EXECUTION__STEP_INDEX_BEFORE_CHILD:
				setStepIndexBeforeChild((Integer)newValue);
				return;
			case ProcessPackage.FUNCTION_EXECUTION__LOCAL_NAME_TO_MEMORY:
				((EStructuralFeature.Setting)getLocalNameToMemory()).set(newValue);
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
			case ProcessPackage.FUNCTION_EXECUTION__PARENT:
				setParent((FunctionExecution)null);
				return;
			case ProcessPackage.FUNCTION_EXECUTION__CHILD:
				setChild((FunctionExecution)null);
				return;
			case ProcessPackage.FUNCTION_EXECUTION__ENTRY_STEP:
				setEntryStep((FunctionCall)null);
				return;
			case ProcessPackage.FUNCTION_EXECUTION__CONTAINING_THREAD:
				setContainingThread((process.Thread)null);
				return;
			case ProcessPackage.FUNCTION_EXECUTION__STEP_INDEX_BEFORE_CHILD:
				setStepIndexBeforeChild(STEP_INDEX_BEFORE_CHILD_EDEFAULT);
				return;
			case ProcessPackage.FUNCTION_EXECUTION__LOCAL_NAME_TO_MEMORY:
				getLocalNameToMemory().clear();
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
			case ProcessPackage.FUNCTION_EXECUTION__PARENT:
				return parent != null;
			case ProcessPackage.FUNCTION_EXECUTION__CHILD:
				return child != null;
			case ProcessPackage.FUNCTION_EXECUTION__ENTRY_STEP:
				return entryStep != null;
			case ProcessPackage.FUNCTION_EXECUTION__CONTAINING_THREAD:
				return containingThread != null;
			case ProcessPackage.FUNCTION_EXECUTION__STEP_INDEX_BEFORE_CHILD:
				return stepIndexBeforeChild != STEP_INDEX_BEFORE_CHILD_EDEFAULT;
			case ProcessPackage.FUNCTION_EXECUTION__LOCAL_NAME_TO_MEMORY:
				return localNameToMemory != null && !localNameToMemory.isEmpty();
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
			case ProcessPackage.FUNCTION_EXECUTION___GET_VARIABLE__STRING:
				return getVariable((String)arguments.get(0));
			case ProcessPackage.FUNCTION_EXECUTION___GET_FUNCTION_NAME:
				return getFunctionName();
			case ProcessPackage.FUNCTION_EXECUTION___GET_FILE_NAME:
				return getFileName();
			case ProcessPackage.FUNCTION_EXECUTION___GET_CURRENT_STEP:
				return getCurrentStep();
			case ProcessPackage.FUNCTION_EXECUTION___GET_ALL_VARIABLES:
				return getAllVariables();
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
		result.append(" (stepIndexBeforeChild: ");
		result.append(stepIndexBeforeChild);
		result.append(')');
		return result.toString();
	}
} //FunctionExecutionImpl
