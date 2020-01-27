package demo;

import java.util.Scanner;

public class exception_negative {
static void validate(int a) throws my_exception
{
	if(a<0)
	{
		throw new my_exception("Invalid mark");
	}
	else
	{
		System.out.println("Mark valid");
	}
}
	public static void main(String[] args) throws my_exception {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of subjects");
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter mark");
			int x=s.nextInt();
			validate(x);
		}
		
	}

}
