class a1
{
	int a=10;
}
class b1 extends a1
{
	int b=20;
	void display() {
		System.out.println(a+b);
	}
}
class b2 extends a1
{
	int c=30;
	void display()
	{
		System.out.println(a+c);
	}
}
public class hierarchial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b1 obj=new b1();
		obj.display();
		b2 obj1 = new b2();
		obj1.display();
	}

}
