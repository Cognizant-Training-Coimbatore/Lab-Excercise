package packB;

public class exception_5 {
	static void checkEligiblity(int Age) {
		if(Age>20 && Age<60) {
			System.out.println("studententry is invalid!!");
		}
		else
		{
			throw new ArithmeticException("student is not eligible for " + "registration");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkEligiblity(44);
		checkEligiblity(15);
		checkEligiblity(65);
	}

}
