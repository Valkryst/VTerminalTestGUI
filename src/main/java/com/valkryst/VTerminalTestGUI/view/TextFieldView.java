package com.valkryst.VTerminalTestGUI.view;

import javax.swing.JTextField;

import java.beans.PropertyChangeEvent;

public class TextFieldView extends View {
	public TextFieldView() {
		var component = new JTextField();
		component.setText("This JTextField is enabled.");
		this.add(component);

		component = new JTextField();
		component.setEnabled(false);
		component.setText("This JTextField is disabled.");
		this.add(component);
	}

	@Override
	public void modelPropertyChange(final PropertyChangeEvent event) {

	}
}
