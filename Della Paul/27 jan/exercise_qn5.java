import java.util.Scanner;
public class exercise_qn5
{
	static void checkmarks(int x) throws Exception
	{
		if(x<0)
		{
			throw new myexceptions("Invalid marks entered");
		}
		else
		{
			System.out.println("Marks accepted");
		}
	}

	public static void main(String[] args)
	{
		try
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the marks");
		int x=sc.nextInt();
		checkmarks(x);
		}
		catch(Exception m)
		{
			System.out.println("Exception occured"+m);
		}
		
	}
	

}
