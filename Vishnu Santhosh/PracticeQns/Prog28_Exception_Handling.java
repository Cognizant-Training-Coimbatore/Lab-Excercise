
public class Prog28_Exception_Handling {

	static void checkEligibility(int age) {
		if((age>20)&&(age<40)) {
			System.out.println("Accepted");
		}
		else {
			throw new ArithmeticException("Student is not eligible");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkEligibility(25);
		checkEligibility(58);
		
	}

}
