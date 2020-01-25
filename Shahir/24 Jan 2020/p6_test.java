import java.util.Scanner;

public class p6_test
{
	public static void main(String[] args)
	{
		int a, i=0,sum=0;
		Scanner s = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter the number: ");
			a=s.nextInt();
			if(a!=-999)
			{
				sum+=a;
				i++;
			}
			else
				break;
		}
		System.out.println("Sum: "+sum+ "Average: "+sum/i);
	}
}