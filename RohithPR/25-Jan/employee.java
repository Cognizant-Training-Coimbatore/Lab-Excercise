package packA;

public class employee 
{
	private int empcode;
	protected String empname;
	public int salary;
	
	void display()
	{
		empcode = 101;
		empname = "John";
		salary = 1000;		
	}
	void printValues()
	{
		System.out.println("Employee code "+empcode);
		System.out.println("Employee name "+empname);
		System.out.println("Employee Salary "+salary);
	}

}
