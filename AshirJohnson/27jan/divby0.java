package helloworld;

import java.util.Scanner;

public class divby0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a,b;
			int result;
			System.out.println("Enter the numbers:");
			Scanner sc=new Scanner(System.in);
			a=sc.nextInt();
			b=sc.nextInt();
			result=a/b;
			System.out.println(result);
		}
		catch(Exception e)
		{
			System.out.println("Error in the code "+e);
		}
		
	}

}
