package demo;

public class throw_normal {
	static void eligibility(int age)
	{
		if((age>20)&&(age<60))
				{
			System.out.println("Student entry is valid!!");
				}
		else
		{
			throw new ArithmeticException("Student is not eligible for registration");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		eligibility(44);
		eligibility(19);
		eligibility(20);
		eligibility(60);
		eligibility(24);
	}

}
