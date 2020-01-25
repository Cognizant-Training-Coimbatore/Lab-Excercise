package Exs4;

import java.util.Scanner;

public class Exs4_7_array_copy {

	public static void main(String[] args) {
		int i=0,j=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 5 elements to array");
		int ar[]=new int[5];
		int arc[]=new int[5];
		
		for(i=0;i<5;i++)
		{
			ar[i]=s.nextInt();
			
		}
		System.out.println("elements in second array:");
		for(i=0;i<5;i++)
		{
			
			arc[i]=ar[i];
			System.out.println(arc[i]);
		}
		

	}

}
