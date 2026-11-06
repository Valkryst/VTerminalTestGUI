package com.valkryst.VTerminalTestGUI.controller;

import com.valkryst.VTerminal.plaf.VTerminalLookAndFeel;
import com.valkryst.VTerminalTestGUI.Display;
import com.valkryst.VTerminalTestGUI.view.*;

import javax.swing.*;
import java.awt.*;

public class DefaultController extends Controller {
	public void displayMainView() {
		Display.getInstance().setLayout(new BorderLayout());

		final var renderingHintsCheckBox = new JCheckBox("High-Quality Rendering Hints", true);
		renderingHintsCheckBox.addActionListener(e -> {
			VTerminalLookAndFeel.enableHighQualityRendering(renderingHintsCheckBox.isSelected());
			Display.getInstance().getFrame().repaint();
		});
		final var toolbar = new JPanel(new FlowLayout(FlowLayout.LEFT));
		toolbar.add(renderingHintsCheckBox);
		Display.getInstance().getFrame().add(toolbar, BorderLayout.NORTH);

		final var tabbedPaneView = new TabbedPaneView();
		this.addView(tabbedPaneView, BorderLayout.CENTER);

		tabbedPaneView.addTab("Button", new ButtonView());
		tabbedPaneView.addTab("Check Box", new CheckBoxView());
		tabbedPaneView.addTab("Editor Pane", new EditorPaneView());
		tabbedPaneView.addTab("Filtered VPanel", new FilteredPanelView());
		tabbedPaneView.addTab("Label", new LabelView());
		tabbedPaneView.addTab("Layered Pane", new LayeredPaneView());
		tabbedPaneView.addTab("Password Field", new PasswordFieldView());
		tabbedPaneView.addTab("Progress Bar", new ProgressBarView());
		tabbedPaneView.addTab("Radio Button", new RadioButtonView());
		tabbedPaneView.addTab("Scroll Pane", new ScrollPaneView());
		tabbedPaneView.addTab("Text Area", new TextAreaView());
		tabbedPaneView.addTab("Text Field", new TextFieldView());
		tabbedPaneView.addTab("Text Pane", new TextPaneView());
		tabbedPaneView.addTab("VPanel", new PanelView());
	}
}
