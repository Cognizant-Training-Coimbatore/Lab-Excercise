import java.util.Scanner;

public class program46_inputnumbers
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int i =0;
		int sum =0;
		int avg = 0;
		while(a!=999)
		{
			i = i+1;
			sum = sum + a;
			avg = sum/i;
			a = sc.nextInt();
		}
		System.out.println("Sum ="+sum);
		System.out.println("Avg = "+avg);
		
	}

}
