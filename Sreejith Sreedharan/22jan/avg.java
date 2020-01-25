package demo;

import java.util.Scanner;

public class avg {
	public static void main(String[] args) {
		int a,b,c,d,e,sum,avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		e=sc.nextInt();
sum=a+b+c+d+e;
avg=sum/5;
System.out.println("Sum and avg is:"+sum+"   "+avg);
}
}