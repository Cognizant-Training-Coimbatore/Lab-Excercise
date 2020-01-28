import java.util.Scanner;
public class Exceptions_test1 
         {
	static void validate(int n)throws myexception
	{
		if(n>0)
		{
			System.out.println("accepted");
		}
		else
		{
			throw new myexception("not valid");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		try
		{
			validate(n);
		}
		catch (myexception e)
		{
			System.out.println(e);
		}

	}

}
