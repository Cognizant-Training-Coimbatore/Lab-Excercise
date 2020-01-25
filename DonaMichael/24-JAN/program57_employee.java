import java.util.Scanner;

class member
	{
	String name,addr;
	int age,salary;
	double phno;
	
	void printSalary()
	{
		System.out.println("Salary:"+salary);
	}
	}
class Employee extends member
	{
	String dep;
	void display()
	{
	System.out.println("name:"+name);
	System.out.println("age"+age);
	System.out.println("phone no"+phno);
	System.out.println("Address"+addr);
	System.out.println("department"+dep);
	
	}
	}
class Manager extends member
	{
	String spec;
	void display()
	{
		System.out.println("name"+name);
		System.out.println("age"+age);
		System.out.println("phone no"+phno);
		System.out.println("Address"+addr);
		System.out.println("Specialization"+spec);
	}
	}

public class program57_employee {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Employee obj=new Employee();
		System.out.println("Enter the details of the employee");
		System.out.println("enter name");
		obj.name=s.next();
		System.out.println("enter age");
		obj.age=s.nextInt();
		System.out.println("enter phone no");
		obj.phno=s.nextDouble();
		System.out.println("enter salary");
		obj.salary=s.nextInt();
		System.out.println("enter address");
		obj.addr=s.next();
		System.out.println("enter department");
		obj.dep=s.next();
		
		System.out.println("Enter the details of the manager");
		Scanner s1=new Scanner(System.in);
		Manager obj1=new Manager();
		System.out.println("enter name");
		obj1.name=s1.next();
		System.out.println("enter age");
		obj1.age=s1.nextInt();
		System.out.println("enter phone no");
		obj1.phno=s1.nextDouble();
		System.out.println("enter salary");
		obj1.salary=s1.nextInt();
		System.out.println("enter address");
		obj1.addr=s1.next();
		System.out.println("enter specification");
		obj1.spec=s1.next();
		obj.display();
		obj.printSalary();
		obj1.display();
		obj1.printSalary();
	}

}
