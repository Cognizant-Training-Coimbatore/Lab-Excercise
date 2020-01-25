package helloworld;
class over
{
	void display()
	{
		System.out.println("Display");
	}
	void display(int x)
	{
		System.out.println(x);
	}
	void display(int x, int y)
	{
		System.out.println(x+"\n"+y);
	}
}
public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5;
		int y=10;
		over o=new over();
		o.display();
		o.display(x);
		o.display(x, y);
	}

}
