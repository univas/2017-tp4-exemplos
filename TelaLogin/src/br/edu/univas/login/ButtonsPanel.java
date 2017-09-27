package br.edu.univas.login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
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
			okButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					okClicked();
				}
			});
		}
		return okButton;
	}

	private JButton getCancelButton() {
		if (cancelButton == null) {
			cancelButton = new JButton();
			cancelButton.setText("Cancelar");
			cancelButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					cancelClicked();
				}
			});
		}
		return cancelButton;
	}

	private void okClicked() {
		JOptionPane.showMessageDialog(this, "Clicou em OK");
	}

	private void cancelClicked() {
		JOptionPane.showMessageDialog(this, "Clicou em cancelar");
	}

}
