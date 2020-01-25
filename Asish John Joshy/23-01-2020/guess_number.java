package demo;

import java.util.Random;
import java.util.Scanner;

public class guess_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random s=new Random();
		Scanner sc=new Scanner(System.in);
		int a=s.nextInt(9);
		for(int i=3;i>=1;i--)
		{
			System.out.println("I'm thinking of a number between 0 and 9. Can you guess it? ("+i+" attempt(s) left):");
			int n=sc.nextInt();
			if(n==a)
			{
				break;
			}
			else
			{
				System.out.println("Sorry. Wrong number.");
			}
		}

		System.out.println("Correct number is "+a);
		
	}

}
