class studentclass1
{
	String name;
	studentclass1()
	{
		System.out.println("Unknown");
	}
	studentclass1(String n)
	{
		name = n;
		System.out.println(n);
	}
}
public class program30_students {

	public static void main(String[] args) 
	{
		studentclass1 cs = new studentclass1();
		studentclass1 cs1 = new studentclass1("John");
		

	}

}
