package Assignment3;
import java.util.*;
// a test class that contains an array list that has different objects to it and adds them to the array list
public class TestClass {

	public static void main(String[] args) {
		//we create an array list.
		ArrayList<Employee> emp = new ArrayList<>();
		
		// we add different types to it
		emp.add(new ProductionWorker("ali", "163-b", new Date(118,11,5) , new Address("Street1","State1","ramallah","0000"),1,10,300));
		emp.add(new ProductionWorker("mohammad", "127-A", new Date(105,7,7) , new Address("Street2","State2","nablus","0200"),2,90,200));
		emp.add(new ShiftSupervisor("ahmad", "223-G", new Date(110,6,6) , new Address("Street3","State3","bkh","tul-karem"),3242, 32,200, 100));
		emp.add(new ShiftSupervisor("ibraheem", "123-T", new Date(118,4,5) , new Address("Street4","State4","hebron","0230"),1500, 20, 100, 200));
		emp.add(new TeamLeader("khaled", "125-D", new Date(112,6,2) , new Address("Street5","State4","haifa","0210"), 1,70,290,1255, 1000, 110));
		emp.add(new TeamLeader("hazem", "173-C", new Date(116,7,24) , new Address("Street6","State5","aka","0010"), 2,70,180,2, 10, 20));
		
		
		checkDate(emp);
		ListGreaterThanAverage(emp);
	}
//this method here calculates the sum then average of the salary and checks if any indivisuals salary is more than the average salary and then prints it
	public static void ListGreaterThanAverage(ArrayList<Employee> list) {
		double sum = 0;
		//here we use instanceof and type casting to invoke the method gettotalsalary in the main method
		//also the sum variable to add different salaries.
		for(int i=0;i<list.size();i++) {
			if (list.get(i) instanceof ProductionWorker) {
			sum += (((ProductionWorker)list.get(i)).getTotalSalary());
			}
			else if(list.get(i) instanceof ShiftSupervisor) {
				sum += (((ShiftSupervisor)list.get(i)).getTotalSalary());
			}
			else if(list.get(i) instanceof TeamLeader) {
				sum += (((TeamLeader)list.get(i)).getTotalSalary());
			}
		}
		//System.out.println(sum);
		
		double avg = sum/list.size();
		System.out.println("AVERAGE OF SALARIES IS = " +avg);
		
		System.out.println("\n\n===================LIST OF EMPLOYEES ABOVE AVERAGE========================\n");
		//after we find the avg we must find the employees that have a salary more that the average of salaries.
		//we also use type casting and instanceof to to compare the salary to the average.
		for (int j=0;j< list.size() ;j++) {
			if (list.get(j) instanceof ProductionWorker) {
				if(((((ProductionWorker)list.get(j)).getTotalSalary()) > avg)) {
				System.out.println(list.get(j));
				   }
				   }
			
			else if(list.get(j) instanceof ShiftSupervisor) {
					if(((((ShiftSupervisor)list.get(j)).getTotalSalary()) > avg)) {
						System.out.println(list.get(j));
					}
				    }
				
			else if(list.get(j) instanceof TeamLeader) {
					if(((((TeamLeader)list.get(j)).getTotalSalary()) > avg)) {
						System.out.println(list.get(j));
					}
				    }
				
			}
			//System.out.println(s);
			
			
		}
	//here i created a method that can check to see if the date is invalid of any of the employees and prints if there is anything wrong.
	public static void checkDate(ArrayList<Employee> list) {
		Date date=new Date();
		int year = date.getYear();
		int months = date.getMonth() + 1;
		for (int i=0;i< list.size() ;i++) {
		          
			if((list.get(i).getHireDate().getYear()) > year || (list.get(i).getHireDate().getYear()) < 0 ) {
				System.out.println("**********HIRE DATE IS INVALID FOR  " + list.get(i).getName()+ "   "  + list.get(i).getId());
			}
			else if(((list.get(i).getHireDate().getYear()) == year) && (list.get(i).getHireDate().getMonth()) +1 >= months) {
				System.out.println("**********HIRE DATE IS INVALID FOR   " + list.get(i).getName() + "   "+ list.get(i).getId());
			}
			
		}
		
		
		
	}
	
	
	}

