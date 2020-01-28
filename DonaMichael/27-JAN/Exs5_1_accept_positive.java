import java.util.Scanner;

public class Exs5_1_accept_positive {
	static void validate(int a)throws negative_exception_1
	{
		if(a<=0)
		{
			throw new negative_exception_1("not valid");
		}
		else
		{
			System.out.println("The number is"+a);
		}
	}

	public static void main(String[] args) {
		int a;
		try {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a positive number");
			a=sc.nextInt();
			validate(a);
		}
		catch(Exception e)
		{
			System.out.println("Exceptoin occured"+e);
		}
		



	}

}
