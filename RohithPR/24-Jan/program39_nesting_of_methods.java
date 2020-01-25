class test2
{
	void display1()
	{
		System.out.println("Display1 is working");
		display2();
	}
	void display2()
	{
		System.out.println("Display2 is working");
	}
}
public class program39_nesting_of_methods {

	public static void main(String[] args) 
	{
		test2 obj = new test2();
		obj.display1();
	}

}
