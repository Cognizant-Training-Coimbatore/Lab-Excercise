package helloworld;

import java.util.Scanner;

public class arr3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,sum=0;
		int[] a=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers:");
		for(i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		System.out.println("sum is: "+sum);
		System.out.println("Average is: "+sum/5);
	}

}
