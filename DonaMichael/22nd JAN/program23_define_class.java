class test
{
	int x,y;
	void print()
	{
		System.out.println("Print this");
	}
}
public class program23_define_class {

	public static void main(String[] args) 
	{
		test obj=new test();//declaring object named obj
		obj.x=10;//accessing members of the class
		obj.y=10;
		System.out.println(obj.x);
		System.out.println(obj.y);
		obj.print();

	}

}
