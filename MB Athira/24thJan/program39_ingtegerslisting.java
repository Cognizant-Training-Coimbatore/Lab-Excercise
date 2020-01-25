import java.util.Scanner;

public class program39_ingtegerslisting 
{

	public static void main(String[] args) 
	{
		int a, b;
		System.out.println("Enter thelimits : ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		if (a<b)
		{
		for(int i =0; a<b-1; i++)
		{
			a=a+1;
			System.out.println(a);
		}
		}
		else
		{
			System.out.println("Incorrect order of inputs. Please mention the lowest limit first.");
		}
	}

}
