class A
{
	int x=2;
}
class B extends A
{
	int y = 10;
	void disp()
	{
		System.out.println(x+y);
	}
}
public class single_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B();
		obj.disp();
	}

}
