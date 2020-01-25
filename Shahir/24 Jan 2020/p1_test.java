import java.util.Scanner;

public class p1_test 
{

	public static void main(String[] args) 
	{
		int a,b;
		System.out.println("Enter the lower number:");
		Scanner s = new Scanner(System.in);
		a=s.nextInt();
		System.out.println("Enter the lower number:");
		Scanner s1 = new Scanner(System.in);
		b=s1.nextInt();
		for(int i=a+1;i<b;i++)
		{
			System.out.println("The integers between "+a+" and "+b+" are: "+i);
		}
		
	}

}
