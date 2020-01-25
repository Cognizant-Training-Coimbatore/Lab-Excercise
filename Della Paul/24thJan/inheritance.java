class a
{
	int x=5;
}
class b extends a
{
	int y=6;
	void display()
	{
		System.out.println(x+y);
	}
}
public class inheritance {

	public static void main(String[] args) {
		b obj=new b();
		obj.display();

	}

}
