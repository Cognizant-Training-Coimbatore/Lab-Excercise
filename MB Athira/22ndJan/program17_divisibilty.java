import java.util.Scanner;

public class program17_divisibilty 
{

	public static void main(String[] args) 
	{
		int x;
		System.out.println("Enter a number");
		Scanner scanner = new Scanner(System.in);
		x = scanner.nextInt();
		if(x%7==0)
		{
			System.out.println("The number "+x+" is divisible by 7");
		}
		else
		{
			System.out.println("The number "+x+" is not divisible by 7");
		}
	}

}
