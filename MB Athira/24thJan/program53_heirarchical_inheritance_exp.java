class p1
{
	int a=20;
}
class c1 extends p1
{
	int b = 23;
	void display()
	{
		System.out.println(a+b);
	}
}
class c2 extends p1
{
	int c=90;
	void display()
	{
		System.out.println(a+c);
	}
}
public class program53_heirarchical_inheritance_exp 
{

	public static void main(String[] args) 
	{
		c1 obj1 = new c1();
		c2 obj2 = new c2();
		obj1.display();
		obj2.display();
	}

}
