interface printableInterface
{
	int length=4,breadth=2,speed=0,empid=0;
	double area=length*breadth;
	void display();
}
class rectangle10 implements printableInterface{
	public void display()
	{
		System.out.println("Area of rectangle: "+area);
	}
}
class car implements printableInterface
{
	public void display()
	{
		int speed=320;
		System.out.println("Speed of the sportcar is: "+speed);
	}
	}
class manager implements printableInterface
{
	public void display()
	{
		int empid=3456;
		System.out.println("Employee id of the manager"+empid);
	}
}
public class Exs7_1_printable_interface {

	public static void main(String[] args) {
		rectangle10 obj=new rectangle10();
		car obj1=new car();
		manager obj2=new manager();
		obj.display();
		obj1.display();
		obj2.display();
		

	}

}
