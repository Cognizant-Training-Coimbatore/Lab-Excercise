class stat
	{
	static int x=10;
	void display()
	{
		x++;
		System.out.println(x);
	}
	static void display1()
	{
		x++;
		System.out.println(x);
	}
	}
public class program59_static_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stat obj=new stat();
		obj.display();
		stat.display1();
		stat obj1=new stat();
		obj1.display();
		stat.display1();
	}

}
