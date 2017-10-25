package br.edu.univas.products;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import br.edu.univas.components.ButtonsListener;
import br.edu.univas.components.ButtonsPanel;

public class ProductFrame extends JFrame {

	private static final long serialVersionUID = 8733420325913653044L;

	private ProductDataPanel productDataPanel;
	private ButtonsPanel buttonsPanel;

	public ProductFrame() {
		super("Cadastro de produtos");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		initialize();
		pack();
		setLocationRelativeTo(null);
		setResizable(false);
	}

	private void initialize() {
		add(getProductDataPanel(), BorderLayout.CENTER);
		add(getButtonsPanel(), BorderLayout.PAGE_END);
	}

	private ProductDataPanel getProductDataPanel() {
		if (productDataPanel == null) {
			productDataPanel = new ProductDataPanel();
		}
		return productDataPanel;
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
			});
		}
		return buttonsPanel;
	}
	
	private void okClicked() {
		Product product = getProductDataPanel().getProduct();
		JOptionPane.showMessageDialog(this, product);
	}
	
	private void cancelClicked() {
	}

	public static void main(String[] args) {
		new ProductFrame().setVisible(true);
	}

}
