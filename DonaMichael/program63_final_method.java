final class first{
	final int x=10;
	final void display() {
		x=20;
		System.out.println("test7 is running");
	}
}
class second extends first
{
	int x=20;
	void display() {
		System.out.println("test8 is running");
	}
	}
public class program63_final_method {

	public static void main(String[] args) {
		second obj=new obj();
		obj.display();

	}

}
