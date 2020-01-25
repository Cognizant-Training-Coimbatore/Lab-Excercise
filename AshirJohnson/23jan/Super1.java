package helloworld;
class Super
{
	int x=100;
}
class subb extends Super
{
	int x=10;
	void display()
	{
		System.out.println(x);
		System.out.println(super.x);
	}
}
public class Super1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subb s=new subb();
		s.display();
	}

}
