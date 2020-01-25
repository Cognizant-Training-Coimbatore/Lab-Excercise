class sample4
{
	sample4()
	{
		System.out.println("Success");
	}
	sample4(int x)
	{
		System.out.println("successful");
	}
}
public class program33_overloading_constructor 
{

	public static void main(String[] args) 
	{
		sample4 obj1 = new sample4();
		sample4 obj2 = new sample4(9);
	
	}

}
