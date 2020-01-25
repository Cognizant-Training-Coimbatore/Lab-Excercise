package demo;

import java.util.Scanner;

public class search_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int c=0;
		int a[]=new int[10];
		System.out.println("Enter array elements");
		for(int i=0;i<10;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Enter a number to search");
		int n=s.nextInt();
		for(int i=0;i<10;i++)
		{
			if(n==a[i])
			{
				c=1;
				break;
			}
		}
		if(c==1)
		{
			System.out.println("Number is found");
		}
		else
		{
			System.out.println("Number not found");
		}
	}

}
