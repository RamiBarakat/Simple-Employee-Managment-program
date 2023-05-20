package Assignment3;
import java.util.Date;
//team leader class that inherits production worker.
public class TeamLeader extends ProductionWorker {
private double monthlyBonus;
private double reqTrainHours;
private double trainHoursAttended;

//no-arg constructor that doesn't pass any thing
public TeamLeader() {
	this("","", new Date(), new Address(), 1, 0, 0,0.0, 0.0,0.0);
}

// a constructor that passes all the variables regarding team leader, production worker, employee(which is a constructor chaining)
public TeamLeader(String name, String id, Date hireDate,Address address, int shift,double hourlyPayrate,double numOfhoursPerMonth,double monthlyBonus, double reqTrainHours, double trainHoursAttended) {
	super(name,id,hireDate,address,shift,hourlyPayrate,numOfhoursPerMonth);
	this.monthlyBonus = monthlyBonus;
	this.reqTrainHours = reqTrainHours;
	this.trainHoursAttended = trainHoursAttended;
}

//getters and setters for all the variables.
public double getMonthlyBonus() {
	return monthlyBonus;
}


public void setMonthlyBonus(double monthlyBonus) {
	this.monthlyBonus = monthlyBonus;
}


public double getReqTrainHours() {
	return reqTrainHours;
}


public void setReqTrainHours(double reqTrainHours) {
	this.reqTrainHours = reqTrainHours;
}


public double getTrainHoursAttended() {
	return trainHoursAttended;
}


public void setTrainHoursAttended(double trainHoursAttended) {
	this.trainHoursAttended = trainHoursAttended;
}

// a getTotalSalary method that calculates the salary of the team leader and gets a part of his salary as a production worker.
@Override
public double getTotalSalary() {
	
	 double salary = super.getTotalSalary() + (monthlyBonus*(trainHoursAttended/reqTrainHours));
	return salary;
}
//a tostring method that prints all the properities of this class
@Override
public String toString() {
	if( monthlyBonus<0 || reqTrainHours<0 ||trainHoursAttended<=0 ) {
		return "==============TEAM LEADER EXTENDS========="+ super.toString() + "please check the values to be right ";
	}
	else
	return"==============TEAM LEADER EXTENDS========="+ super.toString() + "\n- monthlyBonus= " + monthlyBonus + "\n- reqTrainHours= " + reqTrainHours + "\n-  trainHoursAttended= "
			+ trainHoursAttended + "\n- Salary = " +getTotalSalary() ;
}



}
