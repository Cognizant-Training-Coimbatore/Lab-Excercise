package demo;

import java.util.Scanner;

public class exception__index_zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int[] a=new int[5];
		try
		{
			a[5]=30;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic error "+e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Index error "+e);
		}
	}

}
