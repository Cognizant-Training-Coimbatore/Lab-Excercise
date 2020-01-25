import java.util.Scanner;

class studentclass1
{
	String name;
	studentclass1()
	{
		name = "unknown";
		System.out.println(name);
	}
	studentclass1(String n)
	{
		name = n;
		System.out.println(name);
	}
}
public class program34_studentclass1 
{

	public static void main(String[] args) 
	{
		studentclass1 cs = new studentclass1();
		studentclass1 cs1 = new studentclass1("Fakama");
	}

}
