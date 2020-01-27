package demo;

public class throw_example {
		static void checkEligibility(int age)
		{
			if(age>20&& age<60)
				System.out.println("student entry is valid");
			else 
				throw new ArithmeticException("student is not eligible for  "+"registration");
		}
		
		
		public static void main(String[] args)
		{
			// TODO Auto-generated method stub
			checkEligibility(44);
			checkEligibility(94);
			checkEligibility(4);
		}

}

