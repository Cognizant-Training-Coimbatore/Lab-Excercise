class parent
{
	void display()
	{
		System.out.println("This is the parent class");
	}
}
class child extends parent
{
	void display1()
	{
		super.display();
		System.out.println("This is the child class");
	}
}
public class p3_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent p = new parent();
		child c = new child();
		p.display();
		c.display1();
	}

}
