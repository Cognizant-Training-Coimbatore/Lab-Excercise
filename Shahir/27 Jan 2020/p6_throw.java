
public class p6_throw {
	static void checkEligibility(int Age)
	{
		if(Age>20 && Age<60)
		{
			System.out.println("Student Entry is Valid!");
		}
		else
		{
			throw new ArithmeticException("Student is not eligible for "+ "registration");
		}
	}

	public static void main(String[] args)
	{
		checkEligibility(22);
		checkEligibility(44);
		checkEligibility(28);
	}

}
