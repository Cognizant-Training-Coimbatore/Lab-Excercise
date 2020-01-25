package helloworld;

import java.util.Scanner;

class area1
{
	int l,b;
	area1(int a,int c)
	{
		l=a;
		b=c;
	}
}
public class area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c,d;
		System.out.println("Enter the length and breadth:");
		Scanner sc=new Scanner(System.in);
		c=sc.nextInt();
		d=sc.nextInt();
		area1 ar=new area1(c,d);
		System.out.println("Area is:"+ar.l*ar.b);
	}

}
