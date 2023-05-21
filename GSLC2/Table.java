package GSLC2;

public class Table extends FurnitureType{
	public Table(String name, double price, int qty) {
		super(name, price, qty);

	}
	
	public void producing() {
		System.out.println("Please wait for your order to be processed");
		System.out.println("Producing " + qty + " order(s) of " + name);
	}
		
}