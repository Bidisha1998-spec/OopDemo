
public class Specialist extends Doctor
{
	protected String speciality;
Specialist(){
	
}
Specialist(final String str, final int num,final String ad, final String spec)
{
	super(str,num,ad);
	speciality= spec;
	}
void display()
{
	super.display();
    System.out.println("the speciality is:" +speciality);
	}
}
