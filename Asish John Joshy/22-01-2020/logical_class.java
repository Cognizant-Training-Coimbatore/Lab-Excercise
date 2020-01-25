package demo;

import java.util.Scanner;

class logical
{
	float d;
	void add(int x,int y)
	{
		System.out.println("Sum="+(x+y));
	}
	void sub(int x,int y)
	{
		System.out.println("Difference="+(x-y));
	}
	void mul(int x,int y)
	{
		System.out.println("Product="+x*y);
	}
	void div(int x,int y)
	{
		d=x/y;
		System.out.println("Quotient="+d);
	}
}
public class logical_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2;
		Scanner s=new Scanner(System.in);
		logical l=new logical();
		System.out.println("Enter 2 numbers");
		n1=s.nextInt();
		n2=s.nextInt();
		l.add(n1,n2);
		l.sub(n1,n2);
		l.mul(n1,n2);
		l.div(n1,n2);
	}

}
