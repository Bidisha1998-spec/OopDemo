abstract class Shape1
{
	String objectName=" ";
	Shape1(String name)
	{
		this.objectName=name;
	}
	public void moveTo(int x, int y)
	{
		System.out.println(this.objectName+ " "+ "has been moved to"+"x=" +x+ "and y="+y);
	}
	abstract public double area();
	abstract public void draw();
}
class Rectangle extends Shape1
{
	int lenght, width;
	Rectangle(int lenght, int width, String name)
	{
		super(name);
		this.lenght=lenght;
		this.width=width;
	}
	public void draw()
	{
		System.out.println("rectangle has been drawn");
	}
	public double area()
	{
		return (double)(lenght*width);
	}
	}
class Circle extends Shape1
{
	double pi=3.14;
	int radius;
	Circle (int radius, String name)
	{
		super(name);
		this.radius=radius;
	}
	public void draw()
	{
		System.out.println("circle has been drawn");
	}
	public double area()
	{
		return (double)((pi*radius*radius)/2);
	}
	}
public class AbstractDemo1 {

	public static void main(String[] args) {
		Shape1 rect= new Rectangle(2,3,"Rectangle");
		rect.draw();
		System.out.println("area of rectangle="+rect.area());
		rect.moveTo(1, 2);
		System.out.println(" ");
		Shape1 circle= new Circle(2,"Circle");
		circle.draw();
		System.out.println("area of circle: "+circle.area());
		circle.moveTo(2, 4);
	}

}