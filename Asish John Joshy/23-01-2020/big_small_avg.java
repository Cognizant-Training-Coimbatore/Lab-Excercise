package demo;

import java.util.Scanner;

public class big_small_avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[10];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 10 numbers");
		for(int i=0;i<10;i++)
		{
			a[i]=s.nextInt();
		}
		int x=a[0],y=a[0],avg=a[0];
		for(int i=1;i<10;i++)
		{
			avg=avg+a[i];
			if(x<a[i])
				{
					x=a[i];
			    }
			if(y>a[i])
			{
				y=a[i];
		    }
		}
			System.out.println("Biggest="+x);
			System.out.println("Smallest="+y);
			System.out.println("Average="+avg);
	}

}
