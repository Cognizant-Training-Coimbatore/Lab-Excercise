package demo;

import java.util.Scanner;

public class qnumber2 {
	static void checkZero(int n1,int n2)throws Exception
	{
		if(n1==0||n2==0)
			throw new Exception("INVALID INPUT");
		else
			System.out.println("VALID INPUT");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			System.out.println("Enter the number1");
			Scanner sc = new Scanner(System.in);
			int n1 = sc.nextInt();
			System.out.println("Enter the number2");
			int n2 = sc.nextInt();
			checkZero(n1,n2);
		}
		catch(Exception m)
		{
			System.out.println("Exception occurs: "+m);
		}
	}

}
