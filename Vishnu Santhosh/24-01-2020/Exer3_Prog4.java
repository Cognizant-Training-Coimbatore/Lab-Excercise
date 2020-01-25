class member{
	String name;
	int age;
	String phno;
	String address;
	int salary;
	void printSalary() {
		System.out.println("Salary: "+salary);
	}
}
class manager extends member{
	String department;
}
class employee extends member{
	String specialization;
}
public class Exer3_Prog4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		manager man = new manager();
		employee emp = new employee();
		man.name="Asish";
		man.age=22;
		man.phno="9987895525";
		man.address="Ganapathy Coimbatore";
		man.salary=25000;
		man.department="Testing";
		emp.name="Shahir";
		emp.age=22;
		emp.phno="7894546513";
		emp.address="Saravanampatti Coimbatore";
		emp.salary=25000;
		emp.specialization="testing";
		System.out.println("Name: "+man.name);
		System.out.println("Age: "+man.age);
		System.out.println("Phone number: "+man.phno);
		System.out.println("Address: "+man.address);
		man.printSalary();
		System.out.println("Department: "+man.department);
		System.out.println("\n\nName: "+emp.name);
		System.out.println("Age: "+emp.age);
		System.out.println("Phone number: "+emp.phno);
		System.out.println("Address: "+emp.address);
		emp.printSalary();
		System.out.println("Department: "+emp.specialization);
	}

}
