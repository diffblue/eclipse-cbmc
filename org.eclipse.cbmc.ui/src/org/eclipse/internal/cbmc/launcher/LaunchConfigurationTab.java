package org.eclipse.internal.cbmc.launcher;

import org.eclipse.debug.ui.*;

public class LaunchConfigurationTab extends AbstractLaunchConfigurationTabGroup {

	public LaunchConfigurationTab() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		ILaunchConfigurationTab[] tabs = new ILaunchConfigurationTab[] {new MainLaunchingTab()};
		setTabs(tabs);
	}
}
