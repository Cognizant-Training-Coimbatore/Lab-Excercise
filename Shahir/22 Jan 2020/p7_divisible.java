import java.util.Scanner;

public class p7_divisible
{

	public static void main(String[] args)
	{
		int a,b;
		System.out.println("Enter the number=");
		Scanner s1 = new Scanner(System.in);
		a=s1.nextInt();
		if(a%7==0)
		{
			System.out.println("Divisible");
		}
		else
		{
			System.out.println("Not Divisible");
		}
	}
}
