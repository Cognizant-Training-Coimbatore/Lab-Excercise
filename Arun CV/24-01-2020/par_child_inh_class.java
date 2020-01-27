package p2_declare_variable;
class we
{
	void disp()
	{
		System.out.println("This is parent class");
	}
}
	class er extends we
	{
		void displ()
		{
				System.out.println("This is child class");
		
		}
	}

public class par_child_inh_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		er obj2 = new er();
		obj2.disp();
		obj2.displ();
	}

}
