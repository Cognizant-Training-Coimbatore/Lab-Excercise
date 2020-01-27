package demo;

public class exceptions_eg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			validate(4);
		}
		catch(Exception e)
		{
			System.out.println("exception"+e);
		}
	}
static void validate(int age) throws exceptions
{
	if(age<18)
		throw new exceptions("not valid");
	else 
		System.out.println("welcome to vote");
}
}
