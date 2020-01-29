package packc;
abstract class shape
{
	int length=2,width=2,radius=10;
	abstract void calculatearea();
	abstract void displayarea();
	void dummymodule()
	{
		System.out.println("Dummy module");
	}
}
class rectangle extends shape
{
	int area;
	void calculatearea()
	{
		area=length*width;
	}

void displayarea()
{
	System.out.println("rectangle"+area);
}
}
class circle extends shape
{
	double area;
	void calculatearea()
	{
		area=3.14*radius*radius;
	}
	void displayarea()
	{
		System.out.println("Circle"+area);
	}
}
public class exampleabstract
{
	public static void main(String args[])
	{
		rectangle obj=new rectangle();
		circle obj1=new circle();
		obj.calculatearea();
		obj.displayarea();
		obj1.calculatearea();
		obj1.displayarea();
	}
}