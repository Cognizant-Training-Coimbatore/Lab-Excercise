class p1
{
	int a=20;
}
class c1 extends p1
{
	int b=200;
	void display() {
		System.out.println(a+b);
	}
}
class c2 extends p1
{
	int c=1200;
	void display()
	{
		System.out.println(a+c);
	}
}
public class hierarchial_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c1 obj1=new c1();
		obj1.display();
		c2 obj2=new c2();
		obj2.display();
	}

}
