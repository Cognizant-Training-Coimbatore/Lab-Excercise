package prgrms;

import java.util.Scanner;

public class pro7employee {
				
	
		static void validate(int emp)throws negativeexception
		{
			
			if(emp<101 || emp>200)
			{
				throw new negativeexception("input rejected");
			}
			else 
			{
				System.out.println("input accepted");
			}
			
		}
		public static void main(String[] args) {
			int emp;
			try {
				
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the employee code");
			emp=sc.nextInt();
			validate(emp);
			}
			catch(Exception e)
			{
				System.out.println("error in the code"+e);
				
			}
	}

}
