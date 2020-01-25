package helloworld;
class test2
{
	void display1()
	{
		System.out.println("Display1");
		display2();
	}
	void display2()
	{
		System.out.println("Display2");
	}
}
public class nestmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test2 t=new test2();
		t.display1();
		t.display2();
	}

}
