package demo;

import java.util.Scanner;

public class qnumber1 {
	static void checkPositive(int n)throws Exception
	{
		if(n<0)
			throw new Exception("No. is negative. INVALID INPUT");
		else
			System.out.println("VALID INPUT");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			System.out.println("Enter the number");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			checkPositive(n);
		}
		catch(Exception m)
		{
			System.out.println("Exception occurs: "+m);
		}
	}

}
