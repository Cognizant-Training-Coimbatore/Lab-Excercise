import java.util.Scanner;

class Member{
	int name,age,phoneNumber,salary;
	String Address;
}
class Employee extends Member{
	String specialization,department;
	
}
class Manager extends Member{
	String specialization,department;
}
public class q3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee obj1=new Employee();
		Manager obj2=new Manager();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Employee details name,age,phone,salary,Address,department,specialization:");
		obj1.name=input.nextInt();
		obj1.age=input.nextInt();
		obj1.phoneNumber=input.nextInt();
		obj1.salary=input.nextInt();
		obj1.Address=input.nextLine();
		obj1.department=input.nextLine();
		obj1.specialization=input.nextLine();
		System.out.println("Enter Manager details name,age,phone,salary,Address,department,specialization:");
		obj2.name=input.nextInt();
		obj2.age=input.nextInt();
		obj2.phoneNumber=input.nextInt();
		obj2.salary=input.nextInt();
		obj2.Address=input.nextLine();
		obj2.department=input.nextLine();
		obj2.specialization=input.nextLine();
		
		

	}

}
