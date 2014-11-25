/**
 */
package process.impl;

import infra.VarHelpers;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

import process.ProcessPackage;
import process.VariableManager;
import trace.Assignment;
import trace.TraceFactory;
import trace.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link process.impl.VariableManagerImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link process.impl.VariableManagerImpl#getPreviousValues <em>Previous Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableManagerImpl extends MinimalEObjectImpl.Container implements VariableManager {
	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Assignment> variables;

	/**
	 * The cached value of the '{@link #getPreviousValues() <em>Previous Values</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousValues()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Assignment> previousValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessPackage.Literals.VARIABLE_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, Assignment> getVariables() {
		if (variables == null) {
			variables = new EcoreEMap<String,Assignment>(ProcessPackage.Literals.STRING_TO_ASSIGNMENT_ENTRY, StringToAssignmentEntryImpl.class, this, ProcessPackage.VARIABLE_MANAGER__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, Assignment> getPreviousValues() {
		if (previousValues == null) {
			previousValues = new EcoreEMap<String,Assignment>(ProcessPackage.Literals.STRING_TO_ASSIGNMENT_ENTRY, StringToAssignmentEntryImpl.class, this, ProcessPackage.VARIABLE_MANAGER__PREVIOUS_VALUES);
		}
		return previousValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns an assignment representing the expression. 
	 * In cases where the expression is a variable name, the assignment is directly returned. 
	 * Otherwise a new assignment is created and returned. 
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Assignment getAssignment(String expression) {
		String requestedVariable = VarHelpers.getVariableName(expression);
		if (requestedVariable.length() == 0)
			throw new IllegalStateException("The expression is invalid: " + expression);
		
		Assignment current = getVariables().get(requestedVariable);
		if (current == null)
			throw new IllegalStateException("The requested variable does not exist: " + requestedVariable);
		
		Value value = getValue(expression);
		if (value == null)
			throw new IllegalStateException("No value found matching expression: " + expression);
		
		if (current.getParsedValue() == value)
			return current;
		return createTemporaryAssignment(current, expression, value);
	}

	private Assignment createTemporaryAssignment(Assignment parent, String expression, Value value) {
		Assignment result = TraceFactory.eINSTANCE.createAssignment();
		result.setParsedValue(value);
		result.setValue(value.getUserFriendlyRepresentation(false));
		result.setBaseName(expression);
		result.setThread(parent.getThread());
		result.setLocation(parent.getLocation());
		result.setNumber(parent.getNumber());
		result.setType("int"); //TODO FIX ME
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * This method takes an expression and returns the value referenced. 
	 * The first segment of the expression is expected to be the name of an internal variable name (e.g. var1)
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Value getValue(String expression) {
		String requestedVariable = VarHelpers.getVariableName(expression);
		if (requestedVariable.length() == 0)
			throw new IllegalStateException("The expression is invalid: " + expression);
		
		Assignment topLevelAssignment = getVariables().get(requestedVariable);
		if (topLevelAssignment == null)
			throw new IllegalStateException("The requested variable does not exist: " + requestedVariable);
		
		expression = VarHelpers.resolveInternalVariableName(topLevelAssignment, expression);
		return topLevelAssignment.getValue(expression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcessPackage.VARIABLE_MANAGER__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
			case ProcessPackage.VARIABLE_MANAGER__PREVIOUS_VALUES:
				return ((InternalEList<?>)getPreviousValues()).basicRemove(otherEnd, msgs);
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
			case ProcessPackage.VARIABLE_MANAGER__VARIABLES:
				if (coreType) return getVariables();
				else return getVariables().map();
			case ProcessPackage.VARIABLE_MANAGER__PREVIOUS_VALUES:
				if (coreType) return getPreviousValues();
				else return getPreviousValues().map();
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
			case ProcessPackage.VARIABLE_MANAGER__VARIABLES:
				((EStructuralFeature.Setting)getVariables()).set(newValue);
				return;
			case ProcessPackage.VARIABLE_MANAGER__PREVIOUS_VALUES:
				((EStructuralFeature.Setting)getPreviousValues()).set(newValue);
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
			case ProcessPackage.VARIABLE_MANAGER__VARIABLES:
				getVariables().clear();
				return;
			case ProcessPackage.VARIABLE_MANAGER__PREVIOUS_VALUES:
				getPreviousValues().clear();
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
			case ProcessPackage.VARIABLE_MANAGER__VARIABLES:
				return variables != null && !variables.isEmpty();
			case ProcessPackage.VARIABLE_MANAGER__PREVIOUS_VALUES:
				return previousValues != null && !previousValues.isEmpty();
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
			case ProcessPackage.VARIABLE_MANAGER___GET_ASSIGNMENT__STRING:
				return getAssignment((String)arguments.get(0));
			case ProcessPackage.VARIABLE_MANAGER___GET_VALUE__STRING:
				return getValue((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //VariableManagerImpl
