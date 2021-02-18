import java.util.Scanner;
public class Emp4 {
	String name;
	String address;
	int year;
	int salary;
	static  Scanner in= new Scanner(System.in);
	
	void details()
	{
		 System.out.println("enter year");
		 year= Integer.parseInt(in.nextLine());
		 System.out.println("enter name");
		 name= in.nextLine();
		 System.out.println("enter address");
		 address= in.nextLine();
		 System.out.println("enter salary");
		 salary=  Integer.parseInt(in.nextLine());
	}
	void display()
	{
		
		 System.out.println("Name\tyear of joining\tAdress");
	
	}
	void result()
	{
		System.out.print(name+"\t");
		System.out.print("   "+year+"    \t");
		System.out.println(address+"\t");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Emp4 obj= new Emp4();
       Emp4 obj1= new Emp4();
       Emp4 obj2= new Emp4();
       
       obj.details();
       obj1.details();
       obj2.details();
       
       obj.display();
       obj.result();
       obj1.result();
       obj2.result();
      
       
	}

}
