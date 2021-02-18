
public class Contact {
	void createContact(String name,int num)
	{
		System.out.println("name is:"+name+ "phone no is:" +num);
	}
	void createContact(String name,int num,int num1)
	{
		System.out.println("name is:"+name+ "phone no is:" +num+ "and" +num1);
	}
	
	

	public static void main(String[] args) {
		Contact ob= new Contact();
		ob.createContact("Bidisha", 12345);
		ob.createContact("bose", 12345,123456);
	}

}
