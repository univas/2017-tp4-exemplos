package br.edu.univas.products;

public class Product {

	private String name;
	private String quantity;
	private String code;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		String result = "Produto:\n";
		result += "Nome: " + name + "\n";
		result += "Quantidade: " + quantity + "\n";
		result += "Código: " + code + "\n";
		return result;
	}

}
