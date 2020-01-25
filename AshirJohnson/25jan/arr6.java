package helloworld;

import java.util.Scanner;

public class arr6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n;
		int[] a=new int[10];
		for(i=0;i<10;i++)
		{
			a[i]=i;
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be searched:");
		n=sc.nextInt();
		for(i=0;i<10;i++)
		{
			if(a[i]==n) {
			System.out.println("The element is found at "+(i+1)+"th position");
			break;
			}
		}
		if(i==10)
		{
			System.out.println("The element not found");
		}
	}

}
