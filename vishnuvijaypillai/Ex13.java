class parent
{
	int x=1;
	void display()
	{
		System.out.println("i am parent");
	}
}
class child extends parent
{
	void display()
	{
		System.out.println("i am child"+x);
	}
}
public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent obj1 = new parent();
		obj1.display();
		child obj2 = new child();
		obj2.display();
		parent obj3 =new child();
		obj3.display();

	}

}
