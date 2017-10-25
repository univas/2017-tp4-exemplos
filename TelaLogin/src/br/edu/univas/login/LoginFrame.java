package br.edu.univas.login;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import br.edu.univas.components.ButtonsListener;
import br.edu.univas.components.ButtonsPanel;

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
			buttonsPanel.addButtonsListener(new ButtonsListener() {
				@Override
				public void okPerformed() {
					okClicked();
				}
				@Override
				public void cancelPerformed() {
					cancelClicked();
				}
				@Override
				public void helpPerformed() {
					helpClicked();
				}
			});
		}
		return buttonsPanel;
	}

	private void okClicked() {
		User user = getUserPanel().getUser();
		if ("admin".equals(user.getName()) && "1234".equals(user.getPassword())) {
			JOptionPane.showMessageDialog(this, "Logado com sucesso!");
		} else {
			JOptionPane.showMessageDialog(this, "Erro no logon!",
					"Erro", JOptionPane.ERROR_MESSAGE);
		}
	}

	private void cancelClicked() {
		System.exit(0);
	}

	private void helpClicked() {
		JOptionPane.showMessageDialog(this, "Entre com usuário e senha",
				"Ajuda", JOptionPane.QUESTION_MESSAGE);
	}

	public static void main(String[] args) {
		new LoginFrame().setVisible(true);
	}

}
