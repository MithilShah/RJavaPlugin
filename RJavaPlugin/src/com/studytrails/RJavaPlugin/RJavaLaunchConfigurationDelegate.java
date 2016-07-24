package com.studytrails.RJavaPlugin;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.jdt.launching.JavaLaunchDelegate;

public class RJavaLaunchConfigurationDelegate extends JavaLaunchDelegate{
	@Override
	public void launch(ILaunchConfiguration configuration, String mode,
			ILaunch launch, IProgressMonitor monitor) throws CoreException {
		System.out.println("RJavaLaunchConfigurationDelegate.launch()");
		super.launch(configuration, mode, launch, monitor);
	}
	
	


}
