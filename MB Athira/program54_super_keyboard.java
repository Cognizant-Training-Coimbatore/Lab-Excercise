class testX
{
	int x =100;
}
class testY extends testX
{
	int x =10;
	void display()
	{
		System.out.println(super.x);// super command refers to the super class but without the super command then the current class is referred.
	}
}
public class program54_super_keyboard 
{

	public static void main(String[] args) 
	{
		testY obj = new testY();
		obj.display();
	}

}
