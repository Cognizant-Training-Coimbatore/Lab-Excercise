package helloworld;

import java.util.Scanner;

public class arr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		String[] a=new String[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the names:");
		for(i=0;i<5;i++)
		{
			a[i]=sc.next();
			a[i]=a[i].toUpperCase();
		}
		for(i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
	}

}
