package prgrms;

import java.util.Scanner;

public class pg6sumavg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=0,s=0;
		float d;
		int a[]=new int[5];
		System.out.println("enter the 5 numbers\n");
		for(i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
			s=s+a[i];
		}
		d=s/5;
		System.out.println("sum is "+s);
		System.out.println("average is "+d);
	}

}
