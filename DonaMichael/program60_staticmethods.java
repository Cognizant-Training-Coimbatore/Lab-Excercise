class element
	{
	static int x=10,y=20;
	static void display()
		{
		int x=2;
		System.out.println(x++);
		}
	static void dis()
	{
			y++;
		System.out.println(y);
	}
	}
public class program60_staticmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		element obj=new element();
		obj.display();
		element.dis();
		element obj1=new element();
		element.display();
		element.dis();
	}

}
