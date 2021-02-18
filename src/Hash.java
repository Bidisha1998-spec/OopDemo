import java.util.*;
public class Hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Employee1> emset= new HashSet<Employee1>();
		Employee1 e1= new Employee1(100,"bi",4000);
		Employee1 e2= new Employee1(101,"bid",5000);
		Employee1 e3= new Employee1(102,"bidi",66000);
		Employee1 e4= new Employee1(103,"bose",7000);
		emset.add(e1);
		emset.add(e2);
		emset.add(e3);
		emset.add(e4);
		for(Employee1 e : emset )
		{
			System.out.println(e.id+" "+e.name+" "+e.sal);
		}
		
		

	}

}
