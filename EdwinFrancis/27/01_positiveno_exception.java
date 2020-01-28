import java.util.Scanner;

public class prg01_qn01_positiveno_exception
{

	static void checkPositive(int n)throws Exception
	{
		if(n<0)
			throw new Exception("No. is negative. INVALID INPUT");
		else
			System.out.println("VALID INPUT");
	}

	public static void main(String[] args) 
	{
		try
		{
			System.out.println("Enter the number");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			checkPositive(n);
		}
		catch(Exception m)
		{
			System.out.println("Exception occurs: "+m);
		}
	}

}
