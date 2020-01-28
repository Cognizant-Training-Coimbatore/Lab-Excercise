class test1
{
	static int x;
	static void display()
	{
		x++;
		System.out.println(x);
	}
}
public class p6_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1 t = new test1();
		t.display();
		test1 t2 = new test1();
		t2.display();
	}

}
