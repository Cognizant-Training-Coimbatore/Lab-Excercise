package packc;
interface myinterface
{
	void add();
	void display();
}
class testInterface implements myinterface
{
	public void add()
	{
		System.out.println("Add is working");
	}
	public void display()
	{
		System.out.println("Display is working");
	}
}
public class interfaceeg
{
	public static void main(String[] args)
	{
		testInterface obj=new testInterface();
		obj.add();
		obj.display();
	}
}