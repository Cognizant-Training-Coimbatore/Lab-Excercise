package demo;

import java.util.Scanner;

public class arith_op {
	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter value of a and b");
	int a=sc.nextInt();
	int b=sc.nextInt();
	
	System.out.println((a+b));
	System.out.println((a-b));
	System.out.println((a*b));
	System.out.println((a/b));
	System.out.println((a%b));
	
}
}

