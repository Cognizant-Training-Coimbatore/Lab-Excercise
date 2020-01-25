class p1
{
	int a=20;
}
class c1 extends p1
{
	int b=40;
	void display()
	{
		System.out.println(a+b);
	}
}
class c2 extends p1
{
	int c=50;
	void display()
	{
		System.out.println(a+c);
	}
}
public class hierarchicalinheritance {

	public static void main(String[] args) {
		c1 obj=new c1();
		c2 obj1=new c2();
		obj.display();
		obj1.display();

	}

}
