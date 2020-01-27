import java.util.Scanner;

public class Q2_27JAN_numbers 
{
	static void check(int a, int b) throws custom_exception
	{
		if(b==0)
		{
			throw new custom_exception("Can't divide");
		}
		else
		{
			System.out.println("The result is " +(a/b));
		}
	}

	public static void main(String[] args) throws custom_exception
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int x,y;
		System.out.println("Enter the 1st number");
		x = scanner.nextInt();
		System.out.println("Enter the 2nd number");
		y = scanner.nextInt();
		check(x,y);
	}

}
