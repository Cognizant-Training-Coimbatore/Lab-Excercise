package demo;

import java.util.Scanner;

public class positive_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number\n");
		int a=s.nextInt();
		if(a>0) 
		{
			System.out.println("Number is positive\n");
		}
		else if(a<0) 
		{
			System.out.println("Number is negative\n");
		}
		else
		{
			System.out.println("Number is Zero\n");
		}
	}

}
