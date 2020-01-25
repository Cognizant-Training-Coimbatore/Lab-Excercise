package demo;

import java.util.Scanner;

public class odd_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[5];
		int i,c=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 5 numbers");
		for(i=0;i<5;i++)
		{
		a[i]=s.nextInt();
		if(a[i]%2!=0)
		{
			c++;
		}
		}
		System.out.println("\nThere are "+c+" odd numbers");
	}

}

