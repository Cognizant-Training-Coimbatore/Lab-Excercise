package demo;
class test3
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
public class nesting_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test3 t3=new test3();
		t3.display1();
	}

}
