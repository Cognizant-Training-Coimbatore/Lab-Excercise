package packA;

public class Employee1 
{
	int empno;
	String empname;
	String adress;
	String department;
	int salary;
	
	void display()
	{
		empno = 844421;
		empname = "Rohith P R";
		adress = "kannur, kerala";
		department = "selinium testing";		
		salary = 20000;		
	}
	void printValues()
	{
		System.out.println("Employee Number  "+empno);
		System.out.println("Employee name  "+empname);
		System.out.println("Employee Adress "+adress);
		System.out.println("Employee Department "+department);
		System.out.println("Employee Salary  "+salary);
	}

}


