package java8;

import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float sum=0,sum1=0,k;
		int i,j;
		int[] a= {1,5,3,7,8,3,9,2,6,5};
		System.out.println("Enter k");
		Scanner sc=new Scanner(System.in);
		k=sc.nextInt();
		for(i=0;i<10-k;i++)
		{
			sum=0;
			for(j=i;j<i+k;j++)
			{
				sum+=a[j];
				if(sum1<sum)
				{
					sum1=sum;
				}
			}
		}
		System.out.println(sum1/k);
	}

}
