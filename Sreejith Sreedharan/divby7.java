package demo;

import java.util.Scanner;

public class divby7 {
	public static void main(String[] args)
	{int a;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a value");
	a=sc.nextInt();
	sc.close();
	if(a%7==0)
		System.out.println("divisible by 7");
	else
		System.out.println("not divisible by 7");}}
