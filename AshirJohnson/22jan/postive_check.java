package helloworld;

import java.util.Scanner;

public class postive_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
		int a;
		a=sc.nextInt();
		if(a>0)
		{
			System.out.println("positive");
		}
		else
		{
			System.out.println("negative");
		}
	}

}
