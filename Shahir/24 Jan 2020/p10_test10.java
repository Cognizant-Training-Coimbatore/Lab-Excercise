final class testc
{
	int a;
}
class testd
{
	final int b=10;
	final void display()
	{
		System.out.println(b);
	}
}
public class p10_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testd t = new testd();
		t.display();
	}

}
