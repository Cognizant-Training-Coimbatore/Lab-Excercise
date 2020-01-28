package demo;

import java.util.Scanner;

public class Program5_invalidmarks {
	static void validate(int x)throws exceptions{
	
		// TODO Auto-generated method stub
		{
			if(x<0)
				throw new exceptions("this is invalid");
			else
				System.out.println("this is valid");
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int x;
			System.out.println("check whether the marks entered is valid");
			Scanner scanner =new Scanner(System.in);
			x = scanner.nextInt();
			try
			{
				validate(x);
			}
			catch(Exception m)
			{
				System.out.println("Exception occured:" +m);
			}

	}

}
