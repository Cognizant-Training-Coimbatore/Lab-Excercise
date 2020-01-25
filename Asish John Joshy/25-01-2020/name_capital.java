package demo;

import java.util.Scanner;

public class name_capital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String a[]=new String[5];
		String b[]=new String[5];
		System.out.println("Enter 5 names");
		for(int i=0;i<5;i++)
		{
			a[i]=s.nextLine();
		}
			for(int j=0;j<5;j++)
			{
				b[j]=a[j].toUpperCase();
			}
		System.out.println("\nNames:");
		for(int i=0;i<5;i++)
		{
			System.out.println(b[i]);
		}
	}

}
