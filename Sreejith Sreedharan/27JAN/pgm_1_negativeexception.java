package packc;

import java.util.Scanner;

public class pgm_1_negativeexception {
	static void validate(int a)throws negativeexception
	{
		if(a<=0)
			throw new negativeexception("not valid number");
		else
		{System.out.println("The number is "+a);
		}
	}

	public static void main(String[] args) 
	{int a;	
	try
		{
			
			System.out.println("Enter positive number");
			Scanner sc=new Scanner(System.in);
			a=sc.nextInt();
			validate(a);
		}
catch(Exception e)
		{
	System.out.println("Error in the digit"+e);
	}
		
		
	}

}
