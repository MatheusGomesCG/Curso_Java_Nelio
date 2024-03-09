package entities;

public class Product {
	
	private String name;
	private double price;
	private int quantity;
	
	public Product () {
		
	}
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double totalValuelnStock() {
		return quantity * price;
	}
	
	public void addProducts(int x) {
		this.quantity += x;
	}
	
	public void removeProducts(int x) {
		this.quantity -= x;
	}
	
	public String toString() {
		return name
			+ ", $ "
			+ String.format("%.2f", price)
			+ ", "
			+ quantity
			+ " units, Total: $ "
			+ String.format("%.2f", totalValuelnStock());
	}
}
