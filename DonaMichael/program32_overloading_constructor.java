class sample4
{
	sample4()
	{
		System.out.println("Constructor 1 is working");
	}
	sample4(int x)
	{
		System.out.println("Constructor 2 is working");
	}
	}
public class program32_overloading_constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample4 obj1=new sample4();
		sample4 obj2=new sample4(5);
	}

}
