package demo;
class sample3{
	void display() {
		System.out.println("disp1 is working");
	}
	void display(int x) {
		System.out.println("disp2 is working");
	}
}

public class program18_method_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample3 obj=new sample3();
		obj.display();
		obj.display(18);

	}

}
