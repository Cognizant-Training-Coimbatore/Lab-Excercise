package demo;

import java.util.Scanner;

public class exception_numberlimit {
static void validate(int a) throws my_exception
{
	if((a>101)&&(a<200))
	{
		System.out.println("Employee code accepted");
	}
	else
	{
		throw new my_exception("Invalid employee code");
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
