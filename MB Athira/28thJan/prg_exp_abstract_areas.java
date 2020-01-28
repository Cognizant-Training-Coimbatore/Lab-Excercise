abstract class shapes
{
	int length = 2, width = 4, radius = 10;
	abstract void calculateArea();
	abstract void displayArea();
	void dummymodule()
	{
		System.out.println("Dummy module");
	}
}
class rectangle1 extends shapes
{
	int area;
	void calculateArea()
	{
		area = length*width;
	}
	void displayArea()
	{
		System.out.println(area);
	}
}
class circle2 extends shapes
{
	double Carea;
	void calculateArea()
	{
		Carea = 3.14*radius*radius;
	}
	void displayArea()
	{
		System.out.println(Carea);
	}
}
public class prg_exp_abstract_areas 
{

	public static void main(String[] args) 
	{
		rectangle1 obj1 = new rectangle1();
		circle2 obj2 = new circle2();
		obj1.calculateArea();
		obj1.displayArea();
		obj2.calculateArea();
		obj2.displayArea();
		
	}

}
