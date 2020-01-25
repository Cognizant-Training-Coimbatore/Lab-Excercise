package demo;

import java.util.Scanner;

public class reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String a,r="";
		System.out.println("Enter a string");
		a=s.nextLine();
		for(int i=(a.length()-1);i>=0;i--)
		{
			r=r+a.charAt(i);
		}
		System.out.println("Reverse string is "+r);
	}

}
