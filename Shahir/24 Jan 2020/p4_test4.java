class Member
{
	String name,address, phno;
	int age;
	double salary;
	void printSalary()
	{
		System.out.println("Salary"+salary);
	}
}
class Employee extends Member
{
	String specialization;
}
class Manager extends Member
{
	String department;
}
public class p4_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m = new Member();
		Employee e = new Employee();
		Manager m1 = new Manager();
		System.out.println(e.name="Shahir");
		System.out.println(e.age=22);
		System.out.println(e.phno="9746183665");
		System.out.println(e.salary=123456);
		
	}

}
