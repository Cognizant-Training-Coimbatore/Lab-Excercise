package demo;
class sample3{
	void display() {
		System.out.println("1 is working");
	}
	void display(int x) {
		System.out.println("2 is working");
	}
	
}
public class methodoverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
sample3 obj=new sample3();

obj.display();
obj.display(5);
	}

}
