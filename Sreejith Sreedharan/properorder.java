package demo;

import java.util.Scanner;

public class properorder {
	public static void main(String args[])
	{int n,m;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 2 numbers");
		n=sc.nextInt();
		m=sc.nextInt();
		if(n<m)
		for(int i=n;i<=m;i++)
			System.out.println(i);
		else
			for(int i=n;i>=m;i--)
				System.out.println(i);	
	}

}
