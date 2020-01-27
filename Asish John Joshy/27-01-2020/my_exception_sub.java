package demo;

public class my_exception_sub {
static void validate(int age) throws my_exception
{
	if(age<18)
	{
		throw new my_exception("not valid");
	}
	else
	{
		System.out.println("Welcome to vote");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			validate(5);
		}
		catch(Exception m)
		{
			System.out.println("Exception occured "+m);
		}
	}

}
