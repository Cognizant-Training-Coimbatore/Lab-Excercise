package packc;

import java.util.Scanner;

public class pro3stringexception {

	public static void main(String[] args) {
		try
		{
			String str;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the string");
			str=sc.next();
			System.out.println("String is"+str);
		}
		catch(NullPointerException e)
		{
			System.out.println("Error in the code");
		}
	}

}
