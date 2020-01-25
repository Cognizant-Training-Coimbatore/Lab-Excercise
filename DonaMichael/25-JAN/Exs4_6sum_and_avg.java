package Exs4;

import java.util.Scanner;

public class Exs4_6sum_and_avg {

	public static void main(String[] args) {
		int sum=0;
		Scanner s=new Scanner(System.in);
		int ar[]=new int[5];
		System.out.println("Enter 5 numbers");
		for(int i=0;i<5;i++)
		{
			ar[i]=s.nextInt();
			sum=sum+ar[i];
		}
		float avg=sum/5;
		System.out.println("The sum is:"+sum);
		System.out.println("Average is:"+avg);
	}

}
