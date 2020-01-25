final class first
{
	final int x=10;
	final void display()
	{	x=20;
		System.out.println("test7 is running");
	}
}
class second extends first //cannot extend test7 because its final
{
	int x=220;
	 void display() //can't override
	{
		System.out.println("test8 is running");
	}
}
public class newpg10final {

	public static void main(String[] args) {
		second obj=new second();
		obj.display();
	}

}

