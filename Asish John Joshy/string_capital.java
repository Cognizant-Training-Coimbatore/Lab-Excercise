package demo;

import java.util.Scanner;

public class string_capital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String name;
		System.out.println("Enter your name");
		name=s.nextLine();
		String upname=name.toUpperCase();
		System.out.println("Your name in CAPS:-\n"+upname);
	}

}
