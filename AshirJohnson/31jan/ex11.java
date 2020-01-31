package java8;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float n,s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=sc.nextInt();
		s=n;
		while(s>=1)
		{
			
			s=s/4;
			if(s==1)
			{
				System.out.println(n+" is a power of 4");
				break;
			}
		}
		if(s<1)
		{
			System.out.println("not power of 4");
		}
	}

}
