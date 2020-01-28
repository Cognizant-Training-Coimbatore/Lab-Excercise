package demo;

import java.util.Scanner;

public class Program6_throws {

static void validate(int x)throws exceptions
	
	{
		if(x<0)
			throw new exceptions("If 1");
		else
			System.out.println("else statement");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		System.out.println("Program6");
		Scanner scanner =new Scanner(System.in);
		x = scanner.nextInt();
		try
		{
			validate(x);
		}
		catch(Exception m)
		{
			System.out.println("Exception occured:" +m);
		}
		

	}
}
