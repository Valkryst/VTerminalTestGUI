package com.valkryst.VTerminalTestGUI.view;

import javax.swing.JTextArea;

import java.awt.*;
import java.beans.PropertyChangeEvent;

public class TextAreaView extends View {
	public TextAreaView() {
		this.setLayout(new GridLayout(2, 1, 16, 16));

		var component = new JTextArea(10, 32);
		component.setLineWrap(true);
		component.setText("This JTextArea is enabled.");
		this.add(component);

		component = new JTextArea(10, 32);
		component.setEnabled(false);
		component.setLineWrap(true);
		component.setText("This JTextArea is disabled.");
		this.add(component);
	}

	@Override
	public void modelPropertyChange(final PropertyChangeEvent event) {
	}
}
