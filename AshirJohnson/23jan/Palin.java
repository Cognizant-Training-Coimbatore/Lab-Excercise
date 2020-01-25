package helloworld;

import java.util.Scanner;

public class Palin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a;
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		a=sc.next();
		for(i=0;i<a.length();i++)
		{
			if(a.charAt(i)!=a.charAt(a.length()-i-1))
			{
				System.out.println("Not palindrome");
				break;
			}
		}
		if(i==a.length())
		{
			System.out.println("Palindrome");
		}
	}

}
