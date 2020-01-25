class member{
	String name;
	int age;
	int phone_number;
	String address;
	int salary;
	void printsalary() {
		System.out.println("salaray is: "+salary);
	}
	
}
class employee extends member{
	String specialization;
	
}
class manager extends member{
	String department;
}
public class qn_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			manager m1=new manager();
			m1.name="fakama";
			m1.age=23;
			m1.phone_number=234565;
			m1.address="kasaragod";
			m1.salary=5000;
			m1.printsalary();
			System.out.println(m1.name);
			System.out.println(m1.age);
			System.out.println(m1.phone_number);
			System.out.println(m1.address);
			
			employee m2=new employee();
			m2.name="fakama";
			m2.age=23;
			m2.phone_number=234565;
			m2.address="kasaragod";
			m2.salary=5000;
			m2.printsalary();
			System.out.println(m2.name);
			System.out.println(m2.age);
			System.out.println(m2.phone_number);
			System.out.println(m2.address);
	}

}
