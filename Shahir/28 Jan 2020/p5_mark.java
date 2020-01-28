import java.util.Scanner;

public class p5_mark {
	static void checkEligibility()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the mark:");
		int mark = s.nextInt();
		if(mark>0)
		{
			System.out.println("Mark is Valid!");
		}
		else
		{
			throw new ArithmeticException("Mark id invalid");
		}
	}

	public static void main(String[] args)
	{
		checkEligibility();
	}

}