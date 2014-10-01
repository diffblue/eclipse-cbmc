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
import process.FunctionExecution;
import process.ProcessFactory;
import process.ProcessPackage;
import process.StepResult;
import trace.Step;

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
 * </ul>
 * </p>
 *
 * @generated
 */
public class ThreadImpl extends MinimalEObjectImpl.Container implements
		process.Thread {
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
	public NotificationChain basicSetProcess(process.Process newProcess,
			NotificationChain msgs) {
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
	 * 
	 * @generated NOT
	 */
	public StepResult step(int goal) {
		if (!started) {
			initialize();
			
			FunctionExecution bootstrapFunction = ProcessFactory.eINSTANCE.createFunctionExecution();
			bootstrapFunction.setContainingThread(this);
			bootstrapFunction.setCurrentGoal(goal);
			bootstrapFunction.setCurrentStep(allSteps.get(0));//TraceFactory.eINSTANCE.createStep());
			StepResult initialInvocation = bootstrapFunction.step(true);

			if (stack == null)
				throw new RuntimeException("No function found");
			else 
				return initialInvocation;
		}
		stack.setCurrentGoal(goal);
		return stack.step(true);
	}

	private void initialize() {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public FunctionExecution getFrame(int depth) {
		return getFrame(stack, depth);
	}

	private FunctionExecution getFrame(FunctionExecution f, int depth) {
		if (depth == 0)
			return f;
		if (f.getParent() != null)
			return getFrame(f.getParent(), depth-1);
		else 
			throw new RuntimeException("requested depth too deep");
	}
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
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
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
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
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
			case ProcessPackage.THREAD___STEP__INT:
				return step((Integer)arguments.get(0));
			case ProcessPackage.THREAD___GET_STACK_DEPTH:
				return getStackDepth();
			case ProcessPackage.THREAD___GET_FRAME__INT:
				return getFrame((Integer)arguments.get(0));
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
		result.append(')');
		return result.toString();
	}

} // ThreadImpl
