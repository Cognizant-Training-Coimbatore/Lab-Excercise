package demo;

public class overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample s=new sample();
		s.display();
	}

}
class sample
{
	void display() {
		System.out.println("hi");
		
	}
	void display(int x) {
		System.out.println("hello");
	}
	
}