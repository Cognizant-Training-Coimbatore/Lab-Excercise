class testx
{
	int x=100;
}
class testy extends testx
{
	int x=10;
	void display()
	{
		System.out.println(x);
		System.out.println(super.x);
	}
}
public class superkeyword {

	public static void main(String[] args) {
		testy obj=new testy();
		obj.display();
	}

}
