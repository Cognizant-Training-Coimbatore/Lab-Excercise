package helloworld;

import java.util.Scanner;

public class Strrev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a;
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		a=sc.next();
		for(i=a.length()-1;i>=0;i--)
		{
			System.out.print(a.charAt(i));
		}
	}

}
