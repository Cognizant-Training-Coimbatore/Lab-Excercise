package demo;
class test1
{
	static int x;
	void display()
	{
		x++;
		System.out.println(x);
	}
}
public class static_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1 t1=new test1();
		t1.display();
		test1 t2=new test1();
		t2.display();
	}

}
