package demo;
interface printable
{
	void display();
}
class rect2 implements printable
{
	public void display()
	{
		System.out.println("Rectangle");
	}
}
class SportCar implements printable
{
	public void display()
	{
		System.out.println("SportCar");
	}
}
class Manage1 implements printable
{
	public void display()
	{
		System.out.println("Manager");
	}
}
public class interface_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rect2 r=new rect2();
		SportCar s=new SportCar();
		Manage1 m=new Manage1();
		r.display();
		s.display();
		m.display();
	}

}
