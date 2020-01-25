class test2
{
	void display1()
	{
		System.out.println("nothing ");
		display2();
	}
	void display2()
	{
		System.out.println("working");
	}
}
public class program50_nesting_methods
{

	public static void main(String[] args)
	{
		test2 obj =new test2();
		obj.display1();
	}

}
