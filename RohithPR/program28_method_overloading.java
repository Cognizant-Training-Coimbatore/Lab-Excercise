class sample3
{
	void display()
	{
		System.out.println("Display 1 is working");
	}
	void display(int x)
	{
		System.out.println("Display 2 is working");
	}
}
public class program28_method_overloading {

	public static void main(String[] args) 
	{
		sample3 obj = new sample3();
		obj.display();
		obj.display(7);

	}

}
