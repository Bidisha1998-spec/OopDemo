import java.util.Scanner;

class Trainee
{
      int tID;
      String tNAME;
      String technology;
      float salary,stipend;

 void input()
 {
	 Scanner in= new Scanner(System.in);
	 System.out.println("Enter ID, NAME,Technology and Salary of a Trainee:");
	 tID= in.nextInt();
	 tNAME= in.next();
	 technology= in.next();
	 salary= in.nextFloat();
 }
 float calculate()
 {
	 stipend = salary-200;
	 return stipend;
 }
 void display()
 {
     System.out.println("********* TRAINEE DETAILS*********");	
     System.out.println("Trainee ID     :" +tID);
     System.out.println("Trainee Name   :" +tNAME);
     System.out.println("Technology     :" +technology);
    // System.out.println("Stipend        :" +salary);
 }

}



public class TestTrainee {

	public static void main(String[] args) {
		Trainee t1= new Trainee();
		Trainee t2= new Trainee();

		t1.input();
		t2.input();
		
		float s1=t1.calculate();
		float s2=t2.calculate();
		
		t1.display();
		System.out.println("Stipend        :" +s1);
		t2.display();
		System.out.println("Stipend        :" +s2);
		
		

	}

}
