package helloworld;
interface shape9{
	 void area();
}
class Rect1 implements shape9
{
	int a=10;
	int b=20;
public void area()
	{
		System.out.println(a*b);
	}
}
public class interf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape9 o=new Rect1();
		o.area();
	}

}
