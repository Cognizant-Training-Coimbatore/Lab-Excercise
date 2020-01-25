package demo;
class Stud{
	String name,address;
	int roll_no,phone_no;
}
public class Qn2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Stud a=new Stud();
        Stud b=new Stud();
        a.name="Sam";
        a.address="London";
        a.phone_no=2255;
        a.roll_no=17;
        System.out.println("Name:"+a.name);
        System.out.println("Address:"+a.address);
        System.out.println("Phone Number:"+a.phone_no);
        System.out.println("Roll Number:"+a.roll_no);
        b.name="John";
        b.address="Tokyo";
        b.phone_no=3377;
        b.roll_no=34;
        System.out.println("Name:"+b.name);
        System.out.println("Address:"+b.address);
        System.out.println("Phone Number:"+b.phone_no);
        System.out.println("Roll Number:"+b.roll_no);
        
	}

}
