package prgrms;

import java.util.Scanner;

public class pro2inputexception {

	public static void main(String[] args) {
		
		try
		{
			int a,b;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter two numbers");
			a=sc.nextInt();
			b=sc.nextInt();
			System.out.println("result is "+a/b);
		}
		catch(Exception e)
		{
			System.out.println("error in the code"+e);
		}
	}

}
