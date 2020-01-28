import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class p8_inputdata
{
	public static void main(String[] args)
	{
		FileOutputStream fout;
		PrintStream p;
		int n;
		String name,add;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter Name: ");
		name=s.next();
		System.out.println("Enter Address: ");
		add=s.next();
		System.out.println("Enter Aadhar Card Number: ");
		long a = s.nextLong();
		System.out.println("Do you want to save?(0/1)");
		n=s.nextInt();
		if(n==1)
		{
			try
			{
				fout = new FileOutputStream("E:\\Java Eclipse Codes\\Jan 27\\src\\employee.txt");
				p=new PrintStream(fout);
				p.println(name);
				p.println(add);
				p.println(a);
			}
			catch(Exception e)
			{
				System.err.println("Error in file");
			}
		}
		else if(n==0)
		{
			System.out.println("Record not saved");
		}
		else
		{
			System.out.println("Enter the correct value");
		}
	}
}