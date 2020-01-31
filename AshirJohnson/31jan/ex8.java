package java8;

import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the flag");
		s=sc.next();
		System.out.println("Enter the numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(s.equals("abc"))
		{
			if(c>b)
			{
				System.out.println("true");
			}
			else
			{
				System.out.println("false");
			}
		}
		else
		{
			if(b>a&&c>b)
			{
				System.out.println("true");
			}
			else
			{
				System.out.println("false");
			}
		}
	}

}
