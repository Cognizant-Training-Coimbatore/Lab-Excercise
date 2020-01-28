class test11
{
	static int x;
	static void eq(int y)
	{
		x=y;
		
	}
}
public class p7_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test11 t = new test11();
		t.eq(2);
		System.out.println(t.x);
	}

}
