/**
 */
package trace.impl;

import org.eclipse.emf.ecore.EClass;

import trace.TracePackage;
import trace.UnionValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Union Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class UnionValueImpl extends StructValueImpl implements UnionValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnionValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracePackage.Literals.UNION_VALUE;
	}

	@Override
	public String getType() {
		if (type == null || type.trim().length() == 0)
			return "union {...}";
		else
			return type;
	}
} //UnionValueImpl
