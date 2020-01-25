package helloworld;

class det{
	String name;
	int roll;
	  String phno;
	String addr;
}
public class details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		det d=new det();
		det d1=new det();
		d.name="Sam";
		d.roll=56;
		d.phno="9999999999";
		d.addr="Saravanampatti";
		d1.name="John";
		d1.roll=25;
		d1.phno="9988888899";
		d1.addr="Kochi";
		System.out.println(d.name+"\n"+d.roll+"\n"+d.phno+"\n"+d.addr+"\n"+d1.name+"\n"+d1.roll+"\n"+d1.phno+"\n"+d1.addr+"\n");
	}

}
