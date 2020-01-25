package demo;

import java.util.Scanner;

public class divbyseven {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a no");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		if(n%7==0)
		System.out.println("Number divisible by 7");
	
	else 
		System.out.println("Number not divisible by 7");
	}
}
