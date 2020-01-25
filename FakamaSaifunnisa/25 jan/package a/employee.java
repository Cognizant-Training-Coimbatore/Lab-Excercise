package packA;

public class employee {

	private int empcode;
	protected String empname;
	public int salary;
	void putvalues()
	{
		empcode=101;
		empname="venkat";
		salary=1000;
	}
	void printvalues()
	{
		System.out.println(empcode);
		System.out.println(empname);
		System.out.println(salary);
		
	}
}
