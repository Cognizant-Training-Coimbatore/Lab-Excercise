package demo;

import java.util.Scanner;

public class square_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		double square=num*num;
		System.out.println("Square of  the number is "+square);
	}

}
