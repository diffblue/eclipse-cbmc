/**
 */
package process.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import process.Breakpoint;
import process.FunctionExecution;
import process.ProcessFactory;
import process.ProcessPackage;
import process.StepResult;
import process.SteppingResult;
import trace.Assignment;
import trace.FunctionCall;
import trace.FunctionReturn;
import trace.Step;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Execution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link process.impl.FunctionExecutionImpl#getChild <em>Child</em>}</li>
 *   <li>{@link process.impl.FunctionExecutionImpl#getEntryStep <em>Entry Step</em>}</li>
 *   <li>{@link process.impl.FunctionExecutionImpl#getContainingThread <em>Containing Thread</em>}</li>
 *   <li>{@link process.impl.FunctionExecutionImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link process.impl.FunctionExecutionImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link process.impl.FunctionExecutionImpl#getCurrentStep <em>Current Step</em>}</li>
 *   <li>{@link process.impl.FunctionExecutionImpl#getCurrentStepNumber <em>Current Step Number</em>}</li>
 *   <li>{@link process.impl.FunctionExecutionImpl#getCurrentGoal <em>Current Goal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionExecutionImpl extends MinimalEObjectImpl.Container implements FunctionExecution {
	private static final String NOT_A_FUNCTION = "BOOTSTRAP";

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
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected FunctionExecution parent;

	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Assignment> variables;

	/**
	 * The cached value of the '{@link #getCurrentStep() <em>Current Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentStep()
	 * @generated
	 * @ordered
	 */
	protected Step currentStep;

	/**
	 * The default value of the '{@link #getCurrentStepNumber() <em>Current Step Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentStepNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int CURRENT_STEP_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCurrentStepNumber() <em>Current Step Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentStepNumber()
	 * @generated
	 * @ordered
	 */
	protected int currentStepNumber = CURRENT_STEP_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentGoal() <em>Current Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentGoal()
	 * @generated
	 * @ordered
	 */
	protected static final int CURRENT_GOAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCurrentGoal() <em>Current Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentGoal()
	 * @generated
	 * @ordered
	 */
	protected int currentGoal = CURRENT_GOAL_EDEFAULT;

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
	public EList<Assignment> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentEList<Assignment>(Assignment.class, this, ProcessPackage.FUNCTION_EXECUTION__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step getCurrentStep() {
		if (currentStep != null && currentStep.eIsProxy()) {
			InternalEObject oldCurrentStep = (InternalEObject)currentStep;
			currentStep = (Step)eResolveProxy(oldCurrentStep);
			if (currentStep != oldCurrentStep) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessPackage.FUNCTION_EXECUTION__CURRENT_STEP, oldCurrentStep, currentStep));
			}
		}
		return currentStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step basicGetCurrentStep() {
		return currentStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentStep(Step newCurrentStep) {
		Step oldCurrentStep = currentStep;
		currentStep = newCurrentStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.FUNCTION_EXECUTION__CURRENT_STEP, oldCurrentStep, currentStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCurrentStepNumber() {
		return currentStepNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentStepNumber(int newCurrentStepNumber) {
		int oldCurrentStepNumber = currentStepNumber;
		currentStepNumber = newCurrentStepNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.FUNCTION_EXECUTION__CURRENT_STEP_NUMBER, oldCurrentStepNumber, currentStepNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCurrentGoal() {
		return currentGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentGoal(int newCurrentGoal) {
		int oldCurrentGoal = currentGoal;
		currentGoal = newCurrentGoal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.FUNCTION_EXECUTION__CURRENT_GOAL, oldCurrentGoal, currentGoal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Assignment getVariable(String name) {
		for (Assignment assignment : variables) {
			if (assignment.getBaseName().equals(name))
				return assignment;
		}
		throw new RuntimeException("Requested variable name does not exist");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	
	public static int FUNCTION_EXIT = 1;
	public static int FUNCTION_ENTER = 2;
	public static int NEXT_LINE = 4;
	public static int CONTINUE = 8;
	
	public StepResult step(boolean detectBreakpoint) {
		return step(detectBreakpoint, -1); 
	}
	public StepResult step(boolean detectBreakpoint, int lineBeingProcessed) {
		//Check the bound to see if we have more steps
		if (getContainingThread().getAllSteps().size() -1 == currentStepNumber) {
			StepResult result = ProcessFactory.eINSTANCE.createStepResult();
			result.setCode(SteppingResult.STEP_COMPLETE);
			result.setStepDone(currentGoal);
			return result;
		}
		int currentLine;
		boolean isCurrentlyOnBreakpoint = (getContainingThread().getProcess().getBreakpointManager().hasBreakpoint(this, currentStep) != null);
		ListIterator<Step> it;
		if((currentStep instanceof FunctionReturn || currentStep instanceof FunctionCall) && lineBeingProcessed != -1){
			currentLine = lineBeingProcessed;
			it = getContainingThread().getAllSteps().listIterator(currentStepNumber+1);
			lineBeingProcessed = -1;
		}else{
			it = getContainingThread().getAllSteps().listIterator(currentStepNumber);
			currentLine = currentStep.getLineNumber();
		}
		while(it.hasNext()) {
			currentStepNumber = it.nextIndex();			
			currentStep = it.next();
			int justDone = 0;
			
			// Handle breakpoints
			if (detectBreakpoint && !isCurrentlyOnBreakpoint) {
				Breakpoint breakOnLine = getContainingThread().getProcess().getBreakpointManager().hasBreakpoint(this, currentStep);
				if (breakOnLine != null) {
					StepResult result = ProcessFactory.eINSTANCE.createStepResult();
					result.setCode(SteppingResult.BREAKPOINT_HIT);
					result.setObject(breakOnLine);
					result.setStepDone(justDone);
					return result;
				}
			}
			
			
			if (currentStep.getLineNumber() != currentLine && currentStep.getLineNumber() != -1) {
				justDone |= NEXT_LINE;
			}
			
			if ((justDone & currentGoal) == currentGoal) {
				StepResult result = ProcessFactory.eINSTANCE.createStepResult();
				result.setCode(SteppingResult.STEP_COMPLETE);
				result.setStepDone(justDone);
				return result;
			}

			if (currentStep instanceof Assignment) {
				ListIterator<Assignment> iter = getVariables().listIterator();
				List<Assignment> assignementToRemove = new ArrayList<Assignment>();
				while(iter.hasNext()){
					Assignment currentAssignment = iter.next();
					if(currentAssignment.getBaseName().equals(((Assignment)currentStep).getBaseName()))
						assignementToRemove.add(currentAssignment);
				}
				getVariables().removeAll(assignementToRemove);
				getVariables().add((Assignment) currentStep);
			}
			else if (currentStep instanceof FunctionCall) {
				FunctionExecution newExecution = functionFromStep((FunctionCall) currentStep, currentStepNumber, currentGoal == FUNCTION_ENTER ? NEXT_LINE : FUNCTION_EXIT, this, getContainingThread());
				getContainingThread().setStack(newExecution);
				StepResult nextLineResult = newExecution.step(detectBreakpoint, currentStep.getLineNumber()); //enable breakpoint if no bp have been found
				if(nextLineResult.getCode() == SteppingResult.BREAKPOINT_HIT)
					return nextLineResult;
				
				justDone |= FUNCTION_ENTER | nextLineResult.getStepDone();
				if ((justDone & currentGoal) == currentGoal){
					StepResult result = ProcessFactory.eINSTANCE.createStepResult();
					result.setCode(SteppingResult.STEP_COMPLETE);
					result.setStepDone(currentGoal);
					return result;
				}
				
			}
			else if (currentStep instanceof FunctionReturn) {
				if (getContainingThread().getStack() == null)
					continue;
				//We exit from the current function
				FunctionExecution previousFunction = getParent();
				if (previousFunction != null) {
					previousFunction.setChild(null);
					previousFunction.setCurrentStepNumber(currentStepNumber);
					previousFunction.setCurrentStep(currentStep);
				}
				containingThread.setStack(previousFunction);
				previousFunction.setCurrentGoal(NEXT_LINE);
				StepResult nextLineResult = previousFunction.step(detectBreakpoint, getEntryStep().getLineNumber());				
				if(nextLineResult.getCode() == SteppingResult.BREAKPOINT_HIT)
					return nextLineResult;
				
				justDone |= FUNCTION_EXIT | nextLineResult.getStepDone();
				if ((justDone & currentGoal) == currentGoal) {
					StepResult result = ProcessFactory.eINSTANCE.createStepResult();
					result.setCode(SteppingResult.STEP_COMPLETE);
					result.setStepDone(justDone);
					return result;
				}
			}
			
		}
		//TOO No step found
		StepResult result = ProcessFactory.eINSTANCE.createStepResult();
		result.setCode(SteppingResult.STEP_COMPLETE);
		return result;
	}

	public StepResult step2(int goal, boolean detectBreakpoint) {
		//Check the bound to see if we have more steps
		if (getContainingThread().getAllSteps().size() -1 == currentStepNumber) {
			StepResult result = ProcessFactory.eINSTANCE.createStepResult();
			result.setCode(SteppingResult.STEP_COMPLETE);
			result.setStepDone(goal);
			return result;
		}
		ListIterator<Step> it = getContainingThread().getAllSteps().listIterator(currentStepNumber);
		int currentLine = currentStep.getLineNumber();
		while(it.hasNext()) {
			currentStepNumber = it.nextIndex();			
			currentStep = it.next();
			int justDone = 0;
			if (currentStep instanceof Assignment) {
				getVariables().add((Assignment) currentStep);
			}
			else if (currentStep instanceof FunctionReturn) {
				if (getContainingThread().getStack() == null)
					continue;
				//We exit from the current function
				FunctionExecution previousFunction = getParent();
				if (previousFunction != null) {
					previousFunction.setChild(null);
					previousFunction.setCurrentStep(currentStep);
					previousFunction.setCurrentStepNumber(currentStepNumber);
				}
				containingThread.setStack(previousFunction);
				
				//Now move to the next line in the function we return to
				
				StepResult nextLineResult = previousFunction.step(true);
				justDone |= FUNCTION_EXIT | nextLineResult.getStepDone();
				if (nextLineResult.getCode() == SteppingResult.BREAKPOINT_HIT) {
					StepResult result = ProcessFactory.eINSTANCE.createStepResult();
					result.setCode(SteppingResult.BREAKPOINT_HIT);
					result.setObject(nextLineResult.getObject());
					result.setStepDone(justDone);
					return result;
				}
			}
			else if (currentStep instanceof FunctionCall) {
				if (((FunctionCall) currentStep).getDisplayName().startsWith("__CPROVER"))
					continue;
				FunctionCall functionCall = (FunctionCall) currentStep;
				currentStepNumber = it.nextIndex();
				currentStep = it.next();
				FunctionExecution newExecution = functionFromStep((FunctionCall) currentStep, currentStepNumber, goal == FUNCTION_ENTER ? NEXT_LINE : FUNCTION_ENTER, this, getContainingThread());
				getContainingThread().setStack(newExecution);
				//Check if we hit a breakpoint on the function call
				Breakpoint breakOnEntry = getContainingThread().getProcess().getBreakpointManager().hasBreakpoint(newExecution, currentStep);
				
				//Go to the first instruction of the function
				StepResult nextLineResult = newExecution.step(breakOnEntry == null); //enable breakpoint if no bp have been found
				//check if breakpoint has been reached while stepping
				//set the flag properly... make sure to add the result of what has been done so far (pass the result back and OR)
				//When returning from function, do we need to move the counters?
				justDone |= FUNCTION_ENTER | nextLineResult.getStepDone() ;
				if (breakOnEntry != null || SteppingResult.BREAKPOINT_HIT == nextLineResult.getCode()) {
					StepResult result = ProcessFactory.eINSTANCE.createStepResult();
					result.setCode(SteppingResult.BREAKPOINT_HIT);
					result.setObject(breakOnEntry != null ? breakOnEntry : (Breakpoint) nextLineResult.getObject());
					result.setStepDone(justDone);
					return result;
				}
			}
			if (currentStep.getLineNumber() != currentLine && currentStep.getLineNumber() != -1) {
				justDone |= NEXT_LINE;
				if (detectBreakpoint) {
					Breakpoint breakOnLine = getContainingThread().getProcess().getBreakpointManager().hasBreakpoint(this, currentStep);
					if (breakOnLine != null) {
						StepResult result = ProcessFactory.eINSTANCE.createStepResult();
						result.setCode(SteppingResult.BREAKPOINT_HIT);
						result.setObject(breakOnLine);
						result.setStepDone(justDone);
						return result;
					}
				}
			}
			
			if ((justDone & goal) == goal) {
				StepResult result = ProcessFactory.eINSTANCE.createStepResult();
				result.setCode(SteppingResult.STEP_COMPLETE);
				result.setStepDone(justDone);
				return result;
			}
		}
		//TOO No step found
		StepResult result = ProcessFactory.eINSTANCE.createStepResult();
		result.setCode(SteppingResult.STEP_COMPLETE);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getFileName() {
		return currentStep.getLocation().getFile();
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

	public static FunctionExecution functionFromStep(FunctionCall step, int stepIdx, int goal, FunctionExecution parent, process.Thread thread) {
		FunctionExecution newFunction = ProcessFactory.eINSTANCE.createFunctionExecution();
		newFunction.setCurrentGoal(goal);
		newFunction.setCurrentStep(step);
		newFunction.setCurrentStepNumber(stepIdx);
		newFunction.setEntryStep(step);
		newFunction.setContainingThread(thread);
		if (!parent.getFunctionName().equals(NOT_A_FUNCTION))
			newFunction.setParent(parent);
		return newFunction;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcessPackage.FUNCTION_EXECUTION__CHILD:
				if (child != null)
					msgs = ((InternalEObject)child).eInverseRemove(this, ProcessPackage.FUNCTION_EXECUTION__PARENT, FunctionExecution.class, msgs);
				return basicSetChild((FunctionExecution)otherEnd, msgs);
			case ProcessPackage.FUNCTION_EXECUTION__PARENT:
				if (parent != null)
					msgs = ((InternalEObject)parent).eInverseRemove(this, ProcessPackage.FUNCTION_EXECUTION__CHILD, FunctionExecution.class, msgs);
				return basicSetParent((FunctionExecution)otherEnd, msgs);
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
			case ProcessPackage.FUNCTION_EXECUTION__CHILD:
				return basicSetChild(null, msgs);
			case ProcessPackage.FUNCTION_EXECUTION__PARENT:
				return basicSetParent(null, msgs);
			case ProcessPackage.FUNCTION_EXECUTION__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
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
			case ProcessPackage.FUNCTION_EXECUTION__CHILD:
				if (resolve) return getChild();
				return basicGetChild();
			case ProcessPackage.FUNCTION_EXECUTION__ENTRY_STEP:
				if (resolve) return getEntryStep();
				return basicGetEntryStep();
			case ProcessPackage.FUNCTION_EXECUTION__CONTAINING_THREAD:
				if (resolve) return getContainingThread();
				return basicGetContainingThread();
			case ProcessPackage.FUNCTION_EXECUTION__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case ProcessPackage.FUNCTION_EXECUTION__VARIABLES:
				return getVariables();
			case ProcessPackage.FUNCTION_EXECUTION__CURRENT_STEP:
				if (resolve) return getCurrentStep();
				return basicGetCurrentStep();
			case ProcessPackage.FUNCTION_EXECUTION__CURRENT_STEP_NUMBER:
				return getCurrentStepNumber();
			case ProcessPackage.FUNCTION_EXECUTION__CURRENT_GOAL:
				return getCurrentGoal();
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
			case ProcessPackage.FUNCTION_EXECUTION__CHILD:
				setChild((FunctionExecution)newValue);
				return;
			case ProcessPackage.FUNCTION_EXECUTION__ENTRY_STEP:
				setEntryStep((FunctionCall)newValue);
				return;
			case ProcessPackage.FUNCTION_EXECUTION__CONTAINING_THREAD:
				setContainingThread((process.Thread)newValue);
				return;
			case ProcessPackage.FUNCTION_EXECUTION__PARENT:
				setParent((FunctionExecution)newValue);
				return;
			case ProcessPackage.FUNCTION_EXECUTION__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends Assignment>)newValue);
				return;
			case ProcessPackage.FUNCTION_EXECUTION__CURRENT_STEP:
				setCurrentStep((Step)newValue);
				return;
			case ProcessPackage.FUNCTION_EXECUTION__CURRENT_STEP_NUMBER:
				setCurrentStepNumber((Integer)newValue);
				return;
			case ProcessPackage.FUNCTION_EXECUTION__CURRENT_GOAL:
				setCurrentGoal((Integer)newValue);
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
			case ProcessPackage.FUNCTION_EXECUTION__CHILD:
				setChild((FunctionExecution)null);
				return;
			case ProcessPackage.FUNCTION_EXECUTION__ENTRY_STEP:
				setEntryStep((FunctionCall)null);
				return;
			case ProcessPackage.FUNCTION_EXECUTION__CONTAINING_THREAD:
				setContainingThread((process.Thread)null);
				return;
			case ProcessPackage.FUNCTION_EXECUTION__PARENT:
				setParent((FunctionExecution)null);
				return;
			case ProcessPackage.FUNCTION_EXECUTION__VARIABLES:
				getVariables().clear();
				return;
			case ProcessPackage.FUNCTION_EXECUTION__CURRENT_STEP:
				setCurrentStep((Step)null);
				return;
			case ProcessPackage.FUNCTION_EXECUTION__CURRENT_STEP_NUMBER:
				setCurrentStepNumber(CURRENT_STEP_NUMBER_EDEFAULT);
				return;
			case ProcessPackage.FUNCTION_EXECUTION__CURRENT_GOAL:
				setCurrentGoal(CURRENT_GOAL_EDEFAULT);
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
			case ProcessPackage.FUNCTION_EXECUTION__CHILD:
				return child != null;
			case ProcessPackage.FUNCTION_EXECUTION__ENTRY_STEP:
				return entryStep != null;
			case ProcessPackage.FUNCTION_EXECUTION__CONTAINING_THREAD:
				return containingThread != null;
			case ProcessPackage.FUNCTION_EXECUTION__PARENT:
				return parent != null;
			case ProcessPackage.FUNCTION_EXECUTION__VARIABLES:
				return variables != null && !variables.isEmpty();
			case ProcessPackage.FUNCTION_EXECUTION__CURRENT_STEP:
				return currentStep != null;
			case ProcessPackage.FUNCTION_EXECUTION__CURRENT_STEP_NUMBER:
				return currentStepNumber != CURRENT_STEP_NUMBER_EDEFAULT;
			case ProcessPackage.FUNCTION_EXECUTION__CURRENT_GOAL:
				return currentGoal != CURRENT_GOAL_EDEFAULT;
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
			case ProcessPackage.FUNCTION_EXECUTION___STEP__INT_BOOLEAN:
				return step((Boolean)arguments.get(0));
			case ProcessPackage.FUNCTION_EXECUTION___GET_FILE_NAME:
				return getFileName();
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
		result.append(" (currentStepNumber: ");
		result.append(currentStepNumber);
		result.append(", currentGoal: ");
		result.append(currentGoal);
		result.append(')');
		return result.toString();
	}

	public void goToFirstInstruction() {
		ListIterator<Step> it = getContainingThread().getAllSteps().listIterator(currentStepNumber);
		while(it.hasNext()) {
			int potentialNextCurrentStep = it.nextIndex();
			Step s = it.next();
			if (s.getLineNumber() != -1) {
				currentStepNumber = potentialNextCurrentStep;
				currentStep = s;
			}
		}
	}

} //FunctionExecutionImpl
