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
		result.setStepDone(Context.STEPPED);
		return result;
	}
} //LocationOnlyImpl
