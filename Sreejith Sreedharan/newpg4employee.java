import java.util.Scanner;

class member
{
	String name;
	String address;
	int age;
	double phoneno,salary;
	void printsalary()
	{System.out.println("salary is : "+salary);
	}
	
}
class employee extends member
{
	String specialization;
	String department;
	void display()
	{
		System.out.println("name : "+name);
		System.out.println("age : "+age);
		System.out.println("phone no : "+phoneno);
		System.out.println("address : "+address);
		System.out.println("department : "+department);
		System.out.println("specialization : "+specialization);
	}
}
class manager extends member
{
	String specialization;
	String department;
	void display()
	{
		System.out.println("name : "+name);
		System.out.println("age : "+age);
		System.out.println("phone no : "+phoneno);
		System.out.println("address : "+address);
		
		System.out.println("department : "+department);
		System.out.println("specialization : "+specialization);
	}
	
}
public class newpg4employee {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		employee obj=new employee();
		System.out.println("enter the details of the employee");
		
		
		System.out.println("enter name");
		obj.name=sc.next();
		System.out.println("enter age");
		obj.age=sc.nextInt();
		System.out.println("enter phoneno");
		obj.phoneno=sc.nextDouble();
		System.out.println("enter salary");
		obj.salary=sc.nextDouble();
		System.out.println("enter address");
		obj.address=sc.next();
		System.out.println("enter depart");
		obj.department=sc.next();
		System.out.println("enter spec");
		obj.specialization=sc.next();
		
		System.out.println("enter the details of the manager");
		manager obj1=new manager();
		System.out.println("enter name");
		obj1.name=sc.next();
		System.out.println("enter age");
		obj1.age=sc.nextInt();
		System.out.println("enter phoneno");
		obj1.phoneno=sc.nextDouble();
		System.out.println("enter salary");
		obj1.salary=sc.nextDouble();
		System.out.println("enter address");
		obj1.address=sc.next();
		System.out.println("enter depart");
		obj1.department=sc.next();
		System.out.println("enter spec");
		obj1.specialization=sc.next();
		obj.display();
		obj.printsalary();
		obj1.display();
		obj1.printsalary();
	}

}
