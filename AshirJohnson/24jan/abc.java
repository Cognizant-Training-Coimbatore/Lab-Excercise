package helloworld;
class shape
{
	void display()
	{
		System.out.println("This is shape");
	}
}
class rectangle extends shape
{
	void display1()
	{
		System.out.println("This is a rectangle");
	}
}
class circle extends shape
{
	void display2()
	{
		System.out.println("This is a circle");
	}
}
class square1 extends rectangle
{
	void display3()
	{
		System.out.println("Square is a rectangle");
	}
}
public class abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		square1 s=new square1();
		s.display();
		s.display1();
		s.display3();
				}

}
