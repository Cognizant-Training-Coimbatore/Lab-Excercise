
class test11{
	final void display() {
		System.out.println("This is super class!");
	}
}
class test12x extends test11{
//	void display() {
		//super.display();
//		System.out.println("This is child class!");
//	}
}
public class Prog21_Final_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test12x obj = new test12x();
		obj.display();
		
	}

}
