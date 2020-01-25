package helloworld;

import java.util.Random;
import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,a;
		Random rn=new Random();
		n=rn.nextInt(9);
		Scanner sc=new Scanner(System.in);
		for(i=1;i<4;i++)
		{
			System.out.println(i+"th attempt:");
			a=sc.nextInt();
			if(n==a)
			{
				System.out.println("Correct guess");
				break;
			}
		}
		if(i==4)
		{
			System.out.println("End. Correct value is:"+n);
		}
	}

}
