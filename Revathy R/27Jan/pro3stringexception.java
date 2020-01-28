package prgrms;

import java.util.Scanner;

public class pro3stringexception {

	public static void main(String[] args) {
		try
		{
			String str=null;
			int r;
			r=str.length();
		}
		catch(NullPointerException e)
		{
			System.out.println("error in the code"+e);
		}

	}

}
