class p1{
	int a=20;
}
	class c1 extends p1
	{
		int b=200;
		void display()
		{System.out.println(a+b);}
	}
	class d1 extends p1
	{
		int c=100;
		void display()
		{
			System.out.println(a+c);
		}
	}

public class program51_heirarchical_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			c1 obj=new c1();
			obj.display();
			d1 obj1=new d1();
			obj1.display();
	}

}
