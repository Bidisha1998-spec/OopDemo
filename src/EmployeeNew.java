
import java.util.*;

class EmployeeDetail {
	private String name;
	private float salary, hours;
	
	public EmployeeDetail() {
		
	}
	
	public void getInfo(String n, float sal, float hr) {
		name = n;
		salary = sal;
		hours = hr;
	}
	
	public float AddSal() {
		if(salary<500) {
			salary = salary + 10;
		}
		return salary;
	}
	
	public float AddWork() {
		if(hours > 6) {
			salary = salary + 5;
		}
		return salary;
	}
	public void printSal() {
		System.out.println("Salary : " + salary);
	
}
}



class EmployeeNew
{
	public static void main (String[] args)
	{
		EmployeeDetail emp = new EmployeeDetail();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name = sc.nextLine();
		System.out.println("Enter salary");
		float salary = sc.nextFloat();
		System.out.println("Enter no. of hours of work");
		float hours = sc.nextFloat();
		
		
		emp.getInfo(name, salary, hours);
		salary = emp.AddSal();
		salary = emp.AddWork();
		emp.printSal();
		
		
	}
}
