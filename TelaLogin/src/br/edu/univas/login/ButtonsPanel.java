package br.edu.univas.login;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonsPanel extends JPanel {

	private static final long serialVersionUID = 1273697780699353921L;

	private JButton okButton;
	private JButton cancelButton;

	public ButtonsPanel() {
		initialize();
	}

	private void initialize() {
		add(getOkButton());
		add(getCancelButton());
	}

	private JButton getOkButton() {
		if (okButton == null) {
			okButton = new JButton();
			okButton.setText("OK");
		}
		return okButton;
	}

	private JButton getCancelButton() {
		if (cancelButton == null) {
			cancelButton = new JButton();
			cancelButton.setText("Cancelar");
		}
		return cancelButton;
	}

}
