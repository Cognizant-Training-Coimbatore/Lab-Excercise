
class Member
{
	String name;
	int age;
	long ph_no;
	String address;
	float salary;
	void printsalary()
	{
		System.out.println("the salary is"+salary);
	}
}
class Employee extends Member
{
	String specialization;
}
class Manager extends Employee
{
	String department;
}
public class day2_second_4 {

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.name="Ram";
		e1.age=23;
		e1.ph_no=9876543;
		e1.address="kerala";
		e1.salary=100000;
		e1.printsalary();
		System.out.println(e1.name);
		System.out.println(e1.age);
		System.out.println(e1.ph_no);
		System.out.println(e1.address);
		Manager m1=new Manager();
		m1.name="Rahul";
		m1.age=24;
		m1.ph_no=98765643;
		m1.address="karnataka";
		m1.salary=100000;
		m1.printsalary();
		System.out.println(m1.name);
		System.out.println(m1.age);
		System.out.println(m1.ph_no);
		System.out.println(m1.address);
		

	}

}
