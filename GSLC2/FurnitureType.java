package GSLC2;

public abstract class FurnitureType implements Order {
	String name;
	double price;
	int amount;
	
	public FurnitureType(String name, double price, int amount) {
		this.name=name;
		this.price=price;
		this.amount=amount;
	}
	
	public abstract void producing();
	
	
	public void viewOrder() {
		System.out.println("Item: "+amount+ " "+name);
	}
	
	public void viewPrice() {
		System.out.println("$"+price*amount);
	}

}