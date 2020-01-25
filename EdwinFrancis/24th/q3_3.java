class p1{
	void display1()
	{
		System.out.println("This is a parent class");
	}
}
class c1 extends p1{
	void display() 
	{
		display();
		System.out.println("This is child class");
	}
}
public class q3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p1 obj1=new p1();
		c1 obj2=new c1();
		obj1.display1();
		obj2.display();

	}

}
