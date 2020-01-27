package demo;

import java.util.Scanner;

public class positive_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num>0) {
			System.out.println("the number is positive");
		}
		else
		{System.out.println("the number is negative");
	}

}
}
