
public class throw1 {
	static void checkEligibility(int age)
	{
		if(age>20 && age<60)
		{
			System.out.println("entry is valid");
		}
		else
		{
			throw new ArithmeticException("student is not eligible for registration");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkEligibility(64);
		checkEligibility(44);
	}

}
