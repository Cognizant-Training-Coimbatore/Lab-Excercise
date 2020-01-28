public class p7_custom
{
	static void validate(int empcode) throws myexceptions
	{
		if(empcode>101 && empcode<200)
		{
			System.out.println("Code is Valid!");
		}
		else
		{
			throw new ArithmeticException("Mark id invalid");
		}
	}
	public static void main(String[] args)
	{
		try
		{
			validate(150);
		}
		catch(Exception m)
		{
			System.out.println("Exception ocured: "+m);
		}
	}

}
