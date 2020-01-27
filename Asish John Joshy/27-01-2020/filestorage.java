package demo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class filestorage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		FileOutputStream fout;
		PrintStream p;
		System.out.println("Enter your name");
		String na=s.nextLine();
		System.out.println("Enter your address");
		String ad=s.nextLine();
		System.out.println("Enter your aadhar card number");
		String ac=s.nextLine();
		System.out.println("Do you want to save?(1/0)");
		int a=s.nextInt();
		if(a==1)
		{
		try 
		{
			System.out.println("Record saved.....exiting.....");
			fout=new FileOutputStream("E:\\Employee.txt");
			p=new PrintStream(fout);
			p.println(na);
			p.println(ad);
			p.println(ac);
			p.close();
		} 
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		}
		else if(a==0)
		{
			System.out.println("Record not saved.....exiting.....");
		}
		else
		{
			System.out.println("Invalid choice");
		}
	}

}
