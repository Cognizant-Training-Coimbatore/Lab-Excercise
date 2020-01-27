package demo;


public class program36_throw {	
	static void checkEligibilty(int Age) {
	if(Age>20 && Age<60) {
		System.out.println("Student Entry is Valid!!");
	}
	else {
		throw new ArithmeticException("Student is not eligible got"+"registration");
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkEligibilty(44);
		checkEligibilty(15);
	

	}

}
