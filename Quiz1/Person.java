package Quiz1;

public class Person {
	String name;
	int age;
	Address address;
	
	Person(String name, int age, Address address){
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    Address getAddress() {
        return address;
    }
}