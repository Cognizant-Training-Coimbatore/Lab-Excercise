package demo;

import java.util.Random;
import java.util.Scanner;

public class random_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Random r=new Random();
		System.out.println("Enter the limit");
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			int ra=r.nextInt(20);
			System.out.println(ra);
		}
	}

}
