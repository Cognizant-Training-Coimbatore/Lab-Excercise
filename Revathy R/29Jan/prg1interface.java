package jan29;
interface printableinterface{
	int length=4,breadth=5,area=length*breadth,empid=0,speed=0;
	void display();
}
class rectangle implements printableinterface
{
	
	public void display()
	{
		
		System.out.println("area is"+area);
	}
}
class car implements printableinterface
{
	
	public void display()
	{
		int speed=200;
		System.out.println("speed is "+speed);
	}
}
class manager implements printableinterface
{
	
	public void display()
	{
		int empid=25;
		System.out.println("employee id is "+empid);
	}
}
public class prg1interface {

	public static void main(String[] args) {
		rectangle obj=new rectangle();
		car obj1=new car();
		manager obj2=new manager();
		obj.display();
		obj1.display();
		obj2.display();

	}

}
