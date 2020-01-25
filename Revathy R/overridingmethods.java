class test5
{
	void display()
	{
		System.out.println("test5 is running");
	}
}
class test6 extends test5
{
	void display()
	{
		System.out.println("test6 is running");
	}
}
public class overridingmethods {

	public static void main(String[] args) {
		test6 obj=new test6();
		obj.display();

	}

}
