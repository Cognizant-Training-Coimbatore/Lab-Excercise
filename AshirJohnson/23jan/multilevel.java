package helloworld;
class sup
{
	int a=10;
}
class sub1 extends sup
{
	int a=20 ,b=35;
}
class sub2 extends sub1
{
	int a=30,c=20;
	void display()
	{
		System.out.println(super.a);
	}
}
public class multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sub2 s=new sub2();
		s.display();
	}

}
