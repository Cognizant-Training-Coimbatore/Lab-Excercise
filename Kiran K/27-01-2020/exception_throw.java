package demo;

public class exception_throw {

	
		static void checkEligibility(int Age)
		{
			if(Age>20 && Age<60) {
				System.out.println("Student entry is valid");
			}
			else {
				throw new ArithmeticException("Student is not eligible for"+"Registration");
			}
		}
		public static void main(String[] args) {
			checkEligibility(25);
			checkEligibility(56);
			checkEligibility(67);
			
	}

}
