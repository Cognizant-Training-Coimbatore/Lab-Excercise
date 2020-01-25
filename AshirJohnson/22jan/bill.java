package helloworld;

import java.util.Scanner;

public class bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		System.out.println("Enter the new reading:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("Enter the old reading:");
		b=sc.nextInt();
		c=a-b;
		if(c>0&&c<101)
		{
			System.out.println("free");
		}
		else if(c>100&&c<201)
		{
			System.out.println(c);
		}
		else if(c>200&&c<301)
		{
			System.out.println(2*c);
		}
		else if(c>300&&c<401)
		{
			System.out.println(3*c);
		}
		else
		{
			System.out.println(4*c+c/10);
		}
	}

}
