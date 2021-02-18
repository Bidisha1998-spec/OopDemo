
class Student22 implements Comparable<Student22>
{
	int rollno;
	int age;
	String name;
	public Student22(int rollno, int age, String name) {
		super();
		this.rollno = rollno;
		this.age = age;
		this.name = name;
	}
	
	public int compareTo(Student22 st) {
		// TODO Auto-generated method stub
		if(age==st.age)
			return 0;
		else if(age>st.age)
			return 1;
		else
			return -1;
	}
	}