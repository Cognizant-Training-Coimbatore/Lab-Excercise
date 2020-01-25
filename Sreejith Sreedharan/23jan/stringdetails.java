package demo;
class students
{String name;
String phoneno;
int rollno;
String address;
}
public class stringdetails{
	public static void main(String args[]) {
		
	students obj=new students();
	students obj1=new students();
	obj1.name="John";
	obj1.rollno=22;
	obj1.phoneno="8822882288";
	obj1.address="flat 1A, Saravanampatty";
	obj.name="Sam";
obj.rollno=2;
obj.phoneno="8888882882";
obj.address="Flat 7B, Saravanampatty";
System.out.println(obj.name);
System.out.println(obj.rollno);
System.out.println(obj.phoneno);
System.out.println(obj.address);
System.out.println(obj1.name);
System.out.println(obj1.rollno);
System.out.println(obj1.phoneno);
System.out.println(obj1.address);
}}