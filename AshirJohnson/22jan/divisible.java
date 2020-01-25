package helloworld;

import java.util.Scanner;

public class divisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		if(a%7==0)
		{
			System.out.println("Divisible by 7");
		}
		else
		{
			System.out.println("Not divisible by 7");
		}
	}

}
