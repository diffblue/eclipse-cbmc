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
import java.util.Iterator;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import process.BreakpointManager;
import process.Memory;
import process.ProcessFactory;
import process.ProcessPackage;
import process.StepGoal;
import process.StepResult;
import process.VariableManager;
import process.Thread;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link process.impl.ProcessImpl#getThreads <em>Threads</em>}</li>
 *   <li>{@link process.impl.ProcessImpl#isStarted <em>Started</em>}</li>
 *   <li>{@link process.impl.ProcessImpl#getGroupThreadId <em>Group Thread Id</em>}</li>
 *   <li>{@link process.impl.ProcessImpl#getProcessNumber <em>Process Number</em>}</li>
 *   <li>{@link process.impl.ProcessImpl#getActiveThreads <em>Active Threads</em>}</li>
 *   <li>{@link process.impl.ProcessImpl#getVariableManager <em>Variable Manager</em>}</li>
 *   <li>{@link process.impl.ProcessImpl#getBreakpointManager <em>Breakpoint Manager</em>}</li>
 *   <li>{@link process.impl.ProcessImpl#getExecutableName <em>Executable Name</em>}</li>
 *   <li>{@link process.impl.ProcessImpl#getMemory <em>Memory</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessImpl extends MinimalEObjectImpl.Container implements process.Process {
	/**
	 * The cached value of the '{@link #getThreads() <em>Threads</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreads()
	 * @generated
	 * @ordered
	 */
	protected EList<process.Thread> threads;

	/**
	 * The default value of the '{@link #isStarted() <em>Started</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStarted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STARTED_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isStarted() <em>Started</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStarted()
	 * @generated
	 * @ordered
	 */
	protected boolean started = STARTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getGroupThreadId() <em>Group Thread Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupThreadId()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_THREAD_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupThreadId() <em>Group Thread Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupThreadId()
	 * @generated
	 * @ordered
	 */
	protected String groupThreadId = GROUP_THREAD_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProcessNumber() <em>Process Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String PROCESS_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProcessNumber() <em>Process Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessNumber()
	 * @generated
	 * @ordered
	 */
	protected String processNumber = PROCESS_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActiveThreads() <em>Active Threads</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveThreads()
	 * @generated
	 * @ordered
	 */
	protected EList<process.Thread> activeThreads;

	/**
	 * The cached value of the '{@link #getVariableManager() <em>Variable Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableManager()
	 * @generated
	 * @ordered
	 */
	protected VariableManager variableManager;

	/**
	 * The cached value of the '{@link #getBreakpointManager() <em>Breakpoint Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreakpointManager()
	 * @generated
	 * @ordered
	 */
	protected BreakpointManager breakpointManager;

	/**
	 * The default value of the '{@link #getExecutableName() <em>Executable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutableName()
	 * @generated
	 * @ordered
	 */
	protected static final String EXECUTABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExecutableName() <em>Executable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutableName()
	 * @generated
	 * @ordered
	 */
	protected String executableName = EXECUTABLE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMemory() <em>Memory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory()
	 * @generated
	 * @ordered
	 */
	protected Memory memory;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected ProcessImpl() {
		super();
		setMemory(ProcessFactory.eINSTANCE.createMemory());
		setVariableManager(ProcessFactory.eINSTANCE.createVariableManager());
		setBreakpointManager(ProcessFactory.eINSTANCE.createBreakpointManager());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessPackage.Literals.PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<process.Thread> getThreads() {
		if (threads == null) {
			threads = new EObjectContainmentWithInverseEList<process.Thread>(process.Thread.class, this, ProcessPackage.PROCESS__THREADS, ProcessPackage.THREAD__PROCESS);
		}
		return threads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStarted() {
		return started;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStarted(boolean newStarted) {
		boolean oldStarted = started;
		started = newStarted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.PROCESS__STARTED, oldStarted, started));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupThreadId() {
		return groupThreadId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupThreadId(String newGroupThreadId) {
		String oldGroupThreadId = groupThreadId;
		groupThreadId = newGroupThreadId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.PROCESS__GROUP_THREAD_ID, oldGroupThreadId, groupThreadId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProcessNumber() {
		return processNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessNumber(String newProcessNumber) {
		String oldProcessNumber = processNumber;
		processNumber = newProcessNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.PROCESS__PROCESS_NUMBER, oldProcessNumber, processNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<process.Thread> getActiveThreads() {
		if (activeThreads == null) {
			activeThreads = new EObjectResolvingEList<process.Thread>(process.Thread.class, this, ProcessPackage.PROCESS__ACTIVE_THREADS);
		}
		return activeThreads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableManager getVariableManager() {
		if (variableManager != null && variableManager.eIsProxy()) {
			InternalEObject oldVariableManager = (InternalEObject)variableManager;
			variableManager = (VariableManager)eResolveProxy(oldVariableManager);
			if (variableManager != oldVariableManager) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessPackage.PROCESS__VARIABLE_MANAGER, oldVariableManager, variableManager));
			}
		}
		return variableManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableManager basicGetVariableManager() {
		return variableManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableManager(VariableManager newVariableManager) {
		VariableManager oldVariableManager = variableManager;
		variableManager = newVariableManager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.PROCESS__VARIABLE_MANAGER, oldVariableManager, variableManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreakpointManager getBreakpointManager() {
		if (breakpointManager != null && breakpointManager.eIsProxy()) {
			InternalEObject oldBreakpointManager = (InternalEObject)breakpointManager;
			breakpointManager = (BreakpointManager)eResolveProxy(oldBreakpointManager);
			if (breakpointManager != oldBreakpointManager) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessPackage.PROCESS__BREAKPOINT_MANAGER, oldBreakpointManager, breakpointManager));
			}
		}
		return breakpointManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreakpointManager basicGetBreakpointManager() {
		return breakpointManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBreakpointManager(BreakpointManager newBreakpointManager) {
		BreakpointManager oldBreakpointManager = breakpointManager;
		breakpointManager = newBreakpointManager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.PROCESS__BREAKPOINT_MANAGER, oldBreakpointManager, breakpointManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExecutableName() {
		return executableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutableName(String newExecutableName) {
		String oldExecutableName = executableName;
		executableName = newExecutableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.PROCESS__EXECUTABLE_NAME, oldExecutableName, executableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Memory getMemory() {
		if (memory != null && memory.eIsProxy()) {
			InternalEObject oldMemory = (InternalEObject)memory;
			memory = (Memory)eResolveProxy(oldMemory);
			if (memory != oldMemory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessPackage.PROCESS__MEMORY, oldMemory, memory));
			}
		}
		return memory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Memory basicGetMemory() {
		return memory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemory(Memory newMemory) {
		Memory oldMemory = memory;
		memory = newMemory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.PROCESS__MEMORY, oldMemory, memory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public StepResult start() {
		//Init variables
		processNumber = "123";
		started = true;
		
		//Start first thread
		Thread threadToStart = getThreads().get(0);
		StepResult result = threadToStart.step(StepGoal.FUNCTION_ENTER);
		getActiveThreads().add(threadToStart);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public process.Thread getThread(int threadId) {
		for (Iterator<Thread> iterator = activeThreads.iterator(); iterator.hasNext();) {
			Thread candidate = iterator.next();
			if(candidate.getId() == threadId)
				return candidate;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcessPackage.PROCESS__THREADS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getThreads()).basicAdd(otherEnd, msgs);
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
			case ProcessPackage.PROCESS__THREADS:
				return ((InternalEList<?>)getThreads()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProcessPackage.PROCESS__THREADS:
				return getThreads();
			case ProcessPackage.PROCESS__STARTED:
				return isStarted();
			case ProcessPackage.PROCESS__GROUP_THREAD_ID:
				return getGroupThreadId();
			case ProcessPackage.PROCESS__PROCESS_NUMBER:
				return getProcessNumber();
			case ProcessPackage.PROCESS__ACTIVE_THREADS:
				return getActiveThreads();
			case ProcessPackage.PROCESS__VARIABLE_MANAGER:
				if (resolve) return getVariableManager();
				return basicGetVariableManager();
			case ProcessPackage.PROCESS__BREAKPOINT_MANAGER:
				if (resolve) return getBreakpointManager();
				return basicGetBreakpointManager();
			case ProcessPackage.PROCESS__EXECUTABLE_NAME:
				return getExecutableName();
			case ProcessPackage.PROCESS__MEMORY:
				if (resolve) return getMemory();
				return basicGetMemory();
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
			case ProcessPackage.PROCESS__THREADS:
				getThreads().clear();
				getThreads().addAll((Collection<? extends process.Thread>)newValue);
				return;
			case ProcessPackage.PROCESS__STARTED:
				setStarted((Boolean)newValue);
				return;
			case ProcessPackage.PROCESS__GROUP_THREAD_ID:
				setGroupThreadId((String)newValue);
				return;
			case ProcessPackage.PROCESS__PROCESS_NUMBER:
				setProcessNumber((String)newValue);
				return;
			case ProcessPackage.PROCESS__ACTIVE_THREADS:
				getActiveThreads().clear();
				getActiveThreads().addAll((Collection<? extends process.Thread>)newValue);
				return;
			case ProcessPackage.PROCESS__VARIABLE_MANAGER:
				setVariableManager((VariableManager)newValue);
				return;
			case ProcessPackage.PROCESS__BREAKPOINT_MANAGER:
				setBreakpointManager((BreakpointManager)newValue);
				return;
			case ProcessPackage.PROCESS__EXECUTABLE_NAME:
				setExecutableName((String)newValue);
				return;
			case ProcessPackage.PROCESS__MEMORY:
				setMemory((Memory)newValue);
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
			case ProcessPackage.PROCESS__THREADS:
				getThreads().clear();
				return;
			case ProcessPackage.PROCESS__STARTED:
				setStarted(STARTED_EDEFAULT);
				return;
			case ProcessPackage.PROCESS__GROUP_THREAD_ID:
				setGroupThreadId(GROUP_THREAD_ID_EDEFAULT);
				return;
			case ProcessPackage.PROCESS__PROCESS_NUMBER:
				setProcessNumber(PROCESS_NUMBER_EDEFAULT);
				return;
			case ProcessPackage.PROCESS__ACTIVE_THREADS:
				getActiveThreads().clear();
				return;
			case ProcessPackage.PROCESS__VARIABLE_MANAGER:
				setVariableManager((VariableManager)null);
				return;
			case ProcessPackage.PROCESS__BREAKPOINT_MANAGER:
				setBreakpointManager((BreakpointManager)null);
				return;
			case ProcessPackage.PROCESS__EXECUTABLE_NAME:
				setExecutableName(EXECUTABLE_NAME_EDEFAULT);
				return;
			case ProcessPackage.PROCESS__MEMORY:
				setMemory((Memory)null);
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
			case ProcessPackage.PROCESS__THREADS:
				return threads != null && !threads.isEmpty();
			case ProcessPackage.PROCESS__STARTED:
				return started != STARTED_EDEFAULT;
			case ProcessPackage.PROCESS__GROUP_THREAD_ID:
				return GROUP_THREAD_ID_EDEFAULT == null ? groupThreadId != null : !GROUP_THREAD_ID_EDEFAULT.equals(groupThreadId);
			case ProcessPackage.PROCESS__PROCESS_NUMBER:
				return PROCESS_NUMBER_EDEFAULT == null ? processNumber != null : !PROCESS_NUMBER_EDEFAULT.equals(processNumber);
			case ProcessPackage.PROCESS__ACTIVE_THREADS:
				return activeThreads != null && !activeThreads.isEmpty();
			case ProcessPackage.PROCESS__VARIABLE_MANAGER:
				return variableManager != null;
			case ProcessPackage.PROCESS__BREAKPOINT_MANAGER:
				return breakpointManager != null;
			case ProcessPackage.PROCESS__EXECUTABLE_NAME:
				return EXECUTABLE_NAME_EDEFAULT == null ? executableName != null : !EXECUTABLE_NAME_EDEFAULT.equals(executableName);
			case ProcessPackage.PROCESS__MEMORY:
				return memory != null;
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
			case ProcessPackage.PROCESS___START:
				return start();
			case ProcessPackage.PROCESS___GET_THREAD__INT:
				return getThread((Integer)arguments.get(0));
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
		result.append(" (started: ");
		result.append(started);
		result.append(", groupThreadId: ");
		result.append(groupThreadId);
		result.append(", processNumber: ");
		result.append(processNumber);
		result.append(", executableName: ");
		result.append(executableName);
		result.append(')');
		return result.toString();
	}

} //ProcessImpl
