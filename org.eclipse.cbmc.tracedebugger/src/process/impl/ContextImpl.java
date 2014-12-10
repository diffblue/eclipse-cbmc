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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import process.Context;
import process.FunctionExecution;
import process.ProcessPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link process.impl.ContextImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link process.impl.ContextImpl#getContainingThread <em>Containing Thread</em>}</li>
 *   <li>{@link process.impl.ContextImpl#getStepBeingExecutedIdx <em>Step Being Executed Idx</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextImpl extends MinimalEObjectImpl.Container implements Context {
	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected FunctionExecution function;

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
	 * The default value of the '{@link #getStepBeingExecutedIdx() <em>Step Being Executed Idx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepBeingExecutedIdx()
	 * @generated
	 * @ordered
	 */
	protected static final int STEP_BEING_EXECUTED_IDX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStepBeingExecutedIdx() <em>Step Being Executed Idx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepBeingExecutedIdx()
	 * @generated
	 * @ordered
	 */
	protected int stepBeingExecutedIdx = STEP_BEING_EXECUTED_IDX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessPackage.Literals.CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionExecution getFunction() {
		if (function != null && function.eIsProxy()) {
			InternalEObject oldFunction = (InternalEObject)function;
			function = (FunctionExecution)eResolveProxy(oldFunction);
			if (function != oldFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessPackage.CONTEXT__FUNCTION, oldFunction, function));
			}
		}
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionExecution basicGetFunction() {
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunction(FunctionExecution newFunction) {
		FunctionExecution oldFunction = function;
		function = newFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.CONTEXT__FUNCTION, oldFunction, function));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessPackage.CONTEXT__CONTAINING_THREAD, oldContainingThread, containingThread));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.CONTEXT__CONTAINING_THREAD, oldContainingThread, containingThread));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStepBeingExecutedIdx() {
		return stepBeingExecutedIdx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStepBeingExecutedIdx(int newStepBeingExecutedIdx) {
		int oldStepBeingExecutedIdx = stepBeingExecutedIdx;
		stepBeingExecutedIdx = newStepBeingExecutedIdx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.CONTEXT__STEP_BEING_EXECUTED_IDX, oldStepBeingExecutedIdx, stepBeingExecutedIdx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProcessPackage.CONTEXT__FUNCTION:
				if (resolve) return getFunction();
				return basicGetFunction();
			case ProcessPackage.CONTEXT__CONTAINING_THREAD:
				if (resolve) return getContainingThread();
				return basicGetContainingThread();
			case ProcessPackage.CONTEXT__STEP_BEING_EXECUTED_IDX:
				return getStepBeingExecutedIdx();
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
			case ProcessPackage.CONTEXT__FUNCTION:
				setFunction((FunctionExecution)newValue);
				return;
			case ProcessPackage.CONTEXT__CONTAINING_THREAD:
				setContainingThread((process.Thread)newValue);
				return;
			case ProcessPackage.CONTEXT__STEP_BEING_EXECUTED_IDX:
				setStepBeingExecutedIdx((Integer)newValue);
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
			case ProcessPackage.CONTEXT__FUNCTION:
				setFunction((FunctionExecution)null);
				return;
			case ProcessPackage.CONTEXT__CONTAINING_THREAD:
				setContainingThread((process.Thread)null);
				return;
			case ProcessPackage.CONTEXT__STEP_BEING_EXECUTED_IDX:
				setStepBeingExecutedIdx(STEP_BEING_EXECUTED_IDX_EDEFAULT);
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
			case ProcessPackage.CONTEXT__FUNCTION:
				return function != null;
			case ProcessPackage.CONTEXT__CONTAINING_THREAD:
				return containingThread != null;
			case ProcessPackage.CONTEXT__STEP_BEING_EXECUTED_IDX:
				return stepBeingExecutedIdx != STEP_BEING_EXECUTED_IDX_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (stepBeingExecutedIdx: ");
		result.append(stepBeingExecutedIdx);
		result.append(')');
		return result.toString();
	}

} //ContextImpl
