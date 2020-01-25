class a
{
	int a=10;
}
class b extends a
{
	int b=20;
}
class c extends b
{
	int c=10;
	void display()
	{
		System.out.println(a+b+c);
	}
}
public class multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c obj = new c();
		obj.display();
	}

}
