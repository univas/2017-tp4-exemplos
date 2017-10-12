package br.edu.univas.si4.tp4.lojaonline.view;

import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

import br.edu.univas.si4.tp4.lojaonline.model.Product;

public class ListProductsFrame extends JFrame {

	private static final long serialVersionUID = -2672518326382307252L;

	private JScrollPane listProductsScrollPane;
	private JList<Product> listProductsList;

	private DefaultListModel<Product> listProductsListModel;

	public ListProductsFrame() {
		super("List of Products");

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		initialize();
		pack();
		setLocationRelativeTo(null);
		setResizable(false);
	}

	private void initialize() {
		add(getListProductsScrollPane());
	}

	private JScrollPane getListProductsScrollPane() {
		if (listProductsScrollPane == null) {
			listProductsScrollPane = new JScrollPane();
			listProductsScrollPane.setViewportView(getListProductsList());
			listProductsScrollPane.setPreferredSize(new Dimension(300, 200));
		}
		return listProductsScrollPane;
	}

	private JList<Product> getListProductsList() {
		if (listProductsList == null) {
			listProductsList = new JList<>();
			listProductsList.setModel(getListProductsListModel());
		}
		return listProductsList;
	}

	private DefaultListModel<Product> getListProductsListModel() {
		if (listProductsListModel == null) {
			listProductsListModel = new DefaultListModel<>();
		}
		return listProductsListModel;
	}

	public void populateList(ArrayList<Product> products) {
		for (Product product : products) {
			getListProductsListModel().addElement(product);
		}
	}

}
