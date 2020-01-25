class a
{
	int x = 56;
}
class b extends a
{
	int y =67;
	void display()
	{
		System.out.println(x+y);
	}
}
public class program1_qn1_inherit_class 
{

	public static void main(String[] args) 
	{
		b obj = new b();
		obj.display();
	}

}