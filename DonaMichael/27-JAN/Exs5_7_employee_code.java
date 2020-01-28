import java.util.Scanner;

public class Exs5_7_employee_code {
	static void validate(int emp)throws negative_exception_1
	{
		
		if(emp<101 || emp>200)
		{
			throw new negative_exception_1("input rejected");
		}
		else 
		{
			System.out.println("input accepted");
		}
		
	}
	public static void main(String[] args) {
		int emp;
		try {
			
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the employee code");
		emp=sc.nextInt();
		validate(emp);
		}
		catch(Exception e)
		{
			System.out.println("error in the code"+e);
			
		}

		}

}
