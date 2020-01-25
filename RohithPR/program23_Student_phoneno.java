class Student1
{
	String name;
	int roll_no;
	int phone_no;
	String address;
}
public class program23_Student_phoneno {

	public static void main(String[] args) 
	{
		Student1 a = new Student1();
		a.name = "Sam";
		a.roll_no = 2;
		a.phone_no = 9876543;
		a.address = "Kannur,Kerala";
		Student1 b = new Student1();
		b.name = "John";
		b.roll_no = 5;
		b.phone_no = 9865655;
		b.address = "Kochi,Kerala";
		System.out.println("The details of first student");
		System.out.println(a.name);
		System.out.println(a.roll_no);
		System.out.println(a.phone_no);
		System.out.println(a.address);
		System.out.println("The details of second student");
		System.out.println(b.name);
		System.out.println(b.roll_no);
		System.out.println(b.phone_no);
		System.out.println(b.address);
	  }
		}