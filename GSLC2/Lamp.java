package GSLC2;

public class Lamp extends FurnitureType{
	public Lamp(String name, double price, int amount) {
		super(name, price, amount);

	}
	
	public void producing() {
		System.out.println("Please wait for your order to be processed");
		System.out.println("Producing " + amount + " order(s) of " + name);
	}
		
}