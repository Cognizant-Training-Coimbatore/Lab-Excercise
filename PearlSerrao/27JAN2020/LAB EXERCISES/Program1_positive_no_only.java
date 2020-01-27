package demo;

import java.util.Scanner;

public class Program1_positive_no_only {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			//try {
		try {
			validate();
		}
		catch(Exception e)
		{
			System.out.println("exception"+e);
		}
	}
static void validate() throws exceptions
{
	Scanner in=new Scanner(System.in);
	int no=in.nextInt();
	if(no>=0)
		throw new exceptions("Positive");
	else 
		System.out.println("Negative");
}

}

