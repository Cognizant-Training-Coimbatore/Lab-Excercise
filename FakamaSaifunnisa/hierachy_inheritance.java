class p1{
	int a=20;
}
class c1 extends p1{
	int b=28;
	void display()
	{
		System.out.println(a+b);
	}
}
class c2 extends p1{
	int b=27;
	void display()
	{
		System.out.println(a+b);
	}
}
public class hierachy_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		c1 o1=new c1();
		o1.display();
		c2 o2=new c2();
		o2.display();
	}

}
