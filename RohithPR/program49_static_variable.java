class test11
{
	static int x;
	void display()
	{
		x++;
		System.out.println(x);
	}
}
public class program49_static_variable {

	public static void main(String[] args) 
	{
		test11 obj1 = new test11();
		obj1.display();
		 
	}

}
