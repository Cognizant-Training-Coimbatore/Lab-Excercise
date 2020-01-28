package helloworld;

public class throwexc {
	static void checkEligibility(int Age)
	{
		if(Age>20&&Age<60) {
		System.out.println("Student entry is Valid!");
	
		}
		else
		{
			throw new ArithmeticException("Student is not eligible for "+"registration");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkEligibility(44);
		checkEligibility(15);
		checkEligibility(65);
	}

}
