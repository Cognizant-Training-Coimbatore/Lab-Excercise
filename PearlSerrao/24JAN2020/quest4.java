package demo;

public class quest4 {
	public static void main(String[] args) {
 Employee emp=new Employee();
// System.out.println();
 System.out.println ("Employee is " + (emp.Name="Pearl"));
 System.out.println("Address:"+ ( emp.Address="mlore"));
 System.out.println ("Age:"+(emp.age=22));
 System.out.println("Phone:"+ (emp.phone=9591070326l));
 emp.printSal(22000);
 
Manager m=new Manager();
//System.out.println();
System.out.println ("\n bNEmployee is " + (m.Name="XYZ"));
System.out.println("Address:"+ ( m.Address="Blore"));
System.out.println ("Age:"+(m.age=29));
System.out.println("Phone:"+ (m.phone=9591077686l));
m.printSal(52000);
	}
}
class Member{
	String Name, Address;
	int age,salary;
	long phone;
	void printSal(int sal) {
		System.out.println("Salary is: "+sal);
	}
}
class Employee extends Member{
	 String spec;
	 
}


class Manager extends Member{
	String dept;
}