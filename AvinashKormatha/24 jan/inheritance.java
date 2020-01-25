class c1
{
	void display1()
	{
		System.out.println("the parent class");
	}
}
class c2 extends c1
{
	void display()
	{
		System.out.println("the child class");
	}
}
public class inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c1 obj = new c1();
		obj.display1();
		c2 obj1 = new c2();
		obj1.display();
		obj1.display1();
	

}
}
