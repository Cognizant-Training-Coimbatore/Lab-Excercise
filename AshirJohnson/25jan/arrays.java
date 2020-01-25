package helloworld;

import java.util.Scanner;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,sum=0,sum1=0;
		int n[]=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers:");
		for(i=0;i<10;i++)
		{
		 n[i]=sc.nextInt();
		}
		for(i=0;i<10;i++)
		{
			sum+=n[i];
			if(sum<0)
			{
				sum=0;
			}
			if(sum1<sum)
			{
				sum1=sum;
			}
		}
		System.out.println(sum1);
}}
