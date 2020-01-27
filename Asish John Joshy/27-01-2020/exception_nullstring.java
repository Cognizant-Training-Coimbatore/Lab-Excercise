package demo;

import java.util.Scanner;

public class exception_nullstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String x;
		try
		{
			x=null;
			int a=x.length();
		}
		catch(NullPointerException e)
		{
			System.out.println("Exception thrown"+e);
		}
		System.out.println("Finish");
	}

}
