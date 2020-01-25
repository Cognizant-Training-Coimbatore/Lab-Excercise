class shape
{
	void display1() 
	{
		System.out.println("This is the shape");
	}
}
class rectangle extends shape
{
	void display2() 
	{
		System.out.println("This is a rectangular shape");
	}

}
class circle extends shape
{
	void display3() 
	{
		System.out.println("This is a circular shape");
	}

}
class square extends rectangle
{
	void display4() 
	{
		System.out.println("Square is a rectangle");
	}

}
public class program5_qn5_Shape_class 
{

	public static void main(String[] args)
	{
		rectangle obj1 = new rectangle();
		circle obj2 = new circle();
		square obj3 = new square();
		obj3.display1();
		obj3.display2();
	}

}
