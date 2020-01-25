import java.util.Scanner;

public class program16_divisible_by7 {

	public static void main(String[] args) 
	{
		int x;
		System.out.println("Enter the number");
		Scanner scanner = new Scanner(System.in);
		x = scanner.nextInt();
		if(x % 7 == 0)
		{
			System.out.println("The value is divisible by 7");
		}
		else
		{
			System.out.println("The value is not divisible by 7");
		}

	}

}
