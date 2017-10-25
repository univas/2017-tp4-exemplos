package br.edu.univas.products;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ProductDataPanel extends JPanel {

	private static final long serialVersionUID = -8033093147373255219L;

	private JLabel nameLabel;
	private JLabel quantityLabel;
	private JLabel codeLabel;

	private JTextField nameTextField;
	private JTextField quantityTextField;
	private JTextField codeTextField;

	public ProductDataPanel() {
		initialize();
	}

	private void initialize() {
		setLayout(new GridLayout(3, 2, 10, 10));
		setBorder(new EmptyBorder(10, 10, 10, 10));

		add(getNameLabel());
		add(getNameTextField());
		add(getQuantityLabel());
		add(getQuantityTextField());
		add(getCodeLabel());
		add(getCodeTextField());
	}

	private JLabel getNameLabel() {
		if (nameLabel == null) {
			nameLabel = new JLabel();
			nameLabel.setText("Nome");
		}
		return nameLabel;
	}

	private JLabel getQuantityLabel() {
		if (quantityLabel == null) {
			quantityLabel = new JLabel();
			quantityLabel.setText("Quantidade");
		}
		return quantityLabel;
	}

	private JLabel getCodeLabel() {
		if (codeLabel == null) {
			codeLabel = new JLabel();
			codeLabel.setText("Código");
		}
		return codeLabel;
	}

	private JTextField getNameTextField() {
		if (nameTextField == null) {
			nameTextField = new JTextField();
			nameTextField.setColumns(10);
		}
		return nameTextField;
	}

	private JTextField getQuantityTextField() {
		if (quantityTextField == null) {
			quantityTextField = new JTextField();
		}
		return quantityTextField;
	}

	private JTextField getCodeTextField() {
		if (codeTextField == null) {
			codeTextField = new JTextField();
		}
		return codeTextField;
	}

	public Product getProduct() {
		Product product = new Product();
		product.setName(getNameTextField().getText());
		product.setQuantity(getQuantityTextField().getText());
		product.setCode(getCodeTextField().getText());
		return product;
	}

}
