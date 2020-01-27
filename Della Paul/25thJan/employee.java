package packA;

public class employee
{
	 private int empcode;
	 protected String empname;
	 public int salary;
	void putvalues()
	{
		empcode=101;
		empname="Della";
		salary=7000;
	}
	void printvalues()
	{
		System.out.println("Employee code"+empcode);
		System.out.println("Employee name"+empname);
		System.out.println("Employee salary"+salary);
	}
}
