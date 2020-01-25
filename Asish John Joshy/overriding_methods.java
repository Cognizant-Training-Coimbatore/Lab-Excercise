package demo;
class an
{
	void display()
	{
		System.out.println("Parent is running.......");
	}
}
class ba extends an
{
	void display()
	{
		super.display();
		System.out.println("Child is running.......");
	}
}
public class overriding_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ba bo=new ba();
		bo.display();
	}

}
