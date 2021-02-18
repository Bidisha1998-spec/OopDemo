class Student200{
	private int rollno;
	private String name;
	static String college="BMS";
	
	public static void changeCollege() //doesnot belong to any obj , belongs to a class
	{
		college= "RVS";
     //		rollno=1;
	}
public Student200(int r,String n)	
{
	rollno= r;
	name=n;
	}
public void display()
{
	System.out.println(rollno+" "+name+" "+college);
	}
}
public class TestStatic {

	public static void main(String[] args) {
		
		Student200.changeCollege(); //calling static method without creating an obj
		Student200 s1=new Student200(7,"Bidisha");
		Student200 s2=new Student200(8,"Bose");
		Student200 s3=new Student200(9,"raj");
		
		s1.display();
		s2.display();
		s3.display();
	}

}
