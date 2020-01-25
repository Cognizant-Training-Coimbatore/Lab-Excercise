package packA;

public class employee {
	private int empcode;
	 protected String empname;
	public int salary;
	
	void putValues()
	{
		empcode=101;
		empname="Sreejith";
		salary=2000;
		
	}
	void printValues()
	{
		System.out.println("employee code:"+empcode);
		System.out.println("emp name:"+empname);
		System.out.println("salary:"+salary);
		
		
	}
	
	

}
