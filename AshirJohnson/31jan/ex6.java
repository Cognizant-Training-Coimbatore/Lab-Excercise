package java8;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println("1");
		}
		else
		{
			System.out.println("0");
		}
	}

}
