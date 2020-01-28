package helloworld;

import java.util.Scanner;

public class empcode {
	static void validate(int ecode)throws myexceptions
	{
		if(ecode<101 || ecode>200)
		{
			throw new myexceptions("not valid");
		}
		else
			System.out.println("valid");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ecode;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		ecode=sc.nextInt();
		try
		{
			validate(ecode);
		}
		catch(Exception m)
		{
			System.out.println("Exception occured:"+m);
		}
	}

}
