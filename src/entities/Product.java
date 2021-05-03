package entities;

import employee.state;

public class Product {

	private String Name;
	private Double price;
	private state estadoPedido;

	// construtores
	public Product(String name, Double price, state estadorPedido) {
		this.Name = name;
		this.price = price;
		this.estadoPedido = estadoPedido;
	}

	public Product() {

	}

	// Gettes e Setters

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	// Tostring
	@Override
	public String toString() {
		return "Product [Name=" + Name + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		result = prime * result + ((estadoPedido == null) ? 0 : estadoPedido.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		if (estadoPedido != other.estadoPedido)
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		return true;
	}

	
	
}
