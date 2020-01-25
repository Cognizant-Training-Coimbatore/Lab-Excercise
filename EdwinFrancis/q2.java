class Stud{
	int roll_no,phone_no;
	String address;
}

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubStudent sam=new Student();
		
		Stud john=new Stud();
		Stud sam=new Stud();
	
		sam.roll_no=18;
		sam.phone_no=123456789;
		sam.address="Kochi";
	
		john.roll_no=28;
		john.phone_no=987654321;
		john.address="Thrissur";
		System.out.println("Details of Sam");
		System.out.println(sam.roll_no);
		System.out.println(sam.phone_no);
		System.out.println(sam.address);
		System.out.println("Details of John");
		System.out.println(john.roll_no);
		System.out.println(john.phone_no);
		System.out.println(john.address);

	}

}
