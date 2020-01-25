class test2{
	void display1()
	{
		System.out.println("Display 1 is working");
		display2();
	}
	void display2()
	{
		System.out.println("Display  2 is working");
	}
}
public class program48_nesting_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			test2 obj=new test2();
			obj.display1();
			//obj.display2();
	}

}
