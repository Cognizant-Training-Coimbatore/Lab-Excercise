class method{
	void display() {
		System.out.println("First display is working!!");
	}
	void display(String a) {
		System.out.println("First display"+a);
	}
}
public class Prog14_Method_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method obj = new method();
		obj.display();
		obj.display(" is working!!");
	}

}
