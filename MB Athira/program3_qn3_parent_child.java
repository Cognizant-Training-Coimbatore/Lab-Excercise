class pa1
{
	void display()
	{
		System.out.println("This is a parent class");
	}
}
class ch1 extends pa1
{
	void display1()
	{
		System.out.println("This is a child class");
	}
}
public class program3_qn3_parent_child {

	public static void main(String[] args) 
	{
		pa1 obj1 = new pa1();
		ch1 obj2 = new ch1();
		obj1.display();
		obj2.display1();
		obj2.display();
	}

}
