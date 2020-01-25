class shape
{
	void display()
	{
		System.out.println("this the shape");
	}
}
class rectangle extends shape
{
	void display()
	{
		System.out.println("this is a rectangle");
	}
}
class circle extends shape
{
	void display()
	{
		System.out.println("this is circle");
	}
}
class square extends rectangle
{
	void display()
	{
		System.out.println("this is square");
	}
}
public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape obj1 = new shape();
		obj1.display();
		rectangle obj2 =new rectangle();
		obj2.display();
		rectangle obj3 = new square();
		obj3.display();
	}

}
