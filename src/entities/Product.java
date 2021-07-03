package entities;



public class Product {

	private String Name;
	private Double price;
	private int quantidade;


	// construtores
	public Product(String name, Double price,int quatidade) {
		this.Name = name;
		this.price = price; 
		this.quantidade=quatidade;
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
	

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
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
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		return true;
	}
	
	
	
	
	
}