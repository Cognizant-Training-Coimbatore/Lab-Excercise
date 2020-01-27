import java.util.Scanner;

public class Q6_27JAN_throw 
{
	static void see(int a) throws custom_exception
	{
		if(a>0 )
		{
			System.out.println("The number is positive");
		}
		else
		{
			throw new custom_exception("The number is negative");
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int z;
		z = scanner.nextInt();
		System.out.println("Enter the number");
		try {
			see(z);
		} catch (custom_exception e) {
			
			e.printStackTrace();
		}
	}

}
