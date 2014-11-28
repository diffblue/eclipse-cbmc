/**
 */
package trace.impl;

import infra.VarHelpers;

import java.lang.reflect.InvocationTargetException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import expressionparser.ValueExpressionLexer;
import expressionparser.ValueExpressionParser;
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
 *   <li>{@link trace.impl.AssignmentImpl#getValueExpression <em>Value Expression</em>}</li>
 *   <li>{@link trace.impl.AssignmentImpl#getParsedValue <em>Parsed Value</em>}</li>
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
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

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
	 * The default value of the '{@link #getValueExpression() <em>Value Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueExpression() <em>Value Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueExpression()
	 * @generated
	 * @ordered
	 */
	protected String valueExpression = VALUE_EXPRESSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParsedValue() <em>Parsed Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParsedValue()
	 * @generated
	 * @ordered
	 */
	protected Value parsedValue;

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
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.ASSIGNMENT__VALUE, oldValue, value));
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
	public String getValueExpression() {
		return valueExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueExpression(String newValueExpression) {
		String oldValueExpression = valueExpression;
		valueExpression = newValueExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.ASSIGNMENT__VALUE_EXPRESSION, oldValueExpression, valueExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value getParsedValue() {
		if (parsedValue != null && parsedValue.eIsProxy()) {
			InternalEObject oldParsedValue = (InternalEObject)parsedValue;
			parsedValue = (Value)eResolveProxy(oldParsedValue);
			if (parsedValue != oldParsedValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TracePackage.ASSIGNMENT__PARSED_VALUE, oldParsedValue, parsedValue));
			}
		}
		return parsedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value basicGetParsedValue() {
		return parsedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParsedValue(Value newParsedValue) {
		Value oldParsedValue = parsedValue;
		parsedValue = newParsedValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.ASSIGNMENT__PARSED_VALUE, oldParsedValue, parsedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Value getValue(String expression) {
		try {
			parseValueExpression();
		} catch(IllegalStateException e) {
			parsedValue = TraceFactory.eINSTANCE.createSimpleValue();
			((SimpleValue) parsedValue).setValue(getValue());
		}
		if (getBaseName().equals(expression))
			return parsedValue;

		if (expression.startsWith(getBaseName()))
			expression = expression.substring(getBaseName().length());
		return parsedValue.getValue(expression);
	}

	private void parseValueExpression() {
		if (parsedValue != null)
			return;
        ValueExpressionLexer l = new ValueExpressionLexer(new ANTLRInputStream(getValue()));
        ValueExpressionParser p = new ValueExpressionParser(new CommonTokenStream(l));
        p.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                throw new IllegalStateException("failed to parse at line " + line + " due to " + msg, e);
            }
        });
        parsedValue = p.expression().newValue;
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
			case TracePackage.ASSIGNMENT__VALUE_EXPRESSION:
				return getValueExpression();
			case TracePackage.ASSIGNMENT__PARSED_VALUE:
				if (resolve) return getParsedValue();
				return basicGetParsedValue();
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
				setValue((String)newValue);
				return;
			case TracePackage.ASSIGNMENT__TYPE:
				setType((String)newValue);
				return;
			case TracePackage.ASSIGNMENT__VALUE_EXPRESSION:
				setValueExpression((String)newValue);
				return;
			case TracePackage.ASSIGNMENT__PARSED_VALUE:
				setParsedValue((Value)newValue);
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
				setValue(VALUE_EDEFAULT);
				return;
			case TracePackage.ASSIGNMENT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case TracePackage.ASSIGNMENT__VALUE_EXPRESSION:
				setValueExpression(VALUE_EXPRESSION_EDEFAULT);
				return;
			case TracePackage.ASSIGNMENT__PARSED_VALUE:
				setParsedValue((Value)null);
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
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case TracePackage.ASSIGNMENT__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case TracePackage.ASSIGNMENT__VALUE_EXPRESSION:
				return VALUE_EXPRESSION_EDEFAULT == null ? valueExpression != null : !VALUE_EXPRESSION_EDEFAULT.equals(valueExpression);
			case TracePackage.ASSIGNMENT__PARSED_VALUE:
				return parsedValue != null;
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
		result.append(", value: ");
		result.append(value);
		result.append(", type: ");
		result.append(type);
		result.append(", valueExpression: ");
		result.append(valueExpression);
		result.append(')');
		return result.toString();
	}

} //AssignmentImpl
