package helloworld;

import java.util.Scanner;

public class Maxmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,sum=0,max=0,min=10000;
		int[] a=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers:");
		for(i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
			sum+=a[i];
			if(a[i]>max)
			{
				max=a[i];
			}
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("Average is:"+sum/10);
		System.out.println("Max is:"+max);
		System.out.println("Min is:"+min);
	}

}
