package org.eclipse.internal.cbmc.launcher;

import java.util.*;
import java.util.Map.Entry;
import org.eclipse.core.runtime.PlatformObject;
import org.eclipse.debug.core.*;
import org.eclipse.debug.core.model.*;

/**
 * Standard implementation of an <code>IProcess</code> that wrappers a system
 * process (<code>java.lang.Process</code>).
 * <p>
 * Clients may subclass this class. Clients that need to replace the implementation
 * of a streams proxy associated with an <code>IProcess</code> should subclass this
 * class. Generally clients should not instantiate this class directly, but should
 * instead call <code>DebugPlugin.newProcess(...)</code>, which can delegate to an
 * <code>IProcessFactory</code> if one is referenced by the associated launch configuration.
 * </p>
 * @see org.eclipse.debug.core.model.IProcess
 * @see org.eclipse.debug.core.IProcessFactory
 * @since 3.0
 */
public class FakeIProcess extends PlatformObject implements IProcess {

	/**
	 * The launch this process is contained in
	 */
	private ILaunch fLaunch;

	/**
	 * The name of the process
	 */
	private String fName;

	/**
	 * Whether this process has been terminated
	 */
	private boolean fTerminated;

	/**
	 * Table of client defined attributes
	 */
	private Map<String, String> fAttributes;

	/**
	 * Constructs a RuntimeProcess on the given system process
	 * with the given name, adding this process to the given
	 * launch.
	 *
	 * @param launch the parent launch of this process
	 * @param process underlying system process
	 * @param name the label used for this process
	 * @param attributes map of attributes used to initialize the attributes
	 *   of this process, or <code>null</code> if none
	 */
	public FakeIProcess(ILaunch launch, String name, Map<String, String> attributes) {
		setLaunch(launch);
		initializeAttributes(attributes);
		fName = name;
		fTerminated = false;
		launch.addProcess(this);
		fireCreationEvent();
	}

	/**
	 * Initialize the attributes of this process to those in the given map.
	 *
	 * @param attributes attribute map or <code>null</code> if none
	 */
	private void initializeAttributes(Map<String, String> attributes) {
		if (attributes != null) {
			for (Entry<String, String> entry : attributes.entrySet()) {
				setAttribute(entry.getKey(), entry.getValue());
			}
		}
	}

	/**
	 * @see ITerminate#canTerminate()
	 */
	@Override
	public synchronized boolean canTerminate() {
		return !fTerminated;
	}

	/**
	 * @see IProcess#getLabel()
	 */
	@Override
	public String getLabel() {
		return fName;
	}

	/**
	 * Sets the launch this process is contained in
	 *
	 * @param launch the launch this process is contained in
	 */
	protected void setLaunch(ILaunch launch) {
		fLaunch = launch;
	}

	/**
	 * @see IProcess#getLaunch()
	 */
	@Override
	public ILaunch getLaunch() {
		return fLaunch;
	}

	/**
	 * @see ITerminate#isTerminated()
	 */
	@Override
	public synchronized boolean isTerminated() {
		return fTerminated;
	}

	/**
	 * @see ITerminate#terminate()
	 */
	@Override
	public void terminate() {
		fTerminated = true;
		fireTerminateEvent();
	}

	/**
	 * Fires a creation event.
	 */
	protected void fireCreationEvent() {
		fireEvent(new DebugEvent(this, DebugEvent.CREATE));
	}

	/**
	 * Fires the given debug event.
	 *
	 * @param event debug event to fire
	 */
	protected void fireEvent(DebugEvent event) {
		DebugPlugin manager = DebugPlugin.getDefault();
		if (manager != null) {
			manager.fireDebugEventSet(new DebugEvent[] {event});
		}
	}

	/**
	 * Fires a terminate event.
	 */
	protected void fireTerminateEvent() {
		fireEvent(new DebugEvent(this, DebugEvent.TERMINATE));
	}

	/**
	 * Fires a change event.
	 */
	protected void fireChangeEvent() {
		fireEvent(new DebugEvent(this, DebugEvent.CHANGE));
	}

	/**
	 * @see IProcess#setAttribute(String, String)
	 */
	@Override
	public void setAttribute(String key, String value) {
		if (fAttributes == null) {
			fAttributes = new HashMap<String, String>(5);
		}
		Object origVal = fAttributes.get(key);
		if (origVal != null && origVal.equals(value)) {
			return; //nothing changed.
		}

		fAttributes.put(key, value);
		fireChangeEvent();
	}

	/**
	 * @see IProcess#getAttribute(String)
	 */
	@Override
	public String getAttribute(String key) {
		if (fAttributes == null) {
			return null;
		}
		return fAttributes.get(key);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.runtime.IAdaptable#getAdapter(java.lang.Class)
	 */
	@Override
	public Object getAdapter(Class adapter) {
		if (adapter.equals(IProcess.class)) {
			return this;
		}
		if (adapter.equals(IDebugTarget.class)) {
			ILaunch launch = getLaunch();
			IDebugTarget[] targets = launch.getDebugTargets();
			for (int i = 0; i < targets.length; i++) {
				if (this.equals(targets[i].getProcess())) {
					return targets[i];
				}
			}
			return null;
		}
		if (adapter.equals(ILaunch.class)) {
			return getLaunch();
		}
		//CONTEXTLAUNCHING
		if (adapter.equals(ILaunchConfiguration.class)) {
			return getLaunch().getLaunchConfiguration();
		}
		return super.getAdapter(adapter);
	}

	/**
	 * @see IProcess#getExitValue()
	 */
	@Override
	public synchronized int getExitValue() throws DebugException {
		return 0;
	}

	@Override
	public IStreamsProxy getStreamsProxy() {
		// TODO Auto-generated method stub
		return null;
	}
}
