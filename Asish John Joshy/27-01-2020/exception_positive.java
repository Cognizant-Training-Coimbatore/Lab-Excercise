package demo;

import java.util.Scanner;

public class exception_positive {
	static void validate(int a) throws my_exception
	{
		if(a<0)
		{
			throw new my_exception("Zero or negative");
		}
		else
		{
			System.out.println("Positive");
		}
	}
	public static void main(String[] args) throws my_exception {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int x=s.nextInt();
	    validate(x);
	}

}
