package pack1;

import java.util.Scanner;

public class jan31st_pro8 {

	public static void main(String[] args) {
		boolean abc;
		System.out.println("enter the condition true for false");
		Scanner sc=new Scanner(System.in);
		abc=sc.nextBoolean();
		int a,b,c;
		System.out.println("enter three number");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(abc==true)
		{
			if(c>b)
			{
				System.out.println("true");
			}
			else
			{
				System.out.println(false);
			}
		}
		else if(abc==false)
		{
			if(b>a&&c>b)
			{
				System.out.println("true");
			}
			else
			{
				System.out.println(false);
			}	
		}
	}

}
