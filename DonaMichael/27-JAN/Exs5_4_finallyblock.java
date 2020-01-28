import java.util.Scanner;

public class Exs5_4_finallyblock {

	public static void main(String[] args) {
		int a=0,b;
		int ar[]=new int[5];
		try
		{
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter two numbers");
			a=sc.nextInt();
			b=sc.nextInt();
			ar[5]=a/b;
			System.out.println("result is"+a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception occurs");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Excepton thrown"+e);
			
		}
		finally {
			ar[0]=a;
			System.out.println("First element value"+ar[0]);
			System.out.println("The finally statement is executed");
		}
	}

}
