package org.eclipse.internal.cbmc.launcher;

import java.util.*;
import java.util.Map.Entry;
import org.eclipse.core.runtime.PlatformObject;
import org.eclipse.debug.core.*;
import org.eclipse.debug.core.model.*;
import org.eclipse.internal.cbmc.view.GeneratePropertiesJob;

/**
 * THIS IS A TRIMMED DOWN COPY OF THE CLASS org.eclipse.debug.core.model.RuntimeProcess.
 * It is used in order to make sure that the debug view operates properly when CBMC is executed 
 * (e.g. make sure that the process shows as terminated when it is) and also show the CBMC execution
 * details in the property page.
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

	private GeneratePropertiesJob job;

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
	 * @param job 
	 */
	public FakeIProcess(ILaunch launch, String name, Map<String, String> attributes, GeneratePropertiesJob job) {
		setLaunch(launch);
		initializeAttributes(attributes);
		fName = name;
		fTerminated = false;
		this.job = job;
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
		job.cancel();
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
	public int getExitValue() {
		return job.getExitCode();
	}

	@Override
	public IStreamsProxy getStreamsProxy() {
		// TODO Auto-generated method stub
		return null;
	}
}
