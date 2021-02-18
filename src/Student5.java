
public class Student5 {
	int rollno;

	String name;
	String add;
	public Student5(int rollno, String name, String add) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.add = add;
	}
	//used to print student properties in main when obj is given in sop
	@Override
	public String toString() {
		return "Student5 [rollno=" + rollno + ", name=" + name + ", add=" + add + "]";
	}
	
	abstract class Sort implements Comparable<Student5>
	{

		public int compare(Student5 s1, Student5 s2) {
			// TODO Auto-generated method stub
			return s1.rollno-s2.rollno;
		}
	}
	abstract class Sortbyname implements Comparable<Student5>
	{

		public int compare(Student5 s1, Student5 s2) {
			// TODO Auto-generated method stub
			return s1.name.compareTo(s2.name);
		}
		
	}
	

		

}
