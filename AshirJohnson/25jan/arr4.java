package helloworld;

import java.util.Scanner;

public class arr4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int [] a=new int[5];
		int [] b=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers:");
		for(i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
			b[i]=a[i];
		}
		for(i=0;i<5;i++)
		{
			System.out.println(b[i]);
		}
	}

}
