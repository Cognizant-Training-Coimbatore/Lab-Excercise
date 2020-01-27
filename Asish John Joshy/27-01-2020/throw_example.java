package demo;

import java.util.Scanner;

public class throw_example {
	static void validate(int a) throws my_exception
	{
		if(a==0)
		{
			throw new my_exception("Number is Zero");
		}
		else if(a>0)
		{
			System.out.println("Positive number");
		}
		else
		{
			System.out.println("Negative number");
		}
	}
	public static void main(String[] args) throws my_exception {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a  number");
		int n=s.nextInt();
		validate(n);
	}

}
