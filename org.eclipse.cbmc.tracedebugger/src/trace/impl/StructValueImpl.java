/**
 */
package trace.impl;

import infra.VarHelpers;

import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

import trace.StructValue;
import trace.TracePackage;
import trace.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Struct Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link trace.impl.StructValueImpl#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructValueImpl extends ValueImpl implements StructValue {
	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Value> values;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracePackage.Literals.STRUCT_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, Value> getValues() {
		if (values == null) {
			values = new EcoreEMap<String,Value>(TracePackage.Literals.NAME_TO_VALUE_MAP, NameToValueMapImpl.class, this, TracePackage.STRUCT_VALUE__VALUES);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TracePackage.STRUCT_VALUE__VALUES:
				return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
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
			case TracePackage.STRUCT_VALUE__VALUES:
				if (coreType) return getValues();
				else return getValues().map();
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
			case TracePackage.STRUCT_VALUE__VALUES:
				((EStructuralFeature.Setting)getValues()).set(newValue);
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
			case TracePackage.STRUCT_VALUE__VALUES:
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
			case TracePackage.STRUCT_VALUE__VALUES:
				return values != null && !values.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public int getChildrenCount() {
		return getValues().size();
	}
	
	@Override
	public String getUserFriendlyRepresentation(boolean abriged) {
		if (abriged)
			return "{...}";
		StringBuffer bf = new StringBuffer();
		bf.append('{');
		Set<Entry<String, Value>> entries = values.entrySet();
		for (Entry<String, Value> entry : entries) {
			bf.append(entry.getKey());
			bf.append('=');
			bf.append(entry.getValue().getUserFriendlyRepresentation(false));
			bf.append(',');
		}
		bf.replace(bf.lastIndexOf(","), bf.lastIndexOf(",")+1, "}");
		return bf.toString();
	}
	
	public Value getValue(String expression) {
		String[] segments = VarHelpers.splitInTwo(expression);
		Value v = getValues().get(segments[0]);
		if (segments.length == 1)
			return v;
		return v.getValue(segments[1]);
	}
	
	@Override
	public EList<Object> compare(String parentPath, Value old) {
		EList<Object>initialComparison = super.compare(parentPath, old);
		if (initialComparison != null)
			return initialComparison;
		StructValue oldStruct = (StructValue) old;
		Set<String> keys = values.keySet();
		EList<Object> differences = new BasicEList<Object>();
		for (String key : keys) {
			differences.addAll(values.get(key).compare(parentPath + '.' + key, oldStruct.getValues().get(key)));
		}
		return differences;
	}
} //StructValueImpl
