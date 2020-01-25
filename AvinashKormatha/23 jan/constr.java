class sample1
{
	sample1()
	{
		System.out.println("constructor is running");
	}
	sample1(int a, int b)
	{
		System.out.println(a+b);;
	}
}
public class constr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		sample1 obj=new sample1();
		sample1 obj1=new sample1(5,10);

	}

}
