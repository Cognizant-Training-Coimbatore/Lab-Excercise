package helloworld;
class final1
{
	final void display()
	{
		System.out.println("final1");
	}
}
class final2 extends final1
{
	void display1()
	{
		System.out.println("final2");
	}
}
public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final2 f=new final2();
		f.display1();
	}

}
