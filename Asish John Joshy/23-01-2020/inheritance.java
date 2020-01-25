package demo;
class superc
{
	int x=2;
}
class subc extends superc
{
	int y=5;
	void display()
	{
		System.out.println(x+y);
	}
}
public class inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subc c=new subc();
		c.display();
	}

}
