package helloworld;

import java.util.Scanner;

public class marks {
	static void validate(int marks)throws myexceptions
	{
		if(marks<0)
		{
			throw new myexceptions("invalid mark entered");
		}
		else
			System.out.println("valid");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks:");
		marks=sc.nextInt();
		try
		{
			validate(marks);
		}
		catch(Exception m)
		{
			System.out.println("Exception occured:"+m);
		}
	}

}
