import java.util.Scanner;

public class program40_multiplication_table
{

	public static void main(String[] args) 
	{
		System.out.println("Enter a number between 1 to 9 :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<10)
		{
			for(int i=1;i<n+1;i++)
			{
				for(int j=1;j<11;j++)
				{
					int p = i*j;
					System.out.println(i+"*"+j+"="+p);
				}
			}
		}
		else
		{
			System.out.println("Invalid input");
		}
	}

}
