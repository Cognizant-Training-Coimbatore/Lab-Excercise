
public class throw_cmd_exp2 
{
	static void checkEligibility(int Age)
	{
		if(Age>20 && Age<66)
		{
			System.out.println("Student entry valid"); 
		}
		else
		{
			throw new ArithmeticException("Student is not eligible for registration");
		}
	}
	public static void main(String[] args)
	{
		checkEligibility(44);
		checkEligibility(67);
		checkEligibility(23);

		
	}

}
