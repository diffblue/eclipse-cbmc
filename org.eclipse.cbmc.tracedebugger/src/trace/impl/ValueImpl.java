/**
 */
package trace.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import trace.TracePackage;
import trace.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ValueImpl extends MinimalEObjectImpl.Container implements Value {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracePackage.Literals.VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value getValue(String expression) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getChildrenCount() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserFriendlyRepresentation(boolean abridged) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpression(String exp) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Object> compare(String parentPath, Value old) {
		EList<Object> res = new BasicEList<Object>();
		if (old == null) {
			res.add(getUserFriendlyRepresentation(false));
			return res;
			//Return the value of the new object adn its path
		}
		if (old.getClass() != this.getClass()) {
			res.add(getUserFriendlyRepresentation(false));
			return res;
		}
		return null;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case TracePackage.VALUE___GET_VALUE__STRING:
				return getValue((String)arguments.get(0));
			case TracePackage.VALUE___GET_CHILDREN_COUNT:
				return getChildrenCount();
			case TracePackage.VALUE___GET_USER_FRIENDLY_REPRESENTATION__BOOLEAN:
				return getUserFriendlyRepresentation((Boolean)arguments.get(0));
			case TracePackage.VALUE___GET_EXPRESSION__STRING:
				return getExpression((String)arguments.get(0));
			case TracePackage.VALUE___COMPARE__STRING_VALUE:
				return compare((String)arguments.get(0), (Value)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}
} //ValueImpl
