/**
 */
package trace.impl;

import infra.VarHelpers;

import java.util.Collection;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectEList;

import results.data.Vars;
import trace.ArrayValue;
import trace.TracePackage;
import trace.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link trace.impl.ArrayValueImpl#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArrayValueImpl extends ValueImpl implements ArrayValue {
	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<Value> values;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracePackage.Literals.ARRAY_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Value> getValues() {
		if (values == null) {
			values = new EObjectEList<Value>(Value.class, this, TracePackage.ARRAY_VALUE__VALUES);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TracePackage.ARRAY_VALUE__VALUES:
				return getValues();
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
			case TracePackage.ARRAY_VALUE__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends Value>)newValue);
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
			case TracePackage.ARRAY_VALUE__VALUES:
				getValues().clear();
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
			case TracePackage.ARRAY_VALUE__VALUES:
				return values != null && !values.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public int getChildrenCount() {
		return getValues().size();
	}
	
	@Override
	public String getUserFriendlyRepresentation(boolean abridged) {
		if (abridged)
			return "[...]";
		StringBuffer result = new StringBuffer();
		result.append('{');
		for (Value value : values) {
			result.append(value.getUserFriendlyRepresentation(false)).append(',');
		}
		return result.replace(result.lastIndexOf(","), result.lastIndexOf(",") + 1, "}").toString();
	}
	
	@Override
	public EList<Object> compare(String parentPath, Value old) {
		EList<Object>initialComparison = super.compare(parentPath, old);
		if (initialComparison != null)
			return initialComparison;
		
		ArrayValue oldArray = (ArrayValue) old;
		if (oldArray.getValues().size() != values.size())
			return createVar(parentPath);
		
		int i = 0;
		for (Value v : values) {
			if (v.compare(parentPath + '[' + i++ + ']', oldArray).size() != 0)
				return createVar(parentPath);
		}
		return new BasicEList<Object>();
	}
	
	private EList<Object> createVar(String parentPath) {
		Vars v = new Vars();
		v.name = parentPath;
		v.value = getUserFriendlyRepresentation(false);
		v.in_scope="true";
		v.type_changed = "false";
		v.has_more = "0";
		EList<Object> res = new BasicEList<Object>();
		res.add(v);
		return res;
	}
	
	@Override
	public Value getValue(String expression) {
		String[] segments = VarHelpers.splitInTwo(expression);
		int i = Integer.parseInt(segments[0]);
		if (segments.length == 1)
			return getValues().get(i);
		return getValues().get(i).getValue(segments[1]);
	}
	
	@Override
	public String getType() {
		if (values.size() == 0)
			return "unknown [0]";
		return values.get(0).getType() + '[' + values.size() + ']';
	}
} //ArrayValueImpl
