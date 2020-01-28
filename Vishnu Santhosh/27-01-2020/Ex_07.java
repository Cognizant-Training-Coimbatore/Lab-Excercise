package jan_27th;

import java.util.Scanner;

public class Ex_07 {static void validate(int x)throws Myexception
	
	{
		if(x<101 || x>200)
			throw new Myexception("this is invalid");
		else
			System.out.println("this is valid");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		System.out.println("Enter the Emply Id");
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
