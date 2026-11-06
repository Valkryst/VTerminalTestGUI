package com.valkryst.VTerminalTestGUI.view;

import javax.swing.JPasswordField;

import java.beans.PropertyChangeEvent;

public class PasswordFieldView extends View {
	public PasswordFieldView() {
		var component = new JPasswordField();
		component.setText("This JPasswordField is enabled.");
		this.add(component);

		component = new JPasswordField();
		component.setEnabled(false);
		component.setText("This JPasswordField is disabled.");
		this.add(component);
	}

	@Override
	public void modelPropertyChange(final PropertyChangeEvent event) {

	}
}
