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

public class newpg3inherit {

	public static void main(String[] args) {
		parent obj=new parent();
		child obj1=new child();
		obj.display();
		obj1.display1();
		obj1.display();

	}

}
