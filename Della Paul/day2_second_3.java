class parent
{
	void display()
	{
		System.out.println("This is parent class");
	}
}
class child extends parent
{
	void display1()
	{
		System.out.println("This is child class");
	}
}
public class day2_second_3 {

	public static void main(String[] args) {
		parent p1=new parent();
		child c1=new child();
		p1.display();
		c1.display1();
		c1.display();

	}

}
