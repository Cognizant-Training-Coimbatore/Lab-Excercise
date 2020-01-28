class test1{
	void display() {
		System.out.println("This is super class!");
	}
}
class test2x extends test1{
	void display() {
		//super.display();
		System.out.println("This is child class!");
	}
}
public class Prog2_Method_Overiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test2x obj = new test2x();
		obj.display();
		
	}

}
