class shape
{
	void display()
	{System.out.println("This is shape");
	}
}
class rectangle extends shape
{
	void display1()
	{System.out.println("this is rectangular shape");
	}
}
class circle extends shape
{
	void display2()
	{System.out.println("this is circular shape");
}
}
class square extends rectangle
{
	void display3()
	{
		System.out.println("Square is a rectangle");
	}
}
public class newpg5shape {

	public static void main(String[] args) {
		square obj=new square();
		obj.display1();
		obj.display3();

	}

}
