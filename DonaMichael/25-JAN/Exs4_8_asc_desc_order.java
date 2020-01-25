package Exs4;

import java.util.Scanner;

public class Exs4_8_asc_desc_order {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i=0;
		int ar[]=new int[5];
		System.out.println("enter the elemets of the array\n");
		for(i=0;i<5;i++)
		{
			ar[i]=s.nextInt();
		}
		for(i=0;i<5;i++)
		{
			for(int j=1;j<(5-i);j++)
			{
			if(ar[j-1]>ar[j])
			{
				int temp=ar[j-1];
				ar[j-1]=ar[j];
				ar[j]=temp;
			}
			}
		}
		System.out.println("accesnding order is ");
		for(i=0;i<5;i++)
			System.out.println(ar[i]);
		System.out.println("descending order is ");
		for(i=4;i>=0;i--)
			System.out.println(ar[i]);
	}

}


	
