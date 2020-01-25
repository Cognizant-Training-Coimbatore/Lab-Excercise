class sample3{
	void display()
	{
		System.out.println("Display1 is working");
	}
	void display(int x) {
		System.out.println("Display 2 is working");
	}
}
public class program31_method_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample3 obj=new sample3();
		obj.display();
		obj.display(5);

	}

}
