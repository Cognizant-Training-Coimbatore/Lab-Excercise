import java.util.Scanner;

public class program13_positive_negative {

	public static void main(String[] args) 
	{
		int x;
		System.out.println("Enter the Number");
		Scanner scanner = new Scanner(System.in);
		x = scanner.nextInt();
		if(x > 0 && x != 0)
		{
			System.out.println("The value is POSITIVE");
		}
		else if(x == 0)
		{
			System.out.println("The Value is Zero ");
		}
		else
		{
			System.out.println("The value is NEGATIVE ");
		}

	}

}
