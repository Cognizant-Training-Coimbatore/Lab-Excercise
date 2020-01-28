package demo;

import java.util.Scanner;

public class Program4_array_index_out_of_bounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		int[] result=new int[5];
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		try
		{
			
			result[5]=a/b;
			System.out.println("result = "+result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error"+e);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Error "+e);
			
		}
		
		System.out.print("outof the block");

		}
	}

}
