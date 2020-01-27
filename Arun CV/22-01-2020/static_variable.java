class test1
{
	static int x;
	void disp()
	{
		x++;
		System.out.println(x);
	}
}
public class static_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1 obj1 = new test1();
		obj1.disp();
		test1 obj2 = new test1();
		obj2.disp();
	}

}
