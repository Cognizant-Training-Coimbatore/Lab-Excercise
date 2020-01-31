package selenium_proj;

import java.util.Scanner;

public class Program6_odd_or_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Enter  a Number: ");
		Scanner s = new Scanner(System.in);
		
		int n=s.nextInt();
		if(n%2==0)
			System.out.println("it is an even no!");
		else 
			System.out.println("it is an odd no!");
	}

}

