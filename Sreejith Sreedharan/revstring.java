package demo;

import java.util.Scanner;

public class revstring {

	public static void main(String[] args) {
		String a;
		String b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextLine();
		String rev="";
		int n;
		n=(a.length()-1);
		for(int i=n;i>=0;i--)
		{rev=rev+a.charAt(i);
		}
		System.out.println(rev);

	}

}