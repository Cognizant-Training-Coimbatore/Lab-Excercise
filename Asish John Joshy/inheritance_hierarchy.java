package demo;
class sup
{
	int x=5;
}
class sub1 extends sup
{
	int y=1;
	void display()
	{
		System.out.println((x+y));
	}
}
class sub2 extends sup
{
	int z=2;
	void display()
	{
		System.out.println((x+z));
	}
}
class sub3 extends sup
{
	int w=3;
	void display()
	{
		System.out.println((x+w));
	}
}
public class inheritance_hierarchy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sub1 s1=new sub1();
		sub2 s2=new sub2();
		sub3 s3=new sub3();
		s1.display();
		s2.display();
		s3.display();
	}

}
