package br.edu.univas.login;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

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

	private GridBagConstraints nameLabelConstraints;
	private GridBagConstraints nameTextFieldConstraints;
	private GridBagConstraints passwordLabelConstraints;
	private GridBagConstraints passwordFieldConstraints;

	public UserPanel() {
		initialize();
	}

	private void initialize() {
		setBorder(new EmptyBorder(10, 10, 10, 10));
		setLayout(new GridBagLayout());

		add(getNameLabel(), getNameLabelConstraints());
		add(getNameTextField(), getNameTextFieldConstraints());
		add(getPasswordLabel(), getPasswordLabelConstraints());
		add(getPasswordField(), getPasswordFieldConstraints());
	}

	private JLabel getNameLabel() {
		if (nameLabel == null) {
			nameLabel = new JLabel();
			nameLabel.setText("Nome do usuário:");
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

	private GridBagConstraints getNameLabelConstraints() {
		if (nameLabelConstraints == null) {
			nameLabelConstraints = new GridBagConstraints();
			nameLabelConstraints.gridx = 0;
			nameLabelConstraints.gridy = 0;
			nameLabelConstraints.anchor = GridBagConstraints.LINE_START;
			nameLabelConstraints.insets = new Insets(5, 5, 5, 5);
		}
		return nameLabelConstraints;
	}

	private GridBagConstraints getNameTextFieldConstraints() {
		if (nameTextFieldConstraints == null) {
			nameTextFieldConstraints = new GridBagConstraints();
			nameTextFieldConstraints.gridx = 1;
			nameTextFieldConstraints.gridy = 0;
			nameTextFieldConstraints.ipadx = 100;
			nameTextFieldConstraints.insets = new Insets(5, 5, 5, 5);
		}
		return nameTextFieldConstraints;
	}

	private GridBagConstraints getPasswordLabelConstraints() {
		if (passwordLabelConstraints == null) {
			passwordLabelConstraints = new GridBagConstraints();
			passwordLabelConstraints.gridx = 0;
			passwordLabelConstraints.gridy = 1;
			passwordLabelConstraints.anchor = GridBagConstraints.LINE_START;
			passwordLabelConstraints.insets = new Insets(5, 5, 5, 5);
		}
		return passwordLabelConstraints;
	}

	private GridBagConstraints getPasswordFieldConstraints() {
		if (passwordFieldConstraints == null) {
			passwordFieldConstraints = new GridBagConstraints();
			passwordFieldConstraints.gridx = 1;
			passwordFieldConstraints.gridy = 1;
			passwordFieldConstraints.ipadx = 100;
			passwordFieldConstraints.insets = new Insets(5, 5, 5, 5);
		}
		return passwordFieldConstraints;
	}

}
