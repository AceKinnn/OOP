package GSLC2;

public abstract class FurnitureType implements Order {
	String name;
	double price;
	int qty;
	
	public FurnitureType(String name, double price, int qty) {
		this.name = name;
		this.price = price;
		this.qty = qty;
	}
	
	public abstract void producing();
	
	
	public void viewOrder() {
		System.out.println("Item: " + qty + " " + name);
	}
	
	public void viewPrice() {
		System.out.println("$" + price * qty);
	}

}