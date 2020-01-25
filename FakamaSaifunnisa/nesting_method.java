class test2{
	void display1()
	{
		System.out.println("display1 is working");
		display2();
	}
	void display2()
	{
		System.out.println("display2");
	}
}
public class nesting_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test2 obj=new test2();
		obj.display1();
		
	}

}
