package helloworld;
class a
{
	int a=20;
}
class b extends a
{
	int b=25;
	void display()
	{
		System.out.println(a+b);
	}
}
class c extends a
{
	int c=100;
	void display()
	{
		System.out.println(a+c);
	}
}
class d extends a
{
	int b=50;
	void display()
	{
		System.out.println(a+b);
	}
}
public class hierar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b b1=new b();
		c c1=new c();
		d d1=new d();
		b1.display();
		c1.display();
		d1.display();
	}

}
