package demo;

import java.util.Scanner;

public class arithmetic_operations {

	public static void main(String[] args) {
		int x,y;
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		int z;
		z=x+y;
		System.out.println("sum is:"+z);
		int l;
		l=x*y;
		System.out.println("multiplication:"+l);
int m;
m=x-y;
System.out.println("subtraction:"+m);
int n;
n=x/y;
System.out.println("division:"+n);
sc.close();
	}

}
