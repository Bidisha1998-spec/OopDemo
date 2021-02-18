import java.util.Scanner;
public class Area{


int length,breadth;
Area(int l, int b){
        length = l;
        breadth = b;
}
public int returnArea(){
int results = length * breadth;
return results;
}
 public void getArea(){
System.out.println("Area = " +  returnArea());
}
public static void main(String []args){
	Scanner in= new Scanner(System.in);
	System.out.println("enter length and breadth");
	int a=in.nextInt();
	int b= in.nextInt();
	
Area x =new Area(a,b);
x.getArea();
}
}
