class a
{
	int a= 10;
}
class b extends  a 
{
	int b = 20;
	void display()
	{
	System.out.println(a+b);
	}
}
public class program47_inherit_class {

	public static void main(String[] args) 
	{
		b obj = new b();
		obj.display();

	}

}
