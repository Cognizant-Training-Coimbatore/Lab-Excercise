package demo;
class shape
{
	void display()
	{
		System.out.println("This is this shape");
	}
}
class rectangle extends shape
{
	void display1()
	{
		System.out.println("This is rectangular shape");
	}
}
class square extends rectangle
{
	void display2()
	{
		System.out.println("Square is a rectangle");
	}
}
class circle extends shape
{
	void display1()
	{
		System.out.println("This is circular shape");
	}
}
public class shape_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		square sq=new square();
		sq.display();
		sq.display1();
	}

}
