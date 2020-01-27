import java.util.Scanner;

public class prg07_qn07_custom_exception_employee 
{

	static void validate(int val)throws EmployeeException
	{
		if(val<101 || val>200)
			throw new EmployeeException("Invalid");
		else
			System.out.println("Employee code: "+val);
	}

	public static void main(String[] args) 
	{
		try
		{
			System.out.println("Enter Employee code");
			Scanner sc = new Scanner(System.in);
			int val = sc.nextInt();
			validate(val);
		}
		catch(Exception m)
		{
			System.out.println("Exception occurs: "+m);
		}
	}

}
