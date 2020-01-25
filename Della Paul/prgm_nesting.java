class test2
{
	void display1() {
		System.out.println("Display1 is working");
		display2();
	}
	void display2()
	{
		System.out.println("Display2 is working");
	}
}
public class prgm_nesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test2 obj=new test2();
		obj.display1();
		obj.display2();

	}

}
