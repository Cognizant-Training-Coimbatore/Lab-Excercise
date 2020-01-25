package demo;

import java.util.Scanner;

class student1
{
	student1()
	{
		String name="Unknown";
		System.out.println("Name:"+name);
	}
	student1(String a)
	{
		String name=a;
		System.out.println("Name:"+name);
	}
}
public class name_constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter name");
		String nam=s.nextLine();
		if(nam.length()==0)
		{
			student1 st=new student1();
		}
		else
		{
			student1 st=new student1(nam);
		}
	}

}
