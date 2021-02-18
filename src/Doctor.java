
public class Doctor {
	protected String name;
	protected int idNum;
	protected String add;
	
	Doctor(){
	}
		Doctor(final String str, final int num,final String ad)
		{
			name=str;
			idNum= num;
			add= ad;
		}
		void display()
		{
			System.out.println("The name is:" +name);
			System.out.println("The number is:" +idNum);
			System.out.println("The address is:" +add);
		}
		

	}

