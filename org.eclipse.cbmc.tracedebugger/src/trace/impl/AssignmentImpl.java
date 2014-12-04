/**
 */
package trace.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import process.Context;
import process.FunctionExecution;
import process.ProcessFactory;
import process.StepResult;
import process.SteppingResult;
import expressionparser.ValueExpressionLexer;
import expressionparser.ValueExpressionParser;
import java.lang.reflect.InvocationTargetException;
import trace.Assignment;
import trace.SimpleValue;
import trace.TraceFactory;
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
 *   <li>{@link trace.impl.AssignmentImpl#getType <em>Type</em>}</li>
 *   <li>{@link trace.impl.AssignmentImpl#isParameter <em>Parameter</em>}</li>
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
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Value value;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isParameter() <em>Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isParameter()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PARAMETER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isParameter() <em>Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isParameter()
	 * @generated
	 * @ordered
	 */
	protected boolean parameter = PARAMETER_EDEFAULT;

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
	public NotificationChain basicSetValue(Value newValue, NotificationChain msgs) {
		Value oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TracePackage.ASSIGNMENT__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Value newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TracePackage.ASSIGNMENT__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TracePackage.ASSIGNMENT__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.ASSIGNMENT__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TracePackage.ASSIGNMENT__VALUE:
				return basicSetValue(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.ASSIGNMENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isParameter() {
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter(boolean newParameter) {
		boolean oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.ASSIGNMENT__PARAMETER, oldParameter, parameter));
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
	public void setValue(String userFriendlyRepresentation) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case TracePackage.ASSIGNMENT__TYPE:
				return getType();
			case TracePackage.ASSIGNMENT__PARAMETER:
				return isParameter();
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
			case TracePackage.ASSIGNMENT__TYPE:
				setType((String)newValue);
				return;
			case TracePackage.ASSIGNMENT__PARAMETER:
				setParameter((Boolean)newValue);
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
			case TracePackage.ASSIGNMENT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case TracePackage.ASSIGNMENT__PARAMETER:
				setParameter(PARAMETER_EDEFAULT);
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
			case TracePackage.ASSIGNMENT__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case TracePackage.ASSIGNMENT__PARAMETER:
				return parameter != PARAMETER_EDEFAULT;
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
			case TracePackage.ASSIGNMENT___SET_VALUE__STRING:
				setValue((String)arguments.get(0));
				return null;
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
		result.append(", type: ");
		result.append(type);
		result.append(", parameter: ");
		result.append(parameter);
		result.append(')');
		return result.toString();
	}

	@Override
	public StepResult interpret(Context context) {
		FunctionExecution function = context.getFunction();
		if (function == null)
			return null;
		
		ListIterator<Assignment> iter = function.getVariables().listIterator();
		List<Assignment> assignementToRemove = new ArrayList<Assignment>();
		while(iter.hasNext()){
			Assignment currentAssignment = iter.next();
			if(currentAssignment.getBaseName().equals(getBaseName()))
				assignementToRemove.add(currentAssignment);
		}
		function.getVariables().removeAll(assignementToRemove);
		function.getVariables().add(this);
		
		StepResult result = ProcessFactory.eINSTANCE.createStepResult();
		result.setCode(SteppingResult.STEP_COMPLETE);
		result.setStepDone(Context.STEPPED);
		return result;
	}
} //AssignmentImpl
