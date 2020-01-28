class testA
{
	int a=10;
}
class testB extends testA
{
	int b =35;
}
class testC extends testB
{
	int c;
	void display()
	{
		c=a+b;
		System.out.println(c);
	}
}
public class p2_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testC t =new testC();
		t.display();
	}

}
