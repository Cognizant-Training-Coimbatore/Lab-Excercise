package demo;

import java.util.Scanner;

public class question9_search {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		int s=0;
		
		Scanner sc=new Scanner(System.in);
		int numbers1[]=new int[10];
		int i;
		System.out.println("Enter number 0");
		number=sc.nextInt();
		numbers1[0]=number;
		for(i=1;i<10;i++)
		{
		System.out.println("Enter number "+i);
		number=sc.nextInt();
		numbers1[i]=number;
		}
		System.out.println("Enter the number you wish to search");
		int res=sc.nextInt();
		for(i=0;i<10;i++)
		{
			if(numbers1[i]==res)
			{
				s=1;
				break;
			}
		}
		if(s==0)
		{
			System.out.println("NUmber not available");
		}
		else
		{
			System.out.println( number+" is available");
		}
		

	}
}
