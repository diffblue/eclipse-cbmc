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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import process.Breakpoint;
import process.Context;
import process.FunctionExecution;
import process.ProcessFactory;
import process.ProcessPackage;
import process.StepGoal;
import process.StepResult;
import process.SteppingResult;
import trace.Assignment;
import trace.Location;
import trace.Step;
import trace.TracePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Thread</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link process.impl.ThreadImpl#getId <em>Id</em>}</li>
 *   <li>{@link process.impl.ThreadImpl#getAllSteps <em>All Steps</em>}</li>
 *   <li>{@link process.impl.ThreadImpl#isStarted <em>Started</em>}</li>
 *   <li>{@link process.impl.ThreadImpl#getStack <em>Stack</em>}</li>
 *   <li>{@link process.impl.ThreadImpl#isRunning <em>Running</em>}</li>
 *   <li>{@link process.impl.ThreadImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link process.impl.ThreadImpl#getStepToExecuteIdx <em>Step To Execute Idx</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ThreadImpl extends MinimalEObjectImpl.Container implements process.Thread {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAllSteps() <em>All Steps</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getAllSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> allSteps;

	/**
	 * The default value of the '{@link #isStarted() <em>Started</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isStarted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STARTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStarted() <em>Started</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isStarted()
	 * @generated
	 * @ordered
	 */
	protected boolean started = STARTED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStack() <em>Stack</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getStack()
	 * @generated
	 * @ordered
	 */
	protected FunctionExecution stack;

	/**
	 * The default value of the '{@link #isRunning() <em>Running</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isRunning()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RUNNING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRunning() <em>Running</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isRunning()
	 * @generated
	 * @ordered
	 */
	protected boolean running = RUNNING_EDEFAULT;

	/**
	 * The default value of the '{@link #getStepToExecuteIdx() <em>Step To Execute Idx</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getStepToExecuteIdx()
	 * @generated
	 * @ordered
	 */
	protected static final int STEP_TO_EXECUTE_IDX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStepToExecuteIdx() <em>Step To Execute Idx</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getStepToExecuteIdx()
	 * @generated
	 * @ordered
	 */
	protected int stepToExecuteIdx = STEP_TO_EXECUTE_IDX_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ThreadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessPackage.Literals.THREAD;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.THREAD__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Step> getAllSteps() {
		if (allSteps == null) {
			allSteps = new EObjectResolvingEList<Step>(Step.class, this, ProcessPackage.THREAD__ALL_STEPS);
		}
		return allSteps;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStarted() {
		return started;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setStarted(boolean newStarted) {
		boolean oldStarted = started;
		started = newStarted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.THREAD__STARTED, oldStarted, started));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionExecution getStack() {
		if (stack != null && stack.eIsProxy()) {
			InternalEObject oldStack = (InternalEObject)stack;
			stack = (FunctionExecution)eResolveProxy(oldStack);
			if (stack != oldStack) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessPackage.THREAD__STACK, oldStack, stack));
			}
		}
		return stack;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionExecution basicGetStack() {
		return stack;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setStack(FunctionExecution newStack) {
		FunctionExecution oldStack = stack;
		stack = newStack;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.THREAD__STACK, oldStack, stack));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRunning() {
		return running;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunning(boolean newRunning) {
		boolean oldRunning = running;
		running = newRunning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.THREAD__RUNNING, oldRunning, running));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public process.Process getProcess() {
		if (eContainerFeatureID() != ProcessPackage.THREAD__PROCESS) return null;
		return (process.Process)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcess(process.Process newProcess, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProcess, ProcessPackage.THREAD__PROCESS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcess(process.Process newProcess) {
		if (newProcess != eInternalContainer() || (eContainerFeatureID() != ProcessPackage.THREAD__PROCESS && newProcess != null)) {
			if (EcoreUtil.isAncestor(this, newProcess))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProcess != null)
				msgs = ((InternalEObject)newProcess).eInverseAdd(this, ProcessPackage.PROCESS__THREADS, process.Process.class, msgs);
			msgs = basicSetProcess(newProcess, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.THREAD__PROCESS, newProcess, newProcess));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getStepToExecuteIdx() {
		return stepToExecuteIdx;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setStepToExecuteIdx(int newStepToExecuteIdx) {
		int oldStepToExecuteIdx = stepToExecuteIdx;
		stepToExecuteIdx = newStepToExecuteIdx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.THREAD__STEP_TO_EXECUTE_IDX, oldStepToExecuteIdx, stepToExecuteIdx));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public StepResult step(StepGoal goal) {
		if (!started) {
			initialize();
			goToFirstFunctionCall();
		}

		rememberLocation();
		return step(goal, true);
	}

	private void rememberLocation() {
		Step step = getStepToExecute();
		if (step != null)
			location = step.getLocation();
	}

	private Location location;

	private void goToFirstFunctionCall() {
		while (stepToExecuteIdx < allSteps.size()) {
			Step stepToExecute = getStepToExecute();
			if (stepToExecute.eClass().getClassifierID() == TracePackage.FUNCTION_CALL) {
				return;
			}
			if (stepToExecute.eClass().getClassifierID() == TracePackage.ASSIGNMENT) {
				executeNextInstruction();
				continue; //We short cut w/o incrementing because the executeNextInstruction increment the stepToExecuteIdx already
			}
			stepToExecuteIdx++;
		}
	}

	private StepResult getNothingDoneStep() {
		StepResult result = ProcessFactory.eINSTANCE.createStepResult();
		result.setCode(SteppingResult.STEP_COMPLETE);
		result.setStepDone(0);
		return result;
	}

	// only consume the steps that represent parameters assignment
	// these are identified by having as a location the file and function of the
	// calling site.
	// e.g. when foo() is invoked from main(), the assignments for the
	// parameters of foo have main as a location.
	private StepResult consumeParameters() {
		StepResult lastResult = null;
		while (stepToExecuteIdx < allSteps.size()) {
			Step stepToExecute = getStepToExecute();
			if ((stepToExecute.eClass().getClassifierID() == TracePackage.ASSIGNMENT) && 
					((Assignment)stepToExecute).getAssignmentType().equals("actual_parameter")) {
				lastResult = executeNextInstruction();
			} else {
				return lastResult != null ? lastResult : getNothingDoneStep();
			}
		}
		return createEndOfTraceResult();
	}

	private StepResult createEndOfTraceResult() {
		StepResult result = ProcessFactory.eINSTANCE.createStepResult();
		result.setCode(SteppingResult.STEP_COMPLETE);
		return result;
	}

	private StepResult createBreakpointResult(Breakpoint bkpt) {
		StepResult result = ProcessFactory.eINSTANCE.createStepResult();
		result.setCode(SteppingResult.BREAKPOINT_HIT);
		result.setBreakpoint(bkpt);
		return result;
	}

	private Breakpoint isOnBreakpoint() {
		return getProcess().getBreakpointManager().hasBreakpoint(getStack(), getStepToExecute());
	}

	private boolean reachedNextLine(StepResult result) {
		Step nextStep = getStepToExecute();
		if (nextStep == null)
			return true;

		if ((result.getStepDone() == Context.LOCATION_ONLY) && (nextStep.eClass().getClassifierID() == TracePackage.FUNCTION_CALL))
			return false;
		
		Location nextLocation = nextStep.getLocation();
		if (onDifferentLine(nextLocation, location))
			return true;

		if ((result.getStepDone() & Context.FUNCTION_RETURN) == Context.FUNCTION_RETURN) {
			// Simple case
			if (nextLocation.getFile().equals(location.getFile()) && nextLocation.getFunction().equals(location.getFunction()) && nextLocation.getLine() != location.getLine())
				return true;

			// I exited a function but it is only relevant to stop if the
			// function I'm returning to (what is now on the stack)
			// is the function I started from. This handles the case where
			// stepping will execute other functions.
			FunctionExecution parent = getStack();
			if (parent == null)
				return true;
			if (location.getFile().equals(parent.getFileName()) && location.getFunction().equals(parent.getFunctionName()) && nextLocation.getLine() != location.getLine())
				return true;

			// If I just exited from the function from which I started stepping
			if (sameFileAndFunction(result.getLineExecuted(), location))
				return true;
		}
		return false;
	}

	private boolean sameFileAndFunction(Location location1, Location location2) {
		if (location1 == location2)
			return true;
		if (location1 == null || location2 == null)
			return false;
		return location1.getFile().equals(location2.getFile()) && location1.getFunction().equals(location2.getFunction());
	}

	private boolean onDifferentLine(Location location1, Location location2) {
		if (location1.getFile().equals(location2.getFile()) && location1.getFunction().equals(location2.getFunction())
				&& location1.getLine() != location2.getLine())
			return true;
		return false;
	}

	// Execute steps until the goal is reached or a breakpoint is hit.
	// stepToExecuteIdx points at the step TO execute
	//
	private StepResult step(StepGoal goal, boolean breakpoint) {
		while (true) {
			if (stepToExecuteIdx >= allSteps.size()) {
				return createEndOfTraceResult();
			}

			// Execute the next instruction
			StepResult stepResult = executeNextInstruction();

			// Check breakpoint before doing anything else.
			Breakpoint bkpt = breakpoint ? isOnBreakpoint() : null;

			// Consume additional steps from the function call.
			if (stepResult.getStepDone() == Context.FUNCTION_CALL) {
				consumeParameters();
				if (bkpt == null)
					bkpt = breakpoint ? isOnBreakpoint() : null;
			}
			
			if (StepGoal.ENTER_OR_NEXT_LINE == goal && stepResult.getStepDone() == Context.ASSIGNMENT) {
				if (stepToExecuteIdx < allSteps.size()) {
					if (getStepToExecute().eClass().getClassifierID() == TracePackage.FUNCTION_CALL)
						continue;
				}
			}

			// Now return the breakpoint
			if (bkpt != null)
				return createBreakpointResult(bkpt);

			if (reachedNextLine(stepResult)) {
				stepResult.setStepDone(stepResult.getStepDone() | Context.NEXT_LINE);
			}

			if (!exitedExpectedFunction(stepResult)) {
				stepResult.setStepDone(stepResult.getStepDone() & ~Context.FUNCTION_RETURN);
			}

			if (goalReached(goal, stepResult)) {
				StepResult result = ProcessFactory.eINSTANCE.createStepResult();
				result.setCode(SteppingResult.STEP_COMPLETE);
				result.setStepDone(stepResult.getStepDone());
				return result;
			}
		}
	}

	public boolean goalReached(StepGoal goal, StepResult stepResult) {
		//For continue, we expect to be have returned from the regular flow because of a breakpoint
		if (goal.equals(StepGoal.CONTINUE))
			return false;
		
		if ((goal.equals(StepGoal.FUNCTION_ENTER) || goal.equals(StepGoal.ENTER_OR_NEXT_LINE)) && isEnabled(stepResult,Context.FUNCTION_CALL))
			return true;
		if (goal.equals(StepGoal.FUNCTION_EXIT) && isEnabled(stepResult,Context.FUNCTION_RETURN))
			return true;
		if ((goal.equals(StepGoal.NEXT_LINE) || goal.equals(StepGoal.ENTER_OR_NEXT_LINE)) && isEnabled(stepResult,Context.NEXT_LINE))
			return true;
		
		return false;
	}

	private boolean isEnabled(StepResult stepResult, int goal) {
		return (stepResult.getStepDone() & goal) == goal;
	}
	
	private boolean exitedExpectedFunction(StepResult stepResult) {
		if ((stepResult.getStepDone() & Context.FUNCTION_RETURN) != Context.FUNCTION_RETURN)
			return false;
		return sameFileAndFunction(location, stepResult.getLineExecuted());
	}

	private Step getLastStep() {
		return allSteps.get(allSteps.size() - 1);
	}

	public Step getStepToExecuteOrLastOne() {
		Step result = getStepToExecute();
		if (result == null)
			result = getLastStep();
		return result;
	}

	private Step getStepToExecute() {
		if (stepToExecuteIdx >= allSteps.size())
			return null;
		return allSteps.get(stepToExecuteIdx);
	}

	// Execute the next step and return the result produced by the execution of
	// the step
	// Bound check on the step is expected to have been done by the caller
	private StepResult executeNextInstruction() {
		Step stepToExecute = getStepToExecute();
		StepResult stepResult = stepToExecute.interpret(createContext(stepToExecuteIdx));
		stepResult.setLineExecuted(stepToExecute.getLocation());
		stepToExecuteIdx++;
		return stepResult;
	}

	private Context createContext(int stepBeingExecuted) {
		Context result = ProcessFactory.eINSTANCE.createContext();
		result.setFunction(stack);
		result.setContainingThread(this);
		result.setStepBeingExecutedIdx(stepBeingExecuted);
		return result;
	}

	private void initialize() {
		stepToExecuteIdx = 0;
		started = true;
		initStack();
		running = false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public int getStackDepth() {
		FunctionExecution current = getStack();
		int count = 1;
		while (current.getParent() != null) {
			current = current.getParent();
			count++;
		}
		return count;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public FunctionExecution getFrame(int depth) {
		return getFrame(stack, depth);
	}

	private FunctionExecution getFrame(FunctionExecution f, int depth) {
		if (depth == 0)
			return f;
		if (f.getParent() != null)
			return getFrame(f.getParent(), depth - 1);
		else
			throw new RuntimeException("requested depth too deep");
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcessPackage.THREAD__PROCESS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProcess((process.Process)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcessPackage.THREAD__PROCESS:
				return basicSetProcess(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ProcessPackage.THREAD__PROCESS:
				return eInternalContainer().eInverseRemove(this, ProcessPackage.PROCESS__THREADS, process.Process.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	private void initStack() {
		stack = null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProcessPackage.THREAD__ID:
				return getId();
			case ProcessPackage.THREAD__ALL_STEPS:
				return getAllSteps();
			case ProcessPackage.THREAD__STARTED:
				return isStarted();
			case ProcessPackage.THREAD__STACK:
				if (resolve) return getStack();
				return basicGetStack();
			case ProcessPackage.THREAD__RUNNING:
				return isRunning();
			case ProcessPackage.THREAD__PROCESS:
				return getProcess();
			case ProcessPackage.THREAD__STEP_TO_EXECUTE_IDX:
				return getStepToExecuteIdx();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProcessPackage.THREAD__ID:
				setId((Integer)newValue);
				return;
			case ProcessPackage.THREAD__ALL_STEPS:
				getAllSteps().clear();
				getAllSteps().addAll((Collection<? extends Step>)newValue);
				return;
			case ProcessPackage.THREAD__STARTED:
				setStarted((Boolean)newValue);
				return;
			case ProcessPackage.THREAD__STACK:
				setStack((FunctionExecution)newValue);
				return;
			case ProcessPackage.THREAD__RUNNING:
				setRunning((Boolean)newValue);
				return;
			case ProcessPackage.THREAD__PROCESS:
				setProcess((process.Process)newValue);
				return;
			case ProcessPackage.THREAD__STEP_TO_EXECUTE_IDX:
				setStepToExecuteIdx((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ProcessPackage.THREAD__ID:
				setId(ID_EDEFAULT);
				return;
			case ProcessPackage.THREAD__ALL_STEPS:
				getAllSteps().clear();
				return;
			case ProcessPackage.THREAD__STARTED:
				setStarted(STARTED_EDEFAULT);
				return;
			case ProcessPackage.THREAD__STACK:
				setStack((FunctionExecution)null);
				return;
			case ProcessPackage.THREAD__RUNNING:
				setRunning(RUNNING_EDEFAULT);
				return;
			case ProcessPackage.THREAD__PROCESS:
				setProcess((process.Process)null);
				return;
			case ProcessPackage.THREAD__STEP_TO_EXECUTE_IDX:
				setStepToExecuteIdx(STEP_TO_EXECUTE_IDX_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ProcessPackage.THREAD__ID:
				return id != ID_EDEFAULT;
			case ProcessPackage.THREAD__ALL_STEPS:
				return allSteps != null && !allSteps.isEmpty();
			case ProcessPackage.THREAD__STARTED:
				return started != STARTED_EDEFAULT;
			case ProcessPackage.THREAD__STACK:
				return stack != null;
			case ProcessPackage.THREAD__RUNNING:
				return running != RUNNING_EDEFAULT;
			case ProcessPackage.THREAD__PROCESS:
				return getProcess() != null;
			case ProcessPackage.THREAD__STEP_TO_EXECUTE_IDX:
				return stepToExecuteIdx != STEP_TO_EXECUTE_IDX_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ProcessPackage.THREAD___STEP__STEPGOAL:
				return step((StepGoal)arguments.get(0));
			case ProcessPackage.THREAD___GET_STACK_DEPTH:
				return getStackDepth();
			case ProcessPackage.THREAD___GET_FRAME__INT:
				return getFrame((Integer)arguments.get(0));
			case ProcessPackage.THREAD___GET_STEP_TO_EXECUTE_OR_LAST_ONE:
				return getStepToExecuteOrLastOne();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", started: ");
		result.append(started);
		result.append(", running: ");
		result.append(running);
		result.append(", stepToExecuteIdx: ");
		result.append(stepToExecuteIdx);
		result.append(')');
		return result.toString();
	}

} // ThreadImpl
