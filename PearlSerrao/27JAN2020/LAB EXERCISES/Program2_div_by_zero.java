package demo;

import java.util.Scanner;

public class Program2_div_by_zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2;
		System.out.println("enter 2 nos");
		Scanner in=new Scanner(System.in);
		n1=in.nextInt();
		n2=in.nextInt();
	
		try 
		{
			double no=n1/n2;
			System.out.println(no);
		}
		catch(Exception e) {
			System.out.println("cant divide by zero");
		}
	}

}
