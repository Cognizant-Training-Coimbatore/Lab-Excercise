package demo;

import java.util.Scanner;

public class array_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a[]=new int[5];
		int sum=0,avg;
		System.out.println("Enter 5 numbers");
		for(int i=0;i<5;i++)
		{
			a[i]=s.nextInt();
			sum=sum+a[i];
		}
		avg=sum/5;
		System.out.println("Sum="+sum);
		System.out.println("Average="+avg);
	}

}
