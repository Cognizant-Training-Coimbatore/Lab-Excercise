import java.util.Scanner;

public class p2_div {

	public static void main(String[] args)
	{
	try
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int num1 = s.nextInt();
		System.out.println("Enter the 1st number");
		int num2 = s.nextInt();
		int result=num1/num2;
		System.out.println("The result: "+result);
		if(num2==0)
		{
			System.out.println("Error");
		}
	}
	catch (Exception e)
	{
		System.out.println("Error in the code" +e);
	}
	}

}
