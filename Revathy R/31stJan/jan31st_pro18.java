package pack1;

import java.util.Scanner;

public class jan31st_pro18 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the three numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a==b&&a==c)
		{
			System.out.println("All numbers are equal");
		}
		else if(a!=b&&b!=c&&a!=c)
		{
			System.out.println("All numbers are different");
		}
		else
		{
			System.out.println("Neither all are equal or different");
		}
	}

}
