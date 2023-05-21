package GSLC2;

import java.util.Scanner;

//Both abstract classes and interfaces are used to define common behavior and establish contracts for classes that implement them.
//Abstract class cannot be instantiated directly and can contain a combination of concrete and abstract methods, as well as member variables and constructors. Provides partial implementation and specialize further through inheritance
//Interface only declares method signatures, constants, and events, without any implementation. It is useful for unrelated classes or enforcing specific behavior.
//While a class can inherit from only one abstract class, it can implement multiple interfaces, allowing for multiple inheritance of type.

public class main {

	private static Scanner scan;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
	}

	public static void menu(){
		scan = new Scanner(System.in);
		header();
		System.out.println("Choose furniture desired to be bought");
		System.out.println("1. Table");
		System.out.println("2. Chair");
		System.out.println("3. Lamp");
		System.out.println("4. Bookcase");
		System.out.println("5. Bed");
		System.out.println("6. Exit");
		System.out.println("=======================================");
		int num;
		num = scan.nextInt();
		
		clearScreen();
		header();
		
		switch(num) {
		case 1:
			tableSelection();
			break;
		case 2:
			chairSelection();
			break;
		case 3:
			lampSelection();
			break;
		case 4:
			bookcaseSelection();
			break;
		case 5:
			bedSelection();
			break;
		default:
			System.out.println("Thank you for choosing K-Furniture");
			break;
		}
		scan.nextLine();
		scan.nextLine();
		menu();
	}
	
	public static void header() {
		System.out.println("=======================================");
		System.out.println("K-Furniture");
		System.out.println("=======================================");
	}
	
	public static void clearScreen() {  
		for (int i = 0; i < 25; i ++)
			System.out.println("");
	    System.out.flush();
	    System.out.println(" ");
	}
	
	public static void tableSelection() {
		System.out.println("1. Bar Table");
		System.out.println("2. Dining Table");
		System.out.println("3. Coffee Table");
		System.out.println("4. Work Desk");
		System.out.println("=======================================");
		int opt;
		opt = scan.nextInt();
		String tableType = "";
		double tablePrice = 0.0;

		switch (opt) {
		    case 1:
		        tableType = "Bar Table";
		        tablePrice = 110.99;
		        break;
		    case 2:
		        tableType = "Dining Table";
		        tablePrice = 150.99;
		        break;
		    case 3:
		        tableType = "Coffee Table";
		        tablePrice = 99.99;
		        break;
		    case 4:
		        tableType = "Work Desk";
		        tablePrice = 145.99;
		        break;
		    default:
		        System.out.println("Invalid option!");
		        break;
		}

		if (!tableType.isEmpty()) {
		    System.out.println("Enter number of orders: ");
		    int numOrders = scan.nextInt();
		    Table table = new Table(tableType, tablePrice, numOrders);
		    System.out.println();
		    table.producing();
		    table.viewOrder();
		    table.viewPrice();
		    System.out.println();
		    System.out.println("Thank you for choosing K-Furniture");
		}
	}
	public static void chairSelection() {
		System.out.println("1. Armchair");
		System.out.println("2. Recliner Chair");
		System.out.println("3. Director's Chair");
		System.out.println("4. Desk Chair");
		System.out.println("=======================================");
		int opt2;
		opt2 = scan.nextInt();
		String chairType = "";
		double chairPrice = 0.0;

		switch (opt2) {
		    case 1:
		        chairType = "Armchair";
		        chairPrice = 110.99;
		        break;
		    case 2:
		        chairType = "Recliner Chair";
		        chairPrice = 150.99;
		        break;
		    case 3:
		        chairType = "Director's Chair";
		        chairPrice = 99.99;
		        break;
		    case 4:
		        chairType = "Desk Chair";
		        chairPrice = 145.99;
		        break;
		    default:
		        System.out.println("Invalid option!");
		        break;
		}

		if (!chairType.isEmpty()) {
		    System.out.println("Enter number of orders: ");
		    int numOrders = scan.nextInt();
		    Chair chair = new Chair (chairType, chairPrice, numOrders);
		    System.out.println();
		    chair.producing();
		    chair.viewOrder();
		    chair.viewPrice();
		    System.out.println();
		    System.out.println("Thank you for choosing K-Furniture");
		}
	}
	public static void lampSelection() {
		System.out.println("1. Floor Lamp");
		System.out.println("2. Wall Lamp");
		System.out.println("3. Table Lamp");
		System.out.println("4. Desk Lamp");
		System.out.println("=======================================");
		int opt3;
		opt3 = scan.nextInt();
		String lampType = "";
		double lampPrice = 0.0;

		switch (opt3) {
		    case 1:
		        lampType = "Floor Lamp";
		        lampPrice = 110.99;
		        break;
		    case 2:
		        lampType = "Wall Lamp";
		        lampPrice = 150.99;
		        break;
		    case 3:
		        lampType = "Table Lamp";
		        lampPrice = 99.99;
		        break;
		    case 4:
		        lampType = "Desk Lamp";
		        lampPrice = 145.99;
		        break;
		    default:
		        System.out.println("Invalid option!");
		        break;
		}

		if (!lampType.isEmpty()) {
		    System.out.println("Enter number of orders: ");
		    int numOrders = scan.nextInt();
		    Lamp lamp = new Lamp (lampType, lampPrice, numOrders);
		    System.out.println();
		    lamp.producing();
		    lamp.viewOrder();
		    lamp.viewPrice();
		    System.out.println();
		    System.out.println("Thank you for choosing K-Furniture");
		}
	}
	public static void bookcaseSelection() {
		System.out.println("1. Standard Bookcase");
		System.out.println("2. Leaning Bookcase");
		System.out.println("3. Corner Bookcase");
		System.out.println("4. Cube Bookcase");
		System.out.println("=======================================");
		int opt4;
		opt4 = scan.nextInt();
		String bookcaseType = "";
		double bookcasePrice = 0.0;

		switch (opt4) {
		    case 1:
		        bookcaseType = "Standard Bookcase";
		        bookcasePrice = 110.99;
		        break;
		    case 2:
		        bookcaseType = "Leaning Bookcase";
		        bookcasePrice = 150.99;
		        break;
		    case 3:
		        bookcaseType = "Corner Bookcase";
		        bookcasePrice = 99.99;
		        break;
		    case 4:
		        bookcaseType = "Cube Bookcase";
		        bookcasePrice = 145.99;
		        break;
		    default:
		        System.out.println("Invalid option!");
		        break;
		}

		if (!bookcaseType.isEmpty()) {
		    System.out.println("Enter number of orders: ");
		    int numOrders = scan.nextInt();
		    BookCase bookcase = new BookCase (bookcaseType, bookcasePrice, numOrders);
		    System.out.println();
		    bookcase.producing();
		    bookcase.viewOrder();
		    bookcase.viewPrice();
		    System.out.println();
		    System.out.println("Thank you for choosing K-Furniture");
		}
	}
	
	public static void bedSelection() {
		System.out.println("1. Daybed");
		System.out.println("2. Futon");
		System.out.println("3. Water Bed");
		System.out.println("4. Ottoman Bed");
		System.out.println("=======================================");
		int opt5;
		opt5 = scan.nextInt();
		String bedType = "";
		double bedPrice = 0.0;

		switch (opt5) {
		    case 1:
		        bedType = "Daybed";
		        bedPrice = 110.99;
		        break;
		    case 2:
		        bedType = "Futon";
		        bedPrice = 150.99;
		        break;
		    case 3:
		        bedType = "Water Bed";
		        bedPrice = 99.99;
		        break;
		    case 4:
		        bedType = "Ottoman Bed";
		        bedPrice = 145.99;
		        break;
		    default:
		        System.out.println("Invalid option!");
		        break;
		}

		if (!bedType.isEmpty()) {
		    System.out.println("Enter number of orders: ");
		    int numOrders = scan.nextInt();
		    Bed bed = new Bed (bedType, bedPrice, numOrders);
		    System.out.println();
		    bed.producing();
		    bed.viewOrder();
		    bed.viewPrice();
		    System.out.println();
		    System.out.println("Thank you for choosing K-Furniture");
		}
	}
}