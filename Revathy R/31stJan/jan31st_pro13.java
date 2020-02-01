package pack1;

import java.util.Scanner;

public class jan31st_pro13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,k,j,p=0,s=0,avg;
		System.out.println("enter the size of the array");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the elements of first array");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		System.out.println("enter the size of the sub array");
		k=sc.nextInt();
		int k1=k;
		for(i=0;i<=n-k1;i++)
		{	int s1=0;
			for(j=i;j<k;j++)
			{
				s1=s1+a[j];
			
			}
			
			if(s1>s)
			{
				s=s1;
				p=i;
			}
			k++;
		}
		System.out.println("maximum average is "+s/k1);
		System.out.println("sub array with maximum average is ");
		for(i=p;i<=(p+k1-1);i++)
		{
			System.out.println(a[i]);
			
		}
		
	}

}
