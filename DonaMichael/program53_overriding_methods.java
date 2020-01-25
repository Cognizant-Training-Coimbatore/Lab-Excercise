class test_5{
	void display()
	{
		System.out.println("Test1 is running");
	}
}
class test_8 extends test_5
{
	void display()
	{
		System.out.println("Test2 is running");
	}
}
public class program53_overriding_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test_8 obj=new test_8();
		obj.display();
	}

}
