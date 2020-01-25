package helloworld;

import java.util.Scanner;


public class stringcap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n;
		System.out.println("Enter your name");
		Scanner sc=new Scanner(System.in);
		n=sc.next();
		
		System.out.println(n.toUpperCase());
		System.out.println(n.length());
	}

}
