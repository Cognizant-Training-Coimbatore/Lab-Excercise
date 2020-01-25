package helloworld;

import java.util.Scanner;

public class Inte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,a,b;
		System.out.println("Enter two numbers:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		for(i=a+1;i<b;i++)
		{
			System.out.println(i);
		}
	}

}
