package helloworld;

import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 5 numbers:");
		Scanner sc=new Scanner(System.in);
		int a,b,c,d,e;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		e=sc.nextInt();
		System.out.println(a+ b+ c+ d+ e);
		System.out.println((a+ b+ c+ d+ e)/5);
	}

}
