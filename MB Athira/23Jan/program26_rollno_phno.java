class Student1
{
	String name;
	int rollno;
	int phoneno;
	String address;
}
public class program26_rollno_phno {

	public static void main(String[] args) 
	{
		Student1 a = new Student1();
		a.name = "John";
		a.rollno = 2;
		a.phoneno = 97625657;
		a.address = "Thrissur, Kerala";
		Student1 b = new Student1();
		b.name = "Sam";
		b.rollno = 3;
		b.phoneno = 98765432;
		b.address = "NTPC, Kayamkulam, Kerala";
		System.out.println("The details of the first student :");
		System.out.println(a.name);
		System.out.println(a.rollno);
		System.out.println(a.phoneno);
		System.out.println(a.address);
		System.out.println("The details of the second student :");
		System.out.println(b.name);
		System.out.println(b.rollno);
		System.out.println(b.phoneno);
		System.out.println(b.address);
	}

}
