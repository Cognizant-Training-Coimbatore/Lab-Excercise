package packA;

public class employee {
	private int empcode;//visibility only within the class
	String empname;
	int salary;
	void putvalues()
	{
		empcode=101;
		empname="dona";
		salary=1000;
		
	}
	void printValues()
	{
		System.out.println("Employee code:"+empcode);
		System.out.println("Employee name:"+empname);
		System.out.println("Salary:"+salary);
	}

}
