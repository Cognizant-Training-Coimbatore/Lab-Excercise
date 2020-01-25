package prgrms;

import java.util.Scanner;

public class pg10arraysmall {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=0;
		int a[]=new int[5];
		System.out.println("enter the elemets of the array\n");
		for(i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		int min=a[0];
		for(i=1;i<5;i++)
		{
			if(min>a[i])
				min=a[i];
		}
		System.out.println("smallest in the array is "+min);

	}

}
