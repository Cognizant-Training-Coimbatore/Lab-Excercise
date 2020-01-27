import java.util.Scanner;

public class Q1_27JAN_positive 
{
	static void positivee (int n) throws custom_exception
	{
		if(n>0)
		{
			System.out.println("The number is positive");
		}
		else
		{
			throw new custom_exception("The number is negative" );
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = scanner.nextInt();
		try {
			positivee(a);
		} catch (custom_exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
