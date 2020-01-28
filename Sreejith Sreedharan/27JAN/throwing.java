
public class throwing {

	
		// TODO Auto-generated method stub
		static void checkeleigibility(int age)
		{if(age>20&&age<60)
			System.out.println("student entry is valid");
		else
			throw new ArithmeticException("Student not eligible for regst");
		}

	
public static void main(String[] args) {
	checkeleigibility(44);
	checkeleigibility(65);
	checkeleigibility(15);

}
}