package demo;
class a
{
	int x=4;
}
class b extends a
{
	int y=3;
}
class c extends b
{
	int z=3;
	void display()
	{
		System.out.println((x+y+z));
	}
}
public class inheritance_multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c cc=new c();
		cc.display();
	}

}
