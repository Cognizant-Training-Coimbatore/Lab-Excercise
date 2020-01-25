package demo;

import java.util.Scanner;

public class question8_asc_desc {
	public static void main(String[] args)
	   {
		int temp1, temp2;
		Scanner s = new Scanner(System.in);
		int a[] = new int[5];
		System.out.println("Enter the elements to sort:");
		for (int i = 0; i < 5; i++) 
		{
		  a[i] = s.nextInt();
		}
		       
		for (int i = 0; i < 5; i++) 
		{
		  for (int j = i + 1; j < 5; j++) 
		     {
		              
		  if (a[i] > a[j]) 
		  {
		  temp1 = a[i];
		  a[i] = a[j];
		  a[j] = temp1;
		       }
		      }
		 }
		for (int k = 0; k < 5; k++) 
		{
		  for (int l = k + 1; l < 5; l++) 
		     {
		              
		  if (a[k] < a[l]) 
		  {
		  temp2 = a[k];
		  a[k] = a[l];
		  a[l] = temp2;
		       }
		      }
		 }
		System.out.println("Elements in descending order:");
		for (int i = 0; i < 4; i++) 
		{
		 System.out.print(a[i] + ",");
		}
		System.out.println(a[4]);

		System.out.println("Elements in Ascending Order:");
		for (int k =4; k >=0; k--) 
		{
		 System.out.print(a[k] + ",");
		}
	}

}
