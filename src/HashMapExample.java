import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<Integer, Book1> bmap = new HashMap<Integer, Book1>();
		 
		 Book1 b1=new Book1(101,"Let us C","Yashwant Kanetkar","BPB",8);
		    Book1 b2=new Book1(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
		    Book1 b3=new Book1(103,"Operating System","Galvin","Wiley",6);
		    bmap.put(1, b1);
		    bmap.put(2, b2);
		    bmap.put(3, b3);
		    
		    for(Map.Entry<Integer, Book1> e:bmap.entrySet())
		    {
		    	int key= e.getKey();
		    	Book1 b= e.getValue();
		    System.out.println("Book"+key+ " Details");
		    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		    }
		    

	}

}
