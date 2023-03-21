package Quiz1;

public class Address {
	String street;
	String city;
	String state;
	
	Address(String street, String city, String state){
		this.street = street;
		this.city = city;
		this.state = state;
	}
	
	String getStreet() {
        return street;
    }

    String getCity() {
        return city;
    }

    String getState() {
        return state;
    }
}
