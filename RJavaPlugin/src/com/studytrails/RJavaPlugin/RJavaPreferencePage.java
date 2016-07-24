package com.studytrails.RJavaPlugin;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import temp.Activator;

public class RJavaPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage{

	public RJavaPreferencePage(){
		super(GRID);
	}
	
	@Override
	public void init(IWorkbench workbench) {
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		 setDescription("R-Java Integration Preferences");
		
		
	}

	@Override
	protected void createFieldEditors() {
		addField(new StringFieldEditor(RJavaConstants.R_INCLUDE_DIR, "R Include Directory",
		        getFieldEditorParent())); 
		
	}

}
