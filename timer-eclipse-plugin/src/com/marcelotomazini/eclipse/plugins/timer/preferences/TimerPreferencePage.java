package com.marcelotomazini.eclipse.plugins.timer.preferences;



import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import com.marcelotomazini.eclipse.plugins.TimerPlugin;

public class TimerPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	public TimerPreferencePage() {
		super(GRID);
		setPreferenceStore(TimerPlugin.getDefault().getPreferenceStore());
	}

	@Override
	public void createFieldEditors() {
		addField(new TimerListEditor(TimerPlugin.getId(), "&Timers", getFieldEditorParent()));		
	}

	@Override
	public void init(IWorkbench workbench) {}
}