package prgrms;

import java.util.Scanner;

public class pg7arraycopy {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=0;
		int a[]=new int[5];
		int b[]=new int[5];
		System.out.println("enter the elemets of first array\n");
		for(i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("elements of second array is");
		for(i=0;i<5;i++)
		{
			b[i]=a[i];
			System.out.println(b[i]);
		}
		
	}

}
