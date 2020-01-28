import java.util.Scanner;

public class Exs5_5_marks {
	
		static void validate(int a)throws negative_exception_1
		{
			if(a<0)
			{
				throw new negative_exception_1("invalid mark entered");
			}
			else
			{
				System.out.println("the mark is "+a);
			}
		}
	public static void main(String[] args) {
		int a;
		try
		{
			
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the marks");
			a=sc.nextInt();
			validate(a);
		}
		catch(Exception e)
		{
			System.out.println("error in the code"+e);
			
		}


	}

}
