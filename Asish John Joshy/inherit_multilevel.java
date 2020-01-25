package demo;
class aaa
{
	int x=2;
}
class bbb extends aaa
{
	int y=3;
}
class inherit extends bbb
{
	void display()
	{
		System.out.println((x+y));
	}
}
public class inherit_multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inherit in=new inherit();
		in.display();
	}

}
