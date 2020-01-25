package demo;

import java.util.Scanner;

class member
{ int age,salary,phoneno;
String address, name;
void printsalary()
{ System.out.println(salary);
	
}}
class manager extends member
{String specialization, department;

}
class employee extends member
{String specialization, department;
	
	
}
public class office {
	public static void main(String[] args)
	{manager obj=new manager();
	employee obj1=new employee();
	Scanner sc=new Scanner(System.in);
	obj.name=sc.nextLine();
	obj.address=sc.nextLine();
	obj.age=sc.nextInt();
	obj.salary=sc.nextInt();
	obj.department=sc.nextLine();
	obj.specialization=sc.nextLine();
	
	System.out.println("Enter manager details");
	obj1.name=sc.nextLine();
	obj1.address=sc.nextLine();
	obj1.age=sc.nextInt();
	obj1.salary=sc.nextInt();
	obj1.department=sc.nextLine();
	obj1.specialization=sc.nextLine();
	System.out.println("Manager details:");
	System.out.println(obj1.name);
	System.out.println(obj1.age);
	System.out.println(obj1.address);
	System.out.println(obj1.department);
	System.out.println(obj1.specialization);
	obj1.printsalary();
	System.out.println("Employee details:");
	System.out.println(obj.name);
	System.out.println(obj.age);
	System.out.println(obj.address);
	System.out.println(obj.department);
	System.out.println(obj.specialization);
	obj.printsalary();	
		
	}

}
