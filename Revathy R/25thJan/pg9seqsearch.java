package prgrms;

import java.util.Scanner;

public class pg9seqsearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=0,n;
		int a[]=new int[10];
		System.out.println("enter the number to be searches");
		n=sc.nextInt();
		System.out.println("enter the elemets(10 numbers) of the array\n");
		for(i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<10;i++)
		{
			if(a[i]==n)
			{
				System.out.println("element is present");
				System.exit(0);
			}
		}
		System.out.println("element not present");
	}

}
