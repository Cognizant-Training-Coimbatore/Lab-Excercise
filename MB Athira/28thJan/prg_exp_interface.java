interface myinterface
{
	//int x = 56;
	void add();
	void display();
}
class testInterface implements myinterface
{
	public void add()
	{
		//x = 89; value of x will not change as it is static
		System.out.println("Add is working");
	}
	public void display()
	{
		System.out.println("Display is working");
	}
}
public class prg_exp_interface {

	public static void main(String[] args) 
	{
		testInterface obj1 = new testInterface();
		obj1.add();
		obj1.display();
	}

}
