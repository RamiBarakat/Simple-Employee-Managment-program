package Assignment3;
import java.util.Date;

public class ProductionWorker extends Employee {
// we define the class varibles here
private int shift;
private double hourlyPayrate;
private double numOfhoursPerMonth;

//no-arg constructor
public ProductionWorker() {
this("","", new Date(), new Address(), 1, 0, 0);
}
//arg constructor to pass the variables and super to pass it to the superclass
	public ProductionWorker(String name, String id, Date hireDate,Address address, int shift,double hourlyPayrate,double numOfhoursPerMonth) {
		super(name, id, hireDate, address);
		this.shift = shift;
		this.hourlyPayrate = hourlyPayrate;
		this.numOfhoursPerMonth = numOfhoursPerMonth;
	}
//setters and getters to get all the variables 
	public int getShift() {
		return shift;
	}

	public void setShift(int shift) {
		this.shift = shift;
	}

	public double getHourlyPayrate() {
		return hourlyPayrate;
	}

	public void setHourlyPayrate(double hourlyPayrate) {
		this.hourlyPayrate = hourlyPayrate;
	}

	public double getNumOfhoursPerMonth() {
		return numOfhoursPerMonth;
	}

	public void setNumOfhoursPerMonth(double numOfhoursPerMonth) {
		this.numOfhoursPerMonth = numOfhoursPerMonth;
	}
//method to get the total salary depending on the shift.
	public double getTotalSalary() {
			double salary=0;
			//if the shift isn't 1 or 2 then the shift is invalid
			if ( shift != 1&& shift != 2) {
				salary = 0;
			}
			
			//if the shift is 1 then it calculates the salary depending on hours per month with bonus
			if ( shift == 1) {
				
				if (numOfhoursPerMonth > 208) {
					salary = (hourlyPayrate*numOfhoursPerMonth) + (hourlyPayrate*(numOfhoursPerMonth - 208) *1.25);
				}
				else {
					salary = (hourlyPayrate*numOfhoursPerMonth);
				}
				
			}
			
		// if shift is two it sees how many hours in a month and determines how much salary must be calculated
			if (shift == 2) {
				
			     if (numOfhoursPerMonth > 182) {
			    	 salary = (hourlyPayrate*numOfhoursPerMonth) + (hourlyPayrate * (numOfhoursPerMonth - 182)*1.5);
			    		 
			     }
			
			     else {
			    	 salary = (hourlyPayrate*numOfhoursPerMonth);
			     }
			
			}
			
			return salary;
					
					
					
		}
//to string method to print the information.
	@Override
	public String toString() {
		if(getTotalSalary() == 0 || shift < 0 || shift >2) {
			return "======PRODUCTIONWORKER======\n" + super.toString() + "please check if the SHIFT is valid or hourlyPayRate is valid";
		}
		else if(hourlyPayrate <= 0 || numOfhoursPerMonth <=0) {
			
			return "======PRODUCTIONWORKER======\n" + super.toString() + "please check if the hourlyPayrate or numberOfHoursPerMonth is valid";
			
		}
		else
		return "======PRODUCTIONWORKER======\n" + super.toString() +  "- shift=" + shift + "\n- hourlyPayrate=" + hourlyPayrate + "\n-  numOfhoursPerMonth="
				+ numOfhoursPerMonth + "\n- Salary = " + getTotalSalary();
	}

		
	






}
