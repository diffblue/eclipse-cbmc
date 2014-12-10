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
