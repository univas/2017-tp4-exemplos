package br.edu.univas.components;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonsPanel extends JPanel {

	private static final long serialVersionUID = 1273697780699353921L;

	private JButton okButton;
	private JButton cancelButton;
	private JButton helpButton;

	private ArrayList<ButtonsListener> listeners = new ArrayList<>();

	public ButtonsPanel() {
		initialize();
	}

	private void initialize() {
		add(getOkButton());
		add(getCancelButton());
		add(getHelpButton());
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

	private JButton getHelpButton() {
		if (helpButton == null) {
			helpButton = new JButton();
			helpButton.setText("Ajuda");
			helpButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					helpClicked();
				}
			});
		}
		return helpButton;
	}

	public void addButtonsListener(ButtonsListener listener) {
		listeners.add(listener);
	}

	private void okClicked() {
		for (ButtonsListener listener : listeners) {
			listener.okPerformed();
		}
	}

	private void cancelClicked() {
		for (ButtonsListener listener : listeners) {
			listener.cancelPerformed();
		}
	}

	private void helpClicked() {
		for (ButtonsListener listener : listeners) {
			listener.helpPerformed();
		}
	}

}
