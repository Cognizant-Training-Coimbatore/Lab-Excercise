import java.util.Scanner;

public class p4_array {

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
		int a[]=new int[5];
		int b = a[5]=result;
		System.out.println(b); 
		if(num2==0)
		{
			System.out.println("Error");
		}
	}
	catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception occurs ");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		}
	}
}
