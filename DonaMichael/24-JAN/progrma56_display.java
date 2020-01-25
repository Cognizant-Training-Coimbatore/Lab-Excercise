class parent{
	void display() {
		System.out.println("This is parent class ");
	}
}
class child extends parent{
	void display1() {
		System.out.println("This is child class");
	}
}
public class progrma56_display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent y=new parent();
		y.display();
		child x=new child();
		x.display1();
		x.display();
		
	}

}
