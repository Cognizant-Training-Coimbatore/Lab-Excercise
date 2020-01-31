package java8;

import java.util.Scanner;

public class ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j;
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.println();
			for(j=0;j<n-i;j++)
			{
				System.out.print(" ");
			}
			for(j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			for(j=2;j<=i;j++)
			{
				System.out.print(j);
			}}
			for(i=n-1;i>=1;i--)
			{
				System.out.println();
				for(j=0;j<n-i;j++)
				{
					System.out.print(" ");
				}
				for(j=i;j>=1;j--)
				{
					System.out.print(j);
				}
				for(j=2;j<=i;j++)
				{
					System.out.print(j);
				}
		}
	}

}
