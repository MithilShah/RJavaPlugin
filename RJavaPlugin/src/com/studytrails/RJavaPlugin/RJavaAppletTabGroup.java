package com.studytrails.RJavaPlugin;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.eclipse.debug.ui.sourcelookup.SourceLookupTab;
import org.eclipse.jdt.debug.ui.launchConfigurations.JavaClasspathTab;
import org.eclipse.jdt.debug.ui.launchConfigurations.JavaJRETab;
import org.eclipse.jdt.debug.ui.launchConfigurations.JavaMainTab;

public class RJavaAppletTabGroup extends AbstractLaunchConfigurationTabGroup{

	@Override
	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		 ILaunchConfigurationTab[] tabs = new ILaunchConfigurationTab[] {
//				  	new AppletMainTab(),
//				  	new AppletParametersTab(),
//				  	new AppletArgumentsTab(),
				  	new JavaMainTab(),
				  	new JavaJRETab(),
				  	new JavaClasspathTab(),
				  	new SourceLookupTab(),
				  	new CommonTab(),
				  	new RJavaEnvironmentTab()
				  	};
				  	setTabs(tabs);
		
	}

}
