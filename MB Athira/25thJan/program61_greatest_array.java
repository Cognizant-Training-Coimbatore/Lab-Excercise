import java.util.Scanner;

public class program61_greatest_array
{

	public static void main(String[] args) 
	{
		int n, number, greater;
		System.out.println("Enter the max. size");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int numbers1[] = new int[n];
		int i;
		System.out.println("Enter the number 0");
		number = sc.nextInt();
		greater = number;
		for(i=1;i<n;i++)
		{
			System.out.println("Enter number "+i);
			number = sc.nextInt();
			numbers1[i] = number;
			if(number > greater)
			{
				greater = number;
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.println("Numbers are "+ numbers1[i]);
		}
		System.out.println("Greatest no. "+greater);
	}

}
