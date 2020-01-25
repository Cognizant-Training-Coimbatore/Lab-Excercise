class member

{
	String name,add;
	int age;
	double phone,sal;
	void printSalary(String sal)
	{
		System.out.println(sal);
	}
}
class employee1 extends member
{
	String spec,dept;
}
class manager extends member
{
	String spec,dept;
	void display()
	{
		System.out.println(name+" "+age+" "+phone+" "+sal+" "+add+" "+spec+" "+dept);
	}
}
public class employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		manager obj = new manager();
		obj.name="aaa";
		obj.age=10;
		obj.add="sarvanampatti";
		obj.phone=123456789;
		obj.sal=10000;
		obj.spec="hr";
		obj.dept="qea";
		obj.display();
	}

}
