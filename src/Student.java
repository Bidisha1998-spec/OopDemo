
import java.util.Scanner;
public class Student 
{
	
	int rollno;
	 String name;
	 String course; 
	 int marks; 
	static  Scanner in= new Scanner(System.in);
	 public void details()
	 {
		 
		 System.out.println("enter roll no");
		 rollno= Integer.parseInt(in.nextLine());
		 System.out.println("enter name");
		 name= in.nextLine();
		 System.out.println("enter course");
		 course= in.nextLine();
		 System.out.println("enter marks");
		 marks=  Integer.parseInt(in.nextLine());

		
		
		 
    }
	 public void getdetails()
	 {
		 System.out.println(rollno);
		 System.out.println(name);
		 System.out.println(course);
		 System.out.println(marks);

		 
		 
		 
	 }
	 
	
	

}
