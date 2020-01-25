package demo;
class parent
{
	void display()
	{
		System.out.println("This is a parent class");
	}
}
class child extends parent
{
	void display1()
	{
		System.out.println("This is a child class");
	}
}
public class parent_child {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent ppp=new parent();
		child ccc=new child();
		ppp.display();
		ccc.display1();
		ccc.display();
	}

}
