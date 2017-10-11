package br.edu.univas.si4.tp4.lojaonline.controller;

import javax.swing.JOptionPane;

import br.edu.univas.si4.tp4.lojaonline.model.ProductDAO;
import br.edu.univas.si4.tp4.lojaonline.view.ListProductsFrame;
import br.edu.univas.si4.tp4.lojaonline.view.MainFrame;

public class SearchController {

	private MainFrame mainFrame;
	private ListProductsFrame listProductsFrame;
	private ProductDAO productDAO;

	public SearchController() {
		mainFrame = new MainFrame(this);
		listProductsFrame = new ListProductsFrame(this);
		productDAO = new ProductDAO();
	}

	public void initialize() {
		mainFrame.setVisible(true);
	}

	public void search(String productName) {
		JOptionPane.showMessageDialog(null, "Search string: " + productName);
		// TODO: Implementar...
	}

}
