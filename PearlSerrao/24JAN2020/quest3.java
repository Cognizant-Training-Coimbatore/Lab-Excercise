package demo;

public class quest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent p=new parent();
		p.display1();
		child c=new child();
		c.display();
		c.display1();
		
	}

}
class parent{
	void display1() {
		System.out.println("This is parent class");
	}
}
class child extends parent{
	void display() {
		System.out.println("this is child class");
	}
}