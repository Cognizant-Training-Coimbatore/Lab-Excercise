class squad

{
	int roll;
	String phone;
	String address;
	String name;
}
public class Student_details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		squad obj1= new squad();
		squad obj2= new squad();
		obj1.roll= 123;
		obj2.roll= 321;
		obj1.phone= "908908908";
		obj2.phone= "989898989";
		obj1.address= "coimbatore";
		obj2.address= "coimbatore town";
		obj1.name= "sam";
		obj2.name= "john";
	System.out.println(obj1.roll+" "+obj1.phone+" "+obj1.address+" "+obj1.name);
	System.out.println(obj2.roll+" "+obj2.phone+" "+obj2.address+" "+obj2.name);		
	}

}
