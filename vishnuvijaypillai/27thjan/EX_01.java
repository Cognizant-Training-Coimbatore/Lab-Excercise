package jan_27th;

import java.util.Scanner;

public class EX_01 {
	static void checkEligibility(int x)
	{
		if (x>0)
			
		{
			System.out.println("Postive");
		}
		else
		{
			throw new ArithmeticException("negative");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		System.out.println("to check wether its postive or negative");
		Scanner scanner =new Scanner(System.in);
		x = scanner.nextInt();
		checkEligibility(x);
	}

	
}
