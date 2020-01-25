class test
{
	int x,y;
	void print()
	{
		System.out.println("Print this");
	}
}
public class program24_defining_class {

	public static void main(String[] args) 
	{
		test obj = new test();
		obj.x = 10;
		obj.y =10;
		System.out.println(obj.x);
		System.out.println(obj.y);
		obj.print();
	}

}
