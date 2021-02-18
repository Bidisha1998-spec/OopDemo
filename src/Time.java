
public class Time {



	
		int hr;
		int min;
		int sec;
		
		public Time(int h, int m, int s)
		{
			hr= h;
			min= m;
			sec= s;
		}
		void add(Time obj2)
		{
			int tothr= this.hr+obj2.hr;
			int totmin= this.min+ obj2.min;
			int totsec= this.sec+ obj2.sec;
			if(totsec>=60) {
				totmin= totmin+1;
				totsec=totsec%60;
			}
			
			if(totmin>=60) {
				tothr= tothr+1;
				totmin=totmin%60;
			}
			System.out.println("addition of time no is:");
			System.out.println(tothr+ ": " +totmin+ " :" + totsec);
		}
		//void display()
		//{
		//	System.out.println(tothr+ " " +totmin+ " " + totsec);
		//}

	

public static void main(String[] args) {
	Time obj1= new Time(10,45,60);
	Time obj2= new Time(3,55,05);
	
	obj1.add(obj2);
	//System.out.println("addition of time no is:");
	
	//obj1.display();
}
}


