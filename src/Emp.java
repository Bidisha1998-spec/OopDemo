

public class Emp {
	int id;
	String name;
	Address address;
	
	public Emp(int id,String name,Address address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
		
	}
	void display()
	{
		System.out.println(id+" "+ name);
		System.out.println(address.city+" "+address.state+" "+address.country);
	}

	public static void main(String[] args) {
		Address add1=new Address("blore","karnatka","ind");
		Address add2=new Address("mum","maha","ind");
		
		Emp e1= new Emp(111,"varun",add1);
		Emp e2= new Emp(101,"varuni",add2);
		
		e1.display();
		e2.display();
		
		
		

	}

}
