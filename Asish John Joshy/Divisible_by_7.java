package demo;

import java.util.Scanner;

public class Divisible_by_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number\n");
		int n=s.nextInt();
		if(n%7==0)
		{
			System.out.println("Divisible by 7");
		}
		else
		{
			System.out.println("Not divisible by 7");
		}
	}

}
