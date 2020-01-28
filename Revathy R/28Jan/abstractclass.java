abstract class shape1
{
	int length=2,width=2,radius=10;
	abstract void calculateArea();
	abstract void displayArea();
	void dummymodule()
	{
		System.out.println("dummy module");
	}
}
class rectangl extends shape1
{
	int area;
	void calculateArea()
	{
		area=length*width;
		
	}
	void displayArea()
	{
		System.out.println("rectangle "+(area));
	}
}
class circl extends shape1
{
	double area;
	void calculateArea()
	{
		area=3.14*radius*radius;
		
	}
	void displayArea()
	{
		System.out.println("circle "+(area));
	}
}
public class abstractclass {

	public static void main(String[] args) {
		rectangl obj=new rectangl();
		circl obj1=new circl();
		obj.calculateArea();
		obj.displayArea();
		obj1.calculateArea();
		obj1.displayArea();

	}

}
