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

import process.Context;
import process.ProcessFactory;
import process.StepResult;
import process.SteppingResult;
import trace.LocationOnly;
import trace.TracePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location Only</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class LocationOnlyImpl extends StepImpl implements LocationOnly {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationOnlyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracePackage.Literals.LOCATION_ONLY;
	}

	@Override
	public StepResult interpret(Context context) {
		StepResult result = ProcessFactory.eINSTANCE.createStepResult();
		result.setCode(SteppingResult.STEP_COMPLETE);
		result.setStepDone(Context.LOCATION_ONLY);
		return result;
	}
} //LocationOnlyImpl
