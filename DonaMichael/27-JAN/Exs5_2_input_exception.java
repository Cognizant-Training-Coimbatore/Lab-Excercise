import java.util.Scanner;

public class Exs5_2_input_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a,b;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter two numbers");
			a=sc.nextInt();
			b=sc.nextInt();
			System.out.println("result is"+a/b);
		}
		catch(Exception e)
		{
			System.out.println("Error in the code"+e);
		}
	}

}
