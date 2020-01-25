package demo;

import java.util.Scanner;

public class odd {

	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		a=sc.nextInt();
		if(a<0)
			System.out.println(" less than 0");
		else
			System.out.println("greater than 0");

	}

}
