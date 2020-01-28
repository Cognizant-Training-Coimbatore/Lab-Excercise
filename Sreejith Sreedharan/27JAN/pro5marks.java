package prgrms;

import java.util.Scanner;

public class pro5marks {
	static void validate(int a)throws negativeexception
	{
		if(a<0)
		{
			throw new negativeexception("invalid mark entered");
		}
		else
		{
			System.out.println("the mark is "+a);
		}
	}

	public static void main(String[] args) {
		
		int a;
		try
		{
			
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the marks");
			a=sc.nextInt();
			validate(a);
		}
		catch(Exception e)
		{
			System.out.println("error in the code"+e);
			
		}

	}

}
