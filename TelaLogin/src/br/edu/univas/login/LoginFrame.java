package br.edu.univas.login;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class LoginFrame extends JFrame {

	private static final long serialVersionUID = -4249047705813459153L;

	private UserPanel userPanel;
	private ButtonsPanel buttonsPanel;

	public LoginFrame() {
		super("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		initialize();

		pack();
		setLocationRelativeTo(null);
		setResizable(false);
	}

	private void initialize() {
		add(getUserPanel(), BorderLayout.CENTER);
		add(getButtonsPanel(), BorderLayout.PAGE_END);
	}

	private UserPanel getUserPanel() {
		if (userPanel == null) {
			userPanel = new UserPanel();
		}
		return userPanel;
	}

	private ButtonsPanel getButtonsPanel() {
		if (buttonsPanel == null) {
			buttonsPanel = new ButtonsPanel();
		}
		return buttonsPanel;
	}

	public static void main(String[] args) {
		new LoginFrame().setVisible(true);
	}

}
