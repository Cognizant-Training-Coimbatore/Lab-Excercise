import java.util.Scanner;

public class Exs5_3_nullpointer {

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
