class Student1{
	String name;
	int rollno;
	int phno;
	String address;
}
public class ques2_class {

	public static void main(String[] args) {
		Student1 s=new Student1();
		Student1 s1=new Student1();
		s.name="John";
		s.rollno=2;
		s.phno=97659856;
		s.address="kerala";
		System.out.println("name is"+s.name);
		System.out.println("rollno is"+s.rollno);
		System.out.println("phno is"+s.phno);
		System.out.println("address is"+s.address);
		s1.name="Sam";
		s1.rollno=3;
		s1.phno=987654;
		s1.address="kerala";
		System.out.println("name is"+s1.name);
		System.out.println("rollno is"+s1.rollno);
		System.out.println("phno is"+s1.phno);
		System.out.println("address is"+s1.address);

	}

}
