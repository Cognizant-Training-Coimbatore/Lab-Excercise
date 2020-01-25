class sample3
{
	void display()
	{
		System.out.println("Display 1 is working");//method names are always unique. method overloading actually same method name but different parameters
	}
	void display(int x)
	{
		System.out.println("Display 2 working "+x);//since an arg is input here so the second display works
	}
}
public class program32_method_overloading_exp1 {

	public static void main(String[] args)
	{
		sample3 obj = new sample3();
		obj.display();
		obj.display(6);
	}

}
