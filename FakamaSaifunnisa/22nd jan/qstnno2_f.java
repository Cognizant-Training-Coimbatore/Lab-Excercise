class Student1{
	String name;
	int rollno;
	String address;
	int phone_number;
}
public class qstnno2_f {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s=new Student1();
		Student1 s1=new Student1();
		s.name="John";
		s.rollno=2;
		s.address="kerala";
		s.phone_number =98956789;
		s1.name="sam";
		s1.rollno=3;
		s1.address="karnataka";
		s1.phone_number=98976890;
		System.out.println("the name rollno address and phone number of student 1 is: ");
		System.out.println(s.name);
		System.out.println(s.rollno);
		System.out.println(s.address);
		System.out.println(s.phone_number);
		System.out.println("the name rollno address and phone number of student 2 is: ");
		System.out.println(s1.name);
		System.out.println(s1.rollno);
		System.out.println(s1.address);
		System.out.println(s1.phone_number);

	}

}
