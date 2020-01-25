
class student1
{
	String name;
	int roll_no;
	long phone_no;
	String address;
}
public class pgm2class2 {

	public static void main(String[] args) {
		student1 obj=new student1();
		student1 obj1=new student1();
		obj.name="Sam";
		obj.roll_no=1;
		obj.phone_no=9443213251L;
		obj.address="House no 21 \n Saravanampatti ";
		obj1.name="John";
		obj1.roll_no=2;
		obj1.phone_no=9876462718L;
		obj1.address="House no 14 \n Saravanampatti ";
		System.out.println("rollno : "+obj.roll_no);
		System.out.println("name : "+obj.name);
		System.out.println("phone no :"+obj.phone_no);
		System.out.println("address : "+obj.address);
		System.out.println("rollno : "+obj1.roll_no);
		System.out.println("name : "+obj1.name);
		System.out.println("phone no :"+obj1.phone_no);
		System.out.println("address : "+obj1.address);

	}

}
