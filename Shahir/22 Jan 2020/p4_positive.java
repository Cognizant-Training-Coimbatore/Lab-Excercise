import java.util.Scanner;

public class p4_positive 
{
	public static void main(String[] args) 
	{
		int a;
		System.out.println("Enter the number=");
		Scanner s1 = new Scanner(System.in);
		a=s1.nextInt();
		if (a>0)
		{
			System.out.println("The number is POSITIVE");
		}
		else
		{
			System.out.println("The number is NEGATIVE");
		}
	}
}
