package Quiz1;

import java.util.List;
import java.util.ArrayList;

public class main {
	private static List<Person> people;
	private static List<Employer> employers;
	
	public static void main (String[] args) {
		employers = new ArrayList<Employer>();
	    people = new ArrayList<Person>();
	
	    // aggregation (has a) relationship
	    // person have aggregation relationship with address. (address is optional)
	
	    // compoisition (part of) relationship
	    // employer have composition relationship with person. (employer cannot exist without a person)
	    	    
	    Address a1 = new Address("21 Jump St", "Kupang", "IND");
	    Address a2 = new Address("606 Sesame St", "Bagan-Siapiapi", "IND");
	    Address a3 = new Address("101 Not Found St", "New York", "IND");
	    Employer emply1 = new Employer("Spotipai", "Teknologi");
	    Employer emply2 = new Employer("Mikrosop", "Teknologi");
	    Employer emply3 = new Employer("Syopi", "Teknologi");
	    Person prsn1 = emply1.addEmployee(new Person("Didi", 19, a2));
	    Person prsn2 = emply1.addEmployee(new Person("Meimei", 30, a3));
	    Person prsn3 = emply2.addEmployee(new Person("Mamet", 23, a1));
	    Person prsn4 = emply2.addEmployee(new Person("Siti", 28, a2));
	    Person prsn5 = emply3.addEmployee(new Person("Jono", 33, a3));
	    employers.add(emply1);
	    employers.add(emply2);
	    employers.add(emply3);
	    people.add(prsn1);
	    people.add(prsn2);
	    people.add(prsn3);
	    people.add(prsn4);
	    people.add(prsn5);
	    
	    // if employer object is destroyed, all address objects related will still exist. (aggregation)
	    // if employer object is destroyed, all person objects related will be destroyed as well. (composition)
	    // https://www.geeksforgeeks.org/association-composition-aggregation-java/
	
	    // task 1: print with proper relationship
	    System.out.println("Task 1");
	    // print out each employee belonging to each employer
	    System.out.println("INDUSTRY");
	    for (Employer emply: employers) {
	        for (Person prsn : emply.getEmployees()) {
	            System.out.println(prsn.getName() + " works in " + emply.getName());
	        }
	    }
	    
	    // print out each employee's address
	    System.out.println();
	    System.out.println("ACCOMODATION");
	    for (Person prsn : people) {
	        if (prsn.getAddress() == null) {
	        	System.out.println(prsn.getName() + " does not have an address recorded.");
	        } else {
	            System.out.println(prsn.getName() + " lives at " + prsn.getAddress().getStreet());
	        }
	    }
	    
	    
	    // task 2: print without proper relationship
	    System.out.println();
	    System.out.println("Task 2");
	    // print out each employee belonging to each employer
	    Employer emply4 = new Employer("Lojitek", "Teknologi");
	    emply4.addEmployeeStr("Mili");
	    emply4.addEmployeeStr("Febz");
	    emply4.addEmployeeStr("Susan");
	
	    for (String prsn : emply4.getEmployeesStr()) {
	        System.out.println(prsn + " works in " + emply4.getName());
	    }
	}

}