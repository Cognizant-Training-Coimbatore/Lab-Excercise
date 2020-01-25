class test{
	int x,y;
	void print()
	{
		System.out.println("print this");
	}
}

public class program21_define_class {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test obj=new test();
		obj.x=10;
		obj.y=10;
		System.out.println(obj.x);
		System.out.println(obj.y);
		obj.print();
	}

}
