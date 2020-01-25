package helloworld;

import java.util.Scanner;

public class Multab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,j;
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=1;i<=10;i++)
		{
			for(j=1;j<=n;j++)
			{
				System.out.print(j+"*"+i+"="+i*j+"\t");
			}
			System.out.print("\n");
		}
	}

}
