import java.util.Scanner;

public class program14_number_positive {

	public static void main(String[] args)
	{
		int x;
		System.out.println("Enter the number");
		Scanner scanner = new Scanner(System.in);
		x = scanner.nextInt();
		if(x>0)
		{
			System.out.println("Positive");
		}
		else if(x==0)
		{
			System.out.println("Neither positive nor negative");
		}
		else
		{
			System.out.println("Negative");
		}
			
	}

}
