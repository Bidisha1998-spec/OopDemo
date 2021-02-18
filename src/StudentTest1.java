

public class StudentTest1 {

	public static void main(String[] args)
	{
					Student ob[]= new Student[3];
					for(int i=0; i<ob.length;i++)
					{
						ob[i]= new Student();
					}
					for(int i=0; i<ob.length;i++)
					{
						ob[i].details();
					}
					//sort1(Student ob)
	
		//public static void sort1(Student k[])
					
						Student temp= new Student();
						for(int i=0; i<ob.length-1; i++)
						{
							for(int j=0; j<ob.length-1-i; j++)
							{
								if(ob[j].marks>(ob[j+1].marks))
								{
									temp=ob[j];
									ob[j]=ob[j+1];
									ob[j+1]=temp;
								}
							}

						}
						
						for(int i=0; i<ob.length;i++)
						{
							ob[i].getdetails();
						}							
					}
					
										
			}





		

	

