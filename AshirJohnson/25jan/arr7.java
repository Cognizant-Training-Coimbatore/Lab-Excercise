package helloworld;

import java.util.Scanner;

public class arr7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n;
		int[] a=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers:");
		for(i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<5;i++)
		{
			for(j=0;j<4;j++)
			{
				if(a[j]>a[j+1])
				{
					n=a[j];
					a[j]=a[j+1];
					a[j+1]=n;
				}
			}
		}
		System.out.println("Smallest is:"+a[0]);
	}

}
