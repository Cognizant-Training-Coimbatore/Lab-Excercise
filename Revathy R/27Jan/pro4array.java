package prgrms;

import java.util.Scanner;

public class pro4array {

	public static void main(String[] args) {
		int a=0,b;
		int ar[]=new int[5];
		try
		{
			
			Scanner sc=new Scanner(System.in);
			System.out.println("enter two numbers");
			a=sc.nextInt();
			b=sc.nextInt();
			ar[5]=a/b;
			System.out.println("result is "+a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception occurs");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException occurs:"+e);
		}
		finally
		{
			ar[0]=a;
			System.out.println("first element value :"+ar[0]);
			System.out.println("the finally statement is executed");
		}
	}

}
