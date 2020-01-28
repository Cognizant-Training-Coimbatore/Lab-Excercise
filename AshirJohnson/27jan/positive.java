package helloworld;

import java.util.Scanner;

public class positive {
	static void validate(int num)throws myexceptions
	{
		if(num<0)
		{
			throw new myexceptions("not valid");
		}
		else
			System.out.println("valid");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		num=sc.nextInt();
		try
		{
			validate(num);
		}
		catch(Exception m)
		{
			System.out.println("Exception occured:"+m);
		}
	}

}
