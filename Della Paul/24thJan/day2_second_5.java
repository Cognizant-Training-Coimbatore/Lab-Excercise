class shape
{
	void display1()
	{
		System.out.println("This is shape");
	}
}
class rectangle extends shape
{
	void display()
	{
		System.out.println("This is Rectangle shape");
	}
}
class circle extends shape
{
	void display()
	{
		System.out.println("This is Circle shape");
	}
}
class square extends rectangle
{
	void print()
	{
		System.out.println("square is a rectangle");
	}
}
public class day2_second_5 {

	public static void main(String[] args) {
		square s1=new square();
		s1.display();
		s1.display1();

	}

}
