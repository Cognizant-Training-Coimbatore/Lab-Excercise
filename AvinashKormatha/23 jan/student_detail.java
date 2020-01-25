 class studen
{
	int roll;
	String phone;
	String address;
	String name;
}
public class student_detail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		studen obj1= new studen();
		studen obj2=new studen();
		obj1.name="sam";
		obj2.name="john";
		obj1.roll=111;
		obj2.roll=222;
		obj1.phone="9999999999";
		obj2.phone="9999999998";
		obj1.address="sarvanampatti";
		obj2.address="thudiyalur";
		System.out.println(obj1.name+" "+obj1.roll+" "+obj1.phone+" "+obj1.address);
		System.out.println(obj2.name+" "+obj2.roll+" "+obj2.phone+" "+obj2.address);

	}
	

}
