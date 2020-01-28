package helloworld;
abstract class shape8{
	abstract void area();
}
class Rect extends shape8
{
	int a=10;
	int b=20;
	void area()
	{
		System.out.println(a*b);
	}
}
public class abstra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape8 o=new Rect();
		o.area();
	}

}
