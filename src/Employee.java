package Assignment3;

import java.util.Date;
//Employee class in the superclass after the object class in this assignment and we put all the info regarding the employee.
public class Employee {
private String name;
private  String id;
private Date hireDate;
private Address address;//Address is the class that we created.
//no-arg constructor for employee that doesnt pass anything
public Employee() {
	this("", "", new Date(), new Address());
}
//arg-constructor for Employee that passes all the attributes 
public Employee(String name, String id, Date hireDate, Address address) {
	super();
	this.name = name;
	this.id = id;
	this.hireDate = hireDate;
	this.address = address;
}

//setters and getters for the different variables in this class to use if needed.
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public Date getHireDate() {
	return hireDate;
}

public void setHireDate(Date hireDate) {
	this.hireDate = hireDate;
}

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}
//this function scans the format XXX-L and determines if the id entered is right or wrong or if it has a problem
public boolean isEmpNumberValid() {
	String s1 = id;
	//String[] s2=s1.split("-");
	//char[] ss = s1.toCharArray();
	//here first we check the length of the format as it is known to be 5 in size as if it is not 5 the program returns false value.
		if(s1.length() != 5) {
			return false;
		}
		//here we know that"-" index is 3 so if index 3 is not "-" then it returns false
		if(s1.charAt(3) != '-') {
			return false;
		}
		//we check the first 3 characters if any one of them is not a number from 0 to 9 then the program returns false
		for (int i=0 ;i<=2;i++) {
			if(s1.charAt(i)>'9' || s1.charAt(i)<'0') {
				return false;
			}
		}
		//we check the last character as it must be between A and M, please notice that we made all of it in (uppercase) in the beginning
		if(s1.charAt(4) < 'A' || s1.charAt(4) >'M') {
			return false;
		}
		return true;

}
// to string method to print the information
@Override
public String toString() {
	//checks if the empnumber(id) is invalid and prints it.
	if (isEmpNumberValid() == false) {
		return "\n- Name=" + name + "\n- ID = is invalid(please change it to the format) " + id + "\n- HireDate= " + hireDate + "\n- Address=" + address
				+ "\n";
	}
	else 
	return "- Name=" + name + "\n- ID=" + id + "\n- hireDate=" + hireDate + "\n- Address=" + address
			+ "\n";
}



}
