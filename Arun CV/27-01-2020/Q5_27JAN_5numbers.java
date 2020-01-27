import java.util.Scanner;

public class Q5_27JAN_5numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int [] a = new int [5];
	try
	{
		a[5]=30;
	}
	catch(ArithmeticException e)
	{
		System.out.println("Arithmetic error" +e);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Index error" +e);
	}
	}

}
