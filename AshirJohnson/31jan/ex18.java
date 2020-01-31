package java8;

import java.util.Scanner;

public class ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a==b)
		{
			if(b==c)
			{
				System.out.println("All numbers are equal");
			}
			else
			{
				System.out.println("Neither all are equal or different");
			}
		}
		else if(b==c)
		{
			System.out.println("Neither all are equal or different");
		}
		else
			System.out.println("All numbers are different");
	}

}
