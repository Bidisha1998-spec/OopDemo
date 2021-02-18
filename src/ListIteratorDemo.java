import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al= new ArrayList<String>();
		al.add("jim");
		al.add("halpert");
		al.add("pam");
		al.add(1,"beesly");
		System.out.println("element at 2nd pos:" +al.get(2));
		
		ListIterator<String> itr= al.listIterator();
		System.out.println("forward dir");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("backward dir");
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
		
		
		
		
		
		

	}

}
