class shape{
	void display() {
		System.out.println("this is shape");
	}
}
class rectangle extends shape{
	void display1() {
		System.out.println("this is rectangle");
	}
}
class circle extends shape{
	void display1() {
		System.out.println("this is circle");
	}
}

class square extends rectangle{
	void display2() {
		System.out.println("square is a rectangle");
	}
}
public class session_2_qn_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			square q1=new square();
			q1.display1();
			q1.display();
	}

}
