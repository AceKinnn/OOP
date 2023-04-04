package Quiz2;

import java.util.*;

class Person{
//	Person Attribute
	String name;
	String born_date;

//	Person Constructor
	public Person(String name, String born_date) {
		this.name = name;
		this.born_date = born_date;
	}
	
//	Person Method
	void sleep() {
		System.out.println("You have slept!");
	}
}

class Mahasiswa extends Person{
//	Mahasiswa Attribute
	String student_id;
	int point;
	
//	Mahasiswa Constructor
	public Mahasiswa(String name, String born_date, String student_id, int point) {
//		Attribute name and born date are inherited from the parent (Person)
		super(name, born_date);
		this.student_id = student_id;
		this.point = point;
	}
	
//	Mahasiswa Method
	void helpingDosen() {
		point += 10;
		System.out.println("You have help your lecturer!");
		System.out.println("You have got plus points: 10");
		System.out.println("Now, you have " + point + " points");
	}
}

class Dosen extends Person{
//	Dosen Attribute
	String code_dosen;
	int point;
	
	public Dosen(String name, String born_date, String code_dosen, int point) {
//		Attribute name and born date are inherited from the parent (Person)
		super(name, born_date);
		this.code_dosen = code_dosen;
		this.point = point;				
	}
	
//	Dosen Methods
	void selfDev(int increment) {
		point += increment;
		System.out.println("You have develop yourself!");
		System.out.println("You have got plus points: " + increment);
		System.out.println("Now, you have " + point + " points");
	}
	void teach(int increment) {
		point += increment;
		System.out.println("You have teach your student!");
		System.out.println("You have got plus points: " + increment);
		System.out.println("Now, you have " + point + " points");
	}
	void p2m(int increment) {
		point += increment;
		System.out.println("You have done community service!");
		System.out.println("You have got plus points: " + increment);
		System.out.println("Now, you have " + point + " points");
	}
	void otherWorks(int increment) {
		point += increment;
		System.out.println("You have done other works!");
		System.out.println("You have got plus points: " + increment);
		System.out.println("Now, you have " + point + " points");
	}
}


public class Main {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();		
	}
	
	public static void menu() {
//		Display list of roles in a university and let the user chose
		System.out.println("University");
		System.out.println("-------------");
		System.out.println("1. Commoner");
		System.out.println("2. Student");
		System.out.println("3. Lecturer");
		System.out.println("-------------");
		System.out.println("Insert chosen role [number]:");
		System.out.print(">> ");
		int pilihan = scan.nextInt();
		clearScreen();
		if (pilihan == 1) person();
		else if (pilihan == 2) student();
		else if (pilihan == 3) lecturer();
		menu();
	}
	
	public static void person() {
		System.out.println("Commoner");
		System.out.println("------------------");
//		User is prompt to input their personal information
		System.out.println("Insert your name and born date!");
		
//		Variable empty is used to prevent the next scanner scan wrong line
		String empty = scan.nextLine();
		Person p = new Person(scan.nextLine(), scan.nextLine());
		
//		Display user personal information
		System.out.println("Name: " + p.name);
		System.out.println("Born Date: " + p.born_date);
		
//		Display list of task of Person and let user chose
		System.out.println("Task:");
		System.out.println("1. Sleep");
		System.out.println("2. Exit");
		System.out.println("-------------");
		System.out.println("Insert chosen task [number]:");
		System.out.print(">> ");
		int choose = scan.nextInt();
		if (choose == 1) {
			p.sleep();
			System.out.println("Enter to continue..");
			scan.nextLine();
			scan.nextLine();
		}
		else if (choose == 2) {
//			User has exit the person method
			clearScreen();
			menu();
		}
		
//		If user has done task 1 OR input other number than 1 or 2, user is directed to person method again
		clearScreen();
		person();
	}
	
	public static void student() {
		System.out.println("University Student");
		System.out.println("------------------");
//		User is prompt to input their personal information
		System.out.println("Insert your name, born date, student id, and current points!");

//		Variable empty is used to prevent the next scanner scan wrong line
		String empty = scan.nextLine();
		Mahasiswa m = new Mahasiswa(scan.nextLine(), scan.nextLine(), scan.nextLine(), scan.nextInt());
		
//		Display user personal information
		System.out.println("Name: " + m.name);
		System.out.println("Born Date: " + m.born_date);
		System.out.println("Student ID: " + m.student_id);
		System.out.println("Current Point:" + m.point);
		
//		Display list of task of student and let user chose
		System.out.println("Task:");
		System.out.println("1. Sleep");
		System.out.println("2. Help Lecturer");
		System.out.println("3. Exit");
		System.out.println("-------------");
		System.out.println("Insert chosen task [number]:");
		System.out.print(">> ");
		int choose = scan.nextInt();
		if (choose == 1) {
			m.sleep();
			System.out.println("You have got -10 points!");
			System.out.println("Now, you have " + (m.point -10)+ " points");
			System.out.println("Start to help others again!");
			
		}
		else if (choose == 2) m.helpingDosen();
		else if (choose == 3) {
//			User has exit the student method
			clearScreen();
			menu();
		}
		
		System.out.println("Enter to continue..");
		scan.nextLine();
		scan.nextLine();
		
//		If user has done task 1 OR input other number, user is directed to student method again
		clearScreen();
		student();
	}
		
	public static void lecturer() {
		System.out.println("University Lecturer");
		System.out.println("------------------");
//		User is prompt to input their personal information
		System.out.println("Insert your name, born date, lecturer code, and current points!");
		
//		Variable empty is used to prevent the next scanner scan wrong line
		String empty = scan.nextLine();
		Dosen d = new Dosen(scan.nextLine(), scan.nextLine(), scan.nextLine(), scan.nextInt());
		
//		Display user personal information
		System.out.println("Name: " + d.name);
		System.out.println("Born Date: " + d.born_date);
		System.out.println("Lecturer Code: " + d.code_dosen);
		System.out.println("Current Point:" + d.point);
		
//		Display list of task of lecturer and let user chose
		System.out.println("Task:");
		System.out.println("1. Sleep");
		System.out.println("2. Self Development");
		System.out.println("3. Teach Students");
		System.out.println("4. Community Service");
		System.out.println("5. Other Works");
		System.out.println("6. Exit");
		System.out.println("-------------");
		System.out.println("Insert chosen task [number]:");
		System.out.print(">> ");
		int choose = scan.nextInt();
		if (choose == 1) {
			d.sleep();
			System.out.println("You have got -10 points!");
			System.out.println("Now, you have " + (d.point -10)+ " points");
			System.out.println("Start to be productive again!");
			
		}
		else if (choose == 2) d.selfDev(15);
		else if (choose == 3) d.teach(10);
		else if (choose == 4) d.p2m(20);
		else if (choose == 5) d.otherWorks(5);
		else if (choose == 6) {
//			User has exit the lecturer method
			clearScreen();
			menu();
		}
		System.out.println("Enter to continue..");
		scan.nextLine();
		scan.nextLine();
		
//		If user has done task 1 OR input other number, user is directed to person method again
		clearScreen();
		lecturer();
	}
	
	public static void clearScreen() {
//		This method is intended to clear the screen, displaying a more neat menu
		for (int i = 0; i < 25; i ++)
			System.out.println("");
	    System.out.flush();
	    System.out.println(" ");
	}
}
