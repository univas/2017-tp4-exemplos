package br.edu.univas.login;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class UserPanel extends JPanel {

	private static final long serialVersionUID = 8138191159403886908L;

	private JLabel nameLabel;
	private JTextField nameTextField;
	private JLabel passwordLabel;
	private JPasswordField passwordField;

	public UserPanel() {
		initialize();
	}

	private void initialize() {
		setBorder(new EmptyBorder(10, 10, 10, 10));
		setLayout(new GridLayout(2, 2, 5, 5));

		add(getNameLabel());
		add(getNameTextField());
		add(getPasswordLabel());
		add(getPasswordField());
	}

	private JLabel getNameLabel() {
		if (nameLabel == null) {
			nameLabel = new JLabel();
			nameLabel.setText("Nome:");
		}
		return nameLabel;
	}

	private JTextField getNameTextField() {
		if (nameTextField == null) {
			nameTextField = new JTextField();
		}
		return nameTextField;
	}

	private JLabel getPasswordLabel() {
		if (passwordLabel == null) {
			passwordLabel = new JLabel();
			passwordLabel.setText("Senha:");
		}
		return passwordLabel;
	}

	private JPasswordField getPasswordField() {
		if (passwordField == null) {
			passwordField = new JPasswordField();
		}
		return passwordField;
	}

}
