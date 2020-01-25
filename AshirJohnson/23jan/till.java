package helloworld;

import java.util.Scanner;

public class till {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0,i=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers:");
		while(true)
		{
			n=sc.nextInt();
			if(n==-999)
			{
				break;
			}
			i++;
			sum+=n;
		}
		System.out.println("Sum is:"+sum);
		System.out.println("Average is:"+sum/i);
	}

}
