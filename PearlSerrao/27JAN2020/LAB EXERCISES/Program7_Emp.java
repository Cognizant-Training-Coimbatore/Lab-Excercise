package demo;

import java.util.Scanner;

public class Program7_Emp {
static void validate(int x)throws exceptions
	
	{
		if(x<101 || x>200)
			throw new exceptions("this is invalid");
		else
			System.out.println("this is valid");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		System.out.println("Enter the Emply Id");
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
