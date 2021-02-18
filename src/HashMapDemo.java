import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> lang = new HashMap<>();
		lang.put(1, "java");
		lang.put(2, "php");
		lang.put(3, "css");
		
		System.out.println("hashmap:"+lang);
		String v= lang.get(1);
		System.out.println("value at index 1:"+v);
		System.out.println("value at index 1"+lang.get(3));
		
		System.out.println("keys:"+lang.keySet());
		System.out.println("keys:"+lang.values());
		
		System.out.println("key/value mapping:"+lang.entrySet());
		
		lang.replace(1, "bidi");
		
		//iterate through keys
		System.out.println("keys: ");
		for(Integer key: lang.keySet())
		{
			System.out.print(key+"-"+lang.get(key));
			System.out.print(",");
			
		}
		
	
		

	}

}
