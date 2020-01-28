package packc;

import java.util.Scanner;

public class pro2inputcases {

	public static void main(String[] args) {
		try
		{
			int a,b;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter 2 numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Result is"+a/b);
		}
		catch(Exception e)
		{
			System.out.println("Error in code "+e);
		}
		
	}

}
