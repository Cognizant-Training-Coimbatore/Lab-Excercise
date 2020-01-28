package prgrms;


import java.util.Scanner;

public class pro1positiveexception {
	
	static void validate(int a)throws negativeexception
	{
		if(a<=0)
		{
			throw new negativeexception("not valid");
		}
		else
		{
			System.out.println("the number is "+a);
		}
	}

	public static void main(String[] args) {
		int a;
		try
		{
			
			Scanner sc=new Scanner(System.in);
			System.out.println("enter positive number");
			a=sc.nextInt();
			validate(a);
		}
		catch(Exception e)
		{
			System.out.println("error in the code"+e);
			
		}
	}

}
