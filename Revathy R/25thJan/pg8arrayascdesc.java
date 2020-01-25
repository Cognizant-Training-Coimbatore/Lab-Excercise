package prgrms;

import java.util.Scanner;

public class pg8arrayascdesc {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=0;
		int a[]=new int[5];
		System.out.println("enter the elemets of the array\n");
		for(i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<5;i++)
		{
			for(int j=1;j<(5-i);j++)
			{
			if(a[j-1]>a[j])
			{
				int temp=a[j-1];
				a[j-1]=a[j];
				a[j]=temp;
			}
			}
		}
		System.out.println("accesnding order is ");
		for(i=0;i<5;i++)
			System.out.println(a[i]);
		System.out.println("descending order is ");
		for(i=4;i>=0;i--)
			System.out.println(a[i]);
	}

}
