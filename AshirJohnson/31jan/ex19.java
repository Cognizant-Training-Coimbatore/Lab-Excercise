package java8;

import java.util.Scanner;

public class ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5};
		System.out.println("Enter the specific number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i;
		for(i=0;i<5;i++)
		{
			if(a[i]==n)
			{
				System.out.println(n+" is found at "+(i+1)+"th position");
				break;
			}
		}
		if(i==5)
		{
			System.out.println("Element not found");
		}
	}

}
