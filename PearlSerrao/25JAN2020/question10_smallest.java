package demo;

import java.util.Scanner;

public class question10_smallest {
public static void main(String args[]) {
	int n,number,small;
	System.out.println("enter the maximum size");
	Scanner sc=new Scanner(System.in); 
	n=sc.nextInt();
	int numbers1[]=new int[n];
	int i;
	System.out.println("enter number 0");
	numbers1[0]=sc.nextInt();
	small =numbers1[0];
	for(i=1;i<n;i++) {
	System.out.println("enter number"+i);
	number=sc.nextInt();
	numbers1[i]=number;
	if(number<small)
	{
	small=number;

	}
	}
	for (i=0;i<n;i++)
	{
	System.out.println("numbers are "+numbers1[i]);
	}
	System.out.println("smallest number is    "+small);

}
	}


	


