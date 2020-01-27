package demo;

import java.util.Scanner;

public class exception_zero {
static void validate(int a,int b) throws my_exception
{
	if(b==0)
	{
		throw new my_exception("Denominator is  Zero");
	}
	else
	{
		System.out.println("Division="+(a/b));
	}
}
	public static void main(String[] args) throws my_exception
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter 2 numbers");
		int num1=s.nextInt();
		int num2=s.nextInt();
		validate(num1,num2);
	}

}
