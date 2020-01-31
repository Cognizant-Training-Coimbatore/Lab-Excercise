package java8;

import java.util.Arrays;
import java.util.Scanner;

public class ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5};
		System.out.println("Enter the specific number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,j;
		for(i=0;i<5;i++)
		{
			if(a[i]==n)
			{
				for(j=i;j<4;j++)
				{
					a[j]=a[j+1];
				}
				break;
			}
		}
		if(i==5)
		{
			System.out.println("Element not found");
		}
		else
		{
			for(i=0;i<4;i++)
			{
				System.out.println(a[i]);
			}
		}
	}

}