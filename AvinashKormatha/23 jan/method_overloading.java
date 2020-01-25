class sample2
{
	void display()
	{
		System.out.println("display 1");
	}
	void display(int x)
	{
		System.out.println("display2");
	}
}
public class method_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample2 obj= new sample2();
		obj.display();

	}

}
