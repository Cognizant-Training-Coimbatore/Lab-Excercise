class sample4
{
	sample4()
	{
		System.out.println("Constructor1 is working");
	}
	sample4(int a)
	{
		System.out.println("Constructor2 is working");
	}
}
public class overloading_constructor {

	public static void main(String[] args)
	{
		sample4 obj1=new sample4();
		sample4 obj2=new sample4(5);
	}

}
