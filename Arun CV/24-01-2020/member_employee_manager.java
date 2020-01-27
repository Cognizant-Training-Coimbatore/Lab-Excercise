package p2_declare_variable;
class mem
{
	String name;
	int age;
	int phn;
	String add;
	int salary;
	void disp()
	{
		System.out.println(salary);
	}
}
	class emp extends mem
	{
		String specialization;
	}
	class man extends mem
	{
		String department;
	}



public class member_employee_manager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		emp obj = new emp();
		obj.name = "abc";
		obj.age = 21;
		obj.phn = 3123;
		obj.add = "karnataka";
		obj.salary = 986754;
		obj.specialization = "all";
		obj.disp();
		man obj2 = new man();
		
	}

}
