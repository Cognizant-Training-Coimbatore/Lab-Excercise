class student1{
	String addr;
	int roll_no;
	long phno;
}
public class program25_print_details {

	public static void main(String[] args) {
		student1 sam=new student1();
		student1 john=new student1();
		sam.roll_no=3;
		sam.phno=2345678901L;
		sam.addr="flat1B 34 saravanampatti";
		john.roll_no=1;
		john.phno=8765431890L;
		john.addr="flat2B 45 Sravanampatti";
		System.out.println("Sam rollno:"+sam.roll_no);
		System.out.println("Phone no:"+sam.phno);
		System.out.println("Address:"+sam.addr);
		System.out.println("John rollno:"+john.roll_no);
		System.out.println("Phone no:"+john.phno);
		System.out.println("Address:"+john.addr);
		

	}

}
