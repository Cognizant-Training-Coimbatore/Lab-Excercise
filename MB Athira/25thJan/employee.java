package packA;

public class employee 
{
	int empcode;// if kept public;if kept private
	protected String empname;
	int salary;
	
	void putValues()
	{
		empcode = 101;
		empname = "Della Paul";
		salary = 100000;
	}
	
	void printValues()
	{
		System.out.println("Employee code : "+empcode);
		System.out.println("Employee name : "+empname);
		System.out.println("Employee salary : "+salary);
	}
}
