package helloworld;

import java.util.Scanner;

class operation
{
	
	void add(int a, int b)
	{
		System.out.println(a+b);
	}

	void sub(int a, int b)
	{
		System.out.println(a-b);
	}

	void mul(int a, int b)
	{
		System.out.println(a*b);
	}

	void div(int a, int b)
	{
		System.out.println(a/b);
	}
}
public class opera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		System.out.println("Enter two numbers:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		operation o=new operation();
		o.add(a, b);
		o.sub(a, b);
		o.mul(a, b);
		o.div(a, b);
	}

}
