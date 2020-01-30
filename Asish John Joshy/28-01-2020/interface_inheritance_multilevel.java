package demo;
interface testing3
{
	void square();
}
class arithmetic implements testing3
{
	public void square()
	{
		System.out.println("Class implements is working");
	}
}
class ToTestInt extends arithmetic
{
	void display()
	{
		System.out.println("Sub-class implements is working");
	}
}
public class interface_inheritance_multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToTestInt t=new ToTestInt();
		t.square();
		t.display();
	}

}
