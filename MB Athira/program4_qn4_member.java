import java.util.Scanner;

class Member
{
	int age;
	String name;
	long phno;
	String address;
	int salary;
	void printSalary()
	{
		System.out.println("Salary : "+salary);
	}
}
class Employee extends Member
{
	String speci;
}
class Manager extends Member
{
	String dept;
}
public class program4_qn4_member {

	public static void main(String[] args)
	{
		Employee obj1 = new Employee();
		Manager obj2 = new Manager();
		obj1.name = "REVATHY";
		obj1.age = 34;
		obj1.phno = 987654321;
		obj1.address = "B 23 NTPC TOWNSHIP, Kayamkulam";
		obj1.salary = 34000;
		obj1.speci = "Control Systems";
		
		System.out.println("Name : "+obj1.name);
		System.out.println("Age : "+obj1.age);
		System.out.println("Address : "+obj1.address);
		System.out.println("Ph: "+obj1.phno);
		obj1.printSalary();
		
		obj2.name = "Sreehari";
		obj2.age =27;
		obj2.phno = 987543256;
		obj2.address = "D 12 NTPC, Kayamkulam";
		obj2.salary = 100000;
		obj2.dept = "HR department";
		
		System.out.println("Name : "+obj2.name);
		System.out.println("Age : "+obj2.age);
		System.out.println("Address : "+obj2.address);
		System.out.println("Ph: "+obj2.phno);
		obj2.printSalary();
		
	}

}
