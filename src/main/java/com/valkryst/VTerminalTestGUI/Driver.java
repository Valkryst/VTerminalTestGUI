package com.valkryst.VTerminalTestGUI;

import com.valkryst.VTerminal.palette.Palette;
import com.valkryst.VTerminal.plaf.VTerminalLookAndFeel;
import com.valkryst.VTerminalTestGUI.controller.DefaultController;

import javax.swing.*;
import java.io.IOException;

public class Driver {
	public static void main(final String[] args) {
		SwingUtilities.invokeLater(() -> {
			try {
				Palette.loadAndRegisterProperties(Driver.class.getResourceAsStream("/Palettes/Dracula.properties"));
			} catch (IOException e) {
				e.printStackTrace();
			}

			final var laf = VTerminalLookAndFeel.getInstance();
			try {
				UIManager.setLookAndFeel(laf);
			} catch (UnsupportedLookAndFeelException e) {
				e.printStackTrace();
			}

			final var controller = new DefaultController();
			controller.displayMainView();

			final var frame = Display.getInstance().getFrame();
			frame.pack();
			frame.setLocationRelativeTo(null);
		});
	}
}
