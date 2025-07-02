package sales.savvy.dto;

import sales.savvy.entity.Product;

public class CartData {
	String username;
	Product prod;
	
	public CartData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CartData(String username, Product prod) {
		super();
		this.username = username;
		this.prod = prod;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Product getProd() {
		return prod;
	}
	public void setProd(Product prod) {
		this.prod = prod;
	}
	@Override
	public String toString() {
		return "CartData [username=" + username + ", prod=" + prod + "]";
	}
	
	
}
