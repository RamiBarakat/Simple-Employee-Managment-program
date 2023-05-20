package Assignment3;
import java.util.Date;
//class shift supervisor that inherits Employee
public class ShiftSupervisor extends Employee {
private double monthSalary;
private double bonus;
private double productProduced;
private double productMustBeProduced;
//no-arg constructor 
public ShiftSupervisor() {
	this("","", new Date(), new Address(),0.0, 0.0, 0, 0);
	
}
//a constructor that passes variables and also super to the superclass variables.
public ShiftSupervisor(String name, String id, Date hireDate, Address address,double monthSalary, double bonus, int productProduced, int productMustBeProduced) {
	super(name, id, hireDate, address);
	this.monthSalary = monthSalary;
	this.bonus = bonus;
	this.productProduced = productProduced;
	this.productMustBeProduced = productMustBeProduced;
}
//setters and getters for the different 
public double getMonthSalary() {
	return monthSalary;
}

public void setMonthSalary(double monthSalary) {
	this.monthSalary = monthSalary;
}

public double getBonus() {
	return bonus;
}

public void setBonus(double bonus) {
	this.bonus = bonus;
}

public double getProductProduced() {
	return productProduced;
}

public void setProductProduced(double productProduced) {
	this.productProduced = productProduced;
}

public double getProductMustBeProduced() {
	return productMustBeProduced;
}

public void setProductMustBeProduced(double productMustBeProduced) {
	this.productMustBeProduced = productMustBeProduced;
}
// a method that calculates the total salary depending on the product produced and the product that must be produced.
public double getTotalSalary() {
	double salary=0.0;
	if (productProduced >= productMustBeProduced) {
		salary = monthSalary + bonus;
	}
	else {
		salary = monthSalary;
	}
	return salary;
}
// to string method to print all the info regarding shiftSupervisor.
@Override
public String toString() {
	
	if( monthSalary<0 || bonus<0 ||productProduced<=0 || productMustBeProduced<=0  ) {
		return "======SHIFTSUPERVISOR====" + super.toString() + "please check the values entered to be valid to calculate salary right";
	}
	
	else {
	
	return    "======SHIFTSUPERVISOR====\n" + super.toString() + "- monthSalary=" + monthSalary + "\n- bonus=" + bonus + "\n- productProduced=" + productProduced
			+ "\n- productMustBeProduced=" + productMustBeProduced + "\n- Total salary = " + getTotalSalary();
}
}








}
