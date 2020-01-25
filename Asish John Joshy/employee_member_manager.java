package demo;

import java.util.Scanner;

class Member
{
	int age,salary;
	String phn,addr,name;
	void printSalary()
	{
		System.out.println("Salary="+salary);
	}
}
class Employee extends Member
{
	String spec,dep;
	void display()
	{
		System.out.println("Employee:-");
		System.out.println("Name:"+name+"\nAge:"+age+"\nSalary: "+salary+"\nPhone number: "+phn+"\nAddress:"+addr);
		System.out.println("Specialisation:"+spec);
		System.out.println("Department:"+dep);
	}
}
class Manager extends Member
{
	String spec,dep;
	void display()
	{
		System.out.println("Manager:-");
		System.out.println("Name:"+name+"\nAge:"+age+"\nSalary: "+salary+"\nPhone number: "+phn+"\nAddress:"+addr);
		System.out.println("Specialisation:"+spec);
		System.out.println("Department:"+dep);
	}
}
public class employee_member_manager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Manager m=new Manager();
		Employee e=new Employee();
		System.out.println("Enter Name, Age, Salary, Phone number, Address, Specialisation and Department of employee");
        e.name=s.nextLine();
        e.age=s.nextInt();
        e.salary=s.nextInt();
        e.phn=s.nextLine();
        e.addr=s.nextLine();
        e.spec=s.nextLine();
        e.dep=s.nextLine();
        System.out.println("Enter Name, Age, Salary, Phone number, Address, Specialisation and Department of Manager");
        m.name=s.nextLine();
        m.age=s.nextInt();
        m.salary=s.nextInt();
        m.phn=s.nextLine();
        m.addr=s.nextLine();
        m.spec=s.nextLine();
        m.dep=s.nextLine();
        e.display();
        m.display();
	}

}
