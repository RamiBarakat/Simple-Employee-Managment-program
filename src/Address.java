package Assignment3;
//this class is an aggregation from the class Employee as it has many attributes so we make an address class(object) 
public class Address {
private String street;
private String state;
private String city;
private String zipcode;
//no-arg constructor
public Address () {
	this("","","","");
	
}
//constructor that has arguments as we pass all the strings
public Address(String street, String state, String city, String zipcode) {
	super();
	this.street = street;
	this.state = state;
	this.city = city;
	this.zipcode = zipcode;
}
//to string method to print the inforamtion
@Override
public String toString() {
	return "[street=" + street + ", state=" + state + ", city=" + city + ", zipcode=" + zipcode + "]";
}
//from here to the bottom we only generate getters and setters for this class to usse if needed.
public String getStreet() {
	return street;
}

public void setStreet(String street) {
	this.street = street;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getZipcode() {
	return zipcode;
}

public void setZipcode(String zipcode) {
	this.zipcode = zipcode;
}


}
