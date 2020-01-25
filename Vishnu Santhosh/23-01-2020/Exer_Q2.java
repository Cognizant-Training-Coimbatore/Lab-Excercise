class stud{
	String name;
	int roll_no;
	long phno;
	String add;
}
public class Exer_Q2 {

	public static void main(String[] args) {
		stud s1 = new stud();
		stud s2 = new stud();
		
		s1.name="John";
		s1.roll_no=2;
		s1.phno = 1234578954;
		s1.add="no2 Alpha Street";
		
		s2.name="Sam";
		s2.roll_no=12;
		s2.phno = 354564545;
		s2.add="no2 Beta Street";

		System.out.println("Name: "+s1.name);
		System.out.println("Roll no: "+s1.roll_no);
		System.out.println("Phone number: "+s1.phno);
		System.out.println("Address: "+s1.add);

		System.out.println("Name: "+s2.name);
		System.out.println("Roll no: "+s2.roll_no);
		System.out.println("Phone number: "+s2.phno);
		System.out.println("Address: "+s2.add);
	}

}
